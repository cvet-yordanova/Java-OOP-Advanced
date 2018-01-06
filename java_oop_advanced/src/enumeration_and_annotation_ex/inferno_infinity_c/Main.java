package enumeration_and_annotation_ex.inferno_infinity_c;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        LinkedHashMap<String, Weapon> weapons = new LinkedHashMap<>();

        String line;

        while(!(line = reader.readLine()).equalsIgnoreCase("end")){
            String[] info = line.split(";");
            switch (info[0]){
                case "Create":
                    Weapon weapon = null;
                    weapon = new Weapon(WeaponType.valueOf(info[1].toUpperCase()), info[2]);
                    weapons.put(info[2], weapon);
                    break;
                case "Add":
                    weapons.get(info[1]).addGem(Integer.parseInt(info[2]), GemType.valueOf(info[3].toUpperCase()));
                    break;

                case "Remove":
                    weapons.get(info[1]).removeGem(Integer.parseInt(info[2]));
                    break;
                case "Print":
                    System.out.println(weapons.get(info[1]));
                    break;
                case "Compare":
                    Weapon weapon1 = weapons.get(info[1]);
                    Weapon weapon2 = weapons.get(info[2]);

                    if(weapon1.compareTo(weapon2) > 0){
                        String level = String.valueOf(weapon1.getItemLevel());
                        System.out.println(weapon1 +String.format(" (Item Level: %s)",level.substring(0, level.indexOf(".") + 2)));
                    }else{
                        String level = String.valueOf(weapon2.getItemLevel());
                        System.out.println(weapon2 +String.format(" (Item Level: %s)",level.substring(0, level.indexOf(".") + 2)));
                    }
                    break;
                case "Author":
                    System.out.println(String.format("Author: %s", Weapon.class.getAnnotation(CustomAnnotation.class).author()));
                    break;
                case "Revision":
                    System.out.println(String.format("Revision: %d", Weapon.class.getAnnotation(CustomAnnotation.class).revision()));
                    break;
                case "Description":
                    System.out.println(String.format("Class description: %s", Weapon.class.getAnnotation(CustomAnnotation.class).description()));
                    break;
                case "Reviewers":
                    System.out.println(String.format("Reviewers: %s", String.join(", ",Weapon.class.getAnnotation(CustomAnnotation.class).reviewers())));
                    break;

            }

        }
    }
}

package enumeration_and_annotation_ex.j_inferno_infinity;

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
                    if(info[1].equalsIgnoreCase("axe")){
                       weapon = new Axe(info[2]);
                    }
                    else if(info[1].equalsIgnoreCase("sword")){
                        weapon = new Sword(info[2]);
                    }else if(info[1].equalsIgnoreCase("knife ")){
                        weapon = new Knife(info[2]);
                    }

                    weapons.putIfAbsent(info[2], weapon);

                    break;
                case "Add":
                    String typeGem = info[3];
                    Gem gem = null;
                    if(typeGem.equalsIgnoreCase("ruby")){
                        gem = new Ruby();
                    }else if(typeGem.equalsIgnoreCase("emerald")){
                        gem = new Emerald();
                    }else if(typeGem.equalsIgnoreCase("amethyst ")){
                        gem = new Amethyst();
                    }

                    if(weapons.containsKey(info[1])){
                        weapons.get(info[1]).insertGem(gem, Integer.parseInt(info[2]));
                    }
                    break;

                case "Remove":
                    if(weapons.containsKey(info[1])){
                        weapons.get(info[1]).removeGem(Integer.parseInt(info[2]));
                    }
                    break;
                case "Print":
                    if(weapons.containsKey(info[1])){
                        System.out.println(weapons.get(info[1]));
                    }
                    break;
            }

        }


    }
}

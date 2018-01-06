package interfaces_exc.d_birthday_celebrations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = reader.readLine();
        List<Birthable> citizenAndPets = new ArrayList<>();

        while(!line.equalsIgnoreCase("End")){
            String[] info = line.split("\\s+");

            if(info[0].equalsIgnoreCase("Citizen")){
                String name = info[1];
                Integer age = Integer.parseInt(info[2]);
                String id = info[3];
                String birthdate = info[4];

                Birthable citizen = new Citizen(name, age, id, birthdate);
                citizenAndPets.add(citizen);
            }else if(info[0].equalsIgnoreCase("Pet")){
                String name = info[1];
                String birthdate = info[2];

                Birthable pet = new Pet(name, birthdate);
                citizenAndPets.add(pet);
            }

            line = reader.readLine();
        }

        String year = reader.readLine();

        Pattern pattern = Pattern.compile("^\\d+\\/\\d+\\/(\\d+)$");

        for (Birthable a : citizenAndPets) {
            Matcher matcher = pattern.matcher(a.getBirthDate());
            if(matcher.find()){
                if(matcher.group(1).equalsIgnoreCase(year)){
                    System.out.println(matcher.group());
                }
            }
        }
    }
}

package iterators_and_comparators_ex.h_pet_clinics;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer countAnimals = Integer.parseInt(reader.readLine());

        Map<String, Pet> pets = new HashMap<>();
        HashMap<String, Clinic> clinics = new HashMap<>();

        String line;

        for (int i = 0; i < countAnimals; i++) {

            String[] info = reader.readLine().split("\\s+");

//            Create Pet {name} {age} {kind}
//            Create Clinic {name} {rooms}
//            Add {pet's name} {clinic's name}
//            Release {clinic's name}
//            HasEmptyRooms {clinic?s name}
//            Print {clinic's name}
//            Print {clinic's name} {room}


            switch (info[0]) {
                case "Create":
                    if (info[1].equals("Pet")) {
                        Pet newPet = new Pet(info[2], Integer.parseInt(info[3]), info[4]);
                        pets.putIfAbsent(newPet.getName(), newPet);
                        break;
                    } else if (info[1].equals("Clinic")) {
                        try {
                            Clinic newClinic = new Clinic(info[2], Integer.parseInt(info[3]));
                            clinics.putIfAbsent(newClinic.getName(), newClinic);
                        } catch (IllegalArgumentException iae) {
                            System.out.println(iae.getMessage());
                        }
                        break;
                    }
                    break;
                case "Add":
                    try {
                        System.out.println(clinics.get(info[2]).addPet(pets.get(info[1])));
                    } catch (IllegalArgumentException iae) {
                        System.out.println(iae.getMessage());
                    }
                    break;
                case "Release":
                    System.out.println(clinics.get(info[1]).releaseAnimal());
                    break;
                case "HasEmptyRooms":
                    System.out.println(clinics.get(info[1]).hasEmptyRooms());
                    break;
                case "Print":
                    if(info.length == 2){
                        clinics.get(info[1]).print();
                    }else{
                        clinics.get(info[1]).print(Integer.parseInt(info[2]) - 1);
                    }

            }
        }
    }

}

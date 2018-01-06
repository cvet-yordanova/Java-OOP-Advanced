package interfaces_exc.j_mood_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split("[\\s\\|]+");

        String name = input[0];
        String type = input[1];
        Double energy = Double.parseDouble(input[2]);
        Integer level = Integer.parseInt(input[3]);

        Character character = null;
        if(type.equals("Demon")){
            character = new Demon(name, level, energy);
        }else if(type.equals("Archangel")){
            character = new Archangel(name, level, energy);
        }

        System.out.println(character);

    }
}

package interfaces_exc.g_food_storage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Buyer> inhabitants = new HashMap<>();

        Integer countBuyers = Integer.parseInt(reader.readLine());

        for (int i = 0; i < countBuyers; i++) {
            String[] info = reader.readLine().split("\\s+");

            if(info.length == 4){
                Buyer buyer = new Citizen(info[0], Integer.parseInt(info[1]), info[2], info[3]);
                inhabitants.put(info[0],buyer);
            }else if(info.length == 3){
                Buyer buyer = new Rebel(info[0], Integer.parseInt(info[1]), info[2]);

                inhabitants.put(info[0], buyer);
            }
        }


        String line = reader.readLine();
        Integer foodBought = 0;


        while(!line.equalsIgnoreCase("End")){
            String name = line;

            if(inhabitants.containsKey(name)){
                inhabitants.get(name).buyFood();
            }
            line = reader.readLine();
        }


        Integer foodEaten = inhabitants.values().stream().mapToInt(Buyer::getFood).sum();

        System.out.println(foodEaten);
    }
}

package interfaces_exc.e_border_control;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

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
        List<Identifiable> inhabitants = new ArrayList<>();

        while(!line.equalsIgnoreCase("End")){
            String[] info = line.split("\\s+");

            if(info.length == 3){
                String name = info[0];
                Integer age = Integer.parseInt(info[1]);
                String id = info[2];

                Identifiable citizen = new Citizen(name, age, id);
                inhabitants.add(citizen);
            }else if(info.length == 2){
                String model = info[0];
                String id = info[1];

                Identifiable robot = new Robot(model, id);
                inhabitants.add(robot);
            }

            line = reader.readLine();
        }

        String discardId = reader.readLine();

        Pattern pattern = Pattern.compile("^.*"+discardId+"$");

        for (Identifiable inhabitant : inhabitants) {
            Matcher matcher = pattern.matcher(inhabitant.getId());
            if(matcher.find()){
                System.out.println(matcher.group());
            }
        }
    }
}

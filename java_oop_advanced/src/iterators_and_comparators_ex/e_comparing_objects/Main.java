package iterators_and_comparators_ex.e_comparing_objects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Person> people = new ArrayList<>();

        String line;

        while(!(line = reader.readLine()).equalsIgnoreCase("END")){
            String[] info = line.split("\\s+");
            people.add(new Person(info[0],Integer.parseInt(info[1]), info[2]));
        }

        Integer index = Integer.parseInt(reader.readLine());
        Person stat = people.get(index - 1);

        Integer equalPeople = 0;
        Integer notEqual = 0;

        for (Person person : people) {
            if(person.compareTo(stat) == 0){
                equalPeople++;
            }else{
                notEqual++;
            }
        }

        if(equalPeople == 1){
            System.out.println("No matches");
        }else{
            System.out.println(String.format("%d %d %d",  equalPeople, notEqual, people.size()));
        }

    }
}

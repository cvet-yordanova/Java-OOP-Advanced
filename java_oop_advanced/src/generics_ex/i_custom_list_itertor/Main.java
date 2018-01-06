package generics_ex.i_custom_list_itertor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] line;
        MyList<String> list = new MyList<>();

        while(!(line = reader.readLine().split("\\s+"))[0].equals("END")){
            String command = line[0];

            switch (command.toLowerCase()){
                case "add":
                        list.add(line[1]);
                    break;
                case "remove":
                        list.remove(Integer.parseInt(line[1]));
                    break;
                case "contains":
                        System.out.println(list.contains(line[1]));
                    break;
                case "swap":
                        list.swap(Integer.parseInt(line[1]), Integer.parseInt(line[2]));
                    break;
                case "greater":
                        System.out.println(list.countGreaterItems(line[1]));
                    break;
                case "max":
                        System.out.println(list.getMax());
                    break;
                case "min":
                        System.out.println(list.getMin());
                    break;
                case "print":
                    System.out.println(list);
                    break;
                case "sort":
                    list.sort();
                    break;
                case "END":
                    break;
            }
        }

    }
}

package generics_ex.e_generic_count_method_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer count = Integer.parseInt(reader.readLine());

        MyList<String> myList = new MyList<>();

        for (int i = 0; i < count; i++) {
            String line = reader.readLine();
            myList.add(line);
           // Box<String> box = new Box<>(line);
        }

        String searchElement = reader.readLine();

        System.out.println(myList.countGreaterItems(searchElement));
    }
}

package generics_ex.c_swap_elements_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer count = Integer.parseInt(reader.readLine());

        Swap<String> list = new Swap<>();

        for (int i = 0; i < count; i++) {
            String line = reader.readLine();
            list.add(line);
        }

        String[] indexes = reader.readLine().split("\\s+");

        list.swap(Integer.parseInt(indexes[0]), Integer.parseInt(indexes[1]));

        System.out.println(list);;
    }
}

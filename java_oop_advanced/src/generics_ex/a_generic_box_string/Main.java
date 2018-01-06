package generics_ex.a_generic_box_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer count = Integer.parseInt(reader.readLine());

        List<String> list = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            String line = reader.readLine();

            Box<String> box = new Box<>(line);
            System.out.println(box);

        }
    }
}

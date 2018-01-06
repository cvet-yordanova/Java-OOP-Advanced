package generics_ex.b_generic_box_integer;

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
            Integer line = Integer.parseInt(reader.readLine());

            Box<Integer> box = new Box<>(line);
            System.out.println(box);

        }
    }
}

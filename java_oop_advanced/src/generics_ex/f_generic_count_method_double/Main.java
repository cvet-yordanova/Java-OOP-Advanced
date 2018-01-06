package generics_ex.f_generic_count_method_double;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer count = Integer.parseInt(reader.readLine());

        MyList<Double> myList = new MyList<>();

        for (int i = 0; i < count; i++) {
            Double number = Double.parseDouble(reader.readLine());
            myList.add(number);
        }

        Double searchElement = Double.parseDouble(reader.readLine());

        System.out.println(myList.countGreaterItems(searchElement));
    }
}

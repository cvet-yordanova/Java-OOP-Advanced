package generics_ex.i_tuple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstInput = reader.readLine().split("\\s+");
        Tuple<String, String> firstTuple = new Tuple<>(firstInput[0]+" "+firstInput[1],firstInput[2]);

        String[] secondInput = reader.readLine().split("\\s+");
        Tuple<String, Integer> secondTuple = new Tuple<>(secondInput[0], Integer.parseInt(secondInput[1]));

        String[] thirdInput = reader.readLine().split("\\s+");
        Tuple<Integer, Double> thirdTuple = new Tuple<>(Integer.parseInt(thirdInput[0]), Double.parseDouble(thirdInput[1]));

        System.out.println(firstTuple);
        System.out.println(secondTuple);
        System.out.println(thirdTuple);

    }
}

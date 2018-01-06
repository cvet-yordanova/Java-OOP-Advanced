package generics_ex.k_treuple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstInput = reader.readLine().split("\\s+");
        Threeuple<String, String, String> firstTuple = new Threeuple<>(firstInput[0]+" "+firstInput[1],firstInput[2], firstInput[3]);

        String[] secondInput = reader.readLine().split("\\s+");
        Boolean drunk = secondInput[2].equalsIgnoreCase("drunk");
        Threeuple<String, Integer, Boolean> secondTuple = new Threeuple<>(secondInput[0], Integer.parseInt(secondInput[1]), drunk);

        String[] thirdInput = reader.readLine().split("\\s+");
        Threeuple<String, Double, String> thirdTuple = new Threeuple<>(thirdInput[0], Double.parseDouble(thirdInput[1]), thirdInput[2]);

        System.out.println(firstTuple);
        System.out.println(secondTuple);
        System.out.println(thirdTuple);

    }
}

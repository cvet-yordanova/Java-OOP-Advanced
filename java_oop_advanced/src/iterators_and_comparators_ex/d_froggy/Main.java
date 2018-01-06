package iterators_and_comparators_ex.d_froggy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> x = Arrays.stream(reader.readLine().replaceAll(",","").split("\\s"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Lake lake = new Lake(x);

      //  System.out.println(String.join(", ",
      //          lake.getNumbers().stream().map(String::valueOf).collect(Collectors.toList())));
    }
}

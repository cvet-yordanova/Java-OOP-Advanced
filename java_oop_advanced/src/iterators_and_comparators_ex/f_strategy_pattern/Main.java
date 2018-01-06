package iterators_and_comparators_ex.f_strategy_pattern;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer countLines = Integer.parseInt(reader.readLine());
        TreeSet<Person> nameSorted = new TreeSet<>(new NameComparator());
        TreeSet<Person> ageSorted = new TreeSet<>(new AgeComparator());

        for (int i = 0; i < countLines; i++) {
            String[] info = reader.readLine().split("\\s+");
            nameSorted.add(new Person(info[0], Integer.parseInt(info[1])));
            ageSorted.add(new Person(info[0], Integer.parseInt(info[1])));
        }

        nameSorted.forEach(System.out::println);
        ageSorted.forEach(System.out::println);
    }
}

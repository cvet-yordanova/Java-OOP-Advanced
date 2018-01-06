package iterators_and_comparators_ex.g_equality_logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer countLines = Integer.parseInt(reader.readLine());
        Set<Person> treeSet = new TreeSet<>(new PersonComparator());
        Set<Person> hashSet = new HashSet<>();

        for (int i = 0; i < countLines; i++) {
            String[] info = reader.readLine().split("\\s+");
            treeSet.add(new Person(info[0], Integer.parseInt(info[1])));
            hashSet.add(new Person(info[0], Integer.parseInt(info[1])));
        }

        System.out.println(treeSet.size());
        System.out.println(hashSet.size());
    }
}

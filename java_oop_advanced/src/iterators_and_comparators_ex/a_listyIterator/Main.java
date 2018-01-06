package iterators_and_comparators_ex.a_listyIterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line;
        ListyIterator list = new ListyIterator();

        while(!(line = reader.readLine()).equalsIgnoreCase("END")){

            String[] info = line.split("\\s+");

            switch (info[0]){
                case "Create":
                    if(info.length > 1) {
                        list.create(Arrays.copyOfRange(info, 1, info.length));
                    }else{
                        list.create();
                    }
                    break;
                case "Move":
                    System.out.println(list.move());
                    break;
                case "HasNext":
                    System.out.println(list.hasNext());
                    break;
                case "Print":
                    list.print();
                    break;
            }
        }
    }
}

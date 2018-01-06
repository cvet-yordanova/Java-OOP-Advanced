package iterators_and_comparators_ex.h_pet_clinics;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Integer> animals = new ArrayList<Integer>(){};

        animals.add(1);
        animals.add(2);
        animals.add(3);
        animals.add(4);
        animals.add(5);


        int diff = 1;
        int counter = -1;
        Integer index = -1;

        while (true) {

            counter++;

            if(index == animals.size() - 1) {
                break;
            }

            if(counter == 0){
                index = animals.size() / 2;
                System.out.println(animals.get(index));
                continue;
            }else {

                if (counter % 2 != 0) {
                    index = animals.size() / 2 - diff;
                } else if (counter % 2 == 0) {
                    index = animals.size() / 2 + diff;
                    diff++;
                }
            }
            System.out.println(animals.get(index));


        }

    }
}

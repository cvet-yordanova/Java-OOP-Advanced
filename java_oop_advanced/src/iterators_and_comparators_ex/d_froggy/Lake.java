package iterators_and_comparators_ex.d_froggy;

import javax.print.attribute.IntegerSyntax;
import java.util.*;

public class Lake<Integer> implements Iterable<Integer>{

    private List<Integer> numbers;

    Lake(List<Integer> numbers) {
        this.setNumbers(numbers);
    }

    private void setNumbers(List<Integer> numbers){
        List<Integer> evens = new ArrayList<>();
        List<Integer> odds = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
             if(i % 2 == 0){
                 evens.add(numbers.get(i));
             }else{
                 odds.add(numbers.get(i));
             }
        }

        this.numbers = new ArrayList<>();

        this.numbers.addAll(evens);
        this.numbers.addAll(odds);
    }

     List<Integer> getNumbers() {
        return Collections.unmodifiableList(this.numbers);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Frog();
    }

    private final class Frog implements Iterator<Integer>{

        private int counter;

        @Override
        public boolean hasNext() {
            return counter == numbers.size();
        }

        @Override
        public Integer next() {
            counter++;
            return numbers.get(counter - 1);
        }
    }
}

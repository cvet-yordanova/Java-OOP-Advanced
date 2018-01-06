package iterators_and_comparators_ex.f_strategy_pattern;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person>{
    @Override
    public int compare(Person first, Person second) {
        return first.getAge().compareTo(second.getAge());
    }
}

package iterators_and_comparators_ex.f_strategy_pattern;

import java.util.Comparator;

public class NameComparator implements Comparator<Person>{
    @Override
    public int compare(Person first, Person second) {
        if(first.getName().length() == second.getName().length()){
            return first.getName().toLowerCase().compareTo(second.getName().toLowerCase());
        }
        return Integer.compare(first.getName().length(), second.getName().length());
    }
}

package iterators_and_comparators_ex.e_comparing_objects;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person>{
    @Override
    public int compare(Person first, Person second) {

        if(first.getName().compareTo(second.getName()) == 0){
            if(first.getAge().compareTo(second.getAge()) == 0){
                return first.getTown().compareTo(second.getTown());
            }else{
                return first.getAge().compareTo(second.getAge());
            }
        }
        return first.getName().compareTo(second.getName());
    }
}

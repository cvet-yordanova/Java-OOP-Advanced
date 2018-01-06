package generics_ex.f_generic_count_method_double;

import java.util.ArrayList;
import java.util.List;

public class MyList<T extends Comparable<T>> {
    private List<T> list;

    MyList() {
        this.list = new ArrayList<T>();
    }

    public void add(T element){
        this.list.add(element);
    }


    public Integer countGreaterItems(T item){
        Integer count = 0;
        for (T t : list) {
            if(t.compareTo(item) > 0){
                count++;
            }
        }

        return count;
    }
}

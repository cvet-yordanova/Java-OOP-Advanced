package generics_ex.i_custom_list_itertor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MyList<T extends Comparable<T>> implements Iterable<T>{
    private List<T> list;

    MyList() {
        this.list = new ArrayList<T>();
    }

    public void add(T element){
        this.list.add(element);
    }

    void remove(int index){
        this.list.remove(index);
    }

    boolean contains(T element){
        return this.list.contains(element);
    }


    Integer countGreaterItems(T item){
        Integer count = 0;
        for (T t : list) {
            if(t.compareTo(item) > 0){
                count++;
            }
        }

        return count;
    }

    void swap(int ind1, int ind2){
        T firstElement = this.list.get(ind1);
        this.list.set(ind1, this.list.get(ind2));
        this.list.set(ind2, firstElement);

    }

    T getMax(){
        return Collections.max(list);
    }

    T getMin(){
        return Collections.min(list);
    }

    public List<T> getList() {
        return Collections.unmodifiableList(this.list);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (T t : this) {
            sb.append(t).append(System.lineSeparator());
        }

        return sb.toString().trim();
    }

    public void sort(){
        this.list.sort(Comparable::compareTo);
    }

    @Override
    public Iterator<T> iterator() {
        return this.list.iterator();
    }
}

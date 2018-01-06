package open_close_liskov_principles_lab.a_extends_list.P01_ExtendedArrayList;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.BiFunction;

public class ExtendedArrayList<T extends Comparable> extends ArrayList<T> implements CustomList<T>{


    @Override
    public T min(){
        BiFunction<T, T, Boolean> function = (t, t2) -> t.compareTo(t2) > 0;
        return getMinOrMax(function);
    }

    @Override
    public T max(){
        BiFunction<T, T, Boolean> function = (t, t2) -> t.compareTo(t2) < 0;
        return getMinOrMax(function);
    }


    public T getMinOrMax(BiFunction<T, T, Boolean> function){
        T max = null;
        Iterator<T> iterator = super.iterator();
        while(iterator.hasNext()){
            T nextElement = iterator.next();
            if(max == null || function.apply(nextElement, max)) {
                max = nextElement;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        CustomList<Integer> nums = new ExtendedArrayList<>();

        nums.add(100);
        nums.add(1400);
        nums.add(1890980);
        nums.add(2);
        nums.add(-1);
        System.out.println(nums.max());
        System.out.println(nums.min());
    }

}

package open_close_liskov_principles_lab.a_extends_list.P01_ExtendedArrayList;

import java.util.List;

public interface CustomList<T> extends List<T> {
    Comparable min();

    T max();
}

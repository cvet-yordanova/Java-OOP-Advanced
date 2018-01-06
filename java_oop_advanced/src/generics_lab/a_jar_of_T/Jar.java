package generics_lab.a_jar_of_T;

import java.util.ArrayDeque;
import java.util.Deque;

public class Jar<T> {

    private Deque<T> elements;

    public Jar(){
        this.elements = new ArrayDeque<T>();
    }

    public void add(T element){
        elements.push(element);
    }

    public T remove(){
        return elements.pop();
    }
}

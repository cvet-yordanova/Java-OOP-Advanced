package iterators_and_comparators_ex.c_stack_iterator;

import java.util.Iterator;
import java.util.Stack;

public class CustomStack implements Iterable{
    private Stack<Integer> stack;

     CustomStack() {
        this.stack = new Stack<>();
    }

    @Override
    public Iterator iterator() {
        return stack.iterator();
    }

     void push(String[] elements){
        for (String element : elements) {
            this.stack.push(Integer.valueOf(element));
        }
    }

     Integer pop() throws IllegalArgumentException{
        if(this.stack.size() == 0){
            throw new IllegalStateException("No elements");
        }
        return this.stack.pop();
    }

    public Stack<Integer> getStack() {
        return stack;
    }
}

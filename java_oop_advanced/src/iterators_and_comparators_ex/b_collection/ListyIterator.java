package iterators_and_comparators_ex.b_collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListyIterator<String> implements Iterable<String>{

    private List<String> list;
    private Integer internalIndex;

    public ListyIterator() {
        this.internalIndex = 0;
    }

    public void create(String... strings){
        this.list = Arrays.asList(strings);
    }

    public Boolean move(){
        if(!this.hasNext()){
            return false;
        }else{
            this.internalIndex++;
            return true;
        }
    }

    public Boolean hasNext(){
        if(internalIndex == this.list.size() - 1){
            return false;
        }
        return true;
    }

    public void print(){
        try {
            System.out.println(this.list.get(this.internalIndex));
        }catch (IndexOutOfBoundsException ioe){
            System.out.println("Invalid Operation!");
        }
    }

    public void printAll(){
        if(this.list.size() < 0){
            throw new IllegalArgumentException("Invalid Operation!");
        }
        this.list.forEach(a -> System.out.print(a + " "));
        System.out.println();
    }

    @Override
    public Iterator<String> iterator() {
        return new listIterator();
    }

    private final class listIterator implements Iterator<String>{

        private int ind;

        @Override
        public boolean hasNext() {
            if(this.ind < list.size()) { return true; }
            return false;
        }

        @Override
        public String next() {
            ind++;
            return list.get(ind - 1);
        }
    }
}

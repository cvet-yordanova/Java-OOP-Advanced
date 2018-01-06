package interfaces_exc.i_collection_hierarchy;

import java.util.ArrayList;
import java.util.List;

public class MyList implements IMyList{

    private List<String> collection;

    public MyList() {
        this.collection = new ArrayList<>();
    }

    @Override
    public Integer add(String str) {
        this.collection.add(0, str);
        return 0;
    }

    @Override
    public Integer used() {
        return collection.size();
    }

    @Override
    public String remove() {
        String removed = collection.get(0);
        collection.remove(0);
        return removed;
    }
}

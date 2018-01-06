package interfaces_exc.i_collection_hierarchy;

import java.util.ArrayList;
import java.util.List;

public class RemoveCollection implements IAddRemoveCollection{

    private List<String> collection;

    public RemoveCollection() {
        this.collection = new ArrayList<>();
    }

    @Override
    public Integer add(String str) {
        collection.add(0, str);
        return 0;
    }

    @Override
    public String remove() {
        String removed = collection.get(collection.size() - 1);
        this.collection.remove(collection.size() - 1);
        return removed;
    }
}

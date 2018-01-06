package interfaces_exc.i_collection_hierarchy;

import java.util.ArrayList;
import java.util.List;

public class AddCollection implements IAddCollection{

    private List<String> collection;

    public AddCollection() {
        this.collection = new ArrayList<>();
    }

    @Override
    public Integer add(String str) {
        this.collection.add(str);
        return collection.size() - 1;
    }
}

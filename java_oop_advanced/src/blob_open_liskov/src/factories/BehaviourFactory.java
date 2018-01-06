package blob_open_liskov.src.factories;

import blob_open_liskov.src.interfaces.Behavior;
import blob_open_liskov.src.interfaces.Factory;
import blob_open_liskov.src.models.behavors.Aggressive;
import blob_open_liskov.src.models.behavors.Inflated;

public class BehaviourFactory<T extends Behavior> implements Factory<Behavior> {

    //todo mit reflextion zu tun
    public static Behavior createUnit(String[] args) {
        if(args[4].equals("Inflated")){
            return new Inflated();
        }else{
            return new Aggressive();
        }
    }
}

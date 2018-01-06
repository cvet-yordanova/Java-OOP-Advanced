package blob_open_liskov.src.factories;

import blob_open_liskov.src.interfaces.Attack;
import blob_open_liskov.src.interfaces.Behavior;
import blob_open_liskov.src.interfaces.Blob;
import blob_open_liskov.src.interfaces.Factory;
import blob_open_liskov.src.models.BlobImpl;

public class BlobFactory implements Factory<Blob>{

    //todo kak e napraveno da se dobavqt atakite i povedenieto

    public static BlobImpl createUnit(String[] args, Behavior behavior, Attack attack) {
        return new BlobImpl(args[0], Integer.parseInt(args[1]),Integer.parseInt(args[1]), behavior, attack);
    }
}

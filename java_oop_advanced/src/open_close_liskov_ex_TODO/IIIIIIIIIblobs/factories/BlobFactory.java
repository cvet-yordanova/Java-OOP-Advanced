package open_close_liskov_ex_TODO.IIIIIIIIIblobs.factories;

import open_close_liskov_ex_TODO.IIIIIIIIIblobs.interfaces.Attack;
import open_close_liskov_ex_TODO.IIIIIIIIIblobs.interfaces.Behavior;
import open_close_liskov_ex_TODO.IIIIIIIIIblobs.interfaces.Blob;
import open_close_liskov_ex_TODO.IIIIIIIIIblobs.models.BlobImpl;

public final class BlobFactory  {

    private BlobFactory() {
    }

    public static Blob create(String name, int health, int damage, Behavior behavior, Attack attack) {
        return new BlobImpl(name, health, damage, behavior, attack);
    }
}

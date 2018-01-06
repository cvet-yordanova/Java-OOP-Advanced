package blob_open_liskov.src.interfaces;

import blob_open_liskov.src.models.BlobImpl;

public interface Attack {

    void execute(BlobImpl attacker, BlobImpl target);
}

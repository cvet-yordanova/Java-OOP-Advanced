package blob_open_liskov.src.models.attacks;

import blob_open_liskov.src.interfaces.Blob;
import blob_open_liskov.src.interfaces.Repository;
import blob_open_liskov.src.models.BlobImpl;

public class Bloplode extends AbstractAttack{

    private String[] args;
    private Repository<Blob> repository;

    @Override
    public void execute(BlobImpl attacker, BlobImpl target) {
        target.respond(attacker.getDamage());
    }
}

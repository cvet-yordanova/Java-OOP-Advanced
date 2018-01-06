package blob_open_liskov.src.models.attacks;

import blob_open_liskov.src.models.BlobImpl;

public class PutridFart extends AbstractAttack {

    @Override
    public void execute(BlobImpl source, BlobImpl target) {
        target.respond(source.getDamage());
    }
}

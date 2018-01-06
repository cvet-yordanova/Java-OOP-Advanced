package blob_open_liskov.src.models.behavors;

import blob_open_liskov.src.models.BlobImpl;

public class Inflated extends AbstractBehavior {

    private static final Integer HEALTH_INCREASE = 50;
    private static final Integer LOOSE_HEALTH = 10;

    @Override
    public void trigger(BlobImpl blob) {
        super.setIsTriggered(true);
        this.applyRecurrentEffect(blob);
    }

    @Override
    public void applyRecurrentEffect(BlobImpl blob) {
        blob.setDamage(blob.getHealth() + HEALTH_INCREASE);
    }
}

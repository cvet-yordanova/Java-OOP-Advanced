package open_close_liskov_ex_TODO.IIIIIIIIIblobs.models.behavors;

import open_close_liskov_ex_TODO.IIIIIIIIIblobs.interfaces.Blob;

public class Inflated extends AbstractBehavior {
    private static final int INFLATED_HEALTH_INCREASE = 50;
    private static final int INFLATED_HEALTH_DECREMENT = 10;

    @Override
    public void trigger(Blob blob) {
        super.setIsTriggered(true);
        blob.setHealth(blob.getHealth() + INFLATED_HEALTH_INCREASE);
    }

    @Override
    public void applyRecurrentEffect(Blob blob) {
        blob.setHealth(blob.getHealth() - INFLATED_HEALTH_DECREMENT);
    }
}
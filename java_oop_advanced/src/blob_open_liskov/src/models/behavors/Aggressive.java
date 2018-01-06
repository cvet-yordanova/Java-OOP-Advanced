package blob_open_liskov.src.models.behavors;

import blob_open_liskov.src.models.BlobImpl;

public class Aggressive extends AbstractBehavior {

    private static final int AGGRESSIVE_DAMAGE_MULTIPLY = 2;
    private static final int AGGRESSIVE_DAMAGE_DECREMENT = 5;

    private int sourceInitialDamage;

    public Aggressive() {
        super();
    }

    public void trigger(BlobImpl blob) {
       // this.sourceInitialDamage = source.getDamage();
        super.setIsTriggered(true);
        this.applyTriggerEffect(blob);
    }

    public void applyRecurrentEffect(BlobImpl source) {
        //todo ...
        if (super.toDelayRecurrentEffect()) {
            super.setToDelayRecurrentEffect(false);
        } else {
            source.setDamage(source.getDamage() - AGGRESSIVE_DAMAGE_DECREMENT);

            if (source.getDamage() <= this.sourceInitialDamage) {
                source.setDamage(this.sourceInitialDamage);
            }
        }
    }

    public boolean toDelayRecurrentEffect() {
        return super.toDelayRecurrentEffect;
    }

    public void setToDelayRecurrentEffect(boolean toDelayRecurrentEffect){
        super.toDelayRecurrentEffect = toDelayRecurrentEffect;
    }

    private void applyTriggerEffect(BlobImpl blob) {
        blob.setDamage(blob.getDamage() * AGGRESSIVE_DAMAGE_MULTIPLY);
    }
}

package open_close_liskov_ex_TODO.IIIIIIIIIblobs.models.behavors;

import open_close_liskov_ex_TODO.IIIIIIIIIblobs.interfaces.Behavior;

public abstract class AbstractBehavior implements Behavior {

    private boolean isTriggered;

    protected AbstractBehavior() {
    }

    @Override
    public boolean isTriggered() {
        return this.isTriggered;
    }

    protected void setIsTriggered(boolean isTriggered) {
        this.isTriggered = isTriggered;
    }
}

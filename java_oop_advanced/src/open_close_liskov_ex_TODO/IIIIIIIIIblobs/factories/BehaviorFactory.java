package open_close_liskov_ex_TODO.IIIIIIIIIblobs.factories;


import open_close_liskov_ex_TODO.IIIIIIIIIblobs.interfaces.Behavior;
import open_close_liskov_ex_TODO.IIIIIIIIIblobs.models.behavors.Aggressive;
import open_close_liskov_ex_TODO.IIIIIIIIIblobs.models.behavors.Inflated;

public final class BehaviorFactory {
    private static final String AGGRESSIVE_BEHAVIOR_TYPE = "Aggressive";

    private BehaviorFactory() {
    }

    public static Behavior create(String type) {
        if (AGGRESSIVE_BEHAVIOR_TYPE.equalsIgnoreCase(type)) {
            return new Aggressive();
        } else {
            return new Inflated();
        }
    }
}

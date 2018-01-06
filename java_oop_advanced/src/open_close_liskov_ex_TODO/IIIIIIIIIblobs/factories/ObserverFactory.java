package open_close_liskov_ex_TODO.IIIIIIIIIblobs.factories;

import open_close_liskov_ex_TODO.IIIIIIIIIblobs.interfaces.Blob;
import open_close_liskov_ex_TODO.IIIIIIIIIblobs.interfaces.Observer;
import open_close_liskov_ex_TODO.IIIIIIIIIblobs.interfaces.OutputWriter;
import open_close_liskov_ex_TODO.IIIIIIIIIblobs.observers.DeadBlobObserver;
import open_close_liskov_ex_TODO.IIIIIIIIIblobs.observers.TogglesBehaviorObserver;

public final class ObserverFactory {

    private ObserverFactory() {
    }

    public static Observer createDeadBlobObserver(Blob blob, OutputWriter writer) {
        return new DeadBlobObserver(blob, writer);
    }

    public static Observer createTogglesBehaviorObserver(Blob blob, OutputWriter writer) {
        return new TogglesBehaviorObserver(blob, writer);
    }
}

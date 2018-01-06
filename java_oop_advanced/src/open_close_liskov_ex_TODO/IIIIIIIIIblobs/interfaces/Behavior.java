package open_close_liskov_ex_TODO.IIIIIIIIIblobs.interfaces;

public interface Behavior {

    boolean isTriggered();

    void trigger(Blob blob);

    void applyRecurrentEffect(Blob blob);
}

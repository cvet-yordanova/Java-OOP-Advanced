package open_close_liskov_ex_TODO.IIIIIIIIIblobs.observers;


import open_close_liskov_ex_TODO.IIIIIIIIIblobs.interfaces.Blob;
import open_close_liskov_ex_TODO.IIIIIIIIIblobs.interfaces.OutputWriter;

public class TogglesBehaviorObserver extends AbstractObserver {

    public TogglesBehaviorObserver(Blob blob, OutputWriter writer) {
        super(blob, writer);
    }

    @Override
    public void update() {
        super.getWriter().writeLine(String.format("BlobImpl %s toggled %sBehavior", super.getBlob().getName(), super.getBlob().getBehavior().getClass().getSimpleName()));
    }
}

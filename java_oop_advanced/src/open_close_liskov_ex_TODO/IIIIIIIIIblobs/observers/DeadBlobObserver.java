package open_close_liskov_ex_TODO.IIIIIIIIIblobs.observers;

import open_close_liskov_ex_TODO.IIIIIIIIIblobs.interfaces.Blob;
import open_close_liskov_ex_TODO.IIIIIIIIIblobs.interfaces.OutputWriter;

public class DeadBlobObserver extends AbstractObserver {

    public DeadBlobObserver(Blob blob, OutputWriter writer) {
        super(blob, writer);
    }

    @Override
    public void update() {
        super.getWriter().writeLine("BlobImpl %s was killed", super.getBlob().getName());
    }
}

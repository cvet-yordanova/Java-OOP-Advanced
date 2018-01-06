package open_close_liskov_ex_TODO.IIIIIIIIIblobs.observers;


import open_close_liskov_ex_TODO.IIIIIIIIIblobs.interfaces.Blob;
import open_close_liskov_ex_TODO.IIIIIIIIIblobs.interfaces.Observer;
import open_close_liskov_ex_TODO.IIIIIIIIIblobs.interfaces.OutputWriter;

public abstract class AbstractObserver implements Observer {

    private Blob blob;
    private OutputWriter writer;

    protected AbstractObserver(Blob blob, OutputWriter writer) {
        this.blob = blob;
        this.writer = writer;
    }

    protected OutputWriter getWriter() {
        return this.writer;
    }

    protected Blob getBlob() {
        return this.blob;
    }
}

package open_close_liskov_ex_TODO.IIIIIIIIIblobs.core;


import open_close_liskov_ex_TODO.IIIIIIIIIblobs.annotations.Inject;
import open_close_liskov_ex_TODO.IIIIIIIIIblobs.interfaces.Blob;
import open_close_liskov_ex_TODO.IIIIIIIIIblobs.interfaces.Executable;
import open_close_liskov_ex_TODO.IIIIIIIIIblobs.repositories.Repository;

import java.util.Collections;
import java.util.List;

public abstract class BaseCommand implements Executable {

    @Inject
    private List<String> params;
    @Inject
    private Repository<Blob> blobRepository;

    protected BaseCommand() {}

    protected List<String> getParams() {
        return Collections.unmodifiableList(this.params);
    }

    protected Repository<Blob> getBlobRepository() {
        return this.blobRepository;
    }
}

package blob_open_liskov.src.commands;

import blob_open_liskov.src.interfaces.Command;
import blob_open_liskov.src.interfaces.Repository;

public abstract class AbstractCommand implements Command {
    private Repository blobRepository;
    private String[] args;

    public AbstractCommand(Repository blobRepository, String[] args) {
        this.blobRepository = blobRepository;
        this.args = args;
    }

    public Repository getBlobRepository() {
        return blobRepository;
    }

    public String[] getArgs() {
        return args;
    }
}

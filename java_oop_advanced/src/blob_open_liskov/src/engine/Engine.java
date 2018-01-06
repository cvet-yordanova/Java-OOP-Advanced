package blob_open_liskov.src.engine;

import blob_open_liskov.src.interfaces.Reader;
import blob_open_liskov.src.interfaces.Repository;
import blob_open_liskov.src.interfaces.Writer;

import java.io.IOException;

public class Engine implements Runnable {

    private static String COMMANDS_PATH;
    private static String TERMINATING_STRING;
    private Reader reader;
    private Writer writer;
    private Repository blobRepository;

    public Engine(Reader reader, Writer writer, Repository blobRepository) {
        this.reader = reader;
        this.writer = writer;
        this.blobRepository = blobRepository;
    }

    @Override
    public void run() {
        try {
            String[] line = this.reader.readLine().split("\\s+");

            while(true) {
                if (line[0].equals(TERMINATING_STRING)) {
                    break;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

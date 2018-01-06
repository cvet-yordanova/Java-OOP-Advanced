package blob_open_liskov.src.io;

import blob_open_liskov.src.interfaces.Reader;

import java.io.BufferedReader;
import java.io.IOException;

public class ConsoleReader implements Reader {
    private BufferedReader reader;

    public ConsoleReader(BufferedReader reader) {
        this.reader = reader;
    }

    @Override
    public String readLine() throws IOException {
        return this.reader.readLine();
    }
}

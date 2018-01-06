package blob_open_liskov.src.interfaces;

import java.io.IOException;

public interface Reader {
    String readLine() throws IOException;
}

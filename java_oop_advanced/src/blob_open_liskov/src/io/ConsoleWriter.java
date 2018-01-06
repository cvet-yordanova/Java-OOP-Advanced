package blob_open_liskov.src.io;

import blob_open_liskov.src.interfaces.Writer;

public class ConsoleWriter implements Writer {
    @Override
    public void printLine(String text) {
        System.out.println(text);
    }
}

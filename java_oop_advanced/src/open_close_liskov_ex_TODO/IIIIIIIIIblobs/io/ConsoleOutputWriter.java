package open_close_liskov_ex_TODO.IIIIIIIIIblobs.io;

import open_close_liskov_ex_TODO.IIIIIIIIIblobs.interfaces.OutputWriter;

public class ConsoleOutputWriter implements OutputWriter {
    @Override
    public void writeLine(String output) {
        System.out.println(output);
    }

    @Override
    public void writeLine(String format, Object... params) {
        System.out.println(String.format(format, params));
    }
}

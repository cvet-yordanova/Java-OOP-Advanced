package open_close_liskov_ex_TODO.IIIIIIIIIblobs.interfaces;

public interface OutputWriter {

    void writeLine(String output);

    void writeLine(String format, Object... params);
}
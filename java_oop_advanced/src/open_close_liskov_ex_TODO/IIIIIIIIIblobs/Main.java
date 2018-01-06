package open_close_liskov_ex_TODO.IIIIIIIIIblobs;

import open_close_liskov_ex_TODO.IIIIIIIIIblobs.engine.Engine;
import open_close_liskov_ex_TODO.IIIIIIIIIblobs.interfaces.Blob;
import open_close_liskov_ex_TODO.IIIIIIIIIblobs.interfaces.InputReader;
import open_close_liskov_ex_TODO.IIIIIIIIIblobs.interfaces.OutputWriter;
import open_close_liskov_ex_TODO.IIIIIIIIIblobs.io.ConsoleInputReader;
import open_close_liskov_ex_TODO.IIIIIIIIIblobs.io.ConsoleOutputWriter;
import open_close_liskov_ex_TODO.IIIIIIIIIblobs.repositories.BlobRepository;
import open_close_liskov_ex_TODO.IIIIIIIIIblobs.repositories.Repository;
import open_close_liskov_ex_TODO.IIIIIIIIIblobs.utility.MutableBoolean;

public class Main {
    public static void main(String[] args) {
        InputReader reader = new ConsoleInputReader();
        OutputWriter writer = new ConsoleOutputWriter();
        Repository<Blob> blobRepository = new BlobRepository<>();
        MutableBoolean flag = new MutableBoolean();
        Runnable engine = new Engine(reader, writer, blobRepository, flag);

        engine.run();
    }
}

package a_logger;

import a_logger.factories.AppenderFactoryImpl;
import a_logger.interfaces.AppenderFactory;
import a_logger.interfaces.Reader;
import a_logger.interfaces.Runnable;
import a_logger.interfaces.Writer;
import a_logger.io.ConsoleReader;
import a_logger.io.ConsoleWriter;
import a_logger.models.Engine;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ReflectiveOperationException {

        Reader reader = new ConsoleReader();
        Writer writer = new ConsoleWriter();
        AppenderFactory appenderFactory = new AppenderFactoryImpl();
        Runnable engine =  new Engine(reader,writer,appenderFactory);
        engine.run();
    }
}

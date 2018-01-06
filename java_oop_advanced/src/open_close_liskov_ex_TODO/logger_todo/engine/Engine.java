package open_close_liskov_ex_TODO.logger_todo.engine;

import open_close_liskov_ex_TODO.logger_todo.appenders.Appender;
import open_close_liskov_ex_TODO.logger_todo.factories.AppenderFactory;
import open_close_liskov_ex_TODO.logger_todo.io.Reader;
import open_close_liskov_ex_TODO.logger_todo.io.Writer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Engine {
    Reader reader;
    Writer writer;
    List<Appender> appenders;
    AppenderFactory appenderFactory;


    public Engine(Reader reader, Writer writer) {
        this.reader = reader;
        this.writer = writer;
        this.appenders = new ArrayList<>();
    }

    private void getLoggers(int count) throws IOException, ReflectiveOperationException {
        for (int i = 0; i < count; i++) {
            String[] info = reader.readLine().split("\\s+");
            this.appenders.add(this.appenderFactory.createAppender(info));
        }
    }


}

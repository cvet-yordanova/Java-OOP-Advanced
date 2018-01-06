package open_close_liskov_ex_TODO.logger_todo.factories;

import open_close_liskov_ex_TODO.logger_todo.appenders.Appender;
import open_close_liskov_ex_TODO.logger_todo.appenders.FileAppender;
import open_close_liskov_ex_TODO.logger_todo.layouts.Layout;

import java.lang.reflect.InvocationTargetException;

public class AppenderFactory {

    private final String PATH = "open_close_liskov_ex_TODO.logger_todo.appenders.";

    public Appender createAppender(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        String nameAppender = args[0];
        String layoutName = args[1];
        Class<Appender> appenderClass = (Class<Appender>) Class.forName(PATH + nameAppender);
        Class<Layout> layoutClass = (Class<Layout>) Class.forName(PATH + layoutName);

        Appender appender = appenderClass.getDeclaredConstructor().newInstance();
        Layout layout = layoutClass.getDeclaredConstructor().newInstance();

        appender.setLayout(layout);

        if(appender instanceof FileAppender){

        }

       return appender;

    }
}

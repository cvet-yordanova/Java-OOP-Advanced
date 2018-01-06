package open_close_liskov_ex_TODO.logger_todo.loggers;

import a_logger.interfaces.Appender;

import java.util.List;

public class LoggerImpl implements Logger {

    private List<Appender> appenders;

    public LoggerImpl(List<Appender> appenders) {
        this.appenders = appenders;
    }


}

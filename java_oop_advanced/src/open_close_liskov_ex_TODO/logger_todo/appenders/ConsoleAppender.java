package open_close_liskov_ex_TODO.logger_todo.appenders;

import open_close_liskov_ex_TODO.logger_todo.layouts.Layout;

public class ConsoleAppender extends AppenderImpl {

    public ConsoleAppender(Layout layout) {
        super(layout);
    }
}

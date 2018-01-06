package open_close_liskov_ex_TODO.logger_todo.appenders;

import open_close_liskov_ex_TODO.logger_todo.layouts.Layout;

public class FileAppender extends AppenderImpl{

    public FileAppender(Layout layout) {
        super(layout);
    }
}

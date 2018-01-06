package open_close_liskov_ex_TODO.logger_todo.appenders;

import open_close_liskov_ex_TODO.logger_todo.layouts.Layout;

public interface Appender {
    public void append(String as, String vf);
    public void setLayout(Layout layout);
 }


package open_close_liskov_ex_TODO.logger_todo.appenders;

import open_close_liskov_ex_TODO.logger_todo.layouts.Layout;
import open_close_liskov_ex_TODO.logger_todo.report_levels.ReportLevel;

public class AppenderImpl implements Appender{

    private Layout layout;
    ReportLevel reportLevel;

    public AppenderImpl(Layout layout) {
        this.layout = layout;
    }

    @Override
    public void append(String as, String vf) {

    }

    public void setLayout(Layout layout) {
        this.layout = layout;
    }


}

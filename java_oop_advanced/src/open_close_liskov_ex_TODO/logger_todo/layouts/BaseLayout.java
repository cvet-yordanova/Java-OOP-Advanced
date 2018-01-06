package open_close_liskov_ex_TODO.logger_todo.layouts;

public class BaseLayout implements Layout{
    private String FORMAT;

    public BaseLayout(String FORMAT) {
        this.FORMAT = FORMAT;
    }

    @Override
    public String getLog(String message, String neshtosi) {
        return this.FORMAT;
    }

    public void setFORMAT(String FORMAT) {
        this.FORMAT = FORMAT;
    }
}

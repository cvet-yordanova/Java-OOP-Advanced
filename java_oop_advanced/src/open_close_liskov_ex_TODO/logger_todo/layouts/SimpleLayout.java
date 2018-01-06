package open_close_liskov_ex_TODO.logger_todo.layouts;

public class SimpleLayout extends BaseLayout {

    private String FORMAT = "<date-time> - <report level> - <message>";

    public SimpleLayout(String FORMAT) {
        super(FORMAT);
    }

    @Override
    public String getLog(String message, String neshtosi) {
        //TODO
        return String.format(FORMAT, message, neshtosi);
    }


}

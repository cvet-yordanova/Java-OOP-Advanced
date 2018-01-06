package open_close_liskov_ex_TODO.logger_todo.io;

public class ConsoleWriter implements Writer{

    public void writeLine(String text){
        System.out.println(text);
    }
}

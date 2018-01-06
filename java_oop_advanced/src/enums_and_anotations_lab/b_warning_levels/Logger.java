package enums_and_anotations_lab.b_warning_levels;

import java.util.ArrayList;
import java.util.List;

public class Logger {

    private List<Message> messages;
    private Importance importance;

    public Logger(Importance importance) {
        this.messages = new ArrayList<>();
        this.importance = importance;
    }

    void receiveMessage(Importance importance, String message){
        if(this.importance.getPriority() <= importance.getPriority()){
            this.messages.add(new Message(importance+": " + message));
        }
    }

    public Iterable<Message> getMessages(){
        return this.messages;
    }
}

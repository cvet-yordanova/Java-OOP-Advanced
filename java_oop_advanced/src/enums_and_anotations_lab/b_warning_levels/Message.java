package enums_and_anotations_lab.b_warning_levels;

public class Message {
    private String message;

    public Message(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return this.message.toString();
    }
}

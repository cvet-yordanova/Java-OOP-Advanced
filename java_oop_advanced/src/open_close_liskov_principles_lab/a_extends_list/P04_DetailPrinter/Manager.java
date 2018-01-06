package open_close_liskov_principles_lab.a_extends_list.P04_DetailPrinter;

public class Manager extends Employee {

    private Iterable<String> documents;

    private Manager(String name, Iterable<String> documents) {
        super(name);
        this.documents = documents;
    }

    @Override
    public String toString() {
        return "Manager";
    }
}

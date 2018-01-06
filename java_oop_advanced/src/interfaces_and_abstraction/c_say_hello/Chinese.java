package interfaces_and_abstraction.c_say_hello;

public class Chinese extends BasePerson implements Person{

    public Chinese(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Djydjybydjy";
    }
}

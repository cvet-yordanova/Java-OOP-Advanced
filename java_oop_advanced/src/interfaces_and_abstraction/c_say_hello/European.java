package interfaces_and_abstraction.c_say_hello;

public class European extends BasePerson implements Person{

    public European(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Hello";
    }
}

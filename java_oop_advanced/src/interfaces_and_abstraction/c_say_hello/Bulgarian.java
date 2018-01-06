package interfaces_and_abstraction.c_say_hello;

public  class Bulgarian extends BasePerson implements Person{

    Bulgarian(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "???????";
    }
}

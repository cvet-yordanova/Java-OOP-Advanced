package interfaces_exc.b_multiple_implementation;

public class Citizen implements Person, Birthable, Identifiable {
    private String name;
    private Integer age;
    private String birthdate;
    private String id;

    public Citizen(String name, Integer age, String birthdate, String id) {
        this.name = name;
        this.age = age;
        this.birthdate = birthdate;
        this.id = id;
    }

    @Override
    public String getBirthdate() {
        return null;
    }

    @Override
    public String getId() {
        return null;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Integer getAge() {
        return this.age;
    }
}

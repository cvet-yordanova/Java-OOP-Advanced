package iterators_and_comparators_ex.h_pet_clinics;

public class Pet {
    private String name;
    private Integer age;
    private String type;

    public Pet(String name, Integer age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return String.format("%s %d %s", this.name, this.age, this.type);
    }
}

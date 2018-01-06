package iterators_and_comparators_ex.g_equality_logic;

import java.util.Objects;

public class Person implements Comparable<Person>{
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s %d",this.name, this.age);
    }

    @Override
    public int compareTo(Person o) {
        if(this.getName().equals(o.getName()) && this.getAge() == o.getAge()){
            return 0;
        }
        return -1;
    }

    @Override
    public boolean equals(Object obj) {
        Person person = (Person) obj;
        return !(obj == null || obj.getClass() != this.getClass())
                && person.getName().equals(this.getName())
                && person.getAge() == (this.getAge());
    }

    @Override
    public int hashCode() {
        return this.getName().hashCode() * this.age.hashCode();
    }
}

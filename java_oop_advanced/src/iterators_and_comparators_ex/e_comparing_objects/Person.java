package iterators_and_comparators_ex.e_comparing_objects;

public class Person implements Comparable<Person>{
    private String name;
    private Integer age;
    private String town;

    public Person(String name, Integer age, String town) {
        this.name = name;
        this.age = age;
        this.town = town;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

     String getTown() {
        return town;
    }

    @Override
    public int compareTo(Person person) {
        if(this.getName().compareTo(person.getName()) == 0){
            if(this.getAge().compareTo(person.getAge()) == 0){
                if(this.getTown().compareTo(person.getTown()) == 0){
                    return 0;
                }
                return this.getTown().compareTo(person.getTown());
            }else{
                return this.getAge().compareTo(person.getAge());
            }
        }
        return this.getName().compareTo(person.getName());
    }

}

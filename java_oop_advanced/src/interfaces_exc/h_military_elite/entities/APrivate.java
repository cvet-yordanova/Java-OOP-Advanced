package interfaces_exc.h_military_elite.entities;

public abstract class APrivate implements IPrivate{
    private Integer getId;
    private Double salary;
    private String firstName;
    private String lastName;

    protected APrivate(Integer getId, String firstName, String lastName, Double salary) {
        this.getId = getId;
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public Integer getId() {
        return this.getId;
    }

    @Override
    public Double getSalary() {
        return this.salary;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

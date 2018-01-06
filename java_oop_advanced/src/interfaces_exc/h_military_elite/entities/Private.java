package interfaces_exc.h_military_elite.entities;

public class Private extends APrivate {
    public Private(Integer getId, String firstName, String lastName, Double salary) {
        super(getId, firstName, lastName, salary);
    }

    @Override
    public String toString() {
        return String.format("Name: %s %s Id: %d Salary: %.2f",
                super.getFirstName(),
                super.getLastName(),
                super.getId(),
                super.getSalary());
    }
}

package interfaces_exc.h_military_elite.entities;

import java.util.List;
import java.util.Set;

public class Engineer extends APrivate implements IEngineer {

    List<IRepair> repairs;
    private String corps;

    public Engineer(Integer getId, String firstName, String lastName, Double salary,String corps, List<IRepair> repairs) {
        super(getId, firstName, lastName, salary);
        this.repairs = repairs;
        this.corps = corps;
    }

    @Override
    public List<IRepair> getRepairs() {
        return this.repairs;
    }

    @Override
    public String getCorps() {
        return this.corps;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        String first = String.format("Name: %s %s Id: %d Salary: %.2f\n" +
                "Corps: %s\n" + "Repairs:\n", super.getFirstName(), super.getLastName(),super.getId(), super.getSalary(), this.getCorps());
        sb.append(first);

        for (IRepair repair : repairs) {
            sb.append(" ").append(repair).append(System.lineSeparator());
        }

        return sb.toString().trim();
    }
}

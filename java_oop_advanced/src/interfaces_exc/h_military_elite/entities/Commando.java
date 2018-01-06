package interfaces_exc.h_military_elite.entities;


import java.util.List;
import java.util.Set;

public class Commando extends APrivate implements ICommando{

    private List<IMission> missions;
    private String corps;

    public Commando(Integer getId, String firstName, String lastName, Double salary,String corps, List<IMission> missions) {
        super(getId, firstName, lastName, salary);
        this.missions = missions;
        this.corps = corps;
    }

    @Override
    public List<IMission> getMissions() {
        return this.missions;
    }

    @Override
    public String getCorps() {
        return this.corps;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String first = String.format("Name: %s %s Id: %d Salary: %.2f\n" +
                "Corps: %s\n" +
                "Missions:\n", super.getFirstName(), super.getLastName(),super.getId(), super.getSalary(), this.getCorps());

        sb.append(first);

        for (IMission mission : missions) {
            sb.append(" ").append(mission).append(System.lineSeparator());
        }

        return sb.toString().trim();
    }
}












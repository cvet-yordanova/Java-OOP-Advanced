package interfaces_exc.h_military_elite.entities;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LeutenantGeneral extends APrivate implements ILeutenantGeneral {
    private List<IPrivate> privates;

    public LeutenantGeneral(Integer getId, String firstName, String lastName, Double salary, List<IPrivate> privates) {
        super(getId, firstName, lastName, salary);
        this.privates = privates;
    }

    @Override
    public List<IPrivate> getPrivates() {
        return this.privates;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        String first = String.format("Name: %s %s Id: %d Salary: %.2f\n" +
                "Privates:\n", super.getFirstName(), super.getLastName(),super.getId(), super.getSalary());
        sb.append(first);

        List<IPrivate> sortedList = this.privates
                .stream()
                .sorted((a,b)->{return Integer.compare(b.getId(), a.getId());})
                .collect(Collectors.toList());

        for (IPrivate iPrivate : sortedList) {
            sb.append(iPrivate).append(System.lineSeparator());
        }

        return sb.toString();

    }
}

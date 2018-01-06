package interfaces_exc.h_military_elite.entities;

public class SpecialisedSoldier extends APrivate implements ISpecialisedSoldier{

    private String corps;

    public SpecialisedSoldier(Integer getId, String firstName, String lastName, Double salary, String corps) {
        super(getId, firstName, lastName, salary);
        this.corps = corps;
    }

    @Override
    public String getCorps() {
        return this.corps;
    }
}

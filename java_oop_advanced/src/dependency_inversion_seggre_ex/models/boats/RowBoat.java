package dependency_inversion_seggre_ex.models.boats;

import dependency_inversion_seggre_ex.Utility.Validator;
import dependency_inversion_seggre_ex.contracts.Race;

public class RowBoat extends BaseBoat {
    private int oars;

    public RowBoat(String model, int weight, int oars) {
        super(model, weight);
        this.setOars(oars);
    }

    public int getOars() {
        return oars;
    }

    private void setOars(int oars) {
        Validator.ValidatePropertyValue(oars, "Oars");
        this.oars = oars;
    }

    @Override
    public double calculateRaceSpeed(Race race) {
        return (this.oars * 100) - super.getWeight() + race.getOceanCurrentSpeed();
    }

    @Override
    public boolean hasEngine() {
        return false;
    }
}

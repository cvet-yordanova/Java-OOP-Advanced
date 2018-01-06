package dependency_inversion_seggre_ex.models.boats;

import dependency_inversion_seggre_ex.Utility.Constants;
import dependency_inversion_seggre_ex.contracts.Race;

public class SailBoat extends BaseBoat {

    private int sailEfficiency;

    protected SailBoat(String model, int weight, int sailEfficiency) {
        super(model, weight);
        this.sailEfficiency = sailEfficiency;
    }

    public int getSailEfficiency() {
        return sailEfficiency;
    }

    public void setSailEfficiency(int sailEfficiency) {
        if (sailEfficiency < 1 || sailEfficiency > 100) {
            throw new IllegalArgumentException(Constants.IncorrectSailEfficiencyMessage);
        }
        this.sailEfficiency = sailEfficiency;
    }

    @Override
    public double calculateRaceSpeed(Race race) {
        return (race.getWindSpeed() * (this.sailEfficiency / 100.0)) - super.getWeight() * (race.getOceanCurrentSpeed() / 2.0);
    }

    @Override
    public boolean hasEngine() {
        return false;
    }
}

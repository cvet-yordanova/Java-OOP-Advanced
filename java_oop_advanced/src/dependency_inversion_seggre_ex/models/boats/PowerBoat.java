package dependency_inversion_seggre_ex.models.boats;

import dependency_inversion_seggre_ex.contracts.BoatEngine;
import dependency_inversion_seggre_ex.contracts.Race;

public class PowerBoat extends BaseBoat {

    private BoatEngine firstEngine;
    private BoatEngine secondEngine;

    public PowerBoat(String model, int weight, BoatEngine firstBoatEngine, BoatEngine secondEngine) {
        super(model, weight);
        this.firstEngine = firstBoatEngine;
        this.secondEngine = secondEngine;
    }

    @Override
    public double calculateRaceSpeed(Race race) {
        return (this.firstEngine.getOutput() + this.secondEngine.getOutput()) - super.getWeight() + (race.getOceanCurrentSpeed() / 5.0);
    }

    @Override
    public boolean hasEngine() {
        return true;
    }
}

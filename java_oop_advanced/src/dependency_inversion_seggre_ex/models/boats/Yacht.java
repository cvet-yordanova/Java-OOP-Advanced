package dependency_inversion_seggre_ex.models.boats;

import dependency_inversion_seggre_ex.Utility.Validator;
import dependency_inversion_seggre_ex.contracts.BoatEngine;
import dependency_inversion_seggre_ex.contracts.Race;

public class Yacht extends BaseBoat{
    private BoatEngine engine;
    private int cargoWeight;

    public Yacht(String model, int weight, BoatEngine engine, int cargoWeight) {
        super(model, weight);
        this.engine = engine;
        this.setCargoWeight(cargoWeight);
    }

    public int getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(int cargoWeight) {
        Validator.ValidatePropertyValue(cargoWeight, "Cargo Weight");
        this.cargoWeight = cargoWeight;
    }

    @Override
    public double calculateRaceSpeed(Race race) {
        return this.engine.getOutput() - (super.getWeight() + this.cargoWeight) + (race.getOceanCurrentSpeed() / 2.0);
    }

    @Override
    public boolean hasEngine() {
        return true;
    }
}

package dependency_inversion_seggre_ex.models.engines;

import dependency_inversion_seggre_ex.Utility.Constants;
import dependency_inversion_seggre_ex.Utility.Validator;
import dependency_inversion_seggre_ex.contracts.BoatEngine;

public abstract class BaseBoatEngine implements BoatEngine {

    private String model;
    private int cachedOutput;

    protected BaseBoatEngine(String model, int horsePower, int displacement) {
        this.setModel(model);
        this.cachedOutput = calculateCachedOutput(horsePower, displacement);


    }

    @Override
    public String getModel() {
        return this.model;
    }

    private void setModel(String model) {
        Validator.ValidateModelLength(model, Constants.MinBoatEngineModelLength);
        this.model = model;
    }

    @Override
    public int getOutput() {
        if (this.cachedOutput != 0)
        {
            return this.cachedOutput;
        }

        this.cachedOutput = (this.horsepower * Multiplier) + this.displacement;
        return this.cachedOutput;
    }

    protected abstract int calculateCachedOutput(int horsePower, int displacement);

    public int getDisplacement() {
        return displacement;
    }

    private void validateDisplacement(int displacement) {
        Validator.ValidatePropertyValue(displacement, "Displacement");
    }

    public int getHorsepower() {
        return this.horsepower;
    }

    private void validateHorsepower(int horsepower) {
        Validator.ValidatePropertyValue(horsepower, "Horsepower");
    }

}

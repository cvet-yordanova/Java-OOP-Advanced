package dependency_inversion_seggre_ex.models.boats;

import dependency_inversion_seggre_ex.Utility.Constants;
import dependency_inversion_seggre_ex.Utility.Validator;
import dependency_inversion_seggre_ex.contracts.Boat;
import dependency_inversion_seggre_ex.contracts.Race;

public abstract class BaseBoat implements Boat{
    private String model;
    private int weight;

    protected BaseBoat(String model, int weight) {
        this.setModel(model);
        this.setWeight(weight);
    }

    @Override
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        Validator.ValidateModelLength(model, Constants.MinBoatModelLength);
        this.model = model;
    }

    //todo
    public int getWeight() {
        return weight;
    }

    private void setWeight(int weight) {
        Validator.ValidatePropertyValue(weight, "Weight");
        this.weight = weight;
    }

}

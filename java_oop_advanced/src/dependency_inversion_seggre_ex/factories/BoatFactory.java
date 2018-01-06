package dependency_inversion_seggre_ex.factories;


import dependency_inversion_seggre_ex.contracts.Boat;
import dependency_inversion_seggre_ex.contracts.BoatEngine;
import dependency_inversion_seggre_ex.models.boats.PowerBoat;
import dependency_inversion_seggre_ex.models.boats.RowBoat;
import dependency_inversion_seggre_ex.models.boats.Yacht;

public final class BoatFactory {
    private BoatFactory(){

    }

    public static Boat createRowBoat(String model, int weight, int oars){
        return new RowBoat(model, weight, oars);
    }

    public static Boat createSailBoat(String model, int weight, int sailEfficiency){
        return new RowBoat(model, weight, sailEfficiency);
    }

    public static Boat createPowerBoat(String model, int weight, BoatEngine firstEngine, BoatEngine secondEngine){
        return new PowerBoat(model, weight, firstEngine,secondEngine);
    }

    public static Boat createYacht(String model, int weight, BoatEngine boatEngine , int cargoWeight){
        return new Yacht(model, weight,boatEngine, cargoWeight);
    }
}

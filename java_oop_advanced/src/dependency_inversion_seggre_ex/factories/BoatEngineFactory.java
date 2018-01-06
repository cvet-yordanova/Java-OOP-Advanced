package dependency_inversion_seggre_ex.factories;

import dependency_inversion_seggre_ex.contracts.BoatEngine;
import dependency_inversion_seggre_ex.models.engines.JetEngine;
import dependency_inversion_seggre_ex.models.engines.SterndriveEngine;

public final class BoatEngineFactory {
    private BoatEngineFactory(){

    }

    public static BoatEngine createJetEngine(String model, int horsePower, int displacement){
        return new JetEngine(model, horsePower, displacement);
    }

    public static BoatEngine createSternDriveEngine(String model, int horsePower, int displacement){
        return new SterndriveEngine(model, horsePower, displacement);
    }
}

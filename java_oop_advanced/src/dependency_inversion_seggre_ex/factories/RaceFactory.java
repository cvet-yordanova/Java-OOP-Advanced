package dependency_inversion_seggre_ex.factories;

import dependency_inversion_seggre_ex.contracts.Race;
import dependency_inversion_seggre_ex.models.RaceImpl;

public final class RaceFactory {
    private RaceFactory() {
    }

    public static Race createRace(int distance, int windspeed, int oceanCurrentSpeed, boolean allowMotorBoat){
        return new RaceImpl(distance, windspeed, oceanCurrentSpeed, allowMotorBoat);
    }
}

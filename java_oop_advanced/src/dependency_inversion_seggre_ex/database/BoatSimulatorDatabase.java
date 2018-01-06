package dependency_inversion_seggre_ex.database;

import dependency_inversion_seggre_ex.contracts.*;
import dependency_inversion_seggre_ex.contracts.Repository;
import dependency_inversion_seggre_ex.models.MotorBoat;

public class BoatSimulatorDatabase implements Database{
   private CrudRepository<Boat> boats;
   private CrudRepository<BoatEngine> engines;

    public BoatSimulatorDatabase(CrudRepository<Boat> boats, CrudRepository<BoatEngine> engines) {
        this.boats = boats;
        this.engines = engines;
    }

    @Override
    public CrudRepository<Boat> getBoats() {
        return this.boats;
    }

    @Override
    public CrudRepository<BoatEngine> getEngines() {
        return this.engines;
    }


}

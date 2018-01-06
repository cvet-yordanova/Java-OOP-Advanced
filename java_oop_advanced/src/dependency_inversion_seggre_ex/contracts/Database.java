package dependency_inversion_seggre_ex.contracts;

public interface Database {
    CrudRepository<Boat> getBoats();

    CrudRepository<BoatEngine> getEngines();

    Modelable findByModel();
}

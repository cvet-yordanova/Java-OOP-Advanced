package dependency_inversion_seggre_ex.contracts;

public interface Boat extends Modelable {
    double calculateRaceSpeed(Race race);

    boolean hasEngine();
}

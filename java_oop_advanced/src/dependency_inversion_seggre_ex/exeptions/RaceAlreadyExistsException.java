package dependency_inversion_seggre_ex.exeptions;

public class RaceAlreadyExistsException extends Exception {
    public RaceAlreadyExistsException(String message) {
        super(message);
    }
}

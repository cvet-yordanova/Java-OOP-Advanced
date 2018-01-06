package dependency_inversion_seggre_ex.exeptions;

public class NonExistantModelException extends Exception {
    public NonExistantModelException(String message) {
        super(message);
    }
}

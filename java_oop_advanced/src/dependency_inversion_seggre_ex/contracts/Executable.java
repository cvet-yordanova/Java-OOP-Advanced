package dependency_inversion_seggre_ex.contracts;

import dependency_inversion_seggre_ex.exeptions.*;

public interface Executable {
    String execute() throws DuplicateModelException, NonExistantModelException, RaceAlreadyExistsException, NoSetRaceException, InsufficientContestantsException;
}

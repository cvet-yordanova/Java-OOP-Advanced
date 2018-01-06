package dependency_inversion_seggre_ex.commands;

import dependency_inversion_seggre_ex.exeptions.*;

public class StartRaceCommand extends BaseCommand {
    @Override
    public String execute() throws DuplicateModelException, NonExistantModelException, RaceAlreadyExistsException, NoSetRaceException, InsufficientContestantsException {
        return super.getController().startRace();
    }
}

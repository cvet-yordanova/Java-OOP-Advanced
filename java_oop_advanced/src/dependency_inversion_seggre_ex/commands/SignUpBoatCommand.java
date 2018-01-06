package dependency_inversion_seggre_ex.commands;

import dependency_inversion_seggre_ex.exeptions.DuplicateModelException;
import dependency_inversion_seggre_ex.exeptions.NoSetRaceException;
import dependency_inversion_seggre_ex.exeptions.NonExistantModelException;
import dependency_inversion_seggre_ex.exeptions.RaceAlreadyExistsException;

public class SignUpBoatCommand extends BaseCommand{
    @Override
    public String execute() throws DuplicateModelException, NonExistantModelException, RaceAlreadyExistsException, NoSetRaceException {
        return super.getController().signUpBoat(super.getParams().get(0));
    }
}

package dependency_inversion_seggre_ex.commands;

import dependency_inversion_seggre_ex.exeptions.DuplicateModelException;
import dependency_inversion_seggre_ex.exeptions.NonExistantModelException;
import dependency_inversion_seggre_ex.exeptions.RaceAlreadyExistsException;

public class OpenRaceCommand extends BaseCommand{
    @Override
    public String execute() throws DuplicateModelException, NonExistantModelException, RaceAlreadyExistsException {
        return super.getController().openRace(Integer.parseInt(super.getParams().get(0)),Integer.parseInt(super.getParams().get(1)), Integer.parseInt(super.getParams().get(2)), Boolean.parseBoolean(super.getParams().get(3)));
    }
}

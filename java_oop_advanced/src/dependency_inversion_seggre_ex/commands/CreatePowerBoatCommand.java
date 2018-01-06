package dependency_inversion_seggre_ex.commands;

import dependency_inversion_seggre_ex.exeptions.DuplicateModelException;
import dependency_inversion_seggre_ex.exeptions.NonExistantModelException;

public class CreatePowerBoatCommand extends BaseCommand {
    @Override
    public String execute() throws DuplicateModelException, NonExistantModelException {
        return super.getController().createPowerBoat(super.getParams().get(0), Integer.parseInt(super.getParams().get(1)), super.getParams().get(2), super.getParams().get(3));
    }
}

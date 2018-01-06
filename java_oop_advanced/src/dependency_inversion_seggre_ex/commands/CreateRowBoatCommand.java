package dependency_inversion_seggre_ex.commands;

import dependency_inversion_seggre_ex.exeptions.DuplicateModelException;

public class CreateRowBoatCommand extends BaseCommand {
    @Override
    public String execute() throws DuplicateModelException {
        return super.getController().createRowBoat(super.getParams().get(0), Integer.parseInt(super.getParams().get(1)),Integer.parseInt(super.getParams().get(2)));
    }
}

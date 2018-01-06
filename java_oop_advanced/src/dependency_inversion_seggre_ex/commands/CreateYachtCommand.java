package dependency_inversion_seggre_ex.commands;

import dependency_inversion_seggre_ex.exeptions.DuplicateModelException;

public class CreateYachtCommand extends BaseCommand{
    @Override
    public String execute() throws DuplicateModelException {
        return super.getController().createBoatEngine(super.getParams().get(0), Integer.parseInt(super
                .getParams().get(1)),Integer.parseInt(super
                .getParams().get(2)),super.getParams().get(3));
    }
}

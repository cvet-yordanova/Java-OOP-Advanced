package reflection_ex.c_baracks_wars.core.commands;

import reflection_ex.c_baracks_wars.contracts.Repository;
import reflection_ex.c_baracks_wars.contracts.UnitFactory;

import java.lang.reflect.InvocationTargetException;

public class RetireCommand extends BaseCommand{
    private static final String RETIRE_MESSAGE_FORMAT = "%s retired!";

    //refactor task 4
//    public RetireCommand(String[] data, BoatRepository repository, UnitFactory unitFactory) {
//        super(data, repository, unitFactory);
//    }

    @Override
    public String execute() throws ClassNotFoundException, InvocationTargetException, InstantiationException, NoSuchMethodException, IllegalAccessException {
        try{
            super.getRepository().removeUnit(super.getData()[1]);
        } catch (IllegalStateException ise){
            return ise.getMessage();
        }
        return String.format(RETIRE_MESSAGE_FORMAT, super.getData()[1]);
    }
}

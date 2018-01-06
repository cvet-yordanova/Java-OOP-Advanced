package reflection_ex.c_baracks_wars.core.commands;

import reflection_ex.c_baracks_wars.contracts.Repository;
import reflection_ex.c_baracks_wars.contracts.Unit;
import reflection_ex.c_baracks_wars.contracts.UnitFactory;

import java.lang.reflect.InvocationTargetException;

public class AddCommand extends BaseCommand {

    //refactor 4
//    public AddCommand(String[] data, BoatRepository repository, UnitFactory unitFactory) {
//        super(data, repository, unitFactory);
//    }

    @Override
    public String execute() throws ClassNotFoundException, InvocationTargetException, InstantiationException, NoSuchMethodException, IllegalAccessException {
        String unitType = super.getData()[1];
        Unit unitToAdd = super.getUnitFactory().createUnit(unitType);
        super.getRepository().addUnit(unitToAdd);
        String output = unitType + " added!";
        return output;
    }
}

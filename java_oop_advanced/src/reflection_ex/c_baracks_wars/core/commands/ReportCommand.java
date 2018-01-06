package reflection_ex.c_baracks_wars.core.commands;

import reflection_ex.c_baracks_wars.contracts.Repository;
import reflection_ex.c_baracks_wars.contracts.UnitFactory;

import java.lang.reflect.InvocationTargetException;

public class ReportCommand extends BaseCommand{

    //task 4
//    public ReportCommand(String[] data, BoatRepository repository, UnitFactory unitFactory) {
//        super(data, repository, unitFactory);
//    }

    @Override
    public String execute() throws ClassNotFoundException, InvocationTargetException, InstantiationException, NoSuchMethodException, IllegalAccessException {
        String output = super.getRepository().getStatistics();
        return output;
    }
}

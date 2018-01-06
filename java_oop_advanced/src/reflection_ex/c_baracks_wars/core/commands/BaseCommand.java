package reflection_ex.c_baracks_wars.core.commands;

import reflection_ex.c_baracks_wars.annotations.Inject;
import reflection_ex.c_baracks_wars.contracts.Executable;
import reflection_ex.c_baracks_wars.contracts.Repository;
import reflection_ex.c_baracks_wars.contracts.UnitFactory;

public abstract class BaseCommand implements Executable {

    @Inject
    private String[] data;
    @Inject
    private Repository repository;
    @Inject
    private UnitFactory unitFactory;
    //refactor task 4
    //protected BaseCommand(String[] data, BoatRepository repository, UnitFactory unitFactory) {
    protected BaseCommand() {
        //refactor task 4
//        this.data = data;
//        this.repository = repository;
//        this.unitFactory = unitFactory;

    }

    protected String[] getData() {
        return data;
    }

    protected Repository getRepository() {
        return repository;
    }

    protected UnitFactory getUnitFactory() {
        return unitFactory;
    }
}

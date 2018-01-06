package dependency_inversion_seggre_ex.commands;
import dependency_inversion_seggre_ex.contracts.BoatSimulatorController;
import dependency_inversion_seggre_ex.contracts.Executable;

import java.util.Collections;
import java.util.List;

public abstract class BaseCommand implements Executable {

    private List<String> params;
    private BoatSimulatorController controller;

    protected BaseCommand() {
    }

    protected BoatSimulatorController getController(){
        return this.controller;
    }

    public List<String> getParams() {
        return Collections.unmodifiableList(this.params);
    }
}

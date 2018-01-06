package dependency_inversion_seggre_ex.database;


import dependency_inversion_seggre_ex.Utility.Constants;
import dependency_inversion_seggre_ex.contracts.BoatEngine;
import dependency_inversion_seggre_ex.contracts.CrudRepository;
import dependency_inversion_seggre_ex.exeptions.DuplicateModelException;
import dependency_inversion_seggre_ex.exeptions.NonExistantModelException;

import java.util.Collections;
import java.util.Map;

public class BoatEngineRepository implements CrudRepository<BoatEngine> {

    private Map<String, BoatEngine> boatsEngines;

    @Override
    public BoatEngine findByModel(String model) throws NonExistantModelException {
        if (!this.boatsEngines.containsKey(model))
        {
            throw new NonExistantModelException(Constants.NonExistantModelMessage);
        }

        return this.boatsEngines.get(model);
    }

    @Override
    public void add(BoatEngine item) throws DuplicateModelException {
        if (this.boatsEngines.containsKey(item.getModel()))
        {
            throw new DuplicateModelException(Constants.DuplicateModelMessage);
        }

        this.boatsEngines.putIfAbsent(item.getModel(), item);
    }
}

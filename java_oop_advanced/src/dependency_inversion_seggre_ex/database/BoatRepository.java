package dependency_inversion_seggre_ex.database;


import dependency_inversion_seggre_ex.Utility.Constants;
import dependency_inversion_seggre_ex.contracts.Boat;
import dependency_inversion_seggre_ex.contracts.CrudRepository;
import dependency_inversion_seggre_ex.contracts.Modelable;
import dependency_inversion_seggre_ex.exeptions.DuplicateModelException;
import dependency_inversion_seggre_ex.exeptions.NonExistantModelException;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class BoatRepository<T extends Modelable> implements CrudRepository<Boat> {
    private Map<String, Boat> boats;

    public BoatRepository()
    {
        this.boats = new LinkedHashMap<>();
    }

    @Override
    public Map<String, Boat> getBoats(){
        return Collections.unmodifiableMap(this.boats);
    }


    @Override
    public Boat findByModel(String model) throws NonExistantModelException {
        if (!this.boats.containsKey(model))
        {
            throw new NonExistantModelException(Constants.NonExistantModelMessage);
        }

        return this.boats.get(model);
    }

    @Override
    public void add(Boat item) throws DuplicateModelException {
        if (this.boats.containsKey(item.getModel()))
        {
            throw new DuplicateModelException(Constants.DuplicateModelMessage);
        }
    }
}

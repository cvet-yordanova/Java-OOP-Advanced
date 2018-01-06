package dependency_inversion_seggre_ex.contracts;

import dependency_inversion_seggre_ex.exeptions.DuplicateModelException;
import dependency_inversion_seggre_ex.exeptions.NonExistantModelException;

import java.util.Map;

public interface CrudRepository<T extends Modelable> {
    Map<String, Boat> getBoats();

    T findByModel(String model) throws NonExistantModelException;
    void add(T item) throws DuplicateModelException;
}

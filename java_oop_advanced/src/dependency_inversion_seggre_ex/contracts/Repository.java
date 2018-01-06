package dependency_inversion_seggre_ex.contracts;


import dependency_inversion_seggre_ex.exeptions.DuplicateModelException;
import dependency_inversion_seggre_ex.exeptions.NonExistantModelException;

public interface Repository<T extends Modelable> {
    void add(T item) throws DuplicateModelException;

    T getItem(String model) throws NonExistantModelException;
}

package open_close_liskov_ex_TODO.IIIIIIIIIblobs.repositories;

import open_close_liskov_ex_TODO.IIIIIIIIIblobs.interfaces.Blob;

import java.util.Map;

public interface Repository<T> {

    void add(T element);

    Blob findByName(String name);

    Map<String, T> findAll();
}

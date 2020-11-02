package Jardineria.ModelClassDao;

import java.util.List;
import java.util.Optional;

import java.util.*;

public interface Dao<T> {

    Optional<T> get(long id);

    List<T> getAll();

    void save(T clientes);

    void update(T clientes, String[] params);

    void delete(T clientes);
    
}

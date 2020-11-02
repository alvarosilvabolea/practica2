package Jardineria.ModelClassDao;

import java.util.*;

public interface Dao<T> {

    Optional<T> get(long id);

    List<T> getAll();

    void save(T t) throws Exception;

    void update(T t, String[] params);

    void delete(T t);
    
}

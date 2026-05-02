package dao;

import org.bson.types.ObjectId;
import java.util.List;

/**
 *
 * @author Ricardo
 */
public interface IModeloDAO<T> {
    void create(T entity);
    T findById(ObjectId id);
    List<T> findAll();
    void update(T entity);
    void deleteById(ObjectId id);
    void deleteAll();
}
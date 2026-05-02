package dao;

import org.bson.types.ObjectId;
import java.util.List;

/**
 *
 * @author Ricardo
 */
public interface IModeloDAO<T> {

    void crear(T entidad);

    T buscarPorId(ObjectId id);

    List<T> listarTodos();

    void actualizar(T entidad);

    void eliminarPorId(ObjectId id);

    void eliminarTodos();

    List<T> buscarPorNombre(String nombre);
}
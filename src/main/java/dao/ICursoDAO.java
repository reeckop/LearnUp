package dao;

import model.Curso;

/**
 *
 * @author Ricardo
 */
public interface ICursoDAO extends IModeloDAO<Curso> {
    Curso findByNombre(String nombre);
}
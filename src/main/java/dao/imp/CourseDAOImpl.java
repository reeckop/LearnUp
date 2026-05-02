package dao.imp;

import config.MongoClientProvider;
import dao.ICursoDAO;
import model.Curso;
import exception.DaoException;
import exception.EntityNotFoundException;
import com.mongodb.client.MongoCollection;
import org.bson.types.ObjectId;
import static com.mongodb.client.model.Filters.eq;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Ricardo
 */
public class CourseDAOImpl implements ICursoDAO {
    private final MongoCollection<Curso> collection;

    public CourseDAOImpl() {
        this.collection = MongoClientProvider.getInstance()
                .getCollection("courses", Curso.class);
    }

    @Override
    public void create(Curso entity) {
        try {
            if (entity.getId() == null) {
                entity.setId(new ObjectId());
            }
            Date now = new Date();
            entity.setCreatedAt(now);
            entity.setUpdatedAt(now);
            
            collection.insertOne(entity);
        } catch (Exception e) {
            throw new DaoException("Error al crear el curso: " + e.getMessage());
        }
    }

    @Override
    public Curso findById(ObjectId id) {
        Curso curso = collection.find(eq("_id", id)).first();
        if (curso == null) {
            throw new EntityNotFoundException("Curso no encontrado con ID: " + id);
        }
        return curso;
    }

    @Override
    public List<Curso> findAll() {
        return collection.find().into(new ArrayList<>());
    }

    @Override
    public void update(Curso entity) {
        try {
            entity.setUpdatedAt(new Date());
            collection.replaceOne(eq("_id", entity.getId()), entity);
        } catch (Exception e) {
            throw new DaoException("Error al actualizar el curso: " + e.getMessage());
        }
    }

    @Override
    public void deleteById(ObjectId id) {
        collection.deleteOne(eq("_id", id));
    }

    @Override
    public void deleteAll() {
        collection.drop(); 
    }

    @Override
    public Curso findByNombre(String nombre) {
        return collection.find(eq("title", nombre)).first();
    }
}
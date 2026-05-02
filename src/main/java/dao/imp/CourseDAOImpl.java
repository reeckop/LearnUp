package dao.imp;

import com.mongodb.client.MongoCollection;
import config.MongoClientProvider;
import model.Curso;
import org.bson.types.ObjectId;

import java.time.Instant;

public class CourseDAOImpl extends MongoModelDAO<Curso> {

    public CourseDAOImpl() {
        super(
            MongoClientProvider
                .getDatabase()
                .getCollection("courses", Course.class),
            Course.class
        );
    }

    @Override
    protected ObjectId getId(Course entity) {
        return entity.getId();
    }

    @Override
    protected void setId(Course entity, ObjectId id) {
        entity.setId(id);
    }

    @Override
    protected void setCreatedAt(Course entity, Instant now) {
        entity.setCreatedAt(now);
    }

    @Override
    protected void setUpdatedAt(Course entity, Instant now) {
        entity.setUpdatedAt(now);
    }

    @Override
    protected String getNombre(Course entity) {
        return entity.getNombre();
    }
}
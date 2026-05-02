package model;

import org.bson.types.ObjectId;
import java.time.Instant;
import java.util.List;

/**
 *
 * @author Ricardo
 */
public class Curso {

    private ObjectId id;
    private String nombre;
    private String descripcion;
    private ObjectId instructorId;

    private List<Modulo> modulos;
    private List<Resena> resenas;

    private Instant creadoEn;
    private Instant actualizadoEn;

    public Curso() {}

    public ObjectId getId() { return id; }
    public void setId(ObjectId id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public ObjectId getInstructorId() { return instructorId; }
    public void setInstructorId(ObjectId instructorId) { this.instructorId = instructorId; }

    public List<Modulo> getModulos() { return modulos; }
    public void setModulos(List<Modulo> modulos) { this.modulos = modulos; }

    public List<Resena> getResenas() { return resenas; }
    public void setResenas(List<Resena> resenas) { this.resenas = resenas; }

    public Instant getCreadoEn() { return creadoEn; }
    public void setCreadoEn(Instant creadoEn) { this.creadoEn = creadoEn; }

    public Instant getActualizadoEn() { return actualizadoEn; }
    public void setActualizadoEn(Instant actualizadoEn) { this.actualizadoEn = actualizadoEn; }
}
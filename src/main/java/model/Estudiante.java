package model;

import org.bson.types.ObjectId;
import java.time.Instant;
import java.util.List;

/**
 *
 * @author Ricardo
 */
public class Estudiante {

    private ObjectId id;
    private String nombre;
    private String email;

    private List<ObjectId> cursosInscritosIds;

    private Instant creadoEn;
    private Instant actualizadoEn;

    public Estudiante() {}

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<ObjectId> getCursosInscritosIds() {
        return cursosInscritosIds;
    }

    public void setCursosInscritosIds(List<ObjectId> cursosInscritosIds) {
        this.cursosInscritosIds = cursosInscritosIds;
    }

    public Instant getCreadoEn() {
        return creadoEn;
    }

    public void setCreadoEn(Instant creadoEn) {
        this.creadoEn = creadoEn;
    }

    public Instant getActualizadoEn() {
        return actualizadoEn;
    }

    public void setActualizadoEn(Instant actualizadoEn) {
        this.actualizadoEn = actualizadoEn;
    }

}
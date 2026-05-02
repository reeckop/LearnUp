package model;

import org.bson.types.ObjectId;
import java.time.Instant;
import java.util.List;

/**
 *
 * @author Ricardo
 */
public class Instructor {

    private ObjectId id;
    private String nombre;
    private String email;
    private String especialidad;

    private List<ObjectId> cursosIds;

    private Instant creadoEn;
    private Instant actualizadoEn;

    public Instructor() {}

    public ObjectId getId() { return id; }
    public void setId(ObjectId id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }

    public List<ObjectId> getCursosIds() { return cursosIds; }
    public void setCursosIds(List<ObjectId> cursosIds) { this.cursosIds = cursosIds; }

    public Instant getCreadoEn() { return creadoEn; }
    public void setCreadoEn(Instant creadoEn) { this.creadoEn = creadoEn; }

    public Instant getActualizadoEn() { return actualizadoEn; }
    public void setActualizadoEn(Instant actualizadoEn) { this.actualizadoEn = actualizadoEn; }
}
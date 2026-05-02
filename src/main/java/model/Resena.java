package model;

import org.bson.types.ObjectId;

/**
 *
 * @author Ricardo
 */
public class Resena {

    private ObjectId estudianteId;
    private Integer calificacion;
    private String comentario;

    public Resena() {}

    public ObjectId getEstudianteId() { return estudianteId; }
    public void setEstudianteId(ObjectId estudianteId) { this.estudianteId = estudianteId; }

    public Integer getCalificacion() { return calificacion; }
    public void setCalificacion(Integer calificacion) { this.calificacion = calificacion; }

    public String getComentario() { return comentario; }
    public void setComentario(String comentario) { this.comentario = comentario; }
}
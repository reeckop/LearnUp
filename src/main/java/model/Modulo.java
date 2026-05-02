package model;

import java.util.List;

/**
 *
 * @author Ricardo
 */
public class Modulo {

    private String titulo;
    private String descripcion;

    private List<Recurso> recursos;

    public Modulo() {}

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Recurso> getRecursos() {
        return recursos;
    }

    public void setRecursos(List<Recurso> recursos) {
        this.recursos = recursos;
    }

}
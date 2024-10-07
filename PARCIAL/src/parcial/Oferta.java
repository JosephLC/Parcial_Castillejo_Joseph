package parcial;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Oferta {
    private String descripcion;
    private String area;
    private Date fechaInicio;
    private Date fechaTermino;
    private List<Requisito> requisitos;

    public Oferta(String descripcion, String area, Date fechaInicio, Date fechaTermino) {
        this.descripcion = descripcion;
        this.area = area;
        this.fechaInicio = fechaInicio;
        this.fechaTermino = fechaTermino;
        this.requisitos = new ArrayList<>();
    }

    public boolean agregarRequisito(Requisito requisito) {
        return requisitos.add(requisito);
    }

    public boolean eliminarRequisito(Requisito requisito) {
        return requisitos.remove(requisito);
    }

    // Getters y Setters

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaTermino() {
        return fechaTermino;
    }

    public void setFechaTermino(Date fechaTermino) {
        this.fechaTermino = fechaTermino;
    }

    public List<Requisito> getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(List<Requisito> requisitos) {
        this.requisitos = requisitos;
    }
    
}


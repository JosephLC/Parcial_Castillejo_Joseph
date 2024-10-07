package parcial;

import java.util.Date;

public class Postulacion {
    private Date fecha;
    private Oferta oferta;
    private boolean anulado;
    private Date fechaAnulacion;
    private String glosa;

    public Postulacion(Date fecha, Oferta oferta, String glosa) {
        this.fecha = fecha;
        this.oferta = oferta;
        this.anulado = false;
        this.glosa = glosa;
    }

    public void setAnulado(boolean anulado) {
        this.anulado = anulado;
    }

    public void setFechaAnulacion(Date fechaAnulacion) {
        this.fechaAnulacion = fechaAnulacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Oferta getOferta() {
        return oferta;
    }

    public void setOferta(Oferta oferta) {
        this.oferta = oferta;
    }

    public String getGlosa() {
        return glosa;
    }

    public void setGlosa(String glosa) {
        this.glosa = glosa;
    }

    
}

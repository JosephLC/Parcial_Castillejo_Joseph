package parcial;

public class Requisito {
    private int orden;
    private String descripcion;
    private boolean estado;

    public Requisito(int orden, String descripcion) {
        this.orden = orden;
        this.descripcion = descripcion;
        this.estado = true; // Por defecto, habilitado
    }

    public void habilitar() {
        this.estado = true;
    }

    public void deshabilitar() {
        this.estado = false;
    }

    public int getOrden() {
        return orden;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

   
}

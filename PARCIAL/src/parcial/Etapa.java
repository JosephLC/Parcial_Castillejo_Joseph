package parcial;

public class Etapa {
    private String nombre;
    private String glosa;
    private boolean estado;

    public Etapa(String nombre, String glosa) {
        this.nombre = nombre;
        this.glosa = glosa;
        this.estado = true; 
    }

    public void desactivar() {
        this.estado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGlosa() {
        return glosa;
    }

    public void setGlosa(String glosa) {
        this.glosa = glosa;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}

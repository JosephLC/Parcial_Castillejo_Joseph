package relacionesentreclases;
public class TipoUsuario {
    private String nombre;
    private boolean estado;

    public TipoUsuario(String nombre, boolean estado) {
        this.nombre = nombre;
        this.estado = estado;
    }

    public boolean getEstado() {
        return estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}



package relacionesentreclases;
public class Usuario {
    private final String paterno;
    private final String materno;
    private final String nombres;
    private final String documento;

    public Usuario(String paterno, String materno, String nombres, String documento) {
        this.paterno = paterno;
        this.materno = materno;
        this.nombres = nombres;
        this.documento = documento;
    }

    public boolean recargar(Tarjeta tarjeta, float monto) {
        return tarjeta.recargar(monto);
    }

    public boolean consumir(Tarjeta tarjeta, float monto) {
        return tarjeta.consumir(monto);
    }

    public String getPaterno() {
        return paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public String getNombres() {
        return nombres;
    }

    public String getDocumento() {
        return documento;
    }
}


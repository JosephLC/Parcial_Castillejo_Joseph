package relacionesentreclases;

public class Tarjeta {
    private final int numero;
    private float saldo;
    private boolean activo;
    private float precio;

    public Tarjeta(int numero, float monto) {
        this.numero = numero;
        this.saldo = monto;
        this.activo = true; // Activamos la tarjeta por defecto
    }

    public boolean recargar(float monto) {
        if (monto > 0) {
            this.saldo += monto;
            return true;
        }
        return false;
    }

    public boolean consumir(float monto) {
        if (monto > 0 && this.saldo >= monto && this.activo) {
            this.saldo -= monto;
            return true;
        }
        return false;
    }

    public int getNumero() {
        return numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public boolean isActivo() {
        return activo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}

package relacionesentreclases;

public class RelacionesEntreClases {  // Cambia el nombre de la clase de Main a RelacionesEntreClases
    public static void main(String[] args) {
        TipoUsuario tipoUsuario = new TipoUsuario("Cliente", true);

        Usuario usuario = new Usuario("González", "Pérez", "Juan", "12345678");

        Tarjeta tarjeta = new Tarjeta(12345, 100.0f);

        boolean recargaExitosa = usuario.recargar(tarjeta, 50.0f);
        System.out.println("Recarga exitosa: " + recargaExitosa);
        System.out.println("Saldo actual: " + tarjeta.getSaldo());

        boolean consumoExitoso = usuario.consumir(tarjeta, 30.0f);
        System.out.println("Consumo exitoso: " + consumoExitoso);
        System.out.println("Saldo restante: " + tarjeta.getSaldo());

        System.out.println("Tipo de usuario: " + tipoUsuario.getNombre());
        System.out.println("Estado del usuario: " + (tipoUsuario.getEstado() ? "Activo" : "Inactivo"));
    }
}

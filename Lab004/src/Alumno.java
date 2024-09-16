
import java.util.Scanner;

public class Alumno {
    private String codigo;
    private String nombre;
    private double promedioFinal;

    // Constructor
    public Alumno(String codigo, String nombre, double promedioFinal) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.promedioFinal = promedioFinal;
    }

    // Métodos para ingresar datos
    public void ingresarDatos(Scanner scanner) {
        System.out.print("Ingrese código: ");
        this.codigo = scanner.nextLine();
        System.out.print("Ingrese nombre: ");
        this.nombre = scanner.nextLine();
        System.out.print("Ingrese promedio final: ");
        this.promedioFinal = scanner.nextDouble();
        scanner.nextLine();  // Consumir el salto de línea
    }

    // Método para presentar los datos
    public void presentarDatos() {
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Promedio Final: " + promedioFinal);
    }
}


import java.util.Scanner;

public class Lab004 {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            
            Alumno[] alumnos = new Alumno[3];  
            
            
            for (int i = 0; i < alumnos.length; i++) {
                System.out.println("Ingrese los datos del alumno " + (i + 1) + ":");
                alumnos[i] = new Alumno("", "", 0);  
                alumnos[i].ingresarDatos(scanner);  
            }
            
            
            System.out.println("\nDatos ingresados:");
            for (Alumno alumno : alumnos) {
                alumno.presentarDatos();
                System.out.println("------------------");
            }
        } 
    }
}

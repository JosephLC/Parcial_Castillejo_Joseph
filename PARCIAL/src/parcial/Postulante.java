package parcial;

import java.util.ArrayList;
import java.util.Date;

public class Postulante {
    private String DNI;
    private String email;
    private String nombres;
    private String apellidos;
    private String direccion;
    private Date fechaNacimiento;
    private final ArrayList<Postulacion> postulaciones;
    private GradoEstudio gradoEstudio;

    public Postulante(String DNI, String email, String nombres, String apellidos, String direccion, Date fechaNacimiento) {
        this.DNI = DNI;
        this.email = email;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.postulaciones = new ArrayList<>();
    }

    public boolean asignarGradoEstudio(GradoEstudio grado) {
        this.gradoEstudio = grado;
        return true;
    }

    public boolean postular(Oferta oferta, String glosa) {
        return postulaciones.add(new Postulacion(new Date(), oferta, glosa));
    }

    public boolean anularPostulacion(Postulacion postulacion) {
        postulacion.setAnulado(true);
        postulacion.setFechaAnulacion(new Date());
        return true;
    }

    public ArrayList<Postulacion> getPostulaciones() {
        return postulaciones;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public GradoEstudio getGradoEstudio() {
        return gradoEstudio;
    }

    public void setGradoEstudio(GradoEstudio gradoEstudio) {
        this.gradoEstudio = gradoEstudio;
    }

   
}

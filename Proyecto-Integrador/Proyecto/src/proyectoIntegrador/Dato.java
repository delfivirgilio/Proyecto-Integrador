
package proyectoIntegrador;


public class Dato {

   /* Dato(String matricula, 
         String dni, 
         String nombre, 
         String apellido, 
         String direccion, 
         String email, 
         String telefono, 
         String año, 
         String curso, 
         String especialidad) {
    }*/
    
 private String matricula;
 private String dni;
 private String nombre; 
 private String apellido; 
 private String direccion; 
 private String email;         
 private String telefono;         
 private String año;        
 private String curso; 
 private String especialidad;     

    public Dato() {
    }

    public Dato(String matricula, String dni, String nombre, String apellido, String direccion, String email, String telefono, String año, String curso, String especialidad) {
        this.matricula = matricula;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.email = email;
        this.telefono = telefono;
        this.año = año;
        this.curso = curso;
        this.especialidad = especialidad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Dato{" + "matricula=" + matricula + ", dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", email=" + email + ", telefono=" + telefono + ", a\u00f1o=" + año + ", curso=" + curso + ", especialidad=" + especialidad + '}';
    }
 
 
    
}

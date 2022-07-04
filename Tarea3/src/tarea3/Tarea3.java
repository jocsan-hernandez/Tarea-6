//Seguir el ejemplo del modulo 3 para otra profesion
package tarea3;

/**
 *
 * @author jocsa
 */
public class Tarea3 {

    public static void main(String[] args) {
             //Creando el objeto fisico
    Fisico fisico = new Fisico();
    fisico.setNombre("Jocsan");
    fisico.setApellido("Hernandez");
    fisico.setEspecialidad ("Particulas");
    fisico.setNumeroDePublicaciones (4);
    //Obteniendo los valores
    System.out.println("Nombre: " + fisico.getNombre() );
    System.out.println("apellido: " + fisico.getApellido() );
    System.out.println("Especialidad: " + fisico.getEspecialidad() );
    System.out.println("Numero de Publicaciones: " + fisico.getNumeroDePublicaciones() );
    }
    
    public static class Fisico{
    private String nombre;
    private String apellido;
    private String especialidad;
    private int num_publicaciones;   
    //Métodos públicos para acceder a los datos
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public String getEspecialidad(){
        return especialidad;
    }
    public int getNumeroDePublicaciones(){
        return num_publicaciones;
    }

    //Métodos públicos para establecer los datos

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setEspecialidad(String especialidad){
        this.especialidad = especialidad;
    }
    public void setNumeroDePublicaciones(int num_publicaciones){
        this.num_publicaciones = num_publicaciones;
    }
   }
  }


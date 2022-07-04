//Imprime en consola un nombre, una nota y su observacion
public class Ejercicio6 {
    public static void main(String args[]) {
        // Usaremos 3 variables para ello
        String nombre= "Jocsan";
        int nota=99;
        String etiqueta; 
        if(nota>=75){
            etiqueta="Aprobado";
        }else{
            etiqueta="Reprobado";
        }
        System.out.println(nombre+"   "+nota+ "   "+etiqueta);
    }
}

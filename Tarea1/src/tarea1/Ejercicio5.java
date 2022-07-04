//Crea un arreglo multidimensional con 5 compañeros de clase
package tarea1;

public class Ejercicio5 {

    public static void main(String args[]) {
        //Creamos el arreglo multidimensional, debe guardar 4 datos por entrada
        String[][] datos_clase= new String[5][4];
        //Llenando para el primer compañero
        datos_clase[0]= new String[]{"Erick", "Ulloa", "Electronica", "Textiles Merendon"};
        datos_clase[1]= new String []{"Ailin", "Ayala", "Computacion", "NA"};
        datos_clase[2]=new String[]{"Eleazar", "Erazo", "Produccion Textil", "NA"};
        datos_clase[3]= new String[]{"Judy", "Castro", "Computacion", "NA"};
        datos_clase[4]=new String[]{"Maria", "Rivas", "Electronica", "NA"};
    }
}

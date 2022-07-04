//Crea un arreglo de 10 con 10 nombres, los guarda y luego imprime
package tarea1;
//
public class Ejercicio4 {
    public static void main(String args[]) {
        //Creamos el arreglo de 10
        String[] estudiantes= new String[10];
        //Guardamos
        estudiantes[0]="Erick Ulloa";
        estudiantes[1]="Ailin Ayala";
        estudiantes[2]="Eleazar David";
        estudiantes[3]="Judy Castro";
        estudiantes[4]="Maria Rivas";
        estudiantes[5]="Brayan Rodriguez";
        estudiantes[6]="Brayan Aleman";
        estudiantes[7]="Ramon Flores";
        estudiantes[8]="Oscar Velasquez";
        estudiantes[9]="Jose Perez";
        //Imprimimos
        for (int i=0; i<=9; i=i+1){
            System.out.println(estudiantes[i]);
        }
    }
}
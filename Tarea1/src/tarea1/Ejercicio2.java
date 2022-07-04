//Ejercicio 2 todas las operaciones de 2 numeros
package tarea1;

public class Ejercicio2 {
    public static void main(String args[]) {
        double numero1=5;
        double numero2=2;
        double suma, resta, multiplicacion, modulo=0;
        double division=0;
        boolean bandera= false; 
        suma= numero1+numero2;
        resta= numero1-numero2;
        multiplicacion= numero1*numero2;
        if(numero2 != 0){
            division= numero1/numero2;
             modulo= numero1%numero2;
        }else{
            bandera= true;
        }
        System.out.println("El primer numero es: "+ numero1);
        System.out.println("El segundo numero es: "+ numero2);
        System.out.println("La suma es: "+ suma);
        System.out.println("La resta es: "+ resta);
        System.out.println("La multiplicacion es: "+ multiplicacion);
        if(! bandera){
            System.out.println("La division es: "+ division);
            System.out.println("El modulo es: "+ modulo);
       }else{
            System.out.println("No se puede dividir entre 0");
            System.out.println("mod0 no definido en Java");
        }
    }
}

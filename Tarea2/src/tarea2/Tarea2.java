//Tarea 2, crear una clase con 4 metodos
package tarea2;

public class Tarea2 {
    public static void main(String[] args) {
        //Creamos la instancia
        Recursos prueba= new Recursos();
        prueba.Metodo1();
        prueba.Metodo2(28);
        System.out.println(prueba.Metodo3(2,5));
        int x=5;
        int[] arreglo_prueba= prueba.Metodo4(x);
        for(int i=0; i<x; i=i+1){
            System.out.println(arreglo_prueba[i]);
        }
    }
    public static class Recursos{
        //Metodo que no recibe nada y solo imprime un mensaje
        public void Metodo1(){
            System.out.println("Programacion Orientada a Objetos 2021");
        }
        //Metodo que guarda la edad del estudiante e imprime si es mayor de edad o no
        public void Metodo2(int x){
            //Declaramos x y le asignamos la edad
            int edad=x;
            if(edad>=21){
                System.out.println("Mayor de edad");
            }else{
                System.out.println("Menor de edad");
            }
        }
        //Metodo que regresa el resultado de multiplicar dos enteros
        public int Metodo3(int numero1, int numero2){
            //Los numeros los recibe, solo declaramos el retorno
            return numero1*numero2;
        }
        //Metodo que retorna una lista de numeros de 1 a x
        public int[] Metodo4(int x){
            //Crea el arreglo y lo regresa
            int[] arreglo= new int[x];
            for(int i=0; i<x; i=i+1){
                arreglo[i]=i+1;
            }
            return arreglo;
        }
    }
}

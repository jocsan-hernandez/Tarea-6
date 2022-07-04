/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea5;
import helpers.Circulo;
import helpers.Cuadrado;
import helpers.Linea;
import helpers.Triangulo;
/**
 *
 * @author jocsa
 */
public class Tarea5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Creando un circulo
       Circulo circulo1= new Circulo(5);
       System.out.println(circulo1.CalcularRadio());
       circulo1.Dibujar();
       circulo1.EstablecerColor("azul");
       System.out.println(circulo1.ObtenerColor());
       //creando cuadrado
       Cuadrado cuadrado1=new Cuadrado(10);
       System.out.println(cuadrado1.calcularArea());
       cuadrado1.Dibujar();
       //Creando linea
       Linea linea1=new Linea(2);
       linea1.Dibujar();
       //Creando Triangulo
       Triangulo triangulo1=new Triangulo(5,4,2);
       System.out.println(triangulo1.calcularArea());
       triangulo1.Dibujar();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpers;

/**
 *
 * @author jocsa
 */
public class Triangulo extends Formas{
    private double ladoA;
    private double ladoB;
    private double ladoC;
    private double semiperimetro;
    
    //Constructor
    public Triangulo(double ladoA, double ladoB, double ladoC){
        this.ladoA=ladoA;
        this.ladoB=ladoB;
        this.ladoC=ladoC;
        this.semiperimetro=(ladoA+ladoB+ladoC)/2;
    }
    //Metodos
    @Override
    public void Dibujar() {
        System.out.println("Triangulo");
    }
    
    public double calcularArea(){
        double area; 
        area= Math.sqrt(semiperimetro*(semiperimetro-ladoA)*(semiperimetro-ladoB)*(semiperimetro-ladoC));
        return area;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpers;

/**
 *
 * @author jocsa
 */
public class Cuadrado extends Formas{
    private double area; 
    
    public Cuadrado(double area){
        this.area=area;
    }
    @Override
    public void Dibujar() {
        System.out.println("Cuadrado");
    }
    
    public double calcularArea(){
        return area;
    }
}

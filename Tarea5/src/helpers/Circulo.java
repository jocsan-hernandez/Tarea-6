/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpers;

/**
 *
 * @author jocsa
 */
public class Circulo extends Formas{
    private float radio;
    //Constructor
    public Circulo(float radio){
        this.radio=radio;
    }
    //Metodos
    @Override
    public void Dibujar() {
        System.out.println("Circulo");
    }
    
    public float CalcularRadio(){
        return radio;
    }
    
}

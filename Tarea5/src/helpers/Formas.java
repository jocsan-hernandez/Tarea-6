/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpers;

/**
 *
 * @author jocsa
 */
abstract class Formas {
    private String color;
    
    public abstract void Dibujar();
    
    public void EstablecerColor(String color){
        this.color=color;
    }
 
    public String ObtenerColor(){
        return color;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpers;

/**
 *
 * @author jocsa
 */
public class Linea extends Formas{
    private float largo;
    //Constructor
    public Linea(float largo){
        this.largo=largo;
    }
    //Implementacion de metodo abstracto
    @Override
    public void Dibujar() {
      System.out.println("Linea");
    }
    
}

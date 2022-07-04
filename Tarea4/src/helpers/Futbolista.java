/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpers;

/**
 *
 * @author jocsa
 */
public class Futbolista {
    //Declaramos los atributos
    private int edad; 
    private String nombre; 
    private String equipoActual;
    
    //Metodos set
    public void establecerEdad(int edad){
        this.edad=edad;
    }
    
     public void establecerNombre(String nombre){
        this.nombre=nombre;
    }
     
    public void establecerEquipoActual(String equipoActual){
        this.equipoActual=equipoActual;
    }
    
    //Metodos get
    public int obtenerEdad(){
        return edad;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
 
    public String obtenerEquipoActual(){
        return equipoActual;
    }    
}

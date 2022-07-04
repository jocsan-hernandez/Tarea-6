/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpers;

/**
 *
 * @author jocsa
 */
public class RealMadrid extends Equipo {
     //Estableciendo lo que nos piden
    Futbolista capitan= new Futbolista(); 
    String nombre="Real Madrid";
    
    public RealMadrid(){
    capitan.establecerNombre("Benzema");
    }
    
    @Override
    public String getEquipo() {
        return nombre;
    }

    @Override
    public String getCapitan() {
        return capitan.obtenerNombre();
    }
}

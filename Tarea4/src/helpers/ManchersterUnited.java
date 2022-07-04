/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpers;

/**
 *
 * @author jocsa
 */
public class ManchersterUnited extends Equipo {
     //Estableciendo lo que nos piden
    Futbolista capitan= new Futbolista(); 
    String nombre="Manchester United";
    
    public ManchersterUnited(){
            capitan.establecerNombre("McGuire");
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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea4;
import helpers.Futbolista;
import helpers.ParisSaintGerman;
import helpers.ManchersterUnited;
import helpers.RealMadrid;
/**
 *
 * @author jocsa
 */
public class Tarea4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creando al futbolista
      Futbolista futbolista= new Futbolista();
      futbolista.establecerEdad(34);
      futbolista.establecerNombre("Lionel Messi");
      futbolista.establecerEquipoActual("Paris Saint German");
      //Imprimiendo
      System.out.println(futbolista.obtenerEdad());
      System.out.println(futbolista.obtenerNombre());
      System.out.println(futbolista.obtenerEquipoActual());
      
       //Instanciando un equipo
    ParisSaintGerman psg= new ParisSaintGerman();
    
    //Imprimiendo nombre de equipo y capitan
    System.out.println(psg.getEquipo());
    System.out.println(psg.getCapitan());
    
     //Instanciando un equipo
    ManchersterUnited mu= new ManchersterUnited();
    
    //Imprimiendo nombre de equipo y capitan
    System.out.println(mu.getEquipo());
    System.out.println(mu.getCapitan());
    
         //Instanciando un equipo
    RealMadrid rm= new RealMadrid();
    
    //Imprimiendo nombre de equipo y capitan
    System.out.println(rm.getEquipo());
    System.out.println(rm.getCapitan());
    }
       
    
}

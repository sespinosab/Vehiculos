/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automoviles;

/**
 *
 * @author Estudiante
 */
public class Automovil {
    private String marca;
    private int año;
    private String modelo;
    private Llanta[] llanta;
    private Puerta[] puerta;
    private Motor motor;
    
    
    public Automovil(String marca, int año, String modelo){
        this.marca=marca;
        this.año=año;
        this.modelo=modelo;
    }
    
    public Motor getMotor(){
        return this.motor;
    }
    
    public void replace_motor(Motor motor){
        this.motor=motor;
    }
    
    public Llanta[] getLlanta(){
        return this.llanta;
    }
    
    public boolean addLlanta(Llanta llanta){
        
        return false;
    }
    public boolean removeLLanta(Llanta Llanta){
        return false;
    }
    
    public boolean replaceLlanta(Llanta Llanta, Llanta llanta_nueva){
        return false;
    }
    
    public boolean addPuerta(Puerta puerta){
        
        return false;
    }
    public boolean removePuerta(Puerta puerta){
        return false;
    }
    
    public boolean replacePuerta(Puerta puerta, Puerta puerta_nueva){
        return false;
    }
}

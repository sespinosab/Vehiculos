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
public class Llanta {
    private String marca;
    private int tamaño;
    private String modelo;
    
    public Llanta(String marca, int tamaño, String modelo){
        this.marca=marca;
        this.tamaño=tamaño;
        this.modelo=modelo;
    }
    
    public String Getmarca(){
        return marca;
    }
    
}

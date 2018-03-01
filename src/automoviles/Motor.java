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
public class Motor {
    private String serie;
    private int cilindros;
    
    public Motor(String serie, int cilindros){
        this.serie=serie;
        this.cilindros=cilindros;
    }
    
    public String getNumeroSerie(){
        return serie;
    }
    
    public int getNumeroCilindros(){
        return cilindros;
    }
    
    
}

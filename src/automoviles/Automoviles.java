/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automoviles;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Automoviles {
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      Motor motor = new Motor("A100", 10);
      //Llanta llanta;
      Llanta uno=new Llanta("Volk", 30, "2000");
      
      Puerta puerta=new Puerta();
      puerta.setTipo("k1");
      Automovil auto=new Automovil("Chevrolet",2015,"A3");
      auto.addPuerta(puerta);
      auto.addLlanta(uno);
      auto.replace_motor(motor);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

/**
 *
 * @author Jhonston
 */
public class Metamorfomago extends Mago implements Volador{
        private String pocion;

    public Metamorfomago(String nombre, String apellido, String casa, String varita, int edad, String pocion) {
        super(nombre, apellido, casa, varita, edad);
        this.pocion=pocion;
    }

    @Override
    public void despegar(){ 
        System.out.println("Has despegado");
    }
    @Override
    public void volar(){  //método sobreescrito sirve para informar al usuario los requisitos para volar
        System.out.println("Usted es un mago Metamorfomago, puede volar solo con su poder");
    }
    // get y set necesarios de la clase
    public String getPocion(){
        return pocion;
    }
    public void setPocion(String pocion){
        this.pocion=pocion;
    }
        
}

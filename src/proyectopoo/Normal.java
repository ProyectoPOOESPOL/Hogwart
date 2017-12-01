/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

import java.util.Scanner;

/**
 *
 * @author Jhonston
 */
public class Normal extends Mago implements Volador {
    private String deporte;
    public Normal(String nombre, String apellido, String casa, String varita, int edad,boolean esProfesor ) {
        super(nombre, apellido, casa, varita, edad,esProfesor);
        Scanner sc=new Scanner(System.in);
        System.out.println("¿Qué deporte practica?: ");
        deporte=sc.nextLine();
    }
    @Override
    public void despegar(){ 
        System.out.println("Has despegado");
    }
    @Override
    public void volar(){  //método sobreescrito sirve para informar al usuario los requisitos para volar
        System.out.println("Usted es un mago normal, para volar necesita una Nimbus 2000");
    }
    // get y set necesarios de la clase
    public String getDeporte(){
        return deporte;
    }
    public void setDeporte(String deporte){
        this.deporte=deporte;
    }
}

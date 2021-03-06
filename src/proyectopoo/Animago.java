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
public class Animago extends Mago implements Volador{ //Se heredan los atributos y métodos de la clase Mago así como se implementa la interfaz Volador
    private String animal, hechizo;

    public Animago(String nombre, String apellido, String casa, String varita, int edad,boolean esProfesor) { //Constructor de la clase con parámetros para la clase padre
        super(nombre, apellido, casa, varita, edad,esProfesor);
        Scanner sc=new Scanner(System.in);
        System.out.println("¿En qué clase de animal puede convertirse?: ");
        animal=sc.nextLine();
        System.out.println("¿Qué hechizo utiliza?: ");
        hechizo=sc.nextLine();
        
      
    }

    @Override
    public void despegar(){ 
        System.out.println("Has despegado");
    }
    @Override
    public void volar(){  //método sobreescrito sirve para informar al usuario los requisitos para volar
        System.out.println("Usted es un mago animago, para volar necesita una varita");
    }
    
    // get y set necesarios de la clase
    public String getAnimal(){
        return animal;
    }
    public String getHechizo(){
        return hechizo;
    }
    public void setAnimal(String animal){
        this.animal=animal;
    }
    public void setHechizo(String hechizo){
        this.hechizo=hechizo;
    }
   
}

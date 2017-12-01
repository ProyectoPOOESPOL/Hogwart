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
public class Mago { //Clase padre de magos
    private String nombre, apellido, casa, varita,fechaIngreso;
    private boolean esProfesor;
    private int edad;
    
    public Mago(String nombre,String apellido,String casa,String varita,int edad,boolean esProfesor){ //constructor de la clase padre
        this.nombre=nombre;
        this.apellido=apellido;
        this.casa=casa;
        this.varita=varita;
        this.edad=edad;
        Scanner sc=new Scanner(System.in);
        if(esProfesor==true){
            System.out.println("Ingrese fecha de ingreso: ");
            fechaIngreso=sc.nextLine();
        }else fechaIngreso="Es estudiante";
    }
    //get y set necesarios de la clase 
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public String getCasa(){
        return casa;
    }
    public String getVarita(){
        return varita;
    }
    public int getEdad(){
        return edad;
    }
    public String getFechaIngreso(){
        return fechaIngreso;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public void setCasa(String casa){
        this.casa=casa;
    }
    public void setVarita(String varita){
        this.varita=varita;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public void setFechaIngreso(String fechaIngreso){
        this.fechaIngreso=fechaIngreso;
    }
}

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
public class Mago { //Clase padre de magos
    private String nombre, apellido, casa, varita;
    private int edad;
    
    public Mago(String nombre,String apellido,String casa,String varita,int edad){ //constructor de la clase padre
        this.nombre=nombre;
        this.apellido=apellido;
        this.casa=casa;
        this.varita=varita;
        this.edad=edad;
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
}

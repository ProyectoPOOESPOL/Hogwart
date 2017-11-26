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
public class Estudiante  {
    private String nombre,apellido,casa,varita,tipoMago,animal,hechizo,pocion,deporte;
    private int edad;
    
    public Estudiante(String nombre,String apellido,String casa,String varita,String tipoMago, int edad){
        this.nombre=nombre;
        this.apellido=apellido;
        this.casa=casa;
        this.varita=varita;
        this.tipoMago=tipoMago;
        this.edad=edad;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public String getCasa(){
        return casa;
    }
    public void setCasa(String casa){
        this.casa=casa;
    }
    public String getVarita(){
        return varita;
    }
    public void setVarita(String varita){
        this.varita=varita;
    }
    public String getTipoMago(){
        return tipoMago;
    }
    public void setTipoMago(String tipoMago){
        this.tipoMago=tipoMago;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    
}

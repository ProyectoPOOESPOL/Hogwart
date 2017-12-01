/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;
import java.util.*;
/**
 *
 * @Tonny
 */
public class Profesor extends Mago  {
    public Profesor(String nombre,String apellido,String casa,String varita,int edad,boolean esProfesor,int agnio,int mes ,int dia){
        super(nombre, apellido, casa, varita, edad, esProfesor);
        GregorianCalendar fecha=new GregorianCalendar(agnio,mes-1,dia);
        fechaCorrecta=fecha.getTime();
    }
    public Date damefecha(){
        return fechaCorrecta;
    }
     private Date fechaCorrecta;
}

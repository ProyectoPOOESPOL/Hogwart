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
public class Planificador {
    private String nombre,apellido,casa,varita,tipoMago,animal,hechizo,pocion,deporte;
    private int edad;
    Scanner sc= new Scanner(System.in);
    public Planificador(){
        nombre="";
        apellido="";
        casa="";
        varita="";
        tipoMago="";
        animal="";
        hechizo="";
        pocion="";
        deporte="";
        edad=0;
    }
    public void crearCurso(){
        
    }
    public void crearProfesor(){
        
    }
    public void crearEstudiante(){
        System.out.println("Ingrese Nombre: ");
        nombre=sc.nextLine();
        System.out.println("Ingrese Apellido: ");
        apellido=sc.nextLine();
        System.out.println("Ingrese Edad: ");
        edad=sc.nextInt();
        System.out.println("Ingrese Varita: ");
        varita=sc.nextLine();
        System.out.println("Ingrese Casa: ");
        casa=sc.nextLine();
        System.out.println("Tipos de Mago/Bruja\n1.Animago\n2.Metamorfomago\n3.Estandar\nEliga el tipo de mago/bruja que es: ");
        int eleccion=sc.nextInt();
        System.out.println("¿Desea guardar los datos? S/N");
        String validacion=sc.nextLine();
        
        switch(eleccion){
            case 1:
                Animago ani=new Animago(nombre,apellido,casa,varita,edad,animal,hechizo);
            case 2:
                Metamorfomago meta= new Metamorfomago(nombre,apellido,casa,varita,edad,pocion);
            case 3:
                Normal normal= new Normal(nombre,apellido,casa,varita,edad,deporte);
        }
        if (validacion.toLowerCase()=="s"){
           //Se ingresa el estudiante el en .txt 
        }
        else{
            System.out.println("Registro no completado, ¿desea realizar otro registro? S/N: ");
            validacion=sc.nextLine();
            if (validacion.toLowerCase()=="s"){
                this.crearEstudiante();
            }
            else{
                //Se regresa al menú principal
            }
        }
    }
    public void verHorarios(){
        
    }
    public void listadoEstudiantes(){
        
    }
}

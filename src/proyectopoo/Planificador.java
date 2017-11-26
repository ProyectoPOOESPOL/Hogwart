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
        
        
    }
    public void verHorarios(){
        
    }
    public void listadoEstudiantes(){
        
    }
}

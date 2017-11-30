/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

import java.util.Scanner;
import java.io.*;
import java.net.URL;

/**
 *
 * @author Jhonston
 */
public class Planificador {
    private String nombre,apellido,casa,varita,tipoMago,letraTipoMago,animal,hechizo,pocion,deporte;
    private int edad;
    
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
        Scanner sc= new Scanner(System.in);
        int eleccion=0,validacion=0;
        
        
            
            System.out.println("Ingrese Nombre: ");
            nombre=sc.nextLine();
            System.out.println("Ingrese Apellido: ");
            apellido=sc.nextLine();
            System.out.println("Ingrese Varita: ");
            varita=sc.nextLine();
            System.out.println("Ingrese Casa: ");
            casa=sc.nextLine();
            System.out.println("Ingrese Edad: ");
            edad=sc.nextInt(); //falta verificar
            System.out.println("Tipos de Mago/Bruja\n1.Animago\n2.Metamorfomago\n3.Estandar\nEliga el tipo de mago/bruja que es: ");
            eleccion=sc.nextInt();
            System.out.println("¿Desea registrar?\n1.Si\n2.No\nSeleccione: ");
            validacion=sc.nextInt();
                
            int i=0;
            
                switch (validacion) {
                    case 1:
                        FileWriter fichero = null;
                        PrintWriter pw = null;
                        try
                        {
                            fichero = new FileWriter("src/resources/Estudiantes.txt",true);
                            pw = new PrintWriter(fichero);

                            i=0;
                            while(i==0){
                                switch(eleccion){
                                    case 1:
                                        Animago an=new Animago(nombre,apellido,casa,varita,edad,animal,hechizo);
                                        letraTipoMago="A";
                                        pw.println(an.getNombre()+","+an.getApellido()+","+an.getEdad()+","+an.getVarita()+","+an.getCasa()+","+letraTipoMago);
                                        System.out.println("Registro exitoso");
                                        i=1;
                                        break;
                                    case 2:
                                        Metamorfomago mf= new Metamorfomago(nombre,apellido,casa,varita,edad,pocion);
                                        letraTipoMago="M";
                                        pw.println(mf.getNombre()+","+mf.getApellido()+","+mf.getEdad()+","+mf.getVarita()+","+mf.getCasa()+","+letraTipoMago);
                                        System.out.println("Registro exitoso");
                                        i=1;
                                        break;
                                    case 3:
                                        Normal nm= new Normal(nombre,apellido,casa,varita,edad,deporte);
                                        letraTipoMago="N";
                                        pw.println(nm.getNombre()+","+nm.getApellido()+","+nm.getEdad()+","+nm.getVarita()+","+nm.getCasa()+","+letraTipoMago);
                                        System.out.println("Registro exitoso");
                                        i=1;
                                        break;
                                    default:
                                        System.out.println("Tipos de Mago/Bruja incorrecto\nTipos de Mago/Bruja\n1.Animago\n2.Metamorfomago\n3.Estandar\nEliga el tipo de mago/bruja que es: ");
                                        eleccion=sc.nextInt();
                                        i=0;
                                        break;
                                }
                            }    
                        } catch (Exception e) {
                            e.printStackTrace();
                        } finally {
                            try {
                                if (null != fichero)
                                    fichero.close();
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                        }   break;
                    case 2:

                        System.out.println("Registro no completado, ¿desea realizar otro registro?\n1.Si\n2.No\nSeleccione: ");
                        int sel=sc.nextInt();

                        i=0;
                        while(i==0){
                            switch (sel) {
                                case 1:
                                    this.crearEstudiante();
                                    i=1;
                                    break;
                                case 2:
                                    //Se regresa al menú principal
                                    i=1;
                                    break;
                                default:
                                    System.out.println("Seleccion incorrecta\n¿desea realizar otro registro?\n1.Si\n2.No\nSeleccione: ");
                                    sel=sc.nextInt();
                                    i=0;
                                    break;
                            }
                        }   break;
                    default:
                        break;
                }
            
    }
    public void verHorarios(){
        
    }
    public void listadoEstudiantes(){
        
    }
}

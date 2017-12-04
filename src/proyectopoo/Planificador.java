/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

import java.util.Scanner;
import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Jhonston
 */
public class Planificador implements Comparable<Estudiante> {
    private String nombre,apellido,casa,varita,tipoMago,letraTipoMago;
    private int edad;
    private int indiceMateria, indiceProfesor,criterio,capacidad;
    private String dia, horario;
    
    public ArrayList<String> listaMaterias= new ArrayList<>();
     public ArrayList<Curso> listaCursos= new ArrayList<>();
    
    Scanner sc= new Scanner(System.in);
    public Planificador(){
        //Se agregan materias predefinidas
        listaMaterias.add("Pociones");
        listaMaterias.add("Defensas contra las artes oscuras");
        listaMaterias.add("Adivinación");
        listaMaterias.add("Astronomía");
        listaMaterias.add("Historia de la magia");
        listaMaterias.add("Herbología");
        listaMaterias.add("Encantamientos");
        listaMaterias.add("Vuelo");
        nombre="";
        apellido="";
        casa="";
        varita="";
        tipoMago="";
        edad=0;
    }
    public void crearCurso() throws IOException{
         int eleccion=0,validacion=0;   
            System.out.println("/******CREAR CURSO******/");
            System.out.println("----------MATERIAS----------");
            for(int i=0;i<listaMaterias.size();i++){
                System.out.println((i+1)+".- "+listaMaterias.get(i));
            }
            System.out.println("Elija una materia del listado de materias: ");
            indiceMateria=sc.nextInt();
            sc.nextLine();
            System.out.println("----------PROFESORES----------");
            leerMagos("src/resources/Profesores.txt");//Muestra nombre y apellido de profesores
            System.out.println("Seleccione un profesor: ");
            
            indiceProfesor=sc.nextInt(); 
            String[] profesor=seleccionMago("src/resources/Profesores.txt",indiceProfesor);
            
            System.out.println("Ingrese capacidad del curso: ");
            capacidad=sc.nextInt(); 
            sc.nextLine();
            System.out.println("Ingrese el día: ");
            dia=sc.nextLine();
            System.out.println("Ingrese el horario del curso: ");
            horario=sc.nextLine();
            System.out.println("¿Desea registrar?\n1.Si\n2.No\nSeleccione: ");
            validacion=sc.nextInt();
             int i=0;
            
                switch (validacion) {
                    case 1:
                        Curso curso= new Curso(listaMaterias.get(indiceMateria),profesor[0]+" "+profesor[1], horario, dia, capacidad);
                        listaCursos.add(curso);
                        System.out.println("Se ha creado el curso: \n"+curso.toString());
                        System.out.println("¿desea realizar otro registro?\n1.Si\n2.No\nSeleccione: ");
                        int sel=sc.nextInt();

                        i=0;
                        while(i==0){
                            switch (sel) {
                                case 1:
                                    this.crearCurso();
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
                    
                    case 2:

                        System.out.println("Registro no completado, ¿desea realizar otro registro?\n1.Si\n2.No\nSeleccione: ");
                        sel=sc.nextInt();

                        i=0;
                        while(i==0){
                            switch (sel) {
                                case 1:
                                    this.crearCurso();
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
    public void crearProfesor(){
         int eleccion=0,validacion=0;
            System.out.println("/******CREAR PROFESOR******/");
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
                            fichero = new FileWriter("src/resources/Profesores.txt",true);
                            pw = new PrintWriter(fichero);

                            crearMagos(pw,eleccion,true); //Permite instanciar la clase de mago
                            System.out.println("¿desea realizar otro registro?\n1.Si\n2.No\nSeleccione: ");
                        int sel=sc.nextInt();

                        i=0;
                        while(i==0){
                            switch (sel) {
                                case 1:
                                    this.crearCurso();
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
    public void crearEstudiante(){
        int eleccion=0,validacion=0;
            System.out.println("/******CREAR ESTUDIANTE******/");
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

                            crearMagos(pw,eleccion,false); //Permite instanciar la clase de mago
                            System.out.println("¿desea realizar otro registro?\n1.Si\n2.No\nSeleccione: ");
                        int sel=sc.nextInt();

                        i=0;
                        while(i==0){
                            switch (sel) {
                                case 1:
                                    this.crearCurso();
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
        System.out.println("/******CURSOS PLANIFICADOS******/");  
        for(int i=0;i<listaMaterias.size();i++){
            System.out.println((i+1)+".- "+listaMaterias.get(i));
        }
        System.out.println("Elija una materia del listado de materias: ");
        indiceMateria=sc.nextInt();
        boolean hayHorarios=false;
        for(int i=0;i<listaCursos.size();i++){
            if(listaCursos.get(i).getMateria().equals(listaMaterias.get(indiceMateria-1))){
                System.out.println(listaCursos.get(i).toString()+"\nREGISTRADOS: "+listaCursos.get(i).getRegistrados());
                hayHorarios=true;
            }  
            if(hayHorarios==false){
                System.out.println("No hay horarios disponibles para esa materia");
            }
        }
        System.out.println("¿desea ver otros horarios?\n1.Si\n2.No\nSeleccione: ");
        int sel=sc.nextInt();

        int i=0;
        while(i==0){
            switch (sel) {
                case 1:
                    this.verHorarios();
                    i=1;
                    break;
                    case 2:
                    //Se regresa al menú principal
                    i=1;
                    break;
                    default:
                    System.out.println("Seleccion incorrecta\n¿desea ver otros horarios?\n1.Si\n2.No\nSeleccione: ");
                    sel=sc.nextInt();
                    i=0;
                    break;
            }
        }      
            
    }
    public void listadoEstudiantes() throws FileNotFoundException, IOException{
        System.out.println("/******LISTADO DE ESTUDIANTES******/");
        System.out.println("1.-Edad\n2.-Nombre\n3.-Número de materias registradas\nSeleccione el criterio a ordenar: ");
        criterio=sc.nextInt();
        sc.nextLine();
        String cadena;
        int i=0;
        String[] datos=null;
        Estudiante[] estudiantes=null;
        
        
           FileReader f = new FileReader("src/resources/Estudiantes.txt");
           BufferedReader b = new BufferedReader(f);
           while((cadena = b.readLine())!=null) {
                datos=cadena.split(",");
                estudiantes[i]=new Estudiante(datos[0],datos[1],datos[4],datos[3],datos[5],Integer.parseInt(datos[2]),0);   
           }
           b.close();  

        
    }
    public void crearMagos(PrintWriter pw,int eleccion,boolean esProfesor){
        int i=0;
        while(i==0){
                             
        switch(eleccion){
            case 1:
                Animago an=new Animago(nombre,apellido,casa,varita,edad,esProfesor);
                letraTipoMago="A";
                pw.println(an.getNombre()+","+an.getApellido()+","+an.getEdad()+","+an.getVarita()+","+an.getCasa()+","+letraTipoMago);
                System.out.println("Registro exitoso");
                if(esProfesor)
                i=1;
                break;
            case 2:
                Metamorfomago mf= new Metamorfomago(nombre,apellido,casa,varita,edad,esProfesor);
                letraTipoMago="M";
                pw.println(mf.getNombre()+","+mf.getApellido()+","+mf.getEdad()+","+mf.getVarita()+","+mf.getCasa()+","+letraTipoMago);
                System.out.println("Registro exitoso");
                i=1;
                break;
            case 3:
                Normal nm= new Normal(nombre,apellido,casa,varita,edad,esProfesor);
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
    }
    public void leerMagos(String archivo) throws FileNotFoundException, IOException {
        String cadena;
        int contador=1;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null) {
            String[] datos=cadena.split(",");
            System.out.println(contador+".- "+datos[0].toUpperCase()+" "+datos[1].toUpperCase());
            contador++;
        }
        b.close();
    }
    public String[] seleccionMago(String archivo,int posicion) throws FileNotFoundException, IOException {
           String cadena;
           String[]datos = null;
           int contador=1;
           FileReader f = new FileReader(archivo);
           BufferedReader b = new BufferedReader(f);
           while((cadena = b.readLine())!=null) {
               if(contador==posicion){
                   datos=cadena.split(",");
               } 
               contador++;
           }
           b.close();
           return datos;
       }
    @Override
    public int compareTo(Estudiante e) {
        if (edad<e.getEdad()) {
            return -1;
            }
        if (edad > e.getEdad()) {
            return 1;
            }
            return 0;
        }
}
    

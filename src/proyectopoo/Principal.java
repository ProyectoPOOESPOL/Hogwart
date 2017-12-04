/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
 *
 * @author Jhonston
 */
public class Principal {
    static Scanner sc=new Scanner(System.in);
    static String usuario,contraseña,cadena;
    static String[] datos;
    public static void main(String[] args) throws IOException{
        System.out.println("Bienvenido a el colegio Hogwarts de Magia y Hechicería");
        System.out.println("Ingrese su nombre de usuario: ");
        usuario=sc.nextLine();
        System.out.println("Ingrese su contraseña: ");
        contraseña=sc.nextLine();
        int i=0;
        while(i==0){
            switch(validarLogin(usuario,contraseña)){
                case 1:
                    
                    System.out.println("Ingreso exitoso");
                    System.out.println("------PLANIFICADOR------");
                    System.out.println("1.-Crear curso\n2.-Crear profesor\n3.-Crear estudiante\n4.-Ver horarios planificados\n5.-Listado de estudiantes\n6.-Salir\nSeleccione una opción: ");
                    int seleccion = sc.nextInt();
                    Planificador p= new Planificador();
                    switch(seleccion){
                        case 1: p.crearCurso(); break;
                        case 2: p.crearProfesor(); break;
                        case 3: p.crearEstudiante(); break;
                        case 4: p.verHorarios(); break;
                        case 5: p.listadoEstudiantes(); break;
                        case 6: i=1; break;
                        default: System.out.println("Opción incorrecta"); break;
                        }break;
                case 2:
                    System.out.println("Estudiante no se encuentra disponible"); //Rol estudiante no está listo
                    break;
                default:
                    System.out.println("Usuario o contraseña incorrectas");
                    System.out.println("Ingrese su nombre de usuario: ");
                    usuario=sc.nextLine();
                    System.out.println("Ingrese su contraseña: ");
                    contraseña=sc.nextLine();
                    i=0;
                    break;
            }
        }
        
    }
    public static int validarLogin(String usuario, String contraseña) throws FileNotFoundException, IOException{
        int esValido = 0; //0 significa vacío, 1 planificador y 2 estudiante
        FileReader f = new FileReader("src/resources/Usuarios.txt");
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null) {
                datos=cadena.split(",");
                if(usuario.equals(datos[0])&&contraseña.equals(datos[1])){
                    if(datos[4].equals("planificador")){
                        esValido=1;
                    }
                    else esValido=2;
                }
           }
           b.close();  
        return esValido;
    }
}

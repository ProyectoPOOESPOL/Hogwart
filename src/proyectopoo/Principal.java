/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

import java.io.IOException;

/*
 *
 * @author Jhonston
 */
public class Principal {
    public static void main(String[] args) throws IOException{
        Planificador p= new Planificador();
        p.crearProfesor();
        p.crearCurso();
    }
}

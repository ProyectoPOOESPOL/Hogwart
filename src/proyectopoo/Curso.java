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
public class Curso {
    private String materia, profesor, horario, dia;
    private int capacidad;
    
    // get y set necesarios de la clase
    
    public String getMateria(){
        return materia;
    }
    public String getProfesor(){
        return profesor;
    }
    public String getHorario(){
        return horario;
    }
    public String getDia(){
        return dia;
    }
    public int getCapacidad(){
        return capacidad;
    }
    public void setMateria(String materia){
        this.materia=materia;
    }
    public void setProfesor(String profesor){
        this.profesor=profesor;
    }
    public void setHorario(String horario){
        this.horario=horario;
    }
    public void setDua(String dia){
        this.dia=dia;
    }
    public void setCapacidad(int capacidad){
        this.capacidad=capacidad;
    }
}

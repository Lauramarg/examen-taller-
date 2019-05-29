/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.HashSet;

/**
 *
 * @author HP
 */
public abstract class ProyectoSoftware {
    private String nombre;
    HashSet<Tarea> tareas = new HashSet<Tarea>();
    private int duracionProyecto;
    private String estado;

    public ProyectoSoftware(String nombre, HashSet<Tarea> tareas, int duracionProyecto, String estado) {
        this.nombre = nombre;
        this.tareas = tareas;
        this.duracionProyecto = duracionProyecto;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public HashSet<Tarea> getTareas() {
        return tareas;
    }

    public int getDuracionProyecto() {
        return duracionProyecto;
    }

    public String getEstado() {
        return estado;
    }
    
    public HashSet<Tarea> consultar(String fase){
        HashSet<Tarea> t = new HashSet<Tarea>();
        for(Tarea t1: tareas ){
            if(t1.getFase() == fase){
                t.add(t1);
            }
        }
        return t;
    }
    
    public boolean addTarea(String nombre, String fase, int duracion){
        Tarea t = new Tarea(nombre, duracion, fase);
        return tareas.add(t);
        
    }
    
    public boolean borrar(Tarea tarea){
        return tareas.remove(tarea);
    }
    public boolean finalizarTarea(String nombre, String fase){
            for(Tarea t1: tareas ){
                if(t1.getFase().equals(fase) && t1.getNombre().equals(t1)){
                    t1.modificarEstado();
                    return true;
                }
        }
        return false;
    }
    
    public boolean arrancar(){
        if(getEstado() == "no iniciado"){
            for (Tarea tarea : tareas) {
                if(tarea.getFase().equals("analisis")){
                    return true;
                }
            }
        }
        return false;
    }
    
}

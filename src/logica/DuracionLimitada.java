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
public class DuracionLimitada extends ProyectoSoftware{
    private final int duracionMaxima;

    public DuracionLimitada(int duracionMaxima, String nombre, HashSet<Tarea> tareas, int duracionProyecto, String estado) {
        super(nombre, tareas, duracionProyecto, estado);
        this.duracionMaxima = duracionMaxima;
    }

    public int getDuracionMaxima() {
        return duracionMaxima;
    }
    
    public boolean addTarea(String nombre, String fase, int duracion){
            Tarea t = new Tarea(nombre, duracion, fase);
            if(t.getDuracion() < duracionMaxima)
                return tareas.add(t);
        return false;
    }

    @Override
    public boolean arrancar() {
        boolean sw=false;
        if(getEstado().equals("no iniciado")){
            for (Tarea tarea : tareas) {
                if(tarea.getFase().equals("analisis")){
                    if(tareas.size() > 0){
                        
                    }
                }
            }
        }
        if(sw){
            
        }
        return false;
    }
    
}

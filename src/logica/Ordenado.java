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
public class Ordenado extends DuracionLimitada{
    
    public Ordenado(int duracionMaxima, String nombre, HashSet<Tarea> tareas, int duracionProyecto, String estado) {
        super(duracionMaxima, nombre, tareas, duracionProyecto, estado);
    }
    
    public boolean verificar(String fase){
        for(Tarea t1: tareas ){
            if(!t1.isFinalizada()){
                return false;
            }
        }
        return true;
    }    
    
    public boolean finalizar(String nombre, String fase){
        boolean estado = verificar(fase);
        if(estado){
            for(Tarea t1: tareas ){
                if(t1.getFase() == fase && (t1.getNombre() == null ? nombre == null : t1.getNombre().equals(nombre))){
                    t1.modificarEstado();
                    return true;
                }
            }
        }
        return false;
    }
    
}
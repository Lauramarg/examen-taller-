/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 *
 * @author HP
 */
public class FasesLimitadas extends ProyectoSoftware{
    private int numTareasporfase;
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();

    public FasesLimitadas(int numTareasporfase, String nombre, HashSet<Tarea> tareas, int duracionProyecto, String estado) {
        super(nombre, tareas, duracionProyecto, estado);
        this.numTareasporfase = numTareasporfase;
    }
    
    
    public boolean establecerLimite(int fase, int numTareas){
        int valor;
        if(map.isEmpty()){
            map.put(fase, numTareas);
            return true;
        }else{
            if(!map.containsKey(fase)){
                map.put(fase, numTareas);
                return true;
            }else{
                valor = map.get(fase);
                if(numTareas <= valor){
                    map.put(fase, numTareas);
                    return true;
                }
            }
        }
        return false;
    }
    
    /**
     *
     * @param fase
     * @return
     */
    public int consultarLimite(String fase){
        int tareas = 0;
        if(this.map.containsKey(fase)){
            tareas = map.get(fase);
        }
        return tareas;
    }
    /*
    public int consultarTareas(String fase){
        int numT;
    }
    */
    public boolean arrancar(){
        boolean sw=false;
        if(getEstado().equals("no iniciado")){
            for (Tarea tarea : tareas) {
                if(tarea.getFase().equals("analisis")){
                    sw=true;
                    break;
                }
            }
        }
        if(sw){
            
        }
        return false;
    }
}

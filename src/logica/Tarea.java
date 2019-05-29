/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.Objects;

/**
 *
 * @author HP
 */
public class Tarea {
    private final String nombre;
    private int duracion;
    private final String fase;
    private boolean finalizada;

    public Tarea(String nombre, String fase) {
        this.nombre = nombre;
        this.duracion = 10;
        this.fase = fase;
        this.finalizada = false;
    }
    
    public Tarea(String nombre, int duracion, String fase) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.fase = fase;
        this.finalizada = false;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion){
        this.duracion = duracion;
    }
    
    public String getFase() {
        return fase;
    }

    public boolean isFinalizada() {
        return finalizada;
    }
    
    public void modificarEstado(){
        this.finalizada = true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.nombre);
        hash = 29 * hash + this.duracion;
        hash = 29 * hash + Objects.hashCode(this.fase);
        hash = 29 * hash + (this.finalizada ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tarea other = (Tarea) obj;
        if (this.duracion != other.duracion) {
            return false;
        }
        if (this.fase != other.fase) {
            return false;
        }
        if (this.finalizada != other.finalizada) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Tarea{" + "nombre=" + nombre + ", duracion=" + duracion + ", fase=" + fase + ", finalizada=" + finalizada + '}';
    }
    
    
    
}

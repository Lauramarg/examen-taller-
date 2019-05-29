/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.HashSet;

/**
 *
 * @author Estudiante
 */
public class Aplicacion {
    public static void main(String[] args) {
        
        Tarea tarea1 = new Tarea("Extraccion de los requisitos", 12, "analisis");
        Tarea tarea2 = new Tarea("Definicion de caoso de uso ", 6, "analisis");
        Tarea tarea3 = new Tarea("Diseñños de modelos de datos", 10, "diseño");
        Tarea tarea4 = new Tarea("implementacion de la UI", 20, "implementacion");
        Tarea tarea5 = new Tarea("implementacion del modelo", 20, "implementacion");
        Tarea tarea6 = new Tarea("implementacion de pruebas", 8, "implementacion");
        Tarea tarea7 = new Tarea("configuracion de la base de datos ", 4, "despliegue");
        Tarea tarea8 = new Tarea("instalacion del servidor", 6, "despliegue");  
        Tarea tarea9 = new Tarea("programacion de nuevos requisitos", 20, "mantenimiento");
        
        HashSet<Tarea> listaLimitadas = new HashSet<>();
        HashSet<Tarea> listaOrdenada = new HashSet<>();
        HashSet<Tarea> listaFases = new HashSet<>();
        
        listaLimitadas.add(tarea1);
        listaLimitadas.add(tarea2);
        listaLimitadas.add(tarea3);
        listaOrdenada.add(tarea4);
        listaOrdenada.add(tarea5);
        listaOrdenada.add(tarea6);
        listaFases.add(tarea7);
        listaFases.add(tarea8);
        listaFases.add(tarea9);
        
        DuracionLimitada duracionLimitada = new DuracionLimitada(100, "web comercial - equipo1", listaLimitadas, 99, "no iniciado");
        Ordenado ordenado = new  Ordenado(120, "web comercial - equipo 3", listaOrdenada, 119, "iniado");
        FasesLimitadas fasesLimitadas = new FasesLimitadas(100, "web comercial- equipo 2", listaLimitadas, 99, "no iniciado");
        
        System.out.println(duracionLimitada.getDuracionMaxima());
        System.out.println(fasesLimitadas.consultarLimite("iniciado"));
        System.out.println(ordenado.verificar("no iniciado"));
    }
}


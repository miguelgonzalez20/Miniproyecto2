/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jugador;

/**
 *
 * @author Miguel
 */
public class Jugador {
    
    //ATRIBUTOS
    
    public static String nombre1;
    public static String nombre2;
    public static int numeroPartidas;
    
    // METODO CONSTRUCTOR
    public Jugador(){
        nombre1 = "NONE";
        nombre2 = "CPU";
        numeroPartidas = 0;
    }
    
    public Jugador(String nombre){
        this.nombre1 = nombre;
    }
    
    public Jugador(String nombre1, String nombre2){
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
    }
    
    
    public String getNombre1() {
        return nombre1;
    }
    
    public void setNombre1(String nombre) {
        this.nombre1 = nombre;
    }
    
    public String getNombre2() {
        return nombre2;
    }
    
    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }
    
    public static int get_numeroPartidas() {
        return numeroPartidas;
    }
    
    public void set_numeroPartidas(int numeroPartidas) {
        this.numeroPartidas = numeroPartidas;
    }
    
}

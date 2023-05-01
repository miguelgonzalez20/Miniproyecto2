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
    
    public String nombre1;
    public String nombre2;
    public static int categoriaSeleccionada;
    
    // METODO CONSTRUCTOR
    public Jugador(){
        nombre1 = "NONE";
        nombre2 = "NONE";
        categoriaSeleccionada = 0;
    }
    
    public Jugador(String nombre){
        this.nombre1 = nombre;
    }
    
    //public Jugador2(String nombre){
        //this.nombre2= nombre;
    //}

    public String getNombre1() {
        return nombre1;
    }
    
    public void setNombre1(String nombre) {
        this.nombre1 = nombre;
    }
    
    public static int get_categoriaSeleccionada() {
        return categoriaSeleccionada;
    }
    
    public void set_categoriaSeleccionada(int categoriaSeleccionada) {
        this.categoriaSeleccionada = categoriaSeleccionada;
    }
    
}

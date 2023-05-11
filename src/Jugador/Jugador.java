/*
MiniProyecto 2

INTEGRANTES DEL GRUPO : 
- Miguel Angel Gonzalez Castrillon 2227203
- Ana Sofía Mezu Vargas 2225958         
CURSO FPOE GRUPO 01
PROFESOR : LUIS YOVANY ROMO PORTILLA
*/
package Jugador;

public class Jugador {
    
    //ATRIBUTOS
    
    public static String nombre1;
    public static String nombre2;
    public static int numeroPartidas;
    public static boolean machine;
    public static int WinsPlayer1;
    public static int WinsPlayer2;
    
    // METODO CONSTRUCTOR
    public Jugador(){
        nombre1 = "NONE";
        nombre2 = "CPU";
        numeroPartidas = 0;
        WinsPlayer1 = 0;
        WinsPlayer2 = 0;
        machine = false;
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

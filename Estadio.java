/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package administracion;

/**
 *
 * @author spsmh
 */
public class Estadio {
    private String nombre;
    private int numeroEspectadores;
    
    public Estadio(String name, int capacidad){
        nombre = name;
        capacidad = numeroEspectadores;
    }
    // métodos establecer para cada atributo
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecernumeroEspectadores (int n){
        numeroEspectadores = n;
    }
           
    public String obtenerNombre(){
        return nombre;
    }
    
    public int obtenernumeroEspectadores(){
        return numeroEspectadores;
    }
        
    @Override
    public String toString(){
        String cadena = String.format("Estadio\nNombre: %s\nNúmero de espectadores: %d", 
                obtenerNombre(), 
                obtenernumeroEspectadores());
        return cadena;
    }
}
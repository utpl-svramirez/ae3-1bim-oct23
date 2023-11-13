/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package administracion;

/**
 *
 * @author spsmh
 */
public class Ciudad {
    private String nombre;
    private String pais;
    
    public Ciudad(String name, String nomPais){
        nombre = name;
        pais = nomPais;
    }
    // métodos establecer para cada atributo
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerNomPais (String n){
        pais = n;
    }
           
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerNomPais(){
        return pais;
    }
        
    @Override
    public String toString(){
        String cadena = String.format("Ciudad\nNombre: %s\nPais: %s", 
                obtenerNombre(), 
                obtenerNomPais());
        return cadena;
    }
}
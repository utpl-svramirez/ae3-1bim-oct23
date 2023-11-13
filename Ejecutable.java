/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administracion;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 *///@author edit svramirez 

public class Ejecutable {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        ArrayList<Estadio> estadios = new ArrayList<>();
        String nombre;
        int numeroEspectadores;
        boolean bandera = true;
        String salida;
        while (bandera) {
            System.out.println("Ingrese nombre del estadio");
            nombre = entrada.nextLine();
            System.out.println("Ingrese el número de espectadores");
            numeroEspectadores = entrada.nextInt();
            Estadio estadio = new Estadio(nombre, numeroEspectadores);
            estadios.add(estadio);
            System.out.println("Desea salir del ciclo?, escriba (y) ");
            salida = entrada.nextLine();
            if (salida.equals("y")) {
                bandera = false;
            }
        }
        
        System.out.println("Listado de estadios");
        for (int i = 0; i < estadios.size(); i++) {
            System.out.printf("%s\n", estadios.get(i));
        }
        
        
    }
}

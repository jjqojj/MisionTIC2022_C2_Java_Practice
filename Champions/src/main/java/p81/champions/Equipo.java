/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p81.champions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/** alt + shift + F ** organizar todo
 *
 * @author jjqoj
 */
public class Equipo {

    public static void main(String[] args) {
        Map<Integer, Jugador> datosJugador = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int opcionMenu;

        int numero;
        String nombre;
        String equipo;
        String posicion;
        int contador = 0;

        System.out.println("*********************\nRegistro de Jugadores\n "
                + "********************* \n");

        do {
            System.out.println("Menú de opciones para el registro del jugador:"
                    + "\n1. \t Agregar jugador"
                    + "\n2. \t Imprimir datos de los jugadores"
                    + "\n3. \t Salir\n*********************\n"
                    + "Opción seleccionada:");
            opcionMenu = sc.nextInt();

            if (opcionMenu == 1) {
                contador++;

                System.out.println("*********************\n"
                        + "Ingrese el dorsal del jugador: ");
                //sc.nextInt();
                numero = sc.nextInt();

                System.out.println("*********************\n"
                        + "Ingrese el nombre del jugador: ");
                sc.nextLine();
                nombre = sc.nextLine();

                System.out.println("*********************\n"
                        + "Ingrese el equipo actual del jugador: ");
                //sc.nextLine();
                equipo = sc.nextLine();

                System.out.println("*********************\n"
                        + "Ingrese la posición del jugador: ");
                // sc.nextLine();
                posicion = sc.nextLine();

                // Instanciando Jugador
                Jugador jugadorObjeto = new Jugador(numero, nombre, equipo, posicion);

                // Ingresando valors a Map
                datosJugador.put(contador, jugadorObjeto);
                
            } else if (opcionMenu == 2) {
                System.out.println("*********************");
                for(Entry j:datosJugador.entrySet()){
                  System.out.println("Jugador:\n"+j.getValue());  
                }
                System.out.println("*********************\n");
            } else if (opcionMenu == 3) {
                break;
            }

        } while (opcionMenu != 3);

    }

}

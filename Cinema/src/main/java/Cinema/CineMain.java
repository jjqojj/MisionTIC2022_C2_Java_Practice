/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cinema;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jjqoj
 */
public class CineMain {

    public static void main(String[] args) {
        
        List<Pelicula> catalogoPeliculas = new ArrayList();
        
        
        Scanner sc = new Scanner(System.in);
        int opcion;
        int opcionDirectores;
        int opcionActores;
        
        
         System.out.println("*** Menú de opciones ****");
         System.out.println("1 \t Ingresar informaciones de la Película");
         System.out.println("2 \t Imprimir catálogo");
         System.out.println("3 \t salir");
         System.out.println("***********************");
        
        
        OUTER:
        do {
            System.out.println("Selección menú principal: ");
            opcion=sc.nextInt();
            switch (opcion) {
                case 1:
                    Pelicula pelicObjeto = new Pelicula();
                    System.out.println("Nombre de la película:\n");
                    sc.nextLine();  /// Arreglo para que tome el Scanner
                    String titulo=sc.nextLine();
                    pelicObjeto.setTitulo(titulo);
                    do{
                        System.out.println("*** Información Directores ****");
                        System.out.println("*** Menú de opciones ****");
                        System.out.println("1 \t Ingresar Director");
                        System.out.println("2 \t salir");
                        System.out.println("***********************");
                        System.out.println("Selección menú directores: ");
                        opcionDirectores=sc.nextInt();
                        if(opcionDirectores==1){
                            System.out.println("Nombre director:\n");
                            sc.nextLine();  /// Arreglo para que tome el Scanner
                            String director=sc.nextLine();
                            pelicObjeto.addDirector(director);
                        }
                        else if(opcionDirectores==2){
                            break;
                        }
                    }while(opcionDirectores!=2);
                    do{
                        System.out.println("*** Información Actores****");
                        System.out.println("*** Menú de opciones ****");
                        System.out.println("1 \t Ingresar Actor");
                        System.out.println("2 \t salir");
                        System.out.println("***********************");
                        System.out.println("Selección menú actores: ");
                        opcionActores=sc.nextInt();
                        if(opcionActores==1){
                            System.out.println("Nombre actor:\n");
                            sc.nextLine();  /// Arreglo para que tome el Scanner
                            String actor=sc.nextLine();
                            pelicObjeto.addActor(actor);
                        }
                        else if(opcionActores==2){
                            break;
                        }
                    }while(opcionActores!=2);
                    catalogoPeliculas.add(pelicObjeto);
                    break;
                case 2:
                    System.out.println("*** Catálogo dísponible ***");
                    for(Pelicula p: catalogoPeliculas){
                        System.out.println("********************\n");
                        System.out.println("\nPelícula: \n"+p.getTitulo()+"\n");
                        System.out.println("\nDirector(es):\n"+p.getDirectores()+"\n");
                        System.out.println("\nActores(es):\n"+p.getActores()+"\n");
                        System.out.println("********************");
                    }       break;
                case 3:
                    break OUTER;
                default:
                    break;
            }
        } while (opcion!=3);
        
        
        
    }
 
    
    
}

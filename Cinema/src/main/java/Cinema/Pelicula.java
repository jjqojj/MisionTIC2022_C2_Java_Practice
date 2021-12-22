
package Cinema;

import java.util.List;
import java.util.ArrayList;


public class Pelicula {
    
    
    private String titulo=null;
    private List<String> actores=new ArrayList();
    private List<String> directores=new ArrayList();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<String> getActores() {
        return actores;
    }

    public List<String> getDirectores() {
        return directores;
    }
   
    
    
    
    public void addDirector(String nombreDirector){
        this.directores.add(nombreDirector);
    }
    
    
      public void addActor(String nombreActor){
        this.actores.add(nombreActor);
    }
         
    
}

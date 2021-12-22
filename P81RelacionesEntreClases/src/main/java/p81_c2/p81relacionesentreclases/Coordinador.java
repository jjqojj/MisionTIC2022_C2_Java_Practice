

package p81_c2.p81relacionesentreclases;




public class Coordinador extends Empleado{
    
   private int idCargo;
   private String descripCargo;
  

    public Coordinador(int idCargo, String descripCargo, int idEmpleado, String direccion, int telefono, String cargo, double sueldo, String nombre, int edad, String genero) {
        super(idEmpleado, direccion, telefono, cargo, sueldo, nombre, edad, genero);
        this.idCargo = idCargo;
        this.descripCargo = descripCargo;
    }

    public int getIdCargo() {
        return idCargo;
    }

    public String getDescripCargo() {
        return descripCargo;
    }

    public void setDescripCargo(String descripCargo) {
        this.descripCargo = descripCargo;
    }
   
   @Override
   public String experiencia(){
return " ";}
    
    
    
    
    
   
   
   
    
}

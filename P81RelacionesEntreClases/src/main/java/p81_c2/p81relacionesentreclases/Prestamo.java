
package p81_c2.p81relacionesentreclases;


public class Prestamo {
    private String entidadFinanciera;
    private int duracion;
    private double monto;
    private int numeroCuotasPagas;
    private double vrCuotas;
    private double saldo;
    private double interesPrestamo;

    public Prestamo(String entidadFinanciera, int duracion, double monto, int numeroCuotasPagas, double vrCuotas, double saldo, double interesPrestamo) {
        this.entidadFinanciera = entidadFinanciera;
        this.duracion = duracion;
        this.monto = monto;
        this.numeroCuotasPagas = numeroCuotasPagas;
        this.vrCuotas = vrCuotas;
        this.saldo = saldo;
        this.interesPrestamo = interesPrestamo;
    }
    
    
    public void abonarCuotas(){
        
    }

    public String getEntidadFinanciera() {
        return entidadFinanciera;
    }

    public void setEntidadFinanciera(String entidadFinanciera) {
        this.entidadFinanciera = entidadFinanciera;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getNumeroCuotasPagas() {
        return numeroCuotasPagas;
    }

    public void setNumeroCuotasPagas(int numeroCuotasPagas) {
        this.numeroCuotasPagas = numeroCuotasPagas;
    }

    public double getVrCuotas() {
        return vrCuotas;
    }

    public void setVrCuotas(double vrCuotas) {
        this.vrCuotas = vrCuotas;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getInteresPrestamo() {
        return interesPrestamo;
    }

    public void setInteresPrestamo(double interesPrestamo) {
        this.interesPrestamo = interesPrestamo;
    }
    
    

   
    
    
    
    
  
    
}

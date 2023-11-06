package Banco;

public abstract class Cuenta {
    private String numeroCuenta;
    private double saldo;
    private TipoCuenta tipoCuenta;
    private String dniTitular;
    
    public Cuenta(String numeroCuenta, double saldo, TipoCuenta tipoCuenta, String dniTitular) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
        this.dniTitular = dniTitular;
    }
    
    // getters y setters para cada atributo
    
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public TipoCuenta getTipoCuenta() {
        return tipoCuenta;
    }
    
    public void setTipoCuenta(TipoCuenta tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }
    
    public String getDniTitular() {
        return dniTitular;
    }
    
    public void setDniTitular(String dniTitular) {
        this.dniTitular = dniTitular;
    }
    
    // métodos abstractos
    
    public abstract void ingresarDinero(double cantidad);
    
    public abstract void sacarDinero(double cantidad);
    
    public abstract double consultarSaldo();
    
    public abstract void revisionMensual(double comisionMensual);
}

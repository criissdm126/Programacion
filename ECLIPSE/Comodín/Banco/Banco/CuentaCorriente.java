package Banco;

public class CuentaCorriente extends Cuenta {
    public CuentaCorriente(String numeroCuenta, double saldo, String dniTitular) {
        super(numeroCuenta, saldo, TipoCuenta.CC, dniTitular);
    }
    
    @Override
    public void sacarDinero(double cantidad) {
        if (cantidad <= getSaldo()) {
            double nuevoSaldo = getSaldo() - cantidad;
            setSaldo(nuevoSaldo);
        } else {
        	System.out.println("No hay suficiente saldo en la cuenta para realizar la operación.");
        }
        }
        }

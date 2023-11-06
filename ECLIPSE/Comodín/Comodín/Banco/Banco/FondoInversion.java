package Banco;

public class FondoInversion extends Cuenta {
    public FondoInversion(int numero, double saldo) {
        super(numero, saldo, 0.34, 0.6);
    }
    
    public void sacar(double cantidad) {
        if (saldo + 500 >= cantidad) {
            saldo -= cantidad;
            System.out.println("Retirada realizada. Saldo actual: " + saldo);
        } else {
            System.out.println("No se puede retirar más dinero del que hay en la cuenta o se superaría el límite de números rojos.");
        }
    }
}
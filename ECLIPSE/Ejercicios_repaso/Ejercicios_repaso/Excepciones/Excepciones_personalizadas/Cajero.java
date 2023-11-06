package Excepciones_personalizadas;

public class Cajero {
    private int saldo;

    public void retirar(int cantidad) throws NoTieneSaldo {
        if (cantidad > saldo) {
            throw new NoTieneSaldo(saldo);
        }
        saldo -= cantidad;
    }

    public int getSaldo() {
        return saldo;
    }
}
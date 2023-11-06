package Excepciones_personalizadas;

public class NoTieneSaldo extends Exception {
    private int saldoDisponible;

    public NoTieneSaldo(int saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    public int getSaldoDisponible() {
        return saldoDisponible;
    }
}

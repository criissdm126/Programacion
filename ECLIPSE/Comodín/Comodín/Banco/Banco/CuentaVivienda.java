package Banco;

class CuentaVivienda extends Cuenta {
	// Constructor
	public CuentaVivienda(int numeroCuenta, double saldo, String dniTitular) {
	    super(numeroCuenta, saldo, "CV", dniTitular);
	}

	// Sobrescritura del método sacarDinero para no permitir sacar dinero
	@Override
	public void sacarDinero(double cantidad) {
	    System.out.println("No se puede sacar dinero de una cuenta vivienda.");
	}

	// Sobrescritura del método revisionMensual para no cobrar comisión
	public void revisionMensual() {
	    double interes_cuenta = getSaldo() * 0.002;
	    double nuevoSaldo = getSaldo() + interes_cuenta;
	    setSaldo(nuevoSaldo);
	}
}

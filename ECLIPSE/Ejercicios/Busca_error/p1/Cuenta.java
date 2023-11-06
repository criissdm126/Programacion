package p1;

//p1 va con p2, buscar el error
public class Cuenta {
	

	/*protected*/ public int numero_cuenta;
	public double saldo;
	
	public Cuenta (int cuenta, double inicial) {
		numero_cuenta = cuenta;
		saldo = inicial;
	}
	
	public void depositar (double cantidad) {
		saldo = saldo + cantidad;
	}
	
	public double saldo() {
		return saldo;
	}

}
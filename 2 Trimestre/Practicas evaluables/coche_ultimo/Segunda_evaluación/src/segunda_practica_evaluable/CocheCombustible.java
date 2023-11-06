package segunda_practica_evaluable;

public class CocheCombustible extends Coche {

	private Deposito deposito;
	

    public CocheCombustible(String marca, String modelo, double precioBase) {
		super(marca, modelo, precioBase);
	}
    
    

	public CocheCombustible(String marca, String modelo, double precioBase, Deposito deposito) {
		super(marca, modelo, precioBase);
		this.deposito = deposito;
	}

    public Deposito getDeposito() {
        return deposito;
    }

    public void setDeposito(Deposito deposito) {
        this.deposito = deposito;
    }
}

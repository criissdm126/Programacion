package segunda_practica_evaluable;

//import segunda_practica_evaluable.Coche.Accesorio;

public class CocheCombustible extends Coche {

	private Deposito deposito;
	

    public CocheCombustible(String marca, String modelo, Accesorio[] accesorios, Deposito deposito) {
		super(marca, modelo, accesorios);
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setAccesorios(accesorios);
		this.deposito = deposito;

	}

    public Deposito getDeposito() {
        return deposito;
    }

    public void setDeposito(Deposito deposito) {
        this.deposito = deposito;
    }

    
}
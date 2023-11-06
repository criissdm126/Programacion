package Concesionario;


public class CocheCombustible extends Coche {
	
	// ATRIBUTOS
	private Deposito deposito;
	
	// CONSTRUCTOR
	public CocheCombustible(String marca, String modelo, Accesorio[] accesorios, Deposito deposito) {
		super(marca, modelo, accesorios);
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setAccesorios(accesorios);
		this.deposito = deposito;

	}
	
	
	//GETTER Y SETTER
	public Deposito getDeposito() {
		return deposito;
		}
	
	public void setDeposito(Deposito deposito) {
		this.deposito = deposito;
		}
	}

//FALTA ETIQUETA
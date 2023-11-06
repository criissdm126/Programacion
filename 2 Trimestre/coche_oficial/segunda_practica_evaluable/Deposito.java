package segunda_practica_evaluable;


public class Deposito {
	
	private boolean diesel;
	private boolean gasolina;
	private String etiqueta;
	
	public boolean getDiesel() {
		return diesel;
	}

	public boolean getGasolina() {
		return gasolina;
	}
	
	public String getEtiqueta() {
		return etiqueta;
	}
	
	Deposito(String deposito) {
	
		if(deposito.compareToIgnoreCase("gasolina") == 0)	{
			this.gasolina = true;
			this.diesel = false;
			this.etiqueta = "B";
		}
		else {
			this.diesel = true;
			this.gasolina = false;
			this.etiqueta = "C";
		}
	}

	public void consumirCombustible(String tipoCombustible) {
		// TODO Auto-generated method stub
		
	}
}



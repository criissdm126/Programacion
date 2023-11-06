package Clase;
public class Ordenador {
	
	private String memoria;
	private int consumo;
	private /*static*/ int consumoTotal;
	private static int cuentaOrdenadores;
	
	
	
	public Ordenador (){
		this.memoria = "ramo";
		this.consumo = 0;
		cuentaOrdenadores ++;
	}
	
	public Ordenador (String mem, int consum, int consumTo) {
		this.consumo = consum;
		this.memoria = mem;
		consumoTotal += consumo;
	}
	
	



	//get memoria
	public void getMemoria (String memoria) {
		this.memoria = memoria;
	}
	//set memoria
	public String setMemoria() {
		return memoria;
	}
	
	//get consumo
	public void getConsumo (int consum) {
		this.consumo = consum;
	}
	// set consumo
	public int setConsumo() {
		return consumo;
	}
	public int getconsumoTotal() {
		return consumoTotal;
	}
	public void getConsumoTotal(int consumototal) {
		this.consumoTotal = consumototal;
	}
	public int setConsumoTotal() {
		return consumoTotal;
	}
	
	//método tostring
	public String toString() {
		String cadena = "datos del ordenador \n";
		cadena += "Memoria: " + this.setMemoria() + " \n ";
		cadena += " Consumo: " + this.setConsumo() + " \n ";
		cadena += " \n ";
		cadena += " - ".repeat(10);
		return cadena;
	}
	
	//mostrar total consumido
	
	//equals
	@Override
	public boolean equals (Object obj) {
		Ordenador otro = (Ordenador) obj;
		if (this.memoria.equals(otro.memoria)  || this.consumo == otro.consumo) {
			System.out.println("Los ordenadores son iguales");
			return true;
		}
		
		else {
			System.out.println("Los ordenadores son distintos");
			return false;
		}
		
	}
	
	
	
	//Método sube consumo
	public void subeConsumo(int porcentaje) {
		this.consumo = (porcentaje*this.consumo)/100;
	}
	
	
	
	

}



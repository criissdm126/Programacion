package Fecha;
public class Fecha {
	//variables
	private int dia;
	private int mes;
	private int año;
	
	//constructor
	public Fecha(int dia, int mes, int año) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}
	
	public Fecha() {
		this.dia = 1;
		this.mes = 1;
		this.año = 1900;
	}

	//getter y setter
	public int getDia() {
		return dia;
	}


	public void setDia(int dia) {
		this.dia = dia;
	}


	public int getMes() {
		return mes;
	}


	public void setMes(int mes) {
		this.mes = mes;
	}


	public int getAño() {
		return año;
	}


	public void setAño(int año) {
		this.año = año;
	}
	
	
	//bisiesto
	private boolean esBisiesto() {
		if ((año % 4 == 0 && año% 100 != 0) || año % 400 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//fehca correcta
	public boolean fechaCorrecta() {
		int[] dias_mes = {31,28,31,30,31,30,31,31,30,31,30,31};
		if (esBisiesto()) {
			dias_mes[1] = 29;
		}
		if (mes < 1 || mes > 12) {
			return false;
		}
		if (dia < 1 || dia > dias_mes[mes - 1]) {
			return false;
		}
		return true;
	}
	
	//dia siguiente
	public void diaSiguiente() {
		int[] diasMes = {31,28,31,30,31,30,31,31,30,31,30,31};
		if (esBisiesto()) {
			diasMes[1] = 29;
		}
		if (fechaCorrecta()) {
			dia++;
			if (dia > diasMes[mes - 1]) {
				dia = 1;
				mes++;
				if (mes > 12) {
					mes = 1;
					año++;
				}
			}
		}
		else {
			System.out.println("Fecha incorrecta");
		}
	}
	
	
	//tostring
	public String toString() {
		return String.format("%02d-%02d-%02d", dia, mes, año % 100);
	}
}
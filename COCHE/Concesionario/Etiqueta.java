package Concesionario;

import java.util.Objects;

public class Etiqueta {
	
	String tipo1 = "B";//GASOLINA
	String tipo2 = "C";//DIESEL
	
	//GETTER Y SETTER
	//ETIQUETA B = TIPO 1
	public String getTipo1() {
		return tipo1;
	}
	
	public void setTipo1(String tipo1) {
		this.tipo1 = tipo1;
	}
	
	
	// ETIQUETA C = TIPO 2
	public String getTipo2() {
		return tipo2;
	}
	
	public void setTipo2(String tipo2) {
		this.tipo2 = tipo2;
	}


	//MÉTODO EQUALS
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Etiqueta otro = (Etiqueta) obj;
		return Objects.equals(tipo1, otro.tipo1) && Objects.equals(tipo2, otro.tipo2);
	}
	
	
	//MÉTODO TOSTRING
	@Override
	public String toString() {
		return "Etiqueta [tipo1 = " + tipo1 + ", tipo2 = " + tipo2 + "]";
	}
}

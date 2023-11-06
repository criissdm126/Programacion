package segunda_practica_evaluable;

import java.util.*;

public class Etiquetas {
	
	String tipo1 = "B";
	String tipo2 = "C";
	
	//GETTER Y SETTER
	//ETIQUETA B = TIPO 1
	public String getTipo1() {
		return tipo1;
	}
	
	public void setTipo1(String tipo1) {
		this.tipo1 = tipo1;
	}
	
	// ETIQUETA A = TIPO 2
	public String getTipo2() {
		return tipo2;
	}
	
	public void setTipo2(String tipo2) {
		this.tipo2 = tipo2;
	}
	
	//MÉTODO TOSTRING
	@Override
	public String toString() {
		return "Etiqueta [tipo1=" + tipo1 + ", tipo2=" + tipo2 + "]";
	}
	
	//MÉTODO hashcode
	@Override
	public int hashCode() {
		return Objects.hash(tipo1, tipo2);
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
		Etiquetas other = (Etiquetas) obj;
		return Objects.equals(tipo1, other.tipo1) && Objects.equals(tipo2, other.tipo2);
	}

	
}

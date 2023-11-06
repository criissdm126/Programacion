package segunda_practica_evaluable;

import java.util.*;

public class CocheElectrico extends coche {
	

	private int bateria;
    private String consumo;

    public CocheElectrico(String marca, String modelo, double precioBase) {
        super(marca, modelo, precioBase);
    }

    public CocheElectrico(String marca, String modelo, double precioBase, int bateria, String consumo) {
        super(marca, modelo, precioBase);
        this.bateria = bateria;
        this.consumo = consumo;
    }



	// GETTERS Y SETTERS
    
    public int getBateria() {
        return bateria;
    }
    
    public void setBateria(int bateria) {
        this.bateria = bateria;
    }
    
    public String getConsumo() {
        return consumo;
    }
    
    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }
    
    
    
  //MÉTODO TOSTRING
	@Override
	public String toString() {
		return "CocheElectrico [bateria = " + bateria + ", consumo = " + consumo + "]";
	}
	
	//METODO HASCODE

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(bateria, consumo);
		return result;
	}
	
	//METODO EQUALS
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		CocheElectrico other = (CocheElectrico) obj;
		return bateria == other.bateria && Objects.equals(consumo, other.consumo);
	}
	
	//COMPARETO
	public int compareTo(CocheElectrico otroCoche) {
		if (this.bateria < otroCoche.bateria) {
			return -1;
		}
		else if (this.bateria > otroCoche.bateria) {
			return 1;
		}
		else {
			return 0;
		}
	}
}
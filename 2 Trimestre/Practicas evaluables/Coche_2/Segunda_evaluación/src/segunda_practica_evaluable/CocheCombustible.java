package segunda_practica_evaluable;

import java.util.*;

public class CocheCombustible extends Coche {
    
	 private double deposito = 0.0;
	 private Etiquetas etiquetas;
	    private String etiqueta = "";    
	private String dep1 = "diesel";
	private String dep2 = "gasolina";
	

	    // constructor SUPERCLASS
		public CocheCombustible(String marca, String modelo, double precioBase) {
			super(marca, modelo, precioBase);
		}
		
		//CONSTRUCTOR
		public CocheCombustible(String marca, String modelo, double precioBase, double deposito, String tipo1, String tipo2, String dep1, String dep2) {
		    super(marca, modelo, precioBase);
		    this.deposito = deposito;
		    this.etiquetas = new Etiquetas();
		    this.etiquetas.setTipo1(tipo1);
		    this.etiquetas.setTipo2(tipo2);
		    this.dep1 = dep1;
		    this.dep2 = dep2;
		}



		// getter y setter
		public double getDeposito() {
			return deposito;
		}
		public void setDeposito(double deposito) {
			this.deposito = deposito;
		}
		
		public String getEtiqueta() {
			return etiqueta;
		}
		
		public void setEtiqueta(String etiqueta) {
			this.etiqueta = etiqueta;
		}
		
		public String getDep1() {
			return dep1;
		}

		public void setDep1(String dep1) {
			this.dep1 = dep1;
		}

		public String getDep2() {
			return dep2;
		}

		public void setDep2(String dep2) {
			this.dep2 = dep2;
		}
		
		public Etiquetas getEtiquetas() {
	        return etiquetas;
	    }

	    public void setEtiquetas(Etiquetas etiquetas) {
	        this.etiquetas = etiquetas;
	    }
		//MÉTODO VERPRECIO
		public double verPrecio() {
			//double precio = super.verPrecio();
		    double precioTotal = getPrecioBase();
		    if (deposito != 0.0) {
		        precioTotal += deposito * 1.5;
		    }
		    return precioTotal;
		}

		/*@Override
		public double verPrecio() {
		    double precio = super.verPrecio();
		    if (deposito != null && deposito.equals(dep1)) {
		        precio *= 1.1; // Incrementa un 10% si es diésel
		    } else {
		        precio = precio / 1.1;
		    }
		    return precio;
		}*/

		
		
		//MÉTODO TOSTRING

		@Override
		public String toString() {
			return "CocheCombustible [deposito=" + deposito + ", etiqueta=" + etiqueta + ", dep1=" + dep1 + ", dep2="
					+ dep2 + "]";
		}
	
	
		//MÉTODO HASCODE

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = super.hashCode();
			result = prime * result + Objects.hash(dep1, dep2, deposito, etiqueta);
			return result;
		}


		//MÉTODO EQUALS
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (!super.equals(obj))
				return false;
			if (getClass() != obj.getClass())
				return false;
			CocheCombustible other = (CocheCombustible) obj;
			return Objects.equals(dep1, other.dep1) && Objects.equals(dep2, other.dep2) && Objects.equals(deposito, other.deposito) && Objects.equals(etiqueta, other.etiqueta);
		}
	
		//MÉTODO COMPARA
	
		
}
	
	
	
	
	
	



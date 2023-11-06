package Coche;

import java.util.Arrays;

public class Coche {
    
	private String marca;
    private String modelo;
    private double precioBase=20000;
    private double precioFinal;
    private static double descuento = 1500;
    private Accesorio[] accesorios;
    private CocheCombustible coche_combustible;
    private CocheElectrico coche_electrico;
    private int velocidad = 0;

    Coche(String marca, String modelo, Accesorio[] accesorios) {
        this.marca = marca;
        this.modelo = modelo;
        this.accesorios = accesorios;
    }

	public void verPrecio() {
		System.out.println(this.precioFinal);
	}
    
    public double precioNormal() {
        this.precioFinal = this.precioBase - this.descuento;
 
        for (int i = 0; i < this.accesorios.length; i++) {
            this.precioFinal += this.accesorios[i].getPrecio();
        }
        return this.precioFinal;
    }
    
	public double precioElectrico() {
        this.precioFinal = this.precioBase - (this.precioBase*0.1); 
        
 
        for (int i = 0; i < this.accesorios.length; i++) {
            this.precioFinal += this.accesorios[i].getPrecio();
        }
        return this.precioFinal;
    }
	
	public double precioCombustible() {
        this.precioFinal = this.precioBase + (this.precioBase*0.1);
        
 
        for (int i = 0; i < this.accesorios.length; i++) {
            this.precioFinal += this.accesorios[i].getPrecio();
        }
        return this.precioFinal;
    }

    public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}
	
	public double getPrecioFinal() {
		return precioFinal;
	}
	
	public CocheCombustible getCoche_combustible() {
		return coche_combustible;
	}

	public void setCoche_combustible(CocheCombustible coche_combustible) {
		this.coche_combustible = coche_combustible;
	}

	public CocheElectrico getCoche_electrico() {
		return coche_electrico;
	}

	public void setCoche_electrico(CocheElectrico coche_electrico) {
		this.coche_electrico = coche_electrico;
	}

	public static double getDescuento() {
		return descuento;
	}

	public Accesorio[] getAccesorios() {
		return accesorios;
	}

	public void setAccesorios(Accesorio[] accesorios) {
		this.accesorios = accesorios;
	}
	
	public enum Accesorio {
        TECHO(1000),
        ASIENTOS_CALEFACTABLES(500),
        NAVEGADOR(1500);

        private double precio;

       private Accesorio(double precio) {
            this.precio = precio;
        }

        public double getPrecio() {
            return precio;
        }

		public void setPrecio(double precio) {
			this.precio = precio;
		}   
    }

	public void arrancar() {
		if (this.velocidad == 0) {
			this.velocidad = 1;
			System.out.println("Coche arrancado");
		}
		else {
			System.out.println("El coche ya estaba en movimiento");
		}
	}
	
	public void detener() {
		if (this.velocidad > 0) {
			this.velocidad = 0;
			System.out.println("Coche detenido");
		}
		else {
			System.out.println("El cohe ya estaba detenido");
		}
	}
	
	public void acelerar() {
		if (this.velocidad >= 1) {
			this.velocidad++;
			System.out.println("Acelerando");
		}
		else {
			System.out.println("El coche no ha arrancado");
		}
	}
	
	public void frenar() {
		if (this.velocidad > 1) {
			this.velocidad--;
			System.out.println("Frenando");
		}
		else {
			System.out.println("El coche se habia detenido");
		}
	}
	
	public String toString() {
		
		if (this.coche_combustible != null) {
			return "Marca; " + this.marca + ", Modelo: " + this.modelo + ", Accesorios: " + Arrays.toString(accesorios) + ", Etiqueta: " + this.getCoche_combustible().getDeposito().getEtiqueta() + ", Precio: " + this.precioFinal;
		}
		else if (this.coche_electrico != null) {
			return "Marca; " + this.marca + ", Modelo: " + this.modelo + ", Accesorios: " + Arrays.toString(accesorios) + ", Potencia: " + this.getCoche_electrico().getBateria().getPotencia() + ", Consumo: " + this.getCoche_electrico().getBateria().getConsumo() + ", Precio: " + this.precioFinal;
	}
		else {
			return "Marca; " + this.marca + ", Modelo: " + this.modelo + ", Accesorios: " + Arrays.toString(accesorios)+ ", Precio: " + this.precioFinal;
		}
	}
}



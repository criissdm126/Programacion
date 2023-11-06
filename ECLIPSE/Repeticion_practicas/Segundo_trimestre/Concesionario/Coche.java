package Concesionario;

import java.util.Arrays;
import java.util.Objects;

public class Coche implements Comparable<Object> {
	

	// ATRIBUTOS
    private String marca;
    private String modelo;
    private double precioBase = 20000;
    private double precioFinal;
    private static double descuento = 100;
    private CocheCombustible cocheComb;
    private CocheElectrico cocheElect;
    private int velocidad = 0;

    

    // array 3 accesorios
    private Accesorio[] accesorios = new Accesorio[3];

    // CONSTRUCTOR
    public Coche(String marca, String modelo, Accesorio[] accesorios) {
        this.marca = marca;
        this.modelo = modelo;
        this.accesorios = accesorios;
    }

    // GETTER Y SETTER
    // DESCUENTO
    public static void setDescuento(double descuento) {
        Coche.descuento = descuento;
    }

    public static double getDescuento() {
        return descuento;
    }

    // MARCA
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public CocheCombustible getCocheComb() {
		return cocheComb;
	}

	public void setCocheComb(CocheCombustible cocheComb) {
		this.cocheComb = cocheComb;
	}

	public CocheElectrico getCocheElect() {
		return cocheElect;
	}

	public void setCocheElect(CocheElectrico cocheElect) {
		this.cocheElect = cocheElect;
	}

	public double getPrecioFinal() {
		return precioFinal;
	}

	public void setPrecioFinal(double precioFinal) {
		this.precioFinal = precioFinal;
	}

	// MODELO
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // PRECIOBASE
    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
    
  //MÉTODO VERPRECIO
    public double verPrecio() {
    	//System.out.println(this.precioFinal);
        double precioFinal = precioBase;
        for (Accesorio accesorio : accesorios) {
            if (accesorio != null) {
                precioFinal += accesorio.getPrecio();
            }
        }
        precioFinal -= precioFinal * descuento;
        return precioFinal;
    }
    
    //Precio
    public double precioNormal() {
        this.precioFinal = this.precioBase - this.descuento;
 
        for (int i = 0; i < this.accesorios.length; i++) {
            this.precioFinal += this.accesorios[i].getPrecio();
        }
        return this.precioFinal;
    }
    
    //Coche electrico
    public double precioElectrico() {
        this.precioFinal = this.precioBase - (this.precioBase*0.1); 
        
 
        for (int i = 0; i < this.accesorios.length; i++) {
            this.precioFinal += this.accesorios[i].getPrecio();
        }
        return this.precioFinal;
    }

    //coche combustible
    public double precioCombustible() {
        this.precioFinal = this.precioBase + (this.precioBase*0.1);
        
 
        for (int i = 0; i < this.accesorios.length; i++) {
            this.precioFinal += this.accesorios[i].getPrecio();
        }
        return this.precioFinal;
    }
    
    public void setAccesorios(Accesorio[] accesorios) {
		this.accesorios = accesorios;
	}


    public Accesorio[] getAccesorios() {
        return accesorios;
    }

    // ACCESORIOS
   // public class Accesorios{
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
    //}
    

    // MÉTODOS ARRANCAR, DETENERSE, ACELERAR, FRENAR
   /*  private boolean arrancado = false;
    private boolean frenado = false;
    private boolean acelerado = false;

   public void arrancar() {
        arrancado = true;
    }*/
    
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
			System.out.println("El coche ya estaba detenido");
		}
	}
    
    public void acelerar() {
		if (this.velocidad >= 1) {
			this.velocidad++;
			System.out.println("El coche esta acelerando");
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




   /* public void detenerse() {
        if (frenado) {
            arrancado = false;
        }
    }

    public void acelerar() {
        if (arrancado) {
            acelerado = true;
        }
    }

    public void frenar() {
        if (acelerado) {
            frenado = true;
        }
    }*/

    // MÉTODO COMPARETO
    public int compareTo(Coche otro) {
        if (this.marca.equals(otro.marca)) {
            return this.modelo.compareTo(otro.modelo);
        } else {
            return this.marca.compareTo(otro.marca);
        }
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
		Coche other = (Coche) obj;
		return Arrays.equals(accesorios, other.accesorios) && Objects.equals(cocheComb, other.cocheComb)
				&& Objects.equals(cocheElect, other.cocheElect) && Objects.equals(marca, other.marca)
				&& Objects.equals(modelo, other.modelo)
				&& Double.doubleToLongBits(precioBase) == Double.doubleToLongBits(other.precioBase)
				&& Double.doubleToLongBits(precioFinal) == Double.doubleToLongBits(other.precioFinal)
				&& velocidad == other.velocidad;
	}
  
    //MÉTODO TOSTRING
    
    @Override
	public String toString() {
    	
    	
    	if (this.cocheComb != null) {
			return "Marca; " + this.marca + ", Modelo: " + this.modelo + ", Accesorios: " + Arrays.toString(accesorios) + ", Etiqueta: " + this.getCocheComb().getDeposito().getEtiqueta() + ", Precio: " + this.precioFinal;
		}
		else if (this.cocheElect != null) {
			return "Marca; " + this.marca + ", Modelo: " + this.modelo + ", Accesorios: " + Arrays.toString(accesorios) + ", Potencia: " + this.getCocheElect().getBateria().getPotencia() + ", Consumo: " + this.getCocheElect().getBateria().getConsumo() + ", Precio: " + this.precioFinal;
	}
		else {
			return "Marca; " + this.marca + ", Modelo: " + this.modelo + ", Accesorios: " + Arrays.toString(accesorios)+ ", Precio: " + this.precioFinal;
		}
	}
 

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

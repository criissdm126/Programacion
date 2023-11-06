package segunda_practica_evaluable;

import java.util.*;

public class Coche implements Comparable<Object> {
	

	// ATRIBUTOS
    private String marca;
    private String modelo;
    private double precioBase;
    private static double descuento;
    

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

    // MÉTODO ACCESORIO  //CLASE ACCESORIO
  /* public void addAccesorio(Accesorio tipo) {
        for (int i = 0; i < accesorios.length; i++) {
            if (accesorios[i] == null) {
                accesorios[i] = new Accesorio(tipo);
                break;
            }
        }
    }*/
    
    public void setAccesorios(Accesorio[] accesorios) {
		this.accesorios = accesorios;
	}


    public Accesorio[] getAccesorios() {
        return accesorios;
    }

    // ACCESORIOS
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
    }

    // MÉTODOS ARRANCAR, DETENERSE, ACELERAR, FRENAR
    private boolean arrancado = false;
    private boolean frenado = false;
    private boolean acelerado = false;

    public void arrancar() {
        arrancado = true;
    }

    public void detenerse() {
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
    }

    // MÉTODO COMPARETO
    public int compareTo(Coche otro) {
        if (this.marca.equals(otro.marca)) {
            return this.modelo.compareTo(otro.modelo);
        } else {
            return this.marca.compareTo(otro.marca);
        }
    }


    // MÉTODO HASCODE
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.hashCode(accesorios);
        result = prime * result + Objects.hash(acelerado, arrancado, frenado, marca, modelo, precioBase);
        return result;
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
        Coche otro = (Coche) obj;
        return Arrays.equals(accesorios, otro.accesorios) && acelerado == otro.acelerado
                && arrancado == otro.arrancado && frenado == otro.frenado && Objects.equals(marca, otro.marca)
                && Objects.equals(modelo, otro.modelo)
                && Double.doubleToLongBits(precioBase) == Double.doubleToLongBits(otro.precioBase);
    }
    
    //MÉTODO TOSTRING
    
    @Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", precioBase=" + precioBase + ", accesorios="
				+ Arrays.toString(accesorios) + ", arrancado=" + arrancado + ", frenado=" + frenado + ", acelerado="
				+ acelerado + ", getMarca()=" + getMarca() + ", getModelo()=" + getModelo() + ", getPrecioBase()="
				+ getPrecioBase() + ", getAccesorios()=" + Arrays.toString(getAccesorios()) + ", hashCode()="
				+ hashCode() + ", verPrecio()=" + verPrecio() + ", getClass()=" + getClass() + ", toString()="
				+ super.toString() + "]";
	}

	//MÉTODO VERPRECIO
    public double verPrecio() {
        double precioFinal = precioBase;
        for (Accesorio accesorio : accesorios) {
            if (accesorio != null) {
                precioFinal += accesorio.getPrecio();
            }
        }
        precioFinal -= precioFinal * descuento;
        return precioFinal;
    }
   
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

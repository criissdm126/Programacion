package Alimento;

public class Alimento implements Saludable, Comparable<Alimento> {
	
    //ATRIBUTOS
	String tipo;
	int calorias;
	

    //CONSTRUCTOR
	public Alimento(String tipo, int calorias) {
		this.tipo = tipo;
		this.calorias = calorias;
	}
    
    //GETTER Y SETTER
    @Override
	public String getTipo() {
		return tipo;
	}
    
    @Override
	public int getCalorias() {
		return calorias;
	}
    

    //COMPARE TO
    @Override
	public int compareTo(Alimento o) {
        
        // Comparamos por el número de calorías
		if (this.calorias < o.calorias) {
			return -1;
		}
        else if (this.calorias > o.calorias) {
			return 1;
		}
        else { // Si tienen el mismo número de calorías, comparamos por el tipo
			return this.tipo.compareTo(o.tipo);
		}
	}

    //TO STRING
	@Override
	public String toString() {
		return tipo + " (" + calorias + " cal)";
	}
	
}


/*1) Clase Alimento
 * Desarrollar la clase Alimento que implemente el interfaz Saludable.
 * El interfaz Saludable tiene los siguientes métodos
 *        o getTipo:devuelve String
 *        o getCalorias:devuelve int
 * Crear varios alimentos y añadirlos a un ArrayList.
 * Ordena el contenido del array según el siguiente criterio combinado: por tipo y numero de calorías, de tal forma que primero ordene según número de calorías y si los dos alimentos tienen el mismo número de calorías que los ordene según el tipo.
 * En la clase principal que tenga el método main implementar el método listado que pinta por pantalla el listado de todos los tipos de alimentos y la media de calorías que hay de cada tipo.
 */

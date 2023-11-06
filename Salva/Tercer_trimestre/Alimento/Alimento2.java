package Alimento;

import java.util.Comparator;

// comparator
public class Alimento2 implements Saludable {

    // ATRIBUTOS
    String tipo;
    int calorias;

    // CONSTRUCTOR
    public Alimento2(String tipo, int calorias) {
        this.tipo = tipo;
        this.calorias = calorias;
    }

    // GETTER Y SETTER
    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public int getCalorias() {
        return calorias;
    }

    // COMPARATOR
    public static Comparator<Alimento2> comparadorCalorias = new Comparator<Alimento2>() {

        @Override
        public int compare(Alimento2 alimento1, Alimento2 alimento2) {

            // Comparamos por el número de calorías
            if (alimento1.calorias < alimento2.calorias) {
                return -1;
            } else if (alimento1.calorias > alimento2.calorias) {
                return 1;
            } else { // Si tienen el mismo número de calorías, comparamos por el tipo
                return alimento1.tipo.compareTo(alimento2.tipo);
            }
        }
    };

    // TO STRING
    @Override
    public String toString() {
        return tipo + " (" + calorias + " cal)";
    }
}

//COMPARE TO
/*@Override
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

// COMPARE TO
@Override
public int compareTo(Alimento o) {

    // Comparamos por el número de calorías
    return Integer.compare(this.calorias, o.calorias);
}*/
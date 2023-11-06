package Ejercicio4;

public class Libro extends Articulo {
	
	long ISBN;
	int numPag;
	Autor autor; // Cambio en el tipo de dato del atributo autor
	
	// CONSTRUCTOR
	public Libro(String referencia, String nombre, double precio, long iSBN, int numPag, Autor autor) {
		super(referencia, nombre, precio);
		ISBN = iSBN;
		this.numPag = numPag;
		this.autor = autor;
	}
	
	// GETTER Y SETTER
	public long getISBN() {
		return ISBN;
	}

	public void setISBN(long iSBN) {
		ISBN = iSBN;
	}

	public int getNumPag() {
		return numPag;
	}

	public void setNumPag(int numPag) {
		this.numPag = numPag;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
}




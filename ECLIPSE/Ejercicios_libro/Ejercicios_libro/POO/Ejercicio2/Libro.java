package Ejercicio2;

public class Libro extends Articulo {
	
	long ISBN;
	int numPag;
	String autor;
	
	// CONSTRUCTOR
	public Libro(String referencia, String nombre, double precio, long iSBN, int numPag, String autor) {
		super(referencia, nombre, precio); // PASA COMO PARÁMETRO LOS ATB DE LA CLASE PADRE
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

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

}

// número ISBN, contiene cierto número de páginas y lo ha escrito un autor;
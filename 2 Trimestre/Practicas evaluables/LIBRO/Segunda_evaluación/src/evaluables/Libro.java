package evaluables;

public class Libro {
    
    private String codigo;
    private String titulo;
    private String autor;
    private boolean disponible;
    private Persona personaPrestamo;
    private int numPrestamos;
    private boolean prestado;
    
    public Libro(int codigo2, String titulo2, String autor2) {
        codigo = "";
        titulo = "";
        autor = "";
        disponible = true;
        personaPrestamo = null;
        numPrestamos = 0;
        prestado = false;
    }
    
    public Libro(String codigo, String titulo, String autor) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
        this.personaPrestamo = null;
        this.numPrestamos = 0;
        this.prestado = false;
    }
    
    public String getCodigo() {
        return codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public boolean getDisponible() {
        return disponible;
    }
    
    public boolean setDisponible(boolean disponible) {
        return this.disponible = disponible;
    }
    
    public Persona getPersonaPrestamo() {
        return personaPrestamo;
    }

    public void setPersonaPrestamo(Persona personaPrestamo) {
        this.personaPrestamo = personaPrestamo;
    }

    public int getNumPrestamos() {
        return numPrestamos;
    }

    public void setNumPrestamos(int numPrestamos) {
        this.numPrestamos = numPrestamos;
    }
    public boolean getPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
    
	public boolean prestamo(Persona persona) {
	    if (disponible) {
	        if (persona.getCodigo().equals("p1") && persona.getNumPrestamos() < 3) {
	            disponible = false;
	            personaPrestamo = persona;
	            numPrestamos = persona.getNumPrestamos() + 1;
	            persona.setNumPrestamos(numPrestamos);
	            return true;
	        } else if ((persona.getCodigo().equals("p2") || persona.getCodigo().equals("p3")) && persona.getNumPrestamos() < 2) {
	            disponible = false;
	            personaPrestamo = persona;
	            numPrestamos = persona.getNumPrestamos() + 1;
	            persona.setNumPrestamos(numPrestamos);
	            return true;
	        } else {
	            return false;
	        }
	    } else {
	        return false;
	    }
	}

    
    public boolean devolucion() {
        if (!disponible) {
            disponible = true;
            personaPrestamo.setNumPrestamos(personaPrestamo.getNumPrestamos() - 1);
            personaPrestamo = null;
            numPrestamos = 0;
            return true;
        }
        else {
            return false;
        }
    }

    public boolean compara(Libro libro) {
        return titulo.equals(libro.getTitulo()) && autor.equals(libro.getAutor());
    }

    public String toString() {
        if(this.disponible == false) {
            return "Codigo: " + this.codigo + ", Titulo: " + this.titulo + ", Autor: " + this.autor + ", Disponible: " + this.disponible + ", Persona: " + this.personaPrestamo.nombre; 
        }
        else return "Codigo: " + this.codigo + ", Titulo: " + this.titulo + ", Autor: " + this.autor + ", Disponible: " + this.disponible; 
    }
}
package Libro;

public class Libro {
    private String codigo;
    private String titulo;
    private String autor;
    private boolean disponible;
    private Persona prestamo;

    // Constructor por defecto
    public Libro() {
    }

    // Constructor con parámetros
    public Libro(String codigo, String titulo, String autor, boolean disponible, Persona prestamo) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
        this.prestamo = prestamo;
    }

    // Métodos setters y getters
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

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Persona getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Persona prestamo) {
        this.prestamo = prestamo;
    }

    // Método préstamo
    public boolean prestamo(Persona persona) {
        if (disponible && (persona.getNumPrestamos() < 2)) {
            disponible = false;
            prestamo = persona;
            persona.getNumPrestamos();
            return true;
        } 
        else {
            return false;
        }
    }

    // Método devolución
    public boolean devolucion() {
        if (!disponible) {
            disponible = true;
            prestamo.getNumPrestamos();
            prestamo = null;
            return true;
        } else {
            return false;
        }
    }

    // Método toString
    @Override
    public String toString() {
        return "Libro{" +
                "codigo='" + codigo + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", disponible=" + disponible +
                ", prestamo=" + prestamo +
                '}';
    }

    // Método compara
    public boolean compara(Libro otroLibro) {
        return titulo.equals(otroLibro.getTitulo()) && autor.equals(otroLibro.getAutor());
    }
}

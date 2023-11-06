package repetecion;

public abstract class Bebida {

    private String identificador;
    private double litros;
    private double precioBase;
    private double precioFinal;
    private String marca;

    public Bebida(String identificador, double litros, double precioBase, String marca) {
        this.identificador = identificador;
        this.litros = litros;
        this.precioBase = precioBase;
        this.marca = marca;
        this.precioFinal = calcularPrecioFinal();
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }
    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
        this.precioFinal = calcularPrecioFinal();
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public abstract double calcularPrecioFinal();
    }




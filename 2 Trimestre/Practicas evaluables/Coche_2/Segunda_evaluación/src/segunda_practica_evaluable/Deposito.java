package segunda_practica_evaluable;

public class Deposito {
	private boolean diesel;
    private boolean gasolina;
    private String etiqueta;

    // CONSTRUCTOR
    public Deposito(String etiqueta) {
        if (etiqueta.equalsIgnoreCase("B")) {
            this.gasolina = true;
            this.diesel = false;
            this.etiqueta = "B";
        } else {
            this.diesel = true;
            this.gasolina = false;
            this.etiqueta = "C";
        }
    }

    // GETTER Y SETTER

    public boolean isDiesel() {
        return diesel;
    }

    public void setDiesel(boolean diesel) {
        this.diesel = diesel;
    }

    public boolean isGasolina() {
        return gasolina;
    }

    public void setGasolina(boolean gasolina) {
        this.gasolina = gasolina;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

}



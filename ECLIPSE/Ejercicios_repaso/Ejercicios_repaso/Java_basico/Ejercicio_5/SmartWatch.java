package Ejercicio_5;

public class SmartWatch extends SmartDevice {
	
    private String materialCaja;
    private String modelo1;


    public SmartWatch() {
    }

    public SmartWatch(String marca, String modelo1, String sistemaOperativo, String materialCaja) {
        super(marca, modelo1, sistemaOperativo);
        this.materialCaja = materialCaja;
    }

    // Getter y setter
    
    public String getMaterialCaja() {
        return materialCaja;
    }

    public void setMaterialCaja(String materialCaja) {
        this.materialCaja = materialCaja;
    }
	public String getModelo() {
		return modelo1;
	}

	public void setModelo(String modelo) {
		this.modelo1 = modelo;
	}
}

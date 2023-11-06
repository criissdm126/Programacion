package Mapas;

public class Producto {
	
	String tipo;
	int stock;
	
	public Producto(String tipo, int stock) {
		
		this.tipo = tipo;
		this.stock = stock;
	}
	

	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public void aumentarStock(int cantidad) {
		
		stock = stock + cantidad;
	}
	
	public void reducirStock(int cantidad) {
		
		stock = stock - cantidad;
	}
	

}

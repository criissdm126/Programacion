package CUBO;

public class Cubo {

int capacidad, contenido;
	
	Cubo(int capa){
		capacidad = capa;
	}
	

	void vaciar () {
		contenido = 0;
	}
	
	void vaciar (int c) {
		if (c>contenido || contenido - c<0) {
			contenido =0;
		}
		else {
			contenido -= c;
		}
	}
	void llenar () {
		contenido = capacidad;
	}
	
	int getCapacidad () {
		return this.capacidad;
	}
	
	int getContenido() {
		return this.contenido;
	}
	
	
	void setContenido(int c) {
		this.contenido = c;
	}
	
	void volcar (Cubo destino, int cantidad) {
		this.contenido = this.contenido-cantidad;
		destino.contenido = destino.contenido + cantidad;
		
	}
	
	int pinta(int x) {
		
		return x;
	}
}



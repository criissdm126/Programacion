package Clases_internas;

public class Huevo {

	private Yema yema;
	private Clara clara;
	public class Yema {
	private int tamanio;
	public Yema (int tama) {
	tamanio=tama;
	}
	public int getTamanio() {
	return tamanio;
	}
	}
	public class Clara {
	private int volumen;
	public Clara(int volumen) {
	this.volumen=volumen;
	}
	public int getVolumen() {
	return volumen;
	}
	}
	public Huevo(Yema y, Clara c) {
	this.yema = y;
	this.clara=c;
	}
	public Huevo(int tamanioYema, int volumenClara) {
	 this.yema = new Yema(tamanioYema);
	 this.clara = new Clara(volumenClara);
	 }
	public Yema getYema() {
	return yema;
	}
	public Clara getClara() {
	return clara;
	}
	}

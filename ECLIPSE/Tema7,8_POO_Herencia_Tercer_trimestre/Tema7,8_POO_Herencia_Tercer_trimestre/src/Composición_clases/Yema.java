package Composición_clases;


public class Yema {

private String color;
	
	//constructor
	public Yema(String color) {
		this.color=color;
	}
	
	public Yema() {
		this.color="amarillo";
	}
	
	//getter
	public String getcolor() {
		return color;
	}
	
	//setter
	public void setcolor(String color) {
		this.color=color;
	}
	
	//equals
	@Override
	public boolean equals(Object x) {
		
		Yema otro = (Yema) x;
		
		if (this.equals(x) == otro.equals(x)) {
			return true;
		}
		else {
			return false;
		}
	}

}


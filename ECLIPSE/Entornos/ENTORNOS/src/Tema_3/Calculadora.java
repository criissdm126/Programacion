package Tema_3;

public class Calculadora {
	
	//Atributos
	public int num1;
	public int num2;
	
    //Constructor para inicializar
	public Calculadora(int num1, int num2) {
		//super();
		this.num1 = num1;
		this.num2 = num2;
	}
	public Calculadora() {
	}

	//Método suma
	public int suma() {
		int resultado = num1 + num2;
		return resultado;
	}
	
	//Método resta
	public int resta() {
		int resultado = num1 - num2;
		return resultado;
	}
	
	//Método multiplicación
	public int multiplicacion() {
		int resultado = num1 * num2;
		return resultado;
	}
	
	//Método división
	public int division() {
		int resultado = num1/num2;
		return resultado;
	}
	
}

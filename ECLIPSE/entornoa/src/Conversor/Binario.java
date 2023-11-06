package Conversor;

public class Binario {
	/**

	La clase Binario representa un número binario y proporciona métodos para convertirlo a decimal y verificar su validez.
	@author Cristina de María
	@version 1.0
	*/

	/**
	* Valor de número binario almacenado como long.
	*/
	private long valor;

	/**
	* Crea un objeto Binario con valor cero.
	*/
	public Binario() {

	}

	/**
	* Crea un objeto Binario con el valor especificado.
	*
	* @param n valor de número binario como long.
	*/
	public Binario(long n) {
	    valor = n;
	}

	/**
	* Crea un objeto Binario a partir de un número entero decimal.
	*
	* @param n valor de número entero como int.
	* @return valor de número binario como long.
	*/
	public Binario(int n) {
	    valor = toBinario(n);
	}

	/**
	* Convierte un número entero decimal en su equivalente en binario.
	*
	* @param n valor de número entero como int.
	* @return valor de número binario como long.
	*/
	public long toBinario(int n) {
	    if (n < 2) {
	        return n;
	    } else {
	        return toBinario(n / 2) * 10 + (n % 2);
	    }
	}

	/**
	* Devuelve el valor de número binario almacenado en el objeto Binario.
	*
	* @return valor de número binario como long.
	*/
	public long getValor() {
	    return valor;
	}

	/**
	* Establece el valor de número binario en el objeto Binario.
	*
	* @param valor valor de número binario como long.
	*/
	public void setValor(long valor) {
	    this.valor = valor;

	}

	/**
	* Convierte el número binario almacenado en el objeto Binario a su equivalente en decimal.
	*
	* @return valor de número decimal como int.
	*/
	public int toDecimal() {
	    long n = valor;
	    int nDec = 0;
	    int pos = 0;
	    while (n > 0) {
	        nDec = nDec + (int) (n % 10) * (int) Math.pow(2, pos);
	        pos++;
	        n = n / 10;
	    }
	    return nDec;
	}

	/**
	* Verifica si un número binario es válido.
	*
	* @param n valor de número binario como long.
	* @return true si el número binario es válido, false si no lo es.
	*/
	public static boolean esValido(long n) {
	    if (n == 0 || n == 1) {
	        return true;
	    } else {
	        int ultima = (int) n % 10;

	        return (ultima == 0 || ultima == 1) && esValido(n / 10);

	    }
	}

	/**
	* Verifica si el número binario almacenado en el objeto Binario es válido.
	*
	* @return true si el número binario es válido, false si no lo es.
	*/
	public boolean esValido() {
	    return esValido(valor);
	}
	}






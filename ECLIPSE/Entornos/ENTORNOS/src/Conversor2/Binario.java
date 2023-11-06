package Conversor2;

/**
 * La clase Binario representa un número binario y proporciona métodos para convertirlo a decimal y verificar su validez.
 * 
 * @version 1.0
 */
public class Binario {

    /**
     * Valor de número binario almacenado como long.
     */
    private long valor;

    /**
     * Crea un objeto Binario con valor cero.
     */
    public Binario() {
        this.valor = 0;
    }

    /**
     * Crea un objeto Binario con el valor especificado.
     * 
     * @param valor valor de número binario como long.
     */
    public Binario(long valor) {
        this.valor = valor;
    }

    /**
     * Crea un objeto Binario a partir de un número entero decimal.
     * 
     * @param n valor de número entero como int.
     */
    public Binario(int n) {
        this.valor = toBinario(n);
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
            return 10 * toBinario(n / 2) + n % 2;
        }
    }

    /**
     * Comprueba si el valor del número binario es válido.
     * 
     * @return true si es válido, false en caso contrario.
     */
    public boolean esValido() {
        long aux = valor;
        while (aux > 0) {
            if (aux % 10 > 1) {
                return false;
            }
            aux /= 10;
        }
        return true;
    }

    /**
     * Convierte el número binario almacenado en decimal.
     * 
     * @return valor de número decimal como long.
     */
    public long toDecimal() {
        long decimal = 0;
        long multiplicador = 1;
        long aux = valor;
        while (aux > 0) {
            decimal += (aux % 10) * multiplicador;
            aux /= 10;
            multiplicador *= 2;
        }
        return decimal;
    }

    /**
     * Devuelve el valor del número binario.
     * 
     * @return valor de número binario como long.
     */
    public long getValor() {
        return valor;
    }

    /**
     * Establece el valor del número binario.
     * 
     * @param valor valor de número binario como long.
     */
    public void setValor(long valor) {
        this.valor = valor;
    }
}
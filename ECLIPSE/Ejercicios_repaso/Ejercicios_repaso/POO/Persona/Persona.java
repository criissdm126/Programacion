package Persona;

import java.util.Random;

public class Persona {
   
	private String nombre;
    private int edad;
    private final String DNI;
    private char sexo;
    private double peso;
    private double altura;

    private static final char SEXO_HOMBRE = 'H';
    private static final char SEXO_MUJER = 'M';
    private static final int PESO_IDEAL_BAJO = -1;
    private static final int PESO_IDEAL_NORMAL = 0;
    private static final int PESO_IDEAL_ALTO = 1;

	
	// CONSTRUCTOR POR DEFECTO
    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.DNI = generarDNI();
        this.sexo = SEXO_HOMBRE;
        this.peso = 0.0;
        this.altura = 0.0;
    }
    
    // Constructor con todos los atributos como parámetro
    public Persona(String nombre, int edad, String DNI, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }
    
 // Constructor con nombre, edad y sexo, el resto por defecto
    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = generarDNI();
        this.sexo = comprobarSexo(sexo);
        this.peso = 0.0;
        this.altura = 0.0;
    }
    
 // Métodos get de cada atributo
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDNI() {
        return DNI;
    }

    public char getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }
 // Métodos set de cada atributo, excepto DNI
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = comprobarSexo(sexo);
    }


	public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Método para calcular el índice de masa corporal (IMC)
    public int calcularIMC() {
        double imc = peso / (altura * altura);

        if (imc < 20) {
            return PESO_IDEAL_BAJO;
        }
        else if (imc >= 20 && imc <= 25) {
            return PESO_IDEAL_NORMAL;
        }
        else {
            return PESO_IDEAL_ALTO;
        }
    }

    // Método para comprobar si la persona es mayor de edad
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }
    
    // COMPROBAR SEXO
    private char comprobarSexo(char sexo) {
       
    	sexo = Character.toUpperCase(sexo);
        
    	if (sexo == SEXO_HOMBRE || sexo == SEXO_MUJER) {
            return sexo;
        }
        else {
            return SEXO_HOMBRE; // Por defecto, será Hombre
        }
    }
    
    // TO STRING
	@Override
	public String toString() {
		return "Persona [nombre= " + nombre + ", edad= " + edad + ", DNI= " + DNI + ", sexo= " + sexo + ", peso= " + peso
				+ ", altura= " + altura + "]";
	}
	
	// CALCULAR DNI
	   // Método para generar el DNI aleatoriamente
    private String generarDNI() {
        Random random = new Random();
        int numeroDNI = random.nextInt(90000000) + 10000000;
        char letraDNI = calcularLetraDNI(numeroDNI);
        return String.valueOf(numeroDNI) + letraDNI;
    }
    
    // Método para calcular la letra del DNI
    private char calcularLetraDNI(int numeroDNI) {
        String letrasDNI = "TRWAGMYFPDXBNJZSQVHLCKE";
        int indiceLetra = numeroDNI % 23;
        return letrasDNI.charAt(indiceLetra);
    }

}

/* Haz una clase llamada Persona que siga las siguientes condiciones:
 * Sus atributos son: nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura. No queremos que se accedan directamente a ellos.
 * Piensa que modificador de acceso es el más adecuado, también su tipo. Si quieres añadir algún atributo puedes hacerlo.
 * Por defecto, todos los atributos menos el DNI serán valores por defecto según su tipo (0 números, cadena vacía para String, etc.).
 * Sexo sera hombre por defecto, usa una constante para ello.
 * Se implantaran varios constructores:
 *     Un constructor por defecto.
 *     Un constructor con el nombre, edad y sexo, el resto por defecto.
 *     Un constructor con todos los atributos como parámetro.
 * Los métodos que se implementaran son:
 *     calcularIMC(): calculara si la persona esta en su peso ideal (peso en kg/(altura^2  en m)), si esta fórmula devuelve un valor menor que 20, la función devuelve un -1, si devuelve un número entre 20 y 25 (incluidos), significa que esta por debajo de su peso ideal la función devuelve un 0  y si devuelve un valor mayor que 25 significa que tiene sobrepeso, la función devuelve un 1. Te recomiendo que uses constantes para devolver estos valores.
 *     esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
 *     comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. Si no es correcto, sera H. No sera visible al exterior.
 *     toString(): devuelve toda la información del objeto.
 *     generaDNI(): genera un número aleatorio de 8 cifras, genera a partir de este su número su letra correspondiente. Este método sera invocado cuando se construya el objeto. Puedes dividir el método para que te sea más fácil. No será visible al exterior.
 * Métodos set de cada parámetro, excepto de DNI.
 */




package Arraylist;

import java.util.*;

public class Media_alumnos_altura {

	public static void main(String[] args) {
        ArrayList<Double> altura = new ArrayList<>();
        int num = introducirAlturas();
        altura = leerAlturas(num);
        double media = calcularMedia(altura);
        mostrarResultados(altura, media);
    }
	
	//NUMERO ALTURAS
	//devuelve el número de alturas que determine el usuario por consola
	public static int numeroAlturas() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el numero de alturas: ");
        int num = sc.nextInt();
        return num;
	}
	
	//LEER ALTURAS
    /*Introducir por teclado las alturas de los alumnos a través del método leerAltura.
    * se pedirá por teclado tantas alturas según sea el resultado de numeroAlturas
    * No puede haber alturas negativas, si el usuario mete una altura negativa
    * no avanza el programa
    */
	public static ArrayList<Double> leerAlturas(int numAlturas) { //Media_alumnos_altura.txt
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> alturas = new ArrayList<>();
        
        try {
        	for (int i = 0; i < numAlturas; i++) {
                System.out.print("Introduce la altura del alumno " + (i + 1) + ": ");
                double altura = sc.nextDouble();
                if (altura < 0) {
                    System.out.println("La altura no puede ser negativa. Introduce otra altura.");
                    i--; // volvemos a pedir la altura
                } else {
                    alturas.add(altura);
                }
            }
        }
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("posicion fuera del array");
		}
		
		catch (Exception e) {
			System.out.println("No se pueden introducir letras, solo numero decimales.");
		}
      
        return alturas;
    }
	
	//CALCULO MEDIAS
    //devuelve lam media de todas las alturas introducidas.
    //recibe como parámetro el ArrayList que  contiene todas las alturas introducidas por teclado
    public static double calcularMedia(ArrayList<Double> alturas) {
        double sum = 0;
        for (double altura : alturas) {
            sum += altura;
        }
        double media = sum / alturas.size();
        return media;
    }
    
    //VER RESULTADOS
    /*mostrará lo siguiente:
    * Muestra el número de alturas que se han introducido
    * La media de las alturas introducidad
    * Las alturas mayores a la media
    * Las alturas menores a la media
    */
    public static void mostrarResultados(ArrayList<Double> alturas, double media) {
        System.out.println("Número de alturas introducidas: " + alturas.size());
        System.out.println("Media de las alturas introducidas: " + media);
        System.out.println("Alturas mayores que la media:");
        for (double altura : alturas) {
            if (altura > media) {
                System.out.println(altura);
            }
        }
        
        System.out.println("Alturas menores que la media:");
        for (double altura : alturas) {
            if (altura < media) {
                System.out.println(altura);
            }
        }
    }
	
    //INTRODUCIR ALTURAS
    //indicamos al programa el número de alturas de alumno que podemos introducir por teclado
    public static int introducirAlturas() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el numero de alturas: ");
        int num = sc.nextInt();
        return num;
    }
}

/*introducir por teclado una serie de alturas de alumnos
 * metodo leerAltura, no puede haber alturas negativas
 * si se introduce una negativa, no avanza el programa
 * el método leerAltura recibe como parámetro el ArrayList
 * metodo calcularMedia, que devuelva la media de todas altruas introducidas
 * el metodo calcularMedia recibe como parámetro el ArrayList que  contiene todas las alturas introducidas por teclado
 * método mostrarResultados, mostrará lo siguiente:
 * Muestra el número de alturas que se han introducido
 * La media de las alturas introducidad
 * Las alturas mayores a la media
 * Las alturas menores a la media
 * método introducirAlturas, indicamos al priograma el número de alturas de alumno que podemos introducir por teclado
 */
package Concesionario;

import java.util.*;
import Concesionario.Coche.Accesorio;


public class Vehiculos {
    
static Coche[] cochesMezclados = new Coche[10];
    
    public static void main(String[] args) {
    	
        crearCoche("Audi", "A3", crearAccesorios(5)); // Crear un coche normal
        crearCocheCombustible("Volkswagen", "Golf", crearAccesorios(4), "diesel"); // Crear un coche de combustible
        crearCocheElectrico("Tesla", "Model 3", crearAccesorios(6), 100); // Crear un coche eléctrico
        crearCocheCombustible("Ford", "Fiesta", crearAccesorios(2), "gasolina"); // Crear un coche de combustible
        crearCocheElectrico("Nissan", "Leaf", crearAccesorios(1), 50); // Crear un coche eléctrico
        
        cochesMezclados[0].verPrecio(); // Mostrar el precio del primer coche en la lista
        
        mostrarCoches(cochesMezclados); // Mostrar todos los coches en la lista y el precio total del concesionario
        
        generarInforme("Ford"); // Generar informe de coches de la marca "Ford"
    }
    

    
    // Método para generar informe
    public static void generarInforme(String marca) {
        int total = 0; // Contador de coches totales
        int totalElectricos = 0; // Contador de coches eléctricos
        int totalCombustible = 0; // Contador de coches de combustible
        
        for (Coche coche : cochesMezclados) {
            if (coche != null && coche.getMarca().equalsIgnoreCase(marca)) {
                total++; // Incrementar el contador total
                
                if (coche instanceof CocheElectrico) {
                    totalElectricos++; // Incrementar el contador de coches eléctricos
                } else if (coche instanceof CocheCombustible) {
                    totalCombustible++; // Incrementar el contador de coches de combustible
                }
            }
        }
        
        int normal = total - (totalElectricos + totalCombustible); // Calcular el número de coches normales
        
        // Imprimir el informe con la cantidad de coches de cada tipo
        System.out.println("Hay " + total + " coches de la marca " + marca);
        System.out.println("Hay " + totalElectricos + " coches eléctricos, " + totalCombustible + " coches de combustible y " + normal + " coches normales");
    }
	
 // CREAR ACCESORIO
    public static Accesorio[] crearAccesorios(int menu) {
        Accesorio[] accesorios;

        // Crear y retornar un arreglo de accesorios basado en el valor del menú
        switch (menu) {
            case 1:
                // Caso 1: Accesorios TECHO, NAVEGADOR y ASIENTOS_CALEFACTABLES
                accesorios = new Accesorio[]{Accesorio.TECHO, Accesorio.NAVEGADOR, Accesorio.ASIENTOS_CALEFACTABLES};
                break;
            case 2:
                // Caso 2: Accesorios TECHO y NAVEGADOR
                accesorios = new Accesorio[]{Accesorio.TECHO, Accesorio.NAVEGADOR};
                break;
            case 3:
                // Caso 3: Accesorios TECHO y ASIENTOS_CALEFACTABLES
                accesorios = new Accesorio[]{Accesorio.TECHO, Accesorio.ASIENTOS_CALEFACTABLES};
                break;
            case 4:
                // Caso 4: Accesorios NAVEGADOR y ASIENTOS_CALEFACTABLES
                accesorios = new Accesorio[]{Accesorio.NAVEGADOR, Accesorio.ASIENTOS_CALEFACTABLES};
                break;
            case 5:
                // Caso 5: Accesorio TECHO
                accesorios = new Accesorio[]{Accesorio.TECHO};
                break;
            case 6:
                // Caso 6: Accesorio NAVEGADOR
                accesorios = new Accesorio[]{Accesorio.NAVEGADOR};
                break;
            case 7:
                // Caso 7: Accesorio ASIENTOS_CALEFACTABLES
                accesorios = new Accesorio[]{Accesorio.ASIENTOS_CALEFACTABLES};
                break;
            default:
                // Caso por defecto: Opción inválida. Se crearán accesorios vacíos.
                System.out.println("Opcion invalida. Se crearan accesorios vacios.");
                accesorios = new Accesorio[0];  // Crear un arreglo vacío de accesorios
                break;
        }

        return accesorios;  // Retornar el arreglo de accesorios creado
    }
    
 // COCHE NORMAL
    public static void crearCoche(String marca, String modelo, Accesorio[] accesorios) {
        // Crear un objeto Coche con la marca, modelo y accesorios proporcionados
        Coche normal = new Coche(marca, modelo, accesorios);

        int contador = 0;
        for (int posicion = 0; posicion < cochesMezclados.length && contador != 1; posicion++) {
            if (cochesMezclados[posicion] == null) {
                // Agregar el objeto Coche a la primera posición disponible en el arreglo cochesMezclados
                cochesMezclados[posicion] = normal;

                // Calcular el precio base del Coche
                normal.getPrecioBase();

                // Calcular el precio final del Coche
                normal.precioNormal();

                contador++;
            } else if (cochesMezclados[cochesMezclados.length - 1] != null) {
                System.err.println("Error: El concesionario está lleno");
                contador++;
            }
        }
    }

	
 // COCHE ELECTRICO
    public static void crearCocheElectrico(String marca, String modelo, Accesorio[] accesorios, double potencia) {
        // Crear un objeto Bateria con la potencia proporcionada
        Bateria b = new Bateria(potencia);

        // Crear un objeto CocheElectrico con la marca, modelo, accesorios y batería proporcionados
        CocheElectrico electrico = new CocheElectrico(marca, modelo, accesorios, b);

        // Establecer el objeto CocheElectrico como su propio coche eléctrico
        electrico.setCocheElect(electrico);

        int contador = 0;
        for (int posicion = 0; posicion < cochesMezclados.length && contador != 1; posicion++) {
            if (cochesMezclados[posicion] == null) {
                // Agregar el objeto CocheElectrico a la primera posición disponible en el arreglo cochesMezclados
                cochesMezclados[posicion] = electrico;

                // Calcular el precio final del CocheElectrico
                electrico.precioElectrico();

                contador++;
            }
            else if (cochesMezclados[cochesMezclados.length - 1] != null) {
                System.err.println("Error: El concesionario está lleno");
                contador++;
            }
        }
    } 
	
	//COCHE COMBUSTIBLE
	public static CocheCombustible crearCocheCombustible(String marca, String modelo, Accesorio[] accesorios, String deposito) {
        // Crear un objeto Deposito con el tamaño del depósito proporcionado
        Deposito d = new Deposito(deposito);

        // Crear un objeto CocheCombustible con la marca, modelo, accesorios y depósito proporcionados
        CocheCombustible combustible = new CocheCombustible(marca, modelo, accesorios, d);

        // Establecer el objeto CocheCombustible como su propio coche de combustible
        combustible.setCocheComb(combustible);

        int contador = 0;
        for (int posicion = 0; posicion < cochesMezclados.length && contador != 1; posicion++) {
            if (cochesMezclados[posicion] == null) {
                // Agregar el objeto CocheCombustible a la primera posición disponible en el arreglo cochesMezclados
                cochesMezclados[posicion] = combustible;

                // Calcular el precio final del CocheCombustible
                combustible.precioCombustible();

                contador++;
            } else if (cochesMezclados[cochesMezclados.length - 1] != null) {
                System.err.println("Error: El concesionario está lleno");
                contador++;
            }
        }
		return combustible;
    }



 // MOSTRAR COCHES
    public static void mostrarCoches(Coche[] coches) {
        // Ordenar el arreglo de coches por precio final
		
		ordenarPrecio(coches);

        double precioFinal = 0;
        
        for (int i = 0; i < coches.length; i++) {
			
			if (coches[i] != null) {// Calcular el precio final acumulando los precios de los coches
				
				precioFinal = coches[i].getPrecioFinal() + precioFinal;

                // Mostrar la representación en cadena del coche
				
				System.out.println(coches[i].toString());
                System.out.println();
            }
        }

        // Mostrar el precio total del concesionario
        System.out.println("El precio total del concesionario es de: " + precioFinal);
        System.out.println();
    }

    
 // ORDENAR POR PRECIO
    private static void ordenarPrecio(Coche[] coches) {
		
		for (int i = 0; i < coches.length - 1; i++) {
			for (int j = 0; j < coches.length - i - 1; j++) {
				
				if (coches[j] != null && coches[j + 1] != null && coches[j].getPrecioFinal() > coches[j + 1].getPrecioFinal()) {
                    
                	// Intercambiar los coches si el precio final del coche actual es mayor al del siguiente coche
                    Coche temp = coches[j];
                    coches[j] = coches[j + 1];
                    coches[j + 1] = temp;
                }
            }
        }
    }
    
    // INFORME GENERADO
    public static void InformeCoches(String marca) {
        int total = 0; // Contador de coches totales
        int totalElectricos = 0; // Contador de coches eléctricos
        int totalCombustible = 0; // Contador de coches de combustible

        for (Coche coche : cochesMezclados) {
            if (coche != null && coche.getMarca().equalsIgnoreCase(marca)) {
                total++; // Incrementar el contador total

                if (coche instanceof CocheElectrico) {
                    totalElectricos++; // Incrementar el contador de coches eléctricos
                } else if (coche instanceof CocheCombustible) {
                    totalCombustible++; // Incrementar el contador de coches de combustible
                }
            }
        }

        int totalNormales = total - (totalElectricos + totalCombustible); // Calcular el número de coches normales

        // Imprimir el informe con la cantidad de coches de cada tipo
        System.out.println("Informe de coches de la marca " + marca);
        System.out.println("Total de coches: " + total);
        System.out.println("Coches electricos: " + totalElectricos);
        System.out.println("Coches de combustible: " + totalCombustible);
        System.out.println("Coches normales: " + totalNormales);
    }
}

/*// CREAR ACCESORIO
public static Accesorio[] crearAccesorios(int menu) {
    Accesorio[] accesorios;

    // Crear y retornar un arreglo de accesorios basado en el valor del menú

	if (menu == 1) {
		Accesorio[] accesorios3 = {Accesorio.TECHO, Accesorio.NAVEGADOR, Accesorio.ASIENTOS_CALEFACTABLES};
		return  accesorios3;
	}
	else if (menu == 2) {
		Accesorio[] accesoriosTechoNavegador = {Accesorio.TECHO, Accesorio.NAVEGADOR};
		return	accesoriosTechoNavegador;
	}
	else if (menu == 3) {
		Accesorio[] accesoriosTechoAsiento_Calefactable = {Accesorio.TECHO, Accesorio.ASIENTOS_CALEFACTABLES};
		return accesoriosTechoAsiento_Calefactable;
	}
	else if (menu == 4) {
		Accesorio[] accesoriosNavegadorAsiento_Calefactable = {Accesorio.NAVEGADOR, Accesorio.ASIENTOS_CALEFACTABLES};
		return accesoriosNavegadorAsiento_Calefactable;
	}
	else if (menu == 5) {
		Accesorio[] accesoriosTecho = {Accesorio.TECHO};
		return accesoriosTecho;
	}
	else if (menu == 6) {
		Accesorio[] accesoriosNavegador = {Accesorio.NAVEGADOR};
		return accesoriosNavegador;
	}
	else if (menu == 7) {
		Accesorio[] accesoriosAsiento_calefactables = {Accesorio.ASIENTOS_CALEFACTABLES};
		return accesoriosAsiento_calefactables;
	}
	else {
		Accesorio[] sin_accesorios = new Accesorio[0];
		return sin_accesorios;
	}
}*/
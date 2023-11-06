package repetecion;

import java.util.*;

public class Principal {

	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);

	    //par = agua mineral
	    //impar = refresco

	    int espacio = 10;

	    Almacen[] bebidas = new Almacen[15];

	    bebidas[0] = new Almacen("1", 5, 0, 2, 1.25, "Coca - cola", "No manantial", "Madrid");
	    bebidas[1] = new Almacen("2", 0, 0, 2, 1.50, "Bezoya", "No manantial", "Valencia");
	    bebidas[2] = new Almacen("3", 3, 0, 2, 1.70, "Fanta", "No manantial", "Galicia");
	    bebidas[3] = new Almacen("4", 0, 0, 1, 1.00, "Bezoya", "manantial", "Madrid");
	    bebidas[4] = new Almacen("5", 1, 0, 1.5, 1.85, "Nestie", "No manantial", "Lisboa");
	    bebidas[5] = new Almacen("6", 0, 10, 2, 2.00, "Bezoya", "No manantial", "Madrid");
	    bebidas[6] = new Almacen("7", 6, 10, 0.25, 0.75, "Pepsi", "No manantial", "Madrid");
	    bebidas[7] = new Almacen("8", 0, 10, 1.5, 1.25, "Bezoya", "manantial", "Madrid");
	    bebidas[8] = new Almacen("9", 2, 10, 1, 1.00, "Aquiarius", "No manantial", "Madrid");
	    bebidas[9] = new Almacen("10", 0, 10, 0.50, 0.75, "Bezoya", "manantial", "Madrid");

	    int opcion;
	    do {
	        System.out.println("Seleccione una opcion, seleccione 0 para salir:");
	        System.out.println("1. Mostrar la bebidas");
	        System.out.println("2. Añadir nueva bebida");
	        System.out.println("3. Calcular precio");
	        System.out.println("4. Eliminar una bebida");
	        System.out.println("0. Salir");
	        opcion = sc.nextInt();

	        switch (opcion) {

	            //MOSTRAR BEBIDAS
	            case 1:
	                System.out.println("1. Mostrar las bebidas");

	                boolean hayBebidas = false;

	                for (Almacen almacen : bebidas) {
	                    if (almacen != null) {
	                        System.out.println(almacen);
	                        hayBebidas = true;
	                    }
	                }
	                if (!hayBebidas) {
	                    System.out.println("No hay bebidas actualmente en el almacen.");
	                }

	                break;
	                
			// AÑADIR NUEVA BEBIDA
			case 2:
				System.out.println("2. Añadir nueva bebida");
				if (espacio < 15) {
					System.out.print("Introduzca el codigo: ");
					String cod1 = sc.next();
					
					// Verificar si el identificador ya existe en alguna de las bebidas
					boolean codigoRepetido = false;
					for (Almacen bebida : bebidas) {
					    if (bebida != null && bebida.getIdentificador().equals(cod1)) {
					        codigoRepetido = true;
					        break;
					    }
					}
				
				break;
				}
			
			//CALCULAR PRECIO
			case 3:
				System.out.println("3. Calcular precio");
				double precioTotal = 0;
				for (int i = 0; i < bebidas.length; i++) {
					if (bebidas[i] != null) {
						precioTotal += bebidas[i].getPrecioFinal();
						}
					}
				
				System.out.println("El precio total de las bebidas es: $" + precioTotal);
				break;
			
			//ELIMINAR BEBIDA
			case 4:
				
				System.out.print("Introduzca el codigo de la bebida a borrar: ");
				String codigo11 = sc.next();
				
				int a = 0;
				boolean borrado = false;
				
				for (Almacen almacen : bebidas) {
					if (almacen != null && bebidas[a].getIdentificador().compareToIgnoreCase(codigo11) == 0) {
						bebidas[a] = null;
						System.out.println("Bebida borrada con exito.");
						espacio--;
						borrado = true;
						break;
						}
					a++;
					}
				if (!borrado) {
					System.out.println("No se pudo eliminar la bebida. El codigo introducido no existe.");
					}
				break;
				
				//SALIR DE LAS OPCIONES
				case 0:
					System.out.println("Saliste del menu.");
					}
			} while (opcion != 0);
		}
	}
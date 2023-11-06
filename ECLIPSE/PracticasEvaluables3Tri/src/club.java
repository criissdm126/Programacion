import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class club {
	public static void main(String[] args) {
		//Se crea una lista de socios
		ArrayList<Socio> listaSocios;
		listaSocios = generarSocios();
		
		//Menu que controla la lista de socios
		Scanner sc = new Scanner(System.in);
		int opcion;
		
		do {
			System.out.println("Bienvenido al club (0 salir)\n"
			+ "1 - Dar de alta a un socio\n"
			+ "2 - Dar de baja a un socio\n"
			+ "3 - Modificar datos de un socio\n"
			+ "4 - Listar");
			
			opcion = sc.nextInt();
			
			switch (opcion) {
				case 0:
					System.out.print("Saliendo del menú");
					break;
				case 1:
					altaSocio(listaSocios);
					break;
				case 2:
					bajaSocio(listaSocios);
					break;
				case 3:
					modificarDatos(listaSocios);
					break;
				case 4:
					listar(listaSocios);
					break;
				default:
					System.out.println("Pulsa el 0 para salir");
					break;
			}
		} while (opcion!=0);
		sc.close();
	}

	private static ArrayList<Socio> generarSocios() {
		ArrayList<Socio> socios = new ArrayList<>();
		Socio s1 = new Socio("Paco","paco@gmail.com","22/06/1988", 123321);
		Socio s2 = new Socio("Lucas","lucas@gmail.com","03/11/1975", 123321);
		Socio s3 = new Socio("Aitana","aitana@gmail.com","12/03/2001", 123321);
		Socio s4 = new Socio("Tomás","tomas@gmail.com","19/09/2000", 123321);
		Socio s5 = new Socio("Andrea","andrea@gmail.com","27/04/1995", 123321);
		
		socios.add(s1);
		socios.add(s2);
		socios.add(s3);
		socios.add(s4);
		socios.add(s5);
		
		return socios;	
	}

	private static void listar(ArrayList<Socio> lista) {
		Scanner sc = new Scanner(System.in);
		int opcion;
		
		System.out.print("1 - Listar por nombre\n"
		+ "2 - Listar por antigüedad");
		opcion = sc.nextInt();
		
		if (opcion == 1) {
			Collections.sort(lista, new Comparator<Socio>() {
				public int compare(Socio socio1, Socio socio2) {
					return socio1.getNombre().compareToIgnoreCase(socio2.getNombre());
				}
			});
			
			for(Socio datos: lista){
				System.out.println(datos);
			}
			
		} else if (opcion == 2) {
			Collections.sort(lista, new Comparator<Socio>() {
				public int compare(Socio socio1, Socio socio2) {
					return socio1.getNombre().compareToIgnoreCase(socio2.getNombre());
				}
			});
			
			for(Socio datos: lista){
				System.out.println(datos);
			}
			
		} else {
			System.out.println("Opción no válida");
		}
		
	}

	private static void modificarDatos(ArrayList<Socio> lista) {
		Scanner sc = new Scanner(System.in);
		int codigoElegido;
		boolean correcto = false;
		ArrayList<Integer> codigos = new ArrayList<>();
		//Muestra todos los socios
		for (int i = 0;i<lista.size();i++) {
			System.out.print("Codigo: ");
			System.out.print(lista.get(i).getNumSocio());
			System.out.print(" Nombre: ");
			System.out.println(lista.get(i).getNombre());
			
			codigos.add(lista.get(i).getNumSocio());
		}
		
		do {
			System.out.println("Escribe el código de socio para modificar");
			codigoElegido = sc.nextInt();
			
			if (codigos.contains(codigoElegido)) {
				//Obtener la pocision donde está el socio
				int posicion = 0;
				for (int i = 0; i<lista.size();i++) {
					if (lista.get(i).getNumSocio() == codigoElegido) {
						posicion = i;
					}
				}
				
				do {
					System.out.println("Elige que modificar:\n"
					+ "1 - Modificar nombre\n"
					+ "2 - Modificar email\n"
					+ "3 - Modificar telefono\n"
					+ "4 - Modificar fecha nacimiento\n"
					+ "5 - Modificar fecha de alta");
					
					codigoElegido = sc.nextInt();
					
					
					String cadena;
					int numeros;
					
					//Nombre
					if (codigoElegido == 1) {
						System.out.println("Introduce el nombre:");
						cadena = sc.nextLine();
						
						lista.get(posicion).setNombre(cadena);
						
					//Email
					} else if ( codigoElegido == 2) {
						System.out.println("Introduce el email:");
						cadena = sc.nextLine();
						
						lista.get(posicion).setCorreo(cadena);
						
					//Telefono	
					} else if ( codigoElegido == 3) {
						System.out.println("Introduce el telefono:");
						numeros = sc.nextInt();
						
						lista.get(posicion).setTelefono(numeros);
						
					//Fecha nacimiento
					} else if ( codigoElegido == 4) {
						boolean existe = false;
						while(existe == false) {
							System.out.println("Introduce la fecha de nacimiento: (dd/mm/aaaa)");
							cadena = sc.nextLine();
							
							if (existeFecha(cadena)) {
								lista.get(posicion).setNacimiento(cadena);
								existe=true;
							}
						}
						
					//Fecha alta	
					} else if ( codigoElegido == 5) {
						boolean existe = false;
						while(existe == false) {
							System.out.println("Introduce la fecha de alta: (dd/mm/aaaa)");
							cadena = sc.nextLine();
							
							if (existeFecha(cadena)) {
								lista.get(posicion).setAlta(cadena);
								lista.get(posicion).setAntigüedad(obtenerAntigüedad());
								existe=true;
							}
						}
						
					} else {
						System.out.println("Opcion incorrecta");
						correcto = false;
					}
					correcto = true;
				} while (correcto == false);
				
			} else {
				System.out.println("Codigo de socio incorrecto");
			}
			
		} while (correcto == false);
		
		System.out.println("Se ha modificado el dato");
	}

	private static int obtenerAntigüedad() {
		// TODO Auto-generated method stub
		return 0;
	}

	private static boolean existeFecha(String cadena) {
		boolean existe = false;
		
		String [] fecha = cadena.split("/");
		int dia = Integer.valueOf(fecha[0]);
		int mes = Integer.valueOf(fecha[1]);
		int anio = Integer.valueOf(fecha[2]);
		
		if (dia < 1 || mes < 1 || anio < 1) {
			String fechaActual = obtenerFecha();
			
			String [] fechaA = fechaActual.split("/");
			int diaActual = Integer.valueOf(fechaA[0]);
			int mesActual = Integer.valueOf(fechaA[1]);
			int anioActual = Integer.valueOf(fechaA[2]);
			
			if (dia > diaActual && mes == mesActual && anio == anioActual) {
				System.out.println("La fecha no puede ser posterior a la fecha actual");
			} else if ((mes == 2 && dia <=28) || (mes == 1 && dia <= 31) || ((mes == 1 && dia <= 30)))  {
				
			}
		} else {
			System.out.println("No se pueden introducir numeros menores de 1");
		}
		
		return existe;
	}

	private static void bajaSocio(ArrayList<Socio> lista) {
		Scanner sc = new Scanner(System.in);
		boolean correcto = false, realizarBaja = false;
		int codigoElegido;
		
		ArrayList<Socio> socioDisponible = new ArrayList<>();
		for (int i = 0; i<lista.size();i++) {
			if (lista.get(i).getAlta() != null) {
				socioDisponible.add(lista.get(i));
				realizarBaja = true;
			}
		}
		
		if (realizarBaja == true) {
			ArrayList<Integer> codigos = new ArrayList<>();
			System.out.println("Esta es la lista de socios que están dados de alta");
				
			for (int i = 0;i<socioDisponible.size();i++) {
				if ( socioDisponible.get(i).getAlta() != null) {
					System.out.print("Codigo: ");
					System.out.print(socioDisponible.get(i).getNumSocio());
					System.out.print(" Nombre: ");
					System.out.println(socioDisponible.get(i).getNombre());
					
					codigos.add(socioDisponible.get(i).getNumSocio());
				}
			}
		
			do {
				System.out.println("Escribe el código de socio al que dar la baja");
				codigoElegido = sc.nextInt();
					
				if (codigos.contains(codigoElegido)) {
					for (int i = 0; i<lista.size();i++) {
						if (lista.get(i).getNumSocio() == codigoElegido) {
							System.out.println("Se ha dado de baja al usuario");
							lista.get(i).setAlta(null);
							lista.get(i).setAntigüedad(0);
							correcto = true;
						}
					}
				} else {
					System.out.println("Codigo de socio incorrecto");
				}
				
			} while (correcto == false);
			
		} else {
			System.out.println("Todos los socios están dados de baja");
		}
		
	}

	private static void altaSocio(ArrayList<Socio> lista) {
		Scanner sc = new Scanner(System.in);
		boolean correcto = false, realizarAlta = false;
		int codigoElegido;
		
		ArrayList<Socio> socioDisponible = new ArrayList<>();
		for (int i = 0; i<lista.size();i++) {
			if (lista.get(i).getAlta() == null) {
				socioDisponible.add(lista.get(i));
				realizarAlta = true;
			}
		}
		
		if (realizarAlta == true) {
			ArrayList<Integer> codigos = new ArrayList<>();
			System.out.println("Esta es la lista de socios que no están dados de alta");
				
			for (int i = 0;i<socioDisponible.size();i++) {
				if ( socioDisponible.get(i).getAlta() == null) {
					System.out.print("Codigo: ");
					System.out.print(socioDisponible.get(i).getNumSocio());
					System.out.print(" Nombre: ");
					System.out.println(socioDisponible.get(i).getNombre());
					
					codigos.add(socioDisponible.get(i).getNumSocio());
				}
			}
		
			do {
				System.out.println("Escribe el código de socio al que dar el alta");
				codigoElegido = sc.nextInt();
					
				if (codigos.contains(codigoElegido)) {
					for (int i = 0; i<lista.size();i++) {
						if (lista.get(i).getNumSocio() == codigoElegido) {
							System.out.println("Se ha dado de alta al usuario con fecha de hoy");
							lista.get(i).setAlta(obtenerFecha());
							lista.get(i).setAntigüedad(1);
							correcto = true;
						}
					}
				} else {
					System.out.println("Codigo de socio incorrecto");
				}
				
			} while (correcto == false);
			
		} else {
			System.out.println("Todos los socios están dados de alta");
		}
		
		
		
		
		/*
		Scanner sc = new Scanner(System.in);
		boolean correcto = false, realizarAlta = false;
		int opcion,codigoElegido;
		
		for (int i = 0; i<lista.size();i++) {
			if (((Socio) lista.get(i)).getAlta() == null) {
				realizarAlta = true;
			}
		}
		
		if (realizarAlta == true) {
			System.out.println("1 - Dar de alta con el día actual\n"
			+ "2 - Dar de alta con un fecha específica");
			opcion = sc.nextInt();
			
			if (opcion == 1 || opcion == 2) {
				ArrayList<Integer> codigos = new ArrayList<>();
				System.out.println("Esta es la lista de socios que no están dados de alta");
				
				for (int i = 0;i<lista.size();i++) {
					if (((Socio) lista.get(i)).getAlta() == null) {
						System.out.print("Codigo: ");
						System.out.print(((Socio) lista.get(i)).getNumSocio());
						codigos.add(((Socio) lista.get(i)).getNumSocio());
						System.out.print(" Nombre: ");
						System.out.println(((Socio) lista.get(i)).getNombre());
					}
				}
				
				do {
					System.out.println("Escribe el código de socio al que dar el alta");
					codigoElegido = sc.nextInt();
					
					if (codigos.contains(codigoElegido)) {
						if (opcion == 1) {
							for (int i = 0; i<lista.size();i++) {
								if (((Socio) lista.get(i)).getNumSocio() == codigoElegido) {
									System.out.println("Se ha dado de alta al usuario con fecha de hoy");
									((Socio) lista.get(i)).setAlta(obtenerFecha());;
									correcto = true;
								}
							}
						} else if (opcion == 2) {
							String fecha;
							System.out.print("Introduce el dia: ");
							fecha = sc.next();
							System.out.print("Introduce el mes: ");
							fecha += "/"+sc.next();
							System.out.println("Introduce el año: ");
							fecha += "/"+sc.next();
							for (int i = 0; i<lista.size();i++) {
								if (((Socio) lista.get(i)).getNumSocio() == codigoElegido) {
									System.out.println("Se ha dado de alta al usuario con la fecha seleccionada");
									((Socio) lista.get(i)).setAlta(fecha);;
									correcto = true;
								}
							}
						} 
					} else {
						System.out.println("Codigo de socio incorrecto");
					}
				} while (correcto == false);
				
			} else {
				System.out.println("Opción no válida");
			}
		} else {
			System.out.println("Todos los socios están dados de alta");
		}
		
		*/
	}
	
	private static String obtenerFecha() {
		Calendar fecha = new GregorianCalendar();                                                    
        int año = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH)+1;
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        
        String strfecha = dia + "/" + mes + "/" + año;
        
		return strfecha;
		
	}
}

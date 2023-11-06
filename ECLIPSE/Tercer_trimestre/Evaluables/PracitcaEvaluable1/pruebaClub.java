package PracitcaEvaluable1;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class pruebaClub
{

	// Para poder usar en los metodos sin tener que ir jugando con los parametros
	private static final String ARCHIVO = "socios.dat";
	private static Socio[] socios = new Socio[0];

	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		int numuser = 7;
		cargarArchivo();
		// Bucle de menu principal

		do
		{

			try
			{
				menuSocios();

				switch (numuser = sc.nextInt())
				{
				case 1 ->
				{
					altaSocios();
				}
				case 2 ->
				{
					modificarSocio();
				}
				case 3 ->
				{
					bajaSocio();
				}
				case 4 ->
				{
					listarPorAntiguedad();
				}
				case 5 ->
				{
					listarPorNombre();
				}
				case 6 ->
				{
					listarFamilia();
				}
				default ->
				{
					if (numuser != 0)
					{
						System.out.println("Escribe un numero del menu");
					}

				}
				}
			} catch (InputMismatchException e)
			{
				System.out.println("Caracter inválido, intentelo de nuevo");
				sc.nextLine();
			} catch (DateTimeParseException e)
			{
				System.out.println("No has escrito la fecha en el formato adecuado,intentalo de nuevo");
			}

		} while (numuser != 0);
		guardarArchivo();
		System.out.println("Saliendo del programa...");

	}

	// Metodo para cargar los datos o crear el archivo binario y meter datos en caso de que no exista dicho archivo.
	private static void cargarArchivo()
	{

		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(ARCHIVO)))
		{
			// Serializable
			socios = (Socio[]) in.readObject();
			Socio.setUltimoNumeroSocio(socios.length + 1);
		} catch (EOFException e)
		{
			System.out.println("Se han cargado los socio");
		} catch (FileNotFoundException e)
		{
			System.out.println("No se ha encontrado el archivo. Se crea uno para guardar los Socios.");
		} catch (Exception e)
		{
			System.out.println("Error al leer");
		}
	}

	// Guardado en archivo binario
	private static void guardarArchivo()
	{

		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ARCHIVO)))
		{
			out.writeObject(socios);
			System.out.println("Los socios han sido guardados correctamente");
		} catch (IOException e)
		{
			System.out.println("Error de escritura" + e);
		}
	}

	// Menu para socios
	private static void menuSocios()
	{

		System.out.println("Programa de Gestión de Socios");
		System.out.println("=============================");
		System.out.println("1. Alta de Socio");
		System.out.println("2. Modificacion de Socio");
		System.out.println("3. Baja de socio");
		System.out.println("4. Lista ordenada por antigüedad de socio");
		System.out.println("5. Lista ordenada por nombre de socio");
		System.out.println("6. Lista de socios y familiares, esta ultima ordenada por nombre");
		System.out.println("0. Salir del programa");
	}

	// Alta de socio
	private static void altaSocios()
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Nombre de socio :");
		String nombre = sc.nextLine();
		System.out.println("Fecha de nacimiento de socio (dd/MM/yyyy):");
		String fnacimiento = sc.nextLine();
		System.out.println("Telefono de socio :");
		String tlf = sc.nextLine();
		System.out.println("Correo electrónico de socio :");
		String correo = sc.nextLine();
		Socio nuevo = new Socio(nombre, fnacimiento, tlf, correo);
		System.out.println("¿Cuantos familiares tiene el socio?");
		int num = sc.nextInt();
		// Añadir sc.nextline si o si, si no me devuelve al menu principal
		sc.nextLine();
		if (num > 0)
		{
			Familiar nuevofamilia[] = new Familiar[num];
			for (int i = 0; i < nuevofamilia.length; i++)
			{
				System.out.println("Introduzca el nombre del familiar nº" + (i + 1));
				String nfam = sc.nextLine();
				System.out.println("Introduzca el dni del familiar nº" + (i + 1));
				String dni = sc.nextLine();
				System.out.println("Introduzca la fecha de nacimiento del familiar(dd/MM/yyyy) nº " + (i + 1));
				String ffam = sc.nextLine();
				nuevofamilia[i] = new Familiar(dni, nfam, ffam);
			}
			nuevo.setFamilia(nuevofamilia);
		}

		// Se hace copia del array socios con un cupo mas en su tamaño
		Socio[] nuevosSocios = Arrays.copyOf(socios, socios.length + 1);
		// Se añade el objeto nuevo
		nuevosSocios[nuevosSocios.length - 1] = nuevo;
		// Se da a socios el valor del nuevo array para luego poder guardarlo en el archivo binario
		socios = nuevosSocios;
		for (int j = 0; j < socios.length; j++)
		{
			if (socios[j] != null)
			{
				System.out.println(socios[j]);
			}
		}
	}

	// Lista por orden de fecha de alta
	private static void listarPorAntiguedad()
	{

		if (socios.length == 0)
		{
			System.out.println("No hay socios registrados");
		} else
		{

			OrdenarPorFecha f = new OrdenarPorFecha();
			Arrays.sort(socios, f);
			System.out.println();
			for (int j = 0; j < socios.length; j++)
			{
				if (socios[j] != null)
				{
					System.out.println(socios[j]);
				}
			}
		}
	}

	// Lista por orden ascenciente del nombre del socio
	private static void listarPorNombre()
	{

		if (socios.length == 0)
		{
			System.out.println("No hay socios registrados");
		} else
		{
			OrdenaPorNombre n = new OrdenaPorNombre();
			Arrays.sort(socios, n);
			System.out.println();
			for (int j = 0; j < socios.length; j++)
			{
				if (socios[j] != null)
				{
					System.out.println(socios[j]);
				}
			}
		}
	}

	// Listado de familia por orden de edad
	private static void listarFamilia()
	{

		if (socios.length == 0)
		{
			System.out.println("No hay socios registrados");
		} else
		{
			System.out.println();
			for (int j = 0; j < socios.length; j++)
			{
				// En caso de que tenga familiares se ordenara mediante la edad si no lo contrario
				if (socios[j] != null && socios[j].getFamilia() != null)
				{
					Arrays.sort(socios[j].getFamilia(), new OrdenarFamEdad());
					System.out.println(socios[j]);
				} else if (socios[j] != null)
				{
					System.out.println(socios[j]);
				}

			}
		}
	}

	// Modificación de socio
	private static void modificarSocio()
	{

		Scanner sc = new Scanner(System.in);
		if (socios.length == 0)
		{
			System.out.println("No hay socios registrados");
		} else
		{
			System.out.println("Dime el numero del socio que quieres modificar ");
			boolean valido = false;
			// Contador es para saber la posicion dentro del array que busco
			int contador = 0;
			int num = sc.nextInt();
			for (int i = 0; i < socios.length; i++)
			{
				// Para evitar excepciones
				if (socios[i] == null)
				{
				} else if (socios[i].getNumeroSocio() == num)
				{
					valido = true;
					contador = i;
				} else if (socios[i + 1] == socios[socios.length - 1])
				{
					System.out.println("El numero que de identificacion de socio no existe");
				}
			}
			// En caso de que sea valido el numero de socio
			if (valido)
			{
				System.out.println("Que quieres modificar del socio Nº : " + num);
				System.out.println("1. Modificar Nombre");
				System.out.println("2. Modificar Fecha de alta");
				System.out.println("3. Modificar Fecha de nacimiento");
				System.out.println("4. Modificar Telefono");
				System.out.println("5. Modificar Correo electronico");
				int n = sc.nextInt();
				/*
				 * Hay que poner despues del sc.nextInt un sc.nextLine por que al ponerlo lo que hago es como consumir dicho caracter para que cuando me vuelva a pedir con otro Scanner, automaticamente no me salte al menu principal
				 */
				sc.nextLine();
				// Submenu de modificacion de socio
				switch (n)
				{
				case 1 ->
				{
					System.out.println("Introduce el nuevo nombre");
					String nombre = sc.nextLine();
					socios[contador].setNombre(nombre);
				}
				case 2 ->
				{
					System.out.println("Introduce la nueva Fecha de alta(dd/MM/yyyy)");
					String falta = sc.nextLine();
					socios[contador].setFechaAlta(falta);
				}
				case 3 ->
				{
					System.out.println("Introduce la nueva Fecha de nacimiento(dd/MM/yyyy)");
					String fnacimiento = sc.nextLine();
					socios[contador].setFechaNacimiento(fnacimiento);
				}
				case 4 ->
				{
					System.out.println("Introduce el nuevo telefono");
					String telefono = sc.nextLine();
					socios[contador].setTelefono(telefono);
				}
				case 5 ->
				{
					System.out.println("Introduce el nuevo correo electrónico");
					String correo = sc.nextLine();
					socios[contador].setCorreoElectronico(correo);
				}
				// En caso de que se pase de rango
				default ->
				{
					System.out.println("Has introducido un numero fuera del rango del menu, intentalo de nuevo");
				}

				}
			}

		}
	}

	// Baja de socio
	public static void bajaSocio()
	{

		Scanner sc = new Scanner(System.in);
		if (socios.length == 0)
		{
			System.out.println("No hay socios registrados\n");
			// El return es para acabar y no siga al siguiente if
			return;
		}

		if (socios != null)
		{
			System.out.println("Socios dados de alta en el club : ");

			for (int j = 0; j < socios.length; j++)
			{
				if (socios[j] != null)
				{
					System.out.println(socios[j]);
				}
			}

			System.out.println("Dime el numero de identificacion del Socio: ");
			int num = sc.nextInt();

			for (int i = 0; i < socios.length; i++)
			{
				if (num == socios[i].getNumeroSocio() && socios[i] != null)
				{
					socios[i] = null;
					System.out.println("El socio ha sido borrado con exito");

				}
				// En caso de que se equivoque de numero
				else
				{
					System.out.println("No existe un socio con ese numero de identificacion");
				}
			}

		}
	}
}

package Ficheros;

import java.time.LocalDate;
import java.util.*;



//inputStringReader i=newinputStreamReader()

public class Registro {

	public static void main(String[] args) {
//Creamos el escaner y preguntamos de cuantos clientes querría poner como limite
		Scanner jon=new Scanner(System.in);
		System.out.println("Cuantos clientes desea registrar como maximo?"); 
		int espacio_registro=jon.nextInt();
//Creamos un Array que será nuestro registro y tendra el tamaño que hemos elegido
		Socio []registro= new Socio[espacio_registro];
//Creamos el menú usando una variable como parametro
		int i=0;
		
		while(i!=6) {
			i=menu(i);
			menu2(registro,espacio_registro,i);
		} 
	}
	public static int menu(int i) {
		Scanner jon=new Scanner(System.in);
		System.out.println("1-Listar clientes");
		System.out.println("2-Gestionar alta");
		System.out.println("3-Gestionar baja");
		System.out.println("4-Modificar datos");
		System.out.println("5-Listado alfabetico nombres");
		System.out.println("6-Listado por antiguedad");
		System.out.println("7-Salir del registro");
		i=jon.nextInt();
		return i;
	}
	public static void menu2(Socio [] registro,int espacio_registrado,int i ) {
		if(i==1) {listarCliente(registro,espacio_registrado);}
		else if(i==2) {gestionarAlta(registro, espacio_registrado);}
		else if(i==3) {gestionarBaja(registro,espacio_registrado);}
		else if(i==4) {modificarDato(registro,espacio_registrado);}
		else if(i==5) {listarNombre(registro,espacio_registrado);}
		else if(i>=6) {System.out.println("Usted ha seleccionado irse del registro, que tenga un buen dia.");}
		
	}
//Creamos el metodo que nos permitirá mostrar todos los clientes gaurdados en el registro
	public static void listarCliente(Socio [] registro, int espacio_registrado) {
		if(espacio_registrado==0) {
			System.out.println("Esta vacio el registro");
		}else
		for (int colocar = 0; colocar < espacio_registrado; colocar++) {
			if (registro [colocar]!= null) {
				System.out.println(registro[colocar].toString()); 
			}
		}
	}
//Creamos el metodo que nos permitirá crear nuevos clientes dentro del registro
	public static Socio [] gestionarAlta(Socio [] registro, int espacio_registrado) {
		Scanner jon = new Scanner(System.in);
		int i = 0;
		for (int colocar = 0; colocar < espacio_registrado && i != 1; colocar++) {
			if (registro[colocar] == null) {
			System.out.println("Nombre del cliente: ");
			String nombre = jon.next();
		
			System.out.println("Telefono del cliente: ");
			int telefono = jon.nextInt();
			while (telefono < 100000000 || telefono > 999999999) {
			      System.out.print("Por favor, ingrese un número de teléfono con 9 dígitos: ");
			      
				telefono = jon.nextInt();
			    }
			jon.nextLine();
		    
			
			
			System.out.println("Direccion del cliente: ");
			String direccion = jon.nextLine();
			while(direccion.endsWith("@gmail.com")==false) {
				System.out.println("No termina el @gmail.com");
				direccion=jon.next();
			}
			
			
			System.out.println("Fecha de nacimiento del cliente: /t RECUERDE NO METER NUMEROS NEGATIVOS");
			System.out.println("");
			System.out.println("Introduzca el dia");
			int dia_n = jon.nextInt();
			System.out.println("Introduzca el mes");
			int mes_n = jon.nextInt();
			System.out.println("Introduzca el año");
			int año_n = jon.nextInt();
			//------------------------------
			LocalDate fecha_nac=LocalDate.of(año_n,mes_n,dia_n );
			

			LocalDate fecha_alta=LocalDate.now();
			//------------------------------
			

			registro [colocar] = new Socio(nombre,telefono,direccion,fecha_nac,fecha_alta, colocar);
			
			System.out.println("El codigo del nuevo cliente es: " + registro[colocar].getNUM_SOCIO());
			System.out.println();
			
			i++;
			}
			else if (registro[espacio_registrado - 1] != null){
				System.out.println("El registro esta lleno");
			}
		}
		return registro;
	}
//Creamos el metodo gestionarBaja que nos permitirá eliminar a ese cliente del registro
	public static void gestionarBaja (Socio [] registro, int espacio_registrado) {
		Scanner jon=new Scanner(System.in);
		
		System.out.println("Dime el codigo del cliente que quieres borrar");
		int cod_cliente = jon.nextInt();
			
			if (cod_cliente >= espacio_registrado || cod_cliente < 0 || registro[cod_cliente] == null ||  registro[cod_cliente] == null) {
				System.out.println("No hay libros con ese codigo");
			}else {
				registro[cod_cliente]=null;
				System.out.println("El cliente ha sido borrado");
			}
	}
//Creamos el metodo modificarDato para cambiar los datos en cambio de equivocarnos
	public static void modificarDato(Socio [] registro, int espacio_registrado) {
		Scanner jon =new Scanner(System.in);
		
		System.out.println("Codigo del cliente: ");
		int o = jon.nextInt();
		for (int i = 0; i < espacio_registrado; i++) {
			
			if (o == i && registro[o] != null) {
				 System.out.println("Nombre del cliente: ");
				 registro[o].setNombre(jon.next());
				 jon.nextLine();
				 
				 System.out.println("Telefono del cliente: ");
				 int telefono = jon.nextInt();
				 while (telefono < 100000000 || telefono > 999999999) {
				      System.out.print("Por favor, ingrese un número de teléfono con 9 dígitos: ");
				      
					telefono = jon.nextInt();
				    }
				 registro[o].setTelefono(telefono);
				 jon.nextLine();
				 
				 System.out.println("Direccion del cliente: ");
				 String direccion = jon.nextLine();
				 while(direccion.endsWith("@gmail.com")==false) {
						System.out.println("no termina el gmail");
						direccion=jon.next();
					}
				 registro[o].setDireccion(direccion);
				 
				 
				 System.out.println("Fecha de nacimiento del cliente: /t RECUERDE NO METER NUMEROS NEGATIVOS");
					System.out.println("");
					System.out.println("Introduzca el dia");
					int dia_n = jon.nextInt();
					System.out.println("Introduzca el mes");
					int mes_n = jon.nextInt();
					System.out.println("Introduzca el año");
					int año_n = jon.nextInt();
					LocalDate fecha_nac=LocalDate.now();
				 registro[o].setFecha_nac(fecha_nac);
				 jon.nextLine();
				 
				 System.out.println("Fecha de alta del cliente: /t RECUERDE NO METER NUMEROS NEGATIVOS");
					System.out.println("");
					System.out.println("Introduzca el dia");
					int dia = jon.nextInt();
					System.out.println("Introduzca el mes");
					int mes = jon.nextInt();
					System.out.println("Introduzca el año");
					int año = jon.nextInt();
					LocalDate fecha_alta=LocalDate.now();
				 registro[o].setFecha_alta(fecha_alta);
				 
			}
		}
	}
	public static void listarNombre(Socio [] registro,int espacio_registrado) {
		ComparaNombre cn= new ComparaNombre();
		Arrays.sort(registro,cn);
		listarCliente(registro,espacio_registrado);
		}
}

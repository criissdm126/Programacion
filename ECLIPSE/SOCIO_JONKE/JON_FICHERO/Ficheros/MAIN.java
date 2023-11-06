package Ficheros;

import java.io.BufferedReader;
//PARA VER LOS COMENTARIOS BAJE ABAJO DE TODO EL CODIGO, GRACIAS.
//1.
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;


public class MAIN {//ABRIMOS CLASE	
 

	public static void main(String[] args){//ABRIMOS STATIC VOID MAIN
		
		Socio[] registro = new Socio[0];
		
		info(registro);
		
		menu(registro);
		
		guardadoAlRegistro(registro);
	}//CERRAMOS STATIC VOID MAIN

//EXPLICACION
/*En este primer public static void main se realizara 4 acciones:
 * 
 * -Crear un array: Para recoger todos los clientes/socios que queramos añadir a nuestro registro.Esta coleccion esta vacia hasta que añadamos
 *  
 *  un cliente, de ahi que al final aparezca [0];
 *  
 * -Invocamos el metodo info: Para definir que todo el contenido que creemos lo vincularemos al fichero de texto que hemos llamado registro, 
 *  
 *  es decir, que todos los objetos que vayammos creando se irán añadiendo al dichero.
 *  
 * -Invocamos al metodo menu: Este metodo sirve para que elijamos las ditintas opciones que nos ofrecen, como es dar de alta a un cliente(Crear
 * 
 *  un objeto), darle de baja(Borrar un objeto), modificar los clientes o listarlos segun su antiguedad, por nombre, etc...
 *  
 * -Invocamos al metodo guardadoAlRegistro: Para subir todo los objetos que hemos creado y guardado en el array registro al fichero y cerrar esa 
 *  
 *  vinculacion que creamos en el metodo info para que no se introduzcan mas objetos (informacion) en el fichero. 
 */

	
	
	
	                                                               //METODOS
	
	
	
	
//---------------------------------------------------------------METODO LISTAR ALTA------------------------------------------------------------------------------------------------------
public static void gestionarAlta (Socio [] registro) {//ABRIR GESTIONARALTA
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		boolean error = false;
		String nombre = recogerNombre();
		int telefono = recogerTelefono(registro);
		String direccion = recogerDireccion(registro);
		LocalDate fechaAlta = LocalDate.now();
		
		int dia = recogerDia();
		int mes = recogerMes(dia);
		int anno = recogerAnno();
		LocalDate fechaNacimiento = LocalDate.of(anno, mes, dia);
		
		Familia [] familiar = new Familia[0];
		
		System.out.println("Si tiene familiares tecle 1 \t||\tEn caso de no tener pulse 2");
		int numero = 0;
		do {//ABRIR DO
			try {//ABRIR TRY
				numero = Integer.parseInt(br.readLine());
				if (numero == 1) {//ABRIR IF
					System.out.println("Cuantos familiares tiene?");
					int familiares = Integer.parseInt(br.readLine());
					
					for (int i = 0; i < familiares; i++) {//ABRIR FOR
						String n = recogerNombre();
						int dia_1 = recogerDia();
						int mes_1 = recogerMes(dia);
						int anno_1 = recogerAnno();
						LocalDate nacimiento = LocalDate.of(dia_1, mes_1, anno_1);
												
						familiar = Arrays.copyOf(familiar, familiar.length + 1);
						
						familiar[i] = new Familia(n,nacimiento);
						
					}//CERRAR FOR
				
				}//CERRAR IF
				error = false;
				
			}//CERRAR TRY
			catch (IOException cajon) {//ABRIR CATCH
				System.out.println("ERROR : error en la lectura de datos");
				System.out.println("Si tiene familiares tecle 1 \\t||\\tEn caso de no tener pulse 2");
				error = true;
			}//CERRAR CATCH
			catch (NumberFormatException number) {//ABRIR CATCH
				System.out.println("ERROR : error en la lectura de datos");
				System.out.println("Si tiene familiares tecle 1 \\t||\\tEn caso de no tener pulse 2");
				error = true;
			}//CERRAR CATCH
		}//CERRAR DO
		while(error != false);	
		
		int i = 0;
		for (int colocar = 0; colocar < registro.length && i != 1; colocar++) {//ABRIR FOR
			
			if (registro[colocar] == null) {//ABRIR IF
				
				if(numero == 2) {//ABRIR IF
					registro[colocar] = new Socio(colocar, nombre, fechaNacimiento, fechaAlta, telefono, direccion);
					System.out.println("Codigo cliente a nombre de: "+nombre+" es: "+ registro[colocar].getNum_Socio());
					System.out.println();
				}//CERRAR IF
				else {//ABRIR ELSE
					registro[colocar] = new Socio(colocar, nombre, fechaNacimiento, fechaAlta, telefono, direccion, familiar);
					System.out.println("Codigo cliente a nombre de: "+nombre+" es: "+ registro[colocar].getNum_Socio());
					System.out.println();
				}//CERRAR ELSE
				i++;
			}//CERRAR IF
			
			else if (registro[registro.length - 1] != null){//ABRIR ELSE IF

				if (numero == 2) {//ABRIR IF
					registro = Arrays.copyOf(registro, registro.length + 1);
					registro[colocar + 1] = new Socio(colocar, nombre, fechaNacimiento, fechaAlta, telefono, direccion);
					System.out.println("Codigo cliente a nombre de:  "+nombre+" es: "+ registro[colocar + 1].getNum_Socio());
				}//CERRAR IF
				else {//ABRIR ELSE
					registro = Arrays.copyOf(registro, registro.length + 1);
					registro[colocar + 1] = new Socio(colocar, nombre, fechaNacimiento, fechaAlta, telefono, direccion, familiar);
					System.out.println("Codigo cliente a nombre de: "+nombre+" es: "+ registro[colocar + 1].getNum_Socio());
				}//CERRAR ELSE
				i++;
			}//CERRAR ELSE IF
		}//CERRAR FOR
	}//CERRAR GESTIONARALTA
	
//EXPLICACION
/*Este metodo es el primero y mas importante, con este metodo generaralta, nos permitira crear un objeto de clase socio al cual le podremos 
 * 
 * añadir valor a sus atributos. Para ello declaramos el InputStreamReader y el BufferedReader que sustituyen al clasico Scanner y los atributos

 * del objeto junto a un booleano que usaremos como bucle a la hora de ver si los valores de los atributos son los correctos o no(En caso de que 
 * 
 * no sean, dichas excepciones seran capturadas en los distintos catch). Hay un atributo como es fechaNacimiento que está formada por 3 variables
 * 
 * de tipo int, para ello el atributo será de tipo LocalDate para agrupar las variables dia, mes y anno en una sola y asi recoger la fecha completa.
 * 
 * Luego creamos un array de clase Familia para recoger los atributos de los familiares que compongan al socio, ya que puede no tener familiares o
 * 
 * tener mas de uno. Luego de esto creamos un for para recorrer el array de socios y creamos varios condicioanles para ver y buscar en caso que este 
 * 
 * vacio(null) o no, en este ultimo caso ira a otro condicional y si el numero que le hemos pasado por parametro es por ejemplo 2 redimensionara el 
 * 
 * array de socio y añadira los atributos que le hemos definido antes,pero sin el atributo de tipo objeto Familia y mostrara el codigo del nuevo cliente.
 * 
 * En caso contrario de elegir e introducir el valor 2 para numero, hara los mismo que la opcion 1, pero añadiendo el array de objeto Familia que le hemos
 * 
 * atribuido y tambien mostrara el codigo. Y por ultimo una variable que hemos declarado como i, se irá incrementando según la cantidad de clientes que 
 * 
 * creemos, este con el proposito de ir redimensionando el array y creando distintos objetos de tipos socios, con familiares o sin familiares.
 * 
 * */
	
	 


                                                       //METODO DE RECOGIDA DE NUEVOS DATOS
	

	


																		//FECHAS
	




//--------------------------------------------------------------------METODO DIA-----------------------------------
public static int recogerDia () {//ABRE METODO RECOGERDIA
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	
	boolean error = false;
	
	System.out.println("Introduzca el dia de nacimiento: ");
	int dia = 0;
	do {//ABRE DO
		try {//ABRE TRY
			dia = Integer.parseInt(br.readLine());
			if (dia > 31 || dia < 1) {//ABRE IF
			error = true;
			System.out.println("Al mes hay max. 31 dias y no hay dias negativos, es decir, desde el dia 1 al 31");
			System.out.println();
				}//CIERRA IF
			else {//ABRE ELSE
				error = false;
			}//CIERRA ELSE
			
		}//CIERRA TRY
		catch (IOException cajon) {//ABRE CATCH
			System.out.println("ERROR : error en la lectura de datos");
		}//CIERRA CATCH
		catch (NumberFormatException number) {//ABRE CATCH
			System.out.println("ERROR : error en la lectura de datos");
			error = true;
		}//CIERRA CATCH
		
		
	}//CIERRA DO
	while(error != false);
	return dia;
}//CIERRA METODO RECOGERDIA

//EXPLICACION
/*Este metodo lo vamos a utilizar para recoger el valor de la variable int dia. Para ello comenzamos declarando el 
 * 
 * inputStreamReader y el BufferedReader, luego declaramos un booleano que usaremos para crear un bucle que se repetira
 * 
 * hasta que nos den el valor que queremos, en caso de que no ocurra ira a las capturas de excepciones en la cual puede ir a
 * 
 * la captura cajon que recoge cualquier excepcion o al number en caso de ser una excepcion numerioca.
 */





//--------------------------------------------------------------------------METODO MES------------------------------------------------------------------------------------
public static int recogerMes(int dia) {//ABRE RECOGERMES
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	
	boolean error = false;
	System.out.println("Introduzca el mes de nacimiento: ");
	int mes = 0;
	do {//ABRE DO
		error = false;
		
		try {//ABRE TRY
			mes = Integer.parseInt(br.readLine());
			
			if (mes > 12 && mes < 1) {//ABRE IF
				error = true;
			}//CIERRA IF
			else {//ABRE ELSE
				if ((mes == 2 && dia > 28) || ((mes == 4 || mes == 6 || mes == 8 || mes == 11) && dia > 30)) {//ABRE IF
					error = true;
				}//CIERRA IF
				else {//ABRE ELSE
					error = false;
				}//CIERRA ELSE
			}//CIERRA ELSE
			
		}//CIERRA TRY
		catch (IOException cajon) {//ABRE CATCH
			System.out.println("ERROR : error en la lectura de datos");
		}//CIERRA CATCH
		catch (NumberFormatException number) {//ABRE CATCH
			System.out.println("ERROR : error en la lectura de datos");
			error = true;
		}//CIERRA CATCH
	}//CIERRA DO
	while(error != false);
	return mes;
}//CIERRA RECOGERMES

//EXPLICACION
/*Este metodo lo vamos a utilizar para recoger el valor de la variable int mes. Para ello comenzamos declarando el 
 * 
 * inputStreamReader y el BufferedReader, luego declaramos un booleano que usaremos para crear un bucle que se repetira
 * 
 * hasta que nos den el valor que queremos dentro del try y tambien dentro del condicional, el cual declaramos que
 * 
 * hay meses como febrero que será el mes 2, pero tendra 28 dias, que los meses 4, 6, 8 y 11 tendran 30 dias . En caso 
 * 
 * de que el valor no sea el que queramos, ira a las capturas de excepciones en la cual puede ir a
 * 
 * la captura cajon que recoge cualquier excepcion o al number en caso de ser una excepcion numerioca.Si el resultado es
 * 
 * correcto devolverá el valor que queremos para mes.
 * */





//-----------------------------------------------------------------METODO ANNO-----------------------------------------------------------
public static int recogerAnno() {//ABRE RECOGERANNO
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	
	boolean error = false;
	System.out.println("Introduzca el año de nacimiento: ");
	int anno = 0;
	do {//ABRIR DO
		error = false;
		
		try {//ABRIR TRY
			anno = Integer.parseInt(br.readLine());
			
			if (anno > 2000 && anno < 1000) {//ABRIR TRY
				error  = true;
			}//CERRAR IF
			else {//ABRIR ELSE
				error = false;
			}//CERRAR ELSE
			
		}//CERRAR TRY
		catch (IOException cajon) {//ABRIR CATCH
			System.out.println("ERROR : error en la lectura de datos");
		}//CERRAR CATCH
		catch (NumberFormatException number) {//ABRIR CATCH
			System.out.println("ERROR : error en la lectura de datos");
			error = true;
		}//CERRAR CATCH
	}//CERRAR DO
	while(error != false);
	return anno;
}//CERRAR RECOGERANNO
	
//EXPLICACION
/*Este metodo lo vamos a utilizar para recoger el valor de la variable int anno. Para ello comenzamos declarando el 
 * 
 * inputStreamReader y el BufferedReader, luego declaramos un booleano que usaremos para crear un bucle que se repetira
 * 
 * hasta que nos den el valor que queremos, que estara guardado en el try y en el if , el cual ponemos como condicion que 
 * 
 * anno tenga como valor un numero mayor a dos mil y menor a 1000. En caso de que el valor no sea el deseado ira a las capturas de excepciones en la cual puede ir a
 *
 * la captura cajon que recoge cualquier excepcion o al number en caso de ser una excepcion numerioca.Si el resultado es
 * 
 * correcto devolverá el valor que queremos para anno.
 * */
	
	



	                                               //EL RESTO DE RECOGIDAS
	




//-----------------------------------------------------METODO RECOGERNOMBRE-----------------------------------------------------
public static String recogerNombre() {//ABRIR RECOGERNOMBRE	
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	
	System.out.println("Introduzca un nombre: ");
	String nombre = "";
	
	try {//ABRIR TRY
		nombre = br.readLine();
	}//CERRAR TRY
	catch (IOException cajon) {//ABRIR CATCH
		System.out.println("ERROR : error en la lectura de datos");
	}//CERRAR CATCH
	return nombre;
}//CERRAR RECOGERNOMBRE

//EXPLICACION
/*Este metodo lo vamos a utilizar para recoger el valor de la variable String nombre. Para ello comenzamos declarando el 
 * 
 * inputStreamReader y el BufferedReader, luego declaramos un booleano que usaremos para crear un bucle que se repetira
 * 
 * hasta que nos den el valor que queremos, en caso de que no ocurra ira a las capturas de excepciones en la cual ira a
 * 
 * la captura cajon que recoge cualquier excepcion.Si el resultado es
 * 
 * correcto devolverá el valor que queremos para nombre.
 * */




//-----------------------------------------------------METODO RECOGERTELEFONO-------------------------------------------
public static int recogerTelefono (Socio [] registro) {//ABRIR RECOGERTELEFONO
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	
	boolean error = false;
	System.out.println("Introduzca un Telefono: ");
	int telefono = 0;
	
	do {//ABRIR DO
		error = false;
		
		try {//ABRIR TRY
			telefono = Integer.parseInt(br.readLine());
			
			 if(600000000 <= telefono && 699999999 >= telefono){//ABRIR IF
				 for (int i = 0; i < registro.length && error != true; i++) {//ABRIR FOR
					if (registro[i]!= null && telefono == registro[i].getTelefono()) {//ABRIR IF
						error = true;
						System.out.println("Este telefono ya lo tiene un socio");
						System.out.println();
					}//CERRAR IF
					else {//ABRIR ELSE
						error = false;
					}//CERRAR ELSE
				}//CERRAR FOR
			 }//CERRAR IF
			 else {//ABRI ELSE
				 System.out.println("NOTA:El numero de telefono tiene nueve digitos y debe empezar con 6");
				 System.out.println();
				 error = true;
			 }//CERRAR ELSE
		}//CERRAR TRY
		catch (IOException cajon) {//ABRIR CATCH
			System.out.println("ERROR : error en la lectura de datos");
		}//CERRAR CATCH
		catch (NumberFormatException number) {//ABRIR CATCH
			System.out.println("ERROR : error en la lectura de datos");
			error = true;
		}//CERRAR CATCH
	}//CERRAR DO
	while(error != false);
	return telefono;
}//CERRAR TELEFONO

//EXPLICACION
/*
 * Este metodo lo vamos a utilizar para recoger el valor de la variable int telefono. Para ello comenzamos declarando el 
 * 
 * inputStreamReader y el BufferedReader, luego declaramos un booleano que usaremos para crear un bucle que se repetira
 * 
 * hasta que nos den el valor que queremos, que será un valor que empiece por 6 y que contenga nueve digitos. Tambien 
 * 
 * creamos la posibilidad que dicho numero ya lo tenga registrado un cliente, en caso de que no ocurra ira a las 
 * 
 * capturas de excepciones en la cual puede ir a la captura cajon que recoge cualquier excepcion o al number en caso
 * 
 * de ser una excepcion numerioca.Si el resultado es correcto devolverá el valor que queremos para telefono con las 
 * 
 * condiciones que le hemos impuesto.
 * */




//-----------------------------------------------------METODO RECOGERDIRECCION----------------------------------------------------
public static String recogerDireccion(Socio [] registro) {//ABRE RECOGERDIRECCION
	InputStreamReader is = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(is);
	
	boolean error = false;
	System.out.println("Introduzca la direccion: ");
	String direccion = "";
	
	do {//DO
		try {//ABRE TRY
			direccion = br.readLine();
		}//CIERRA TRY
		catch (IOException cajon) {//ABRE CATCH
			System.out.println("ERROR : error en la lectura de datos");
		}//CIERRA CATCH
		 
		error = false; 

		if(direccion.length() > 10 && direccion.charAt(direccion.length() - 10) == '@' && direccion.charAt(direccion.length() - 9) == 'g' && direccion.charAt(direccion.length() - 8) == 'm' && 
		direccion.charAt(direccion.length() - 7) == 'a' && direccion.charAt(direccion.length() - 6) == 'i' && direccion.charAt(direccion.length() - 5) == 'l' && 
		direccion.charAt(direccion.length() - 4) == '.' && direccion.charAt(direccion.length() - 3) == 'c' && direccion.charAt(direccion.length() - 2) == 'o' && 
		direccion.charAt(direccion.length() - 1) == 'm') {//ABRE IF
			
			for (int i = 0; i < registro.length && error != true; i++) {//ABRE FOR
				if (registro[i]!= null && direccion.compareTo(registro[i].getDireccion()) == 0) {//ABRE IF
					error = true;
					System.out.println("Esta direccion ya tiene un cliente");
					System.out.println();
				}//CIERRA IF
				else {//ABRE ELSE
					error = false;
				}//CIERRA ELSE
			}//CIERRA FOR
		}//CIERRA IF
		else {//ABRE ELSE
			System.out.println("NOTA: la direccion tiene que acabar en @gmail.com");
			System.out.println();
			error = true;
		}//CIERRA ELSE
	}//CIERRA DO
	while(error != false);
	return direccion;
}//CIERRA RECOGERDIRECCION

//EXPLICACION
/*Este metodo lo vamos a utilizar para recoger el valor de la variable String direccion. Para ello comenzamos declarando el 
 * 
 * inputStreamReader y el BufferedReader, luego declaramos un booleano que usaremos para crear un bucle que se repetira
 * 
 * hasta que nos den el valor que queremos, con las condiciones que le indicamos en el if junto a la comparacion la direccion
 * 
 * 
 * si un cliente ya tiene esa direccion, ya que dos clientes no pueden tener la misma direccion. En este caso hemos usado char para que recoja 
 * 
 * caracter por caracter, pero una manera mas eficiente seria con endWith, que devolvera un booleano en caso de no ser correcto
 * 
 *  y seria de esta manera:
 *  
 *  while(direccion.endsWith("@gmail.com")==false) {
			System.out.println("No termina el @gmail.com");
			}
 *  
 * En caso de que no aplicar nuestras condiciones,ira a las capturas de excepciones en la cual sera la captura cajon que recoge cualquier 
 *
 * excepcion ,pero si el resultado es correcto devolverá el valor que queremos para direccion con las condiciones que le hemos impuesto.
 * */
	
	
	


//-----------------------------------------------------METODO GETIONARBAJA-------------------------------------------------------------------
public static void gestionarBaja(Socio [] registro) {//CERRAR GESTIONARBAJA
	
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	
	boolean error = false;	
	System.out.println("Dime el codigo del cliente que quieres borrar");
	int num = 0;
	do {//ABRIR DO
		try {//ABRIR TRY
			num = Integer.parseInt(br.readLine());
			
			if ((num < registro.length - 1 && num >= 0 && registro[num] != null)) {//ABRIR IF
				registro[num] = null;
				error = false;
			}//CERRAR IF
			else {//ABRIR ELSE
				System.out.println("No hay Clientes con el codigo seleccionado");
				error = true;
			}//CERRAR ELSE
		}//CERRAR TRY
		catch (IOException cajon) {//ABRIR CATCH
			System.out.println("ERROR : error en la lectura de datos");
		}//CERRAR CATCH
		catch (NumberFormatException number) {//ABRIR CATCH
			System.out.println("ERROR : error en la lectura de datos");
			error = true;
		}//CERRAR CATCH
	}//CERRAR DO
	while(error != false);
	//metodoBurbuja(registro, num);
}//CERRAR GESTONARBAJA

//EXPLICACION
/*Con este metodo podemos eliminar el objeto que elijamos, para ello contaremos con el InputStreamReader y el BufferedReader, y la 
 * 
 * variable booleana error para usar el siguiente bucle que recogera las excepciones en caso de que el try no se cumpla. En el try pasamos
 * 
 * el valor  que será el codigo del objeto que queremos borrar, luego pasamos por un condicional, el cual si el numero es menor al tamaño del
 * 
 * array -1 y el numero es mayor o igual a 0 y si el array del tamaño del numero es diferente de null(es decir, que no este vacio, porque si no
 * 
 * no borrara nada) el objeto que se encuentre en esa posicion se convertira en null, es decir en una posicon vacia de la coleccion Socio.
 * */
	
	/*	public static void metodoBurbuja(Socio [] arrays_Socios, int borrar_Socio) {
		int n = arrays_Socios.length;
	    for (int i = 0; i < n - 1; i++) {
	        for (int j = 0; j < n - i - 1; j++) {
	            if (arrays_Socios[j] == null) {
	                // Mover el elemento nulo a la última posición
	                Socio temp = arrays_Socios[j];
	                arrays_Socios[j] = arrays_Socios[n-1];
	                arrays_Socios[n-1] = temp;
	            } else if (arrays_Socios[j+1] == null || ((Comparable) arrays_Socios[j]).compareTo(arrays_Socios[j+1]) > 0) {
	                // intercambiar arr[j] y arr[j+1]
	                Socio temp = arrays_Socios[j];
	                arrays_Socios[j] = arrays_Socios[j + 1];
	                arrays_Socios[j + 1] = temp;
	            }
	        }
	    }
	    
	    arrays_Socios = Arrays.copyOf(arrays_Socios, arrays_Socios.length - 1);
	}*/
	
	
	
	


//-----------------------------------------------------------METODO MODIFICARDATO--------------------------------------------------------------	
public static void modificarDato(Socio [] registro) {//ABRIR MODIFICARDATO
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	
	boolean error = false;
	System.out.println("Codigo del Cliente: ");
	int cod_Socio = 0;
	do {//ABRIR DO
		try {//ABRIR TRY
			cod_Socio = Integer.parseInt(br.readLine());
			
			for (int i = 0; i < registro.length; i++) {//ABRIR FOR
				
				if (cod_Socio == i && registro[cod_Socio] != null) {//ABRIR IF
					
					System.out.println("Introduzca el nombre;");
					String nombre = br.readLine();
					registro[cod_Socio].setNombre(nombre);
					
					System.out.println("Introduzca la direccion");
					String direccion = br.readLine();
					String subcadena = direccion.substring(direccion.length() - 10, direccion.length() - 1);
					if(direccion.charAt(direccion.length() - 10) == '@' && direccion.charAt(direccion.length() - 9) == 'g' && direccion.charAt(direccion.length() - 8) == 'm' && 
					direccion.charAt(direccion.length() - 7) == 'a' && direccion.charAt(direccion.length() - 6) == 'i' && direccion.charAt(direccion.length() - 5) == 'l' && 
					direccion.charAt(direccion.length() - 4) == '.' && direccion.charAt(direccion.length() - 3) == 'c' && direccion.charAt(direccion.length() - 2) == 'o' && 
					direccion.charAt(direccion.length() - 1) == 'm') {//ABRIR IF
						
						for (int j = 0; j < registro.length && error != true; j++) {//ABRIR FOR
							if (registro[j]!= null && direccion.compareTo(registro[i].getDireccion()) == 0) {//ABRIR IF
								error = true;
								System.out.println("Esta direccion ya tiene un socio");
								System.out.println();
							}//CERRAR IF
							else {// ABRIR ELSE
								registro[cod_Socio].setDireccion(direccion);
								error = false;
							}//CERRAR ELSE
						}//CERRAR FOR
					}//CERRAR IF
					else {//ABRIR ELSE
						System.out.println("NOTA: la direccion tiene que acabar en @gmail.com");
						System.out.println();
						error = true;
					}//CERRAR ELSE
					
					int telefono = Integer.parseInt(br.readLine());
					if(600000000 <= telefono && 699999999 >= telefono){//ABRIR IF
						 for (int k = 0; k < registro.length && error != true; k++) {//ABRIR FOR
							if (registro[k]!= null && telefono == registro[k].getTelefono()) {//ABRIR IF
								error = true;
								System.out.println("Este telefono ya lo tiene un socio");
								System.out.println();
							}//CERRAR IF
							else {//ABRIR ELSE
								registro[cod_Socio].setTelefono(telefono);
								error = false;
							}//CERRAR ELSE
						}//CERRAR FOR
					 }//CERRAR IF
					 else {//ABRIR ELSE
						 System.out.println("NOTA:El numero de telefono tiene nueve digitos");
						 System.out.println();
						 error = true;
					 }//CERRAR ELSE
					
					int dia = recogerDia();
					int mes = recogerMes(dia);
					int anno = recogerAnno();
					LocalDate fechaNacimiento = LocalDate.of(anno, mes, dia);
					registro[cod_Socio].setFecha_Nac(fechaNacimiento);
					
					System.out.println("Se modifico la informacion del cliente " + registro[cod_Socio].getNombre());
				}//CERRAR IF
			}//CERRAR FOR
		}//CERRAR TRY
		catch (IOException cajon) {//ABRIR CATCH
			System.out.println("ERROR : error en la lectura de datos");
		}//CERRAR CATCH
		catch (NumberFormatException number) {//ABRIR CATCH
			System.out.println("ERROR : error en la lectura de datos");
			error = true;
		}//CERRAR CATCH
	}//CERRAR DO
	while(error != false);	
}//CERRAR MODIFICARDATO
	
//EXPLICACION
/*Este metodo sirve para modificar un objeto de tipo socio que ya hayamos creado, para ello volvemos a declarar 
 *
 * InputStreamReader y el BufferedReader junto a la variable booleana que usaremos apra repetir el bucle en caso de 
 * 
 * encontrar una excepcion. Para ello pedimos un numero que sera la posicion en la que se encuentre el objeto que
 * 
 * queremos modificar, luego, con un for realizaremos la busqueda por el array . Una vez que hemos encontrado el objeto 
 * 
 * le podremos modificar todos los atributos, en caso de que queremos modificar un atributo se podria crear metodos de 
 * 
 * tipo static void en los cuales al llamarlos ya este modificado el atributo, en este caso he decido ponerlo junto, y en
 * 
 * la modificacion de la direccion el if que viene dado con la condicion de varios char, se puede sustituir por el endsWith
 * 
 * que mencione en el metodo de recogerDireccion donde pongo el ejemplo. Se me olvido mencionar que para modificar un atributo 
 * 
 * hay que usar el set.atributo para poder cambiarlo.
 * */
	
	
	


//--------------------------------------------------------METODO LISTARNOMBRE----------------------------------------------------------------
public static void listarNombre(Socio [] registro) {//ABRIR LISTARNOMBRE
	
	ComparaNombre cn = new ComparaNombre ();
	
	Arrays.sort(registro, cn);
	
	for (int i = 0; i<registro.length; i++) {//ABRIR FOR
		System.out.println(registro[i]);
	}//CERRAR FOR
	System.out.println();
}//CERRAR LISTARNOMBRE

//EXPLICACION
/*Este metodo mostrara la pantalla una lista ordenada de los clientes que hemos creado y los ordenara por su nombre de manera alfabeticamente.
 *
 *Para ello invocamos el comparator de nombre que lo hemos llamado ComparaNombre que ya ordena cada objeto por objeto por su nombre. Luego hacemos
 *
 *uso del Arrays.sort para ordenar el array junto con el comparator y luego con el for vamos recorriendo el array mostrandolo por la pantalla 
 *
 *ya ordenado.
 * */
	
	



	
//----------------------------------------------------------------METODO LISTARANTIGUEDAD-----------------------------------------------------------
public static void listarAntiguedad(Socio [] registro) {//ABRIR LISTARANTIGUEDAD
	
	ComparaAntiguedad ca = new ComparaAntiguedad ();

	Arrays.sort(registro, ca);
	
	for (int i = 0; i<registro.length; i++) {//ABRIR FOR
		System.out.println(registro[i]);
	}//CERRAR FOR
	System.out.println();
}//CERRAR LISTARANTIGUEDAD
	
//EXPLICACION
/*Este metodo mostrara la pantalla una lista ordenada de los clientes que hemos creado y los ordenara por su antiguedad en el registro .
*
*Para ello invocamos el comparator de antiguedad que lo hemos llamado ComparaAntiguedad que ya ordena cada objeto por objeto por su antiguedad. 
*
*Luego hacemos uso del Arrays.sort para ordenar el array junto con el comparator y luego con el for vamos recorriendo el array mostrandolo por la pantalla 
*
*ya ordenado.
* */	
	
	
	


//-------------------------------------------------------------------------METODO LISTARFAMILIA-----------------------------------------------------------------------
public static void listarFamilia(Socio [] registro) {//ABRIR LISTARFAMILIA
	
	ComparaFamilia cf = new ComparaFamilia ();
	
	Arrays.sort(registro);
	
	for (int i = 0; i<registro.length; i++) {//ABRIR FOR
		System.out.println(registro[i]);
	}//CERRAR FOR
	System.out.println();
}//CERRAR LISTARFAMILIA

//EXPLICACION
/*/*Este metodo mostrara la pantalla una lista ordenada de los clientes que hemos creado y sus familiares en caso de tener y 
 * 
 * los ordenara por su edad en el registro. Para ello invocamos el comparator de familia que lo hemos llamado ComparaFamilia
 * 
 * que ya ordena cada objeto por objeto por su edad. Luego hacemos uso del Arrays.sort para ordenar el array junto con el 
 * 
 * comparator y luego con el for vamos recorriendo el array mostrandolo por la pantalla ya ordenado.
 * */
	
	
	


//---------------------------------------------------------------------------METODO LISTARCLIENTES--------------------------------------------------------------------
public static void listarClientes(Socio [] registro) {//ABRIR LISTARCLIENTES
	if(registro.length == 0) {//ABRIR IF
		System.out.println("Esta vacio el registro");
	}//CERRAR IF
	else {//ABRIR ELSE
	for (int colocar = 0; colocar < registro.length; colocar++) {//ABRIR FOR
		if (registro [colocar]!= null) {//ABRIR IF
			System.out.println(registro[colocar].toString()); 
			}//CERRRAR IF
		}//CERRAR FOR
	}//CERRAR ELSE
}//CERRAR LISTARCLIENTES
	
//EXPLICACION
/*Este metodo permite mostrar en pantalla todos los objetos creados en la coleccion registro, todo gracias al condicional.Si 
 *
 *el tamaño de la coleccion es igual a 0 quiere decir que la coleccion esta vacia, por lo tanto mostrará por pantalla que el 
 *
 *registro esta vacio, en caso contrario (querra decir que el registro tiene informacion de objetos) usaremos el for para 
 *
 *mostrar por pantalla el contenido.
 * */
	
	
	


	                                                             //MENU
	
	



//-------------------------------------------------------------METODO MENU--------------------------------------------------------------------	
	public static void menu (Socio [] registro) {//ABRIMOS METODO MENU
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		int num_menu = 0;
		do {//ABRIMOS DO 
			
			System.out.println("1- Gestionar alta");
			System.out.println("2- Gestionar baja");
			System.out.println("3- Modificar datos");
			System.out.println("4- Mostrar la lista  de clientes por nombre");
			System.out.println("5- Mostrar la lista de clientes por fecha de alta");
			System.out.println("6- Mostrar la lista de clientes y sus familiares por su edad");
			System.out.println("7- Mostrar la lista de clientes");
			System.out.println("8- Salir del programa");
			try {
				num_menu = Integer.parseInt(br.readLine());
				 
				if (num_menu == 1) {//ABRIMOS IF
					gestionarAlta(registro);
				}//CERRAMOS IF
				else if (num_menu == 2) {//ABRIMOS ELSE IF
					gestionarBaja(registro);
				}//CERRAMOS ELSE IF
				else if (num_menu == 3) {//ABRIMOS ELSE IF
					modificarDato(registro);
				}//CERRAMOS ELSE IF
				else if (num_menu == 4) {//ABRIMOS ELSE IF
					listarNombre(registro);
				}//CERRAMOS ELSE IF
				else if (num_menu == 5) {//ABRIMOS ELSE IF
					listarAntiguedad(registro);
				}//cERRAMOS ELSE IF
				else if (num_menu == 6) {//ABRIMOS ELSE IF
					listarFamilia(registro);
				}//CERRAMOS ELSE IF
				else if (num_menu == 7) {//ABRIMOS ELSE IF
					listarClientes(registro);
				}//CERRAMOS ELSE IF
				else if (num_menu == 8) {//ABRIMOS ELSE IF
					System.out.println("Se ha salido del menú y se guardo en el fichero registro");
				}//CERRAMOS ELSE
				else {//ABRIMOS ELSE
					System.out.println("Te equivocaste, prueba otra vez");
				}//CERRAMOS ELSE
			
			}//CERRAMOS TRY
			catch (IOException cajon) {//ABRIMOS CATCH
				System.out.println("ERROR : error en la lectura de datos");
			}//CERRAMOS CATCH
			catch (NumberFormatException number) {//ABRIMOS CATCH
				System.out.println("ERROR : error en la lectura de datos");
			}//CERRAMOS CATCH
		}//CERRAMOS DO
		while(num_menu != 8); 
	}//CERRAMOS METODO MENU

	
	
	
	
                                                                    //FICHEROS	
	

	
	
//---------------------------------------------------------------METODO INFO-----------------------------------------------------------------	
	
public static void info (Socio [] registro) {//ABRIMOS METODO INFO
		
		try (ObjectInputStream oi = new ObjectInputStream(new FileInputStream("registro"))){//ABRIMOS TRY
			
			registro = (Socio[]) oi.readObject();
			
			for (int i = 0; i<registro.length; i++) {//ABRIMOS FOR
				
				System.out.println(registro[i]);
			}//CERRAMOS FOR
			
		}//CERRAMOS TRY
		catch (IOException cajon) {//ABRIMOS CATCH
			
		}//CERRAMOS CATCH
		catch(ClassNotFoundException clase) {//ABRIMOS CATCH
			
	}//CERRAMOS CATCH
}//CERRAMOS METODO INFO

//EXPLICACION
/*Este metodo nos ayudará a pasar toda la informacion de los clientes (objetos) al fichero que lo hemos llamaado registro. Para ello
 
 * declaramos el ObjectInputStream para deserializar los  objetos escritos previamente usando un ObjectOutputStream que usaremos el otro metodo.

 * Si se genera alguna excepcion, los catch los capturaran siendo el IOException la captura de todos los errores o el ClassNotFoundException
 
 * si es un problema de clases.
 * */





//---------------------------------------------------------METODO GUARDADOALREGISTRO--------------------------------------------------------------
public static void guardadoAlRegistro (Socio [] arrays_Socios) {//ABRIR GUARDADOALREGISTRO
	
	ObjectOutputStream oop = null;
	
	try {//ABRIR TRY
		oop = new ObjectOutputStream(new FileOutputStream("Practica.dat"));
		
		oop.writeObject(arrays_Socios);
		
	}//CERRAR TRY
	catch(IOException cajon){//ABRIR CATCH
		System.out.println(cajon);
	}//CERRAR CATCH
	finally {//ABRIR FINALLY
		if (oop != null) {//ABRIR IF
			try {//ABRIR TRY
				oop.close();
			}//CERRAR TRY
			catch(IOException cajon){//ABRIR TRY
				System.out.println(cajon);
			}//CERRAR TRY
		}//CERRAR IF
	}//CERRAR FINALLY
}//CERRAR GUARDADOALREGISTRO

//EXPLICACION
/*Este metodo sirve para guardar y subir toda la informacion (clientes y sus familiares) al fichero "registro" y que se muestre. Para ello hemos creado

 * el ObjectOutputStream que no serviria si no hubiesemos invocado en el metodo anterior el ObjectInputStream para subirlo, luego hemos capturado las
 
 * excepciones y finalmente hemos cerrado el ObjectOutputStream para cerrar tanto el metodo como la psoibilidad de meter informacion en el fichero.
 * */
}//CERRAMOS CLASE
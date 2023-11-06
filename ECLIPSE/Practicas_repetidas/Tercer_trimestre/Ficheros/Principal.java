package Ficheros;

import java.io.*;
import java.text.ParseException;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;
import java.text.SimpleDateFormat;

public class Principal {

    private static final String ARCHIVO = "Socios.bin";
    private static Socio[] socios = new Socio[0];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numuser = 7;
        cargarArchivo();

        do {
            try {
                menuSocios();

                switch (numuser = sc.nextInt()) {
                    case 1:
                        altaSocios();
                        break;
                    case 2:
                        modificarSocio();
                        break;
                    case 3:
                        bajaSocio();
                        break;
                    case 4:
                        listarPorAntiguedad();
                        break;
                    case 5:
                        listarPorNombre();
                        break;
                    case 6:
                        listarFamilia();
                        break;
                    default:
                        if (numuser != 0) {
                            System.out.println("Escribe un numero del menu");
                        }
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Caracter invalido, intentelo de nuevo");
                sc.nextLine();
            } catch (DateTimeParseException e) {
                System.out.println("No has escrito la fecha en el formato adecuado, intentelo de nuevo");
            }
        } while (numuser != 0);
        guardarArchivo();
        System.out.println("Saliendo del programa...");
    }

    // MÉTODO CARGAR SOCIO
    // Método para cargar los datos o crear el archivo binario y meter datos en caso de que no exista dicho archivo.

    private static void cargarArchivo() {

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(ARCHIVO))) {
            // Serializable: Se lee el array de socios del archivo
            socios = (Socio[]) in.readObject();
            Socio.setNumeroSocio(socios.length + 1);
            System.out.println("Se han cargado los socios correctamente");
        } catch (EOFException e) {
            System.out.println("No hay socios registrados en el archivo.");
        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el archivo. Se creara uno nuevo para guardar los socios.");
        } catch (IOException e) {
            System.out.println("Error de lectura: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Error al leer los socios del archivo: " + e.getMessage());
        }
    }

    // Guardar en archivo
    private static void guardarArchivo() {

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ARCHIVO))) {// Se escribe el array de socios en el archivo

            out.writeObject(socios);
            System.out.println("Los socios han sido guardados correctamente");
        } catch (IOException e) {
            System.out.println("Error de escritura: " + e.getMessage());
        }
    }

 // MENÚ SOCIO
    private static void menuSocios() {
        System.out.println("Programa de Gestion de Socios");
        System.out.println("1. Alta de Socio");
        System.out.println("2. Modificacion de Socio");
        System.out.println("3. Baja de socio");
        System.out.println("4. Lista ordenada por antigüedad de socio");
        System.out.println("5. Lista ordenada por nombre de socio");
        System.out.println("6. Lista de socios y familiares, esta ultima ordenada por nombre");
        System.out.println("0. Salir del programa");
    }
    
 // Alta de socio
    private static void altaSocios() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre del socio:");
        String nombre = sc.nextLine();

        // Validar fecha de nacimiento
        String fnacimiento = null;
        boolean fechaValida = false;
        while (!fechaValida) {
            System.out.println("Fecha de nacimiento del socio (dd/MM/yyyy), el dia debe estar comprendido entre 1 y 31, el mes entre 1 y 12 y el año hasta el año actual:");
            fnacimiento = sc.nextLine();
            fnacimiento = validarFecha(fnacimiento);
            fechaValida = true;
        }

        // Validar número de teléfono
        System.out.println("Telefono del socio:");
        String tlf = sc.nextLine();
        tlf = validarTelefono(tlf);

        // Validar correo electrónico
        System.out.println("Correo electronico del socio (debe terminar en @gmail.com):");
        String correo = sc.nextLine();
        correo = validarCorreo(correo);

        Socio nuevo = new Socio(nombre, fnacimiento, tlf, correo);

        socios = Arrays.copyOf(socios, socios.length + 1);
        socios[socios.length - 1] = nuevo;

     // Apartado familiares

        System.out.println("¿Cuantos familiares tiene el socio?");
        int num = sc.nextInt();

        sc.nextLine(); // Consumir el salto de línea

        if (num > 0) {
        	
            Familiar[] nuevosFamiliares = new Familiar[num];

            for (int i = 0; i < nuevosFamiliares.length; i++) {
                System.out.println("Introduzca el nombre del familiar numero " + (i + 1));
                String nfam = sc.nextLine();

                System.out.println("Introduzca el DNI del familiar numero " + (i + 1));
                String dniFamiliar = null;
                boolean dniFamiliarValido = false;
                while (!dniFamiliarValido) {
                    dniFamiliar = sc.nextLine();
                    if (dniFamiliar.length() == 8 && Character.isLetter(dniFamiliar.charAt(7))) {
                        
                    	// Validar que el DNI no se repita
                        boolean dniRepetido = false;
                        for (Familiar familiar : nuevosFamiliares) {
                            if (familiar != null && dniFamiliar.equals(familiar.getDni())) {
                                dniRepetido = true;
                                break;
                            }
                        }
                        if (!dniRepetido) {
                            dniFamiliarValido = true;
                        }
                        else {
                            System.out.println("El DNI ingresado ya existe. Vuelva a ingresarlo:");
                        }
                    }
                    else {
                        System.out.println("El DNI debe tener 7 numeros y 1 letra en mayuscula. Vuelva a ingresarlo:");
                    }
                }

                // Validar fecha de nacimiento del familiar
                String ffam = null;
                boolean fechaFamiliarValida = false;
                while (!fechaFamiliarValida) {
                    System.out.println("Introduzca la fecha de nacimiento del familiar (dd/MM/yyyy) número " + (i + 1));
                    ffam = sc.nextLine();
                    ffam = validarFecha(ffam);
                    fechaFamiliarValida = true;
                }

                nuevosFamiliares[i] = new Familiar(dniFamiliar, nfam, ffam);
            }

            socios[socios.length - 1].setFamilia(nuevosFamiliares);
        }

        // Mensaje de éxito y datos guardados
        System.out.println("Socio agregado con éxito, guardado con los siguientes datos:");
        System.out.println("Datos del socio: ");
        System.out.println("Nombre: " + nuevo.getNombre());
        System.out.println("Fecha de nacimiento: " + nuevo.getFechaNacimiento());
        System.out.println("Telefono: " + nuevo.getTelefono());
        System.out.println("Correo electronico: " + nuevo.getCorreoElectronico());

        /*if (num > 0) {
            System.out.println("Familiares:");
            for (int i = 0; i < socios.length; i++) {
                System.out.println("Familiar " + (i + 1) + ":");
                System.out.println("Nombre: " + socios[i].getNombre());
                System.out.println("DNI: " + socios[i].getDni());
                System.out.println("Fecha de nacimiento: " + socios[i].getFfnacimiento());
            }
        }*/
        }
    
        
    
    // MÉTODO PARA VALIDAR LA FECHA DE NACIMIENTO ESTE EN EL SIGUIENTE FORMATO: dd/MM/yyyy
    private static String validarFecha(String fecha) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        boolean fechaValida = false;

        while (!fechaValida) {
            try {
                sdf.parse(fecha);
                fechaValida = true;
            } catch (ParseException e) {
                System.out.println("Fecha incorrecta. Vuelva a ingresar la fecha (dd/MM/yyyy):");
                fecha = sc.nextLine();
            }
        }

        return fecha;
    }
    
 // MÉTODO PARA VALIDAR QUE EL NÚMERO DE TELÉFONO TIENE 9 DIGITOS, DEBE EMPEZAR POR 6,7 Ó 9
    private static String validarTelefono(String telefono) {
    	 Scanner sc = new Scanner(System.in);
         while (telefono.length() != 9 || !(telefono.startsWith("6") || telefono.startsWith("7") || telefono.startsWith("9"))) {
             System.out.println("El número de teléfono debe tener 9 dígitos y comenzar con 6, 7 o 9. Vuelva a ingresarlo:");
             telefono = sc.nextLine();
         }

         return telefono;
    }
    
    // MÉTODO PARA VALIDAR QUE EL CORREO ELECTRNICO ACABA EN:  @gmail.com
    private static String validarCorreo(String correo) {
        Scanner sc = new Scanner(System.in);
        while (!correo.endsWith("@gmail.com")) {
            System.out.println("El correo electronico debe terminar con @gmail.com. Vuelva a ingresarlo:");
            correo = sc.nextLine();
        }

        return correo;
    }


 // Lista por orden de fecha de alta
    private static void listarPorAntiguedad() {
        if (socios.length == 0) {
            System.out.println("No hay socios registrados");
        } 
        else {
        	OrdenarporFecha f = new OrdenarporFecha(); // Crear instancia del comparador OrdenarPorFecha
            Arrays.sort(socios, f); // Ordenar el array socios utilizando el comparador f
            System.out.println();
            
            for (int j = 0; j < socios.length; j++) {
                if (socios[j] != null) {
                    System.out.println(socios[j]);
                }
            }
        }
    }


 // Lista por orden ascendente del nombre del socio
    private static void listarPorNombre() {
        if (socios.length == 0) {
            System.out.println("No hay socios registrados");
        }
        else {
			
			OrdenarPorNombre n = new OrdenarPorNombre(); // Crear instancia del comparador OrdenarPorNombre
            Arrays.sort(socios, n); // Ordenar el array socios utilizando el comparador n
            System.out.println();
            
            for (int j = 0; j < socios.length; j++) {
                if (socios[j] != null) {
                    System.out.println(socios[j]);
                }
            }
        }
    }


 // Listado de familia por orden de edad
    private static void listarFamilia() {
        if (socios.length == 0) {
            System.out.println("No hay socios registrados");
        }
        else {
            System.out.println();
            
            for (int j = 0; j < socios.length; j++) {
                
            	// En caso de que tenga familiares se ordenará por edad, de lo contrario se mostrará sin cambios
                if (socios[j] != null && socios[j].getFamilia() != null) {
                    Arrays.sort(socios[j].getFamilia(), new FamiliaresPorEdad()); // Ordenar los familiares por edad
                    System.out.println(socios[j]);
                }
                else if (socios[j] != null) {
                    System.out.println(socios[j]);
                }
            }
        }
    }


 // Modificación de socio
    private static void modificarSocio() {
        Scanner sc = new Scanner(System.in);
        if (socios.length == 0) {
            System.out.println("No hay socios registrados");
        }
        else {
            System.out.println("Dime el numero del socio que quieres modificar");
            boolean valido = false;
            int contador = 0; // Posición del socio en el array
            int num = sc.nextInt();
            
            for (int i = 0; i < socios.length; i++) {
                
            	// Para evitar excepciones y encontrar el socio con el número correcto
                if (socios[i] != null && socios[i].getNumeroSocio() == num) {
                    valido = true;
                    contador = i;
                    break; // Se ha encontrado el socio, se puede salir del bucle
                }
            }
            if (valido) {
				
				System.out.println("¿Qué quieres modificar del socio numero: " + num);
                System.out.println("1. Modificar Nombre");
                System.out.println("2. Modificar Fecha de alta");
                System.out.println("3. Modificar Fecha de nacimiento");
                System.out.println("4. Modificar Telefono");
                System.out.println("5. Modificar Correo electronico");
                System.out.println("6. Eliminar familiar");

                int n = sc.nextInt();
                sc.nextLine(); // Consumir el salto de línea después del número
                
                switch (n) {
                    case 1 -> {
                        System.out.println("Introduce el nuevo nombre");
                        String nombre = sc.nextLine();
                        socios[contador].setNombre(nombre);
                        System.out.println("Nombre modificado exitosamente.");
                        break;
                    }
                    case 2 -> {
                        System.out.println("Introduce la nueva Fecha de alta (dd/MM/yyyy)");
                        String falta = sc.nextLine();
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                        LocalDate fechaAlta = LocalDate.parse(falta, formatter);
                        socios[contador].setFechaAlta(fechaAlta);
                        System.out.println("Fecha de alta modificada exitosamente.");
                        break;
                    }
                    case 3 -> {
                        System.out.println("Introduce la nueva Fecha de nacimiento (dd/MM/yyyy)");
                        String fnacimiento = sc.nextLine();
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                        LocalDate fechaNacimiento = LocalDate.parse(fnacimiento, formatter);
                        socios[contador].setFechaNacimiento(fechaNacimiento);
                        System.out.println("Fecha de nacimiento modificada exitosamente.");
                        break;
                    }
                    case 4 -> {
                        System.out.println("Introduce el nuevo telefono");
                        String telefono = sc.nextLine();
                        socios[contador].setTelefono(telefono);
                        System.out.println("Telefono modificado exitosamente.");
                        break;
                    }
                    case 5 -> {
                        System.out.println("Introduce el nuevo correo electronico");
                        String correo = sc.nextLine();
                        socios[contador].setCorreoElectronico(correo);
                        System.out.println("Correo electronico modificado exitosamente.");
                        break;
                    }
                    case 6 ->{
                        if (socios[contador].getFamilia() != null && socios[contador].getFamilia().length > 0) { // recorre el array de socios
                           
                        	System.out.println("Introduce el nombre del familiar que quieres eliminar");
                            String nombreFamiliar = sc.nextLine();
                            
                            boolean encontrado = false;
                        
                            
                            Familiar[] familiares = socios[contador].getFamilia(); // buscar en el array de familiar (nombre)
                            
                            for (int i = 0; i < familiares.length; i++) {
                                
                            	if (familiares[i].getNombre().equalsIgnoreCase(nombreFamiliar)) {
                                    encontrado = true;
                                    
                                    Familiar[] nuevosFamiliares = new Familiar[familiares.length - 1];// nuevo array sin el familiar que queremos borrar
                                    int indice = 0;
                                    for (int j = 0; j < familiares.length; j++) {
                                        if (j != i) {
                                            nuevosFamiliares[indice] = familiares[j];
                                            indice++;
                                        }
                                    }
                                   
                                    socios[contador].setFamilia(nuevosFamiliares); //  se actualiza el array de socios con el familiar borrado
                                    System.out.println("Familiar eliminado exitosamente.");
                                    break;
                                }
                            } // CIERRE PRIMER FOR

                            if (!encontrado) {
                                System.out.println("El socio no tiene un familiar con ese nombre.");
                            }
                        } // CIERRE PRIMER IF
                        else {
                            System.out.println("El socio no tiene familiares.");
                        }
                        break;
                    }
                    default -> {
                        System.out.println("Has introducido un numero fuera del rango del menu, intentalo de nuevo");
                    }
                }
            }
            else {
                System.out.println("El numero de identificacion de socio no existe.");
            }
        }
    }


 // Baja de socio
    public static void bajaSocio() {
        Scanner sc = new Scanner(System.in);
        if (socios.length == 0) {
            System.out.println("No hay socios registrados\n");

			// El return es para acabar y no siga al siguiente if
            return;
        }

        System.out.println("Socios dados de alta en el club : ");
        for (int j = 0; j < socios.length; j++) {
            if (socios[j] != null) {
                System.out.println(socios[j]);
            }
        }

        System.out.println("Dime el numero de identificacion del Socio: ");
        int num = sc.nextInt();

        // Bandera para saber si se encontró el socio
        boolean encontrado = false;
        for (int i = 0; i < socios.length; i++) {
            if (socios[i] != null && num == socios[i].getNumeroSocio()) {
                socios[i] = null;
                encontrado = true;
                System.out.println("El socio ha sido borrado con exito");
                break; // Se encontró el socio, se puede salir del bucle
            }
        }

        if (!encontrado) {
            System.out.println("No existe un socio con ese numero de identificacion");
        }
        
        System.out.println("Socio dado de baja exitosamente.");
    }
}
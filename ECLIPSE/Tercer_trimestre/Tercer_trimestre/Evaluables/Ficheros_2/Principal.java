package Ficheros_2;

import java.io.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;


public class Principal {

    private static final String ARCHIVO = "Socios.dat";
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
                System.out.println("Carácter invalido, intentelo de nuevo");
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
            System.out.println("No se ha encontrado el archivo. Se creará uno nuevo para guardar los socios.");
        } catch (IOException e) {
            System.out.println("Error de lectura: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Error al leer los socios del archivo: " + e.getMessage());
        }
    }


 // Guardar en archivo 
    private static void guardarArchivo() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ARCHIVO))) {
            // Se escribe el array de socios en el archivo
            out.writeObject(socios);
            System.out.println("Los socios han sido guardados correctamente");
        } catch (IOException e) {
            System.out.println("Error de escritura: " + e.getMessage());
        }
    }


 // MENÚ SOCIO
    private static void menuSocios() {
        System.out.println("Programa de Gestión de Socios");
        // System.out.println("=============================");
        System.out.println("1. Alta de Socio");
        System.out.println("2. Modificacion de Socio");
        System.out.println("3. Baja de socio");
        System.out.println("4. Lista ordenada por antigüedad de socio");
        System.out.println("5. Lista ordenada por nombre de socio");
        System.out.println("6. Lista de socios y familiares, esta última ordenada por nombre");
        System.out.println("0. Salir del programa");
    }
    
 // Alta de socio
    private static void altaSocios() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre de socio :");
        String nombre = sc.nextLine();
        System.out.println("Fecha de nacimiento de socio (dd/MM/yyyy):");
        String fnacimiento = sc.nextLine();
        System.out.println("Telefono de socio :");
        String tlf = sc.nextLine();
        System.out.println("Correo electronico de socio :");
        String correo = sc.nextLine();
        Socio nuevo = new Socio(nombre, fnacimiento, tlf, correo);
        System.out.println("¿Cuantos familiares tiene el socio?");
        int num = sc.nextInt();
        // Añadir sc.nextline si o si, si no me devuelve al menu principal
        sc.nextLine();
        if (num > 0) {
            Familiar nuevofamilia[] = new Familiar[num];
            for (int i = 0; i < nuevofamilia.length; i++) {
                System.out.println("Introduzca el nombre del familiar nº" + (i + 1));
                String nfam = sc.nextLine();
                System.out.println("Introduzca el dni del familiar numero" + (i + 1));
                String dni = sc.nextLine();
                System.out.println("Introduzca la fecha de nacimiento del familiar(dd/MM/yyyy) nº " + (i + 1));
                String ffam = sc.nextLine();
                nuevofamilia[i] = new Familiar(dni, nfam, ffam);
            }
            nuevo.setFamilia(nuevofamilia);
        }

        // Se crea un nuevo array con un tamaño mayor para almacenar los nuevos socios
        Socio[] nuevosSocios = new Socio[socios.length + 1];
        // Se copian los socios existentes al nuevo array
        System.arraycopy(socios, 0, nuevosSocios, 0, socios.length);
        // Se añade el nuevo socio al final del array
        nuevosSocios[nuevosSocios.length - 1] = nuevo;
        // Se actualiza la referencia al array de socios
        socios = nuevosSocios;
        
        // Se muestra la información de todos los socios
        for (Socio socio : socios) {
            if (socio != null) {
                System.out.println(socio);
            }
        }
    }


 // Lista por orden de fecha de alta
    private static void listarPorAntiguedad() {
        if (socios.length == 0) {
            System.out.println("No hay socios registrados");
        } else {
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
        } else {
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
        } else {
            System.out.println();
            for (int j = 0; j < socios.length; j++) {
                // En caso de que tenga familiares se ordenará por edad, de lo contrario se mostrará sin cambios
                if (socios[j] != null && socios[j].getFamilia() != null) {
                    Arrays.sort(socios[j].getFamilia(), new FamiliaresPorEdad()); // Ordenar los familiares por edad
                    System.out.println(socios[j]);
                } else if (socios[j] != null) {
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
        } else {
            System.out.println("Dime el número del socio que quieres modificar");
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
                System.out.println("¿Qué quieres modificar del socio Nº: " + num + "?");
                System.out.println("1. Modificar Nombre");
                System.out.println("2. Modificar Fecha de alta");
                System.out.println("3. Modificar Fecha de nacimiento");
                System.out.println("4. Modificar Telefono");
                System.out.println("5. Modificar Correo electronico");
                int n = sc.nextInt();
                sc.nextLine(); // Consumir el salto de línea después del número
                switch (n) {
                    case 1 -> {
                        System.out.println("Introduce el nuevo nombre");
                        String nombre = sc.nextLine();
                        socios[contador].setNombre(nombre);
                    }
                    case 2 -> {
                        System.out.println("Introduce la nueva Fecha de alta (dd/MM/yyyy)");
                        String falta = sc.nextLine();
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                        LocalDate fechaAlta = LocalDate.parse(falta, formatter);
                        socios[contador].setFechaAlta(fechaAlta);
                    }
                    case 3 -> {
                        System.out.println("Introduce la nueva Fecha de nacimiento (dd/MM/yyyy)");
                        String fnacimiento = sc.nextLine();
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                        LocalDate fechaNacimiento = LocalDate.parse(fnacimiento, formatter);
                        socios[contador].setFechaNacimiento(fechaNacimiento);
                    }
                    case 4 -> {
                        System.out.println("Introduce el nuevo telefono");
                        String telefono = sc.nextLine();
                        socios[contador].setTelefono(telefono);
                    }
                    case 5 -> {
                        System.out.println("Introduce el nuevo correo electronico");
                        String correo = sc.nextLine();
                        socios[contador].setCorreoElectronico(correo);
                    }
                    default -> {
                        System.out.println("Has introducido un numero fuera del rango del menu, intentalo de nuevo");
                    }
                }
            } else {
                System.out.println("El numero de identificación de socio no existe");
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
    }
}
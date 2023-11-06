package Ficheros;

import java.io.*;
import java.time.*;
import java.time.format.DateTimeParseException;
import java.util.*;

import PracitcaEvaluable1.Socio;

public class Principal {
	
    private static Socio[] socios;

    public static void main(String[] args) {
        socios = cargarSociosDesdeArchivo();
        menuPrincipal();
        guardarSociosEnArchivo(socios);
    }

    private static void menuPrincipal() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("----- GESTIÓN DE SOCIOS -----");
            System.out.println("1. Alta de socio");
            System.out.println("2. Baja de socio");
            System.out.println("3. Modificación de datos de socio");
            System.out.println("4. Listado por orden alfabético de nombres");
            System.out.println("5. Listado por antigüedad en el club");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    altaSocio();
                    break;
                case 2:
                    bajaSocio();
                    break;
                case 3:
                    modificarSocio();
                    break;
                case 4:
                    listarPorNombre();
                    break;
                case 5:
                    listarPorAntiguedad();
                    break;
                case 6:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 6);
    }

    private static void altaSocio() {
        Scanner sc = new Scanner(System.in);
        System.out.println("----- Alta de Socio -----");
        System.out.print("Nombre del socio: ");
        String nombre = sc.nextLine();
        System.out.print("Fecha de nacimiento del socio (dd/MM/yyyy): ");
        String fnacimiento = sc.nextLine();
        System.out.print("Teléfono del socio: ");
        String tlf = sc.nextLine();
        System.out.print("Correo electrónico del socio: ");
        String correo = sc.nextLine();
        Socio nuevo = new Socio(nombre, fnacimiento, tlf, correo);
        System.out.print("¿Cuántos familiares tiene el socio? ");
        int num = sc.nextInt();
        sc.nextLine();

        if (num > 0) {
            Familiar[] nuevofamilia = new Familiar[num];
            for (int i = 0; i < nuevofamilia.length; i++) {
                System.out.println("Introduzca el nombre del familiar " + (i + 1));
                String nfam = sc.nextLine();
                System.out.println("Introduzca el dni del familiar " + (i + 1));
                String dni = sc.nextLine();
                System.out.println("Introduzca la fecha de nacimiento del familiar (dd/MM/yyyy) " + (i + 1));
                String ffam = sc.nextLine();
                nuevofamilia[i] = new Familiar(dni, nfam, ffam);
            }
            nuevo.setFamilia(nuevofamilia);
        }

        Socio[] nuevosSocios = Arrays.copyOf(socios, socios.length + 1);
        nuevosSocios[nuevosSocios.length - 1] = nuevo;
        socios = nuevosSocios;

        System.out.println("Socio dado de alta correctamente.");
    }
    
    private static void bajaSocio() {
        Scanner Sc = new Scanner(System.in);
        System.out.println("----- Baja de Socio -----");
        if (socios.length == 0) {
            System.out.println("No hay socios registrados");
        } else {
            System.out.println("Socios registrados en el club:");
            listarSocios();

            System.out.print("Ingrese el número de identificación del socio: ");
            int num = sc.nextInt();
            sc.nextLine();

            boolean encontrado = false;
            for (int i = 0; i < socios.length; i++) {
                if (socios[i] != null && socios[i].getNumeroSocio() == num) {
                    socios[i] = null;
                    encontrado = true;
                    System.out.println("El socio ha sido dado de baja correctamente.");
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("No existe un socio con ese número de identificación.");
            }
        }
    }

    private static void modificarSocio() {
        Scanner sc = new Scanner(System.in);
        System.out.println("----- Modificación de Socio -----");

        if (socios.length == 0) {
            System.out.println("No hay socios registrados");
        } else {
            System.out.println("Socios registrados en el club:");
            listarSocios();

            System.out.print("Ingrese el número de identificación del socio que desea modificar: ");
            int num = sc.nextInt();
            sc.nextLine();

            boolean encontrado = false;
            for (int i = 0; i < socios.length; i++) {
                if (socios[i] != null && socios[i].getNumeroSocio() == num) {
                    encontrado = true;
                    System.out.println("¿Qué dato desea modificar del socio " + num + "?");
                    System.out.println("1. Nombre");
                    System.out.println("2. Fecha de nacimiento");
                    System.out.println("3. Teléfono");
                    System.out.println("4. Correo electrónico");
                    System.out.print("Seleccione una opción: ");
                    int opcion = sc.nextInt();
                    sc.nextLine();

                    switch (opcion) {
                        case 1:
                            System.out.print("Ingrese el nuevo nombre: ");
                            String nombre = sc.nextLine();
                            socios[i].setNombre(nombre);
                            System.out.println("Nombre modificado correctamente.");
                            break;
                        case 2:
                            System.out.print("Ingrese la nueva fecha de nacimiento (dd/MM/yyyy): ");
                            String fnacimiento = sc.nextLine();
                            socios[i].setFechaNacimiento(fnacimiento);
                            System.out.println("Fecha de nacimiento modificada correctamente.");
                            break;
                        case 3:
                            System.out.print("Ingrese el nuevo teléfono: ");
                            String telefono = sc.nextLine();
                            socios[i].setTelefono(telefono);
                            System.out.println("Teléfono modificado correctamente.");
                            break;
                        case 4:
                            System.out.print("Ingrese el nuevo correo electrónico: ");
                            String correo = sc.nextLine();
                            socios[i].setCorreoElectronico(correo);
                            System.out.println("Correo electrónico modificado correctamente.");
                            break;
                        default:
                            System.out.println("Opción inválida. No se ha realizado ninguna modificación.");
                            break;
                    }

                    break;
                }
            }

            if (!encontrado) {
                System.out.println("No existe un socio con ese número de identificación.");
            }
        }
    }
    
    private static void listarPorNombre() {
        if (socios.length == 0) {
            System.out.println("No hay socios registrados");
        } else {
            Arrays.sort(socios, new OrdenarPorNombre());
            System.out.println("----- Listado de Socios por Nombre -----");
            for (Socio socio : socios) {
            if (socio != null) {
            System.out.println(socio);
            }
            }
            }
            }

            private static void listarPorAntiguedad() {
            if (socios.length == 0) {
            System.out.println("No hay socios registrados");
            } else {
            Arrays.sort(socios, new OrdenarporFecha());
            System.out.println("----- Listado de Socios por Antigüedad en el Club -----");
            for (Socio socio : socios) {
            if (socio != null) {
            System.out.println(socio);
            }
            }
            }
            }

            private static void listarFamilia() {
            if (socios.length == 0) {
            System.out.println("No hay socios registrados");
            } else {
            System.out.println("----- Listado de Socios con sus Familiares por Orden de Edad -----");
            for (Socio socio : socios) {
            if (socio != null) {
            System.out.println(socio);
            if (socio.getFamilia() != null) {
            Arrays.sort(socio.getFamilia(), new FamiliaresPorEdad());
            for (Familiar familiar : socio.getFamilia()) {
            System.out.println(familiar);
            }
            }
            }
            }
            }
            }

            public static void main(String[] args) {
            cargarDatos();
            boolean salir = false;
            Scanner sc = new Scanner(System.in);
            while (!salir) {
            System.out.println("----- Gestión de Socios -----");
            System.out.println("1. Alta de Socio");
            System.out.println("2. Baja de Socio");
            System.out.println("3. Modificar Socio");
            System.out.println("4. Listar Socios por Nombre");
            System.out.println("5. Listar Socios por Antigüedad en el Club");
            System.out.println("6. Listar Socios con sus Familiares por Orden de Edad");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
            case 1:
                altaSocio();
                break;
            case 2:
                bajaSocio();
                break;
            case 3:
                modificarSocio();
                break;
            case 4:
                listarPorNombre();
                break;
            case 5:
                listarPorAntiguedad();
                break;
            case 6:
                listarFamilia();
                break;
            case 7:
                salir = true;
                break;
            default:
                System.out.println("Opción inválida. Intente nuevamente.");
                break;
        }
    }
    guardarDatos();
    System.out.println("Hasta luego. ¡Gracias por usar la aplicación!");
            }
}




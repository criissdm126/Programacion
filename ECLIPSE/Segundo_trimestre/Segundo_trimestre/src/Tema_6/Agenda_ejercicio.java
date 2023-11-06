package Tema_6;
import java.util.Scanner;
import java.util.Arrays;

public class Agenda_ejercicio {

	public static void main(String[] args) {
		
		String agenda[] = new String [0];
		int opcion;
		
		do {
			opcion = menu();
			switch(opcion) {
			case 1:
				agenda = nuevo(agenda);
				break;
			case 2:
				buscar(agenda);
				break;
			case 3:
				mostrar(agenda);
				break;
			}
		}while (opcion !=4);

	}
	

	private static int menu() {
		// TODO Auto-generated method stub
		return 0;
	}


	static int menu(int a) {
		System.out.println("1. Nuevo contacto");
		System.out.println("2. Buscar contacto");
		System.out.println("3. Ver todo");
		System.out.println("4. Salir");
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		
		sc.close();
		return a;
		
		
	}
	
	static String [] nuevo (String agenda []) {
		System.out.println("Nombre: ");
		Scanner sc = new Scanner(System.in);
		String nombre = sc.nextLine();
		
		System.out.println("Telefono: ");
		String telefono = sc.nextLine();
		
		agenda = Arrays.copyOf(agenda, agenda.length+1);
		agenda[agenda.length-1] = nombre + " : " + telefono;
		
		sc.close();
		
		return agenda;
		
	}
	
	static void  buscar (String agenda[]) {
		System.out.println("Persona que quieres buscar:  ");
		Scanner sc = new Scanner(System.in);
		String nombre = sc.nextLine();
		
		for (String contacto: agenda) {
			String aux[] = contacto.split(":");
			if (aux[0].startsWith(nombre)) {
				System.out.println("Nombre: " + aux[0] + "/t(" + aux[1] + ")");
			}
		}
		sc.close();
		
		
	}
	
	static String [] muestra (String agenda[]) {
		Scanner sc = new Scanner(System.in);
		sc.close();
		
		return agenda;
	}
	
	private static void mostrar(String[] agenda) {
		// TODO Auto-generated method stub
		
	}

}

package Wrapper;

public class Main {
	
    public static void main(String[] args) {
    	
        StringWrapper wrapper = new StringWrapper("Hola Mundo");

        System.out.println("Longitud: " + wrapper.length());
        System.out.println("En mayusculas: " + wrapper.toUpperCase());
        System.out.println("En minusculas: " + wrapper.toLowerCase());
        System.out.println("Contiene 'Mundo': " + wrapper.contains("Mundo"));
    }
}

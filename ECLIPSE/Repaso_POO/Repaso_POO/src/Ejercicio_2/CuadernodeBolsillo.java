package Ejercicio_2;

public class CuadernodeBolsillo {
	
	 private String[] notas;
	    private int tamañoMaximoNotas;
	    private int tamañoMaximoLineas;

	    public CuadernodeBolsillo(int tamañoMaximoNotas, int tamañoMaximoLineas) {
	        this.tamañoMaximoNotas = tamañoMaximoNotas;
	        this.tamañoMaximoLineas = tamañoMaximoLineas;
	        notas = new String[tamañoMaximoNotas];
	    }

	    public void agregarNota(String texto) {
	        String textoRecortado = texto.substring(0, Math.min(texto.length(), tamañoMaximoLineas));
	        for (int i = 0; i < tamañoMaximoNotas; i++) {
	            if (notas[i] == null) {
	                notas[i] = textoRecortado;
	                break;
	            }
	        }
	    }

	    public void listarNotas() {
	        for (int i = 0; i < tamañoMaximoNotas; i++) {
	            if (notas[i] != null) {
	                System.out.println((i + 1) + ": " + notas[i]);
	            }
	        }
	    }

	    public void eliminarNota(int posicion) {
	        if (posicion >= 1 && posicion <= tamañoMaximoNotas) {
	            notas[posicion - 1] = null;
	        }
	    }

	    public int contarNotas() {
	        int contador = 0;
	        for (int i = 0; i < tamañoMaximoNotas; i++) {
	            if (notas[i] != null) {
	                contador++;
	            }
	        }
	        return contador;
	    }
	}

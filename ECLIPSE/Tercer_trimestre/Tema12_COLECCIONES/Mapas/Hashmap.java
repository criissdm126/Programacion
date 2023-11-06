package Mapas;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args) {
		
		HashMap<String, String> diccionario = new HashMap<String, String>();
		diccionario.put("Lunes", "Primer dia de la semana");
		diccionario.put("Martes", "Segundo dia de la semana");
		diccionario.put("Miercoles", "Tercer dia de la semana");
		diccionario.put("Jueves", "Cuarto dia de la semana");
		
		// FORMA 1
		System.out.println(diccionario);
		
		//VALUES
		for(String a : diccionario.values()) {
			System.out.println(a);
		}
		
		// KEYSET
		for(String a : diccionario.keySet()) {
			System.out.println(a + " : " + diccionario.get(a));
		}
		
		//ENTREYSET
		for(Map.Entry<String, String> entrada : diccionario.entrySet()) {
			
			//diccionario.entrySet() devuelve un set<Map.Entry>
			
			String clave = entrada.getKey();
			String valor = entrada.getValue();
			System.out.println(clave + " : " + valor);
		}
			
		//PROGRAMACIÓN FUNCIONAL
		diccionario.forEach((k, v) -> System.out.println(k + " : " + v));

	}

}

package Clase_abstracta_abstract;

public class Principal {

	public static void main(String[] args) {
		
		
		Automovil [] auto = new Automovil [3];
		auto [0] = new Deportivo();
		auto [1] = new Turismo();
		auto[2] = new Familiar();
		
		imprime_eslogan(auto);

	}

	private static void imprime_eslogan(Automovil[] auto) {
		
		for (int i=0; i<=2; i++) {
			auto[i].eslogan();
		}
		
	}

}

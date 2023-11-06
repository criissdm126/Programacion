package EXAMEN_2;

import java.util.Arrays;

public class Empresa {
	
	static Empleado arrayEmpleados [] = new Empleado[3];

	public static void main(String[] args) {
		
		//ARRAYS
		
		//empleado 1
		Empleado e1 = new Empleado (1000, "Paco", new int[] {1,5});
		
		//empleado 2
		int arrayTlfs [] = {152425, 562431};
		Empleado e2 = new Empleado (2000, "Paco", arrayTlfs);
		
		//empleado 3
		Empleado e3 = new Empleado (1200, "Maria", new int [] {1152,56328});
		
		System.out.println(Empleado.getNumEmpleados());
		
		//array grupal
		Empleado arrayEmpleados [] = {e1,e2,e3};
		Empresa.arrayEmpleados[0] = e1;
		Empresa.arrayEmpleados[1] = e2;
		Empresa.arrayEmpleados[2] = e3;
		
		//bucle
		for (Empleado a: arrayEmpleados) {
			System.out.println(a);
		}
		for (int a=0; a<arrayEmpleados.length; a++) {
			System.out.println(arrayEmpleados[a]);
		}
		
		Empresa.muestraTelefonos(e2);
		muestraTelefonos(e2);
		Empresa.muestraTelefonosNombre("paco");
	}
	
	
	//metodo muestra Telefonos
	
	public static void muestraTelefonos(Empleado a) {
		System.out.println(Arrays.toString(a.getTelefonos()));
	}
	
	public static  void muestraTelefonosNombre (String nombre) {
		//recorrer array empleado = for
		//seleccionar los que tengan ese nombre = equals
		//mostrar sus telefonos = arrays.toString
		//array grupal
		
		for(Empleado var: arrayEmpleados) {
			if(var.equals(nombre)) {
				System.out.println(Arrays.toString(var.getTelefonos()));
			}
		}
	}

}

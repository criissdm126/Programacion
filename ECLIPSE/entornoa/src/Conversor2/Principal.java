package Conversor2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe un numero en decimal:");
        int dec = sc.nextInt();
        Binario bin = new Binario(dec);
        System.out.println(dec+" en binario es "+bin.getValor());
        long nBin;
        do
        {
            System.out.println("Escribe un numero en binario:");
            nBin = sc.nextLong();
            
        }while (!new Binario(nBin).esValido());

        Binario bin2 = new Binario(nBin);
        System.out.println(nBin +" en decimal es "+bin2.toDecimal()); 
	}
}
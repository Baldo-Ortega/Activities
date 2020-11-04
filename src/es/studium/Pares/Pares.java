package es.studium.Pares;

import java.util.Scanner;

public class Pares {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		int numero1,numero2;
		System.out.print("Dame un número entero ");
		numero1 = teclado.nextInt();
		System.out.print("Dame otro numero entero ");
		numero2 = teclado.nextInt();
		for (int i = numero1; i <=numero2; i++) {
			if (i%2 != 0) {
				System.out.println(i);
			}
		}
		teclado.close();		
	}
			
}
		
	



package es.studium.Veces;

import java.util.Scanner;

public class Veces {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		int veces, numero;
		System.out.print("Dame un número entero");
		veces = teclado.nextInt();
		System.out.print("Dame otro número entero");
		numero = teclado.nextInt();
		teclado.close();
		for (int i = 1; i <=veces; i++) {
			System.out.println(numero);
		}
	}
}

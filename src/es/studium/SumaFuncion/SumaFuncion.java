package es.studium.SumaFuncion;

import java.util.Scanner;

public class SumaFuncion {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		int a, b;
		System.out.print("Dame un número entero");
		a = teclado.nextInt();
		System.out.print("Dame otro número entero");
		b = teclado.nextInt();
		teclado.close();
		System.out.println("La suma es igual a " + funSuma(a,b));
	}

	public static int funSuma(int a, int b) {
		int r = a + b;
		return r;
	}

}

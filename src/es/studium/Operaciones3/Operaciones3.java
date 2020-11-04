package es.studium.Operaciones3;

import java.util.Scanner;

public class Operaciones3 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		int a, b,c;
		System.out.print("Dame el primer número");
		a = teclado.nextInt();
		System.out.print("Dame el segundo número");
		b = teclado.nextInt();
		System.out.print("Dame el último número");
		c = teclado.nextInt();
		teclado.close();
		System.out.println("La suma es igual a " + suma(a,b,c));
		System.out.println("El producto es igual a " + producto(a,b,c));
		System.out.println("La media es igual a " + media(a,b,c));
	}

	private static double media(int a, int b, int c) {
		return (float)suma(a,b,c)/3;
	}

	private static int producto(int a, int b, int c) {
		return a*b*c;
	}

	private static int suma(int a, int b, int c) {
		return a+b+c;
	}
}

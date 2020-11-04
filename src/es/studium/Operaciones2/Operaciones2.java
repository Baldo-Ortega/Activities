package es.studium.Operaciones2;

import java.util.Scanner;

public class Operaciones2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		int a, b;
		System.out.print("Dame el primer número");
		a = teclado.nextInt();
		System.out.print("Dame el segundo número");
		b = teclado.nextInt();
		teclado.close();
		System.out.println("La suma es igual a " + suma(a,b));
		System.out.println("La resta es igual a " + resta(a,b));
		System.out.println("El producto es igual a " + producto(a,b));
		if (b!=0) {
			System.out.println("El consciente es igual a " + division(a,b));
		}else {
			System.out.println("No se puede calcular la división entre 0");
		}
	}

	private static float division(int a, int b) {
		return (float)a/(float)b;
	}

	private static int producto(int a, int b) {
		return a*b;
	}

	private static int resta(int a, int b) {
		return a-b;
	}

	private static int suma(int a, int b) {
		return a+b;
	}

}

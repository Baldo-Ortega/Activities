package es.studium.Operaciones;

import java.util.Scanner;

public class Operaciones {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		int a, b;
		System.out.print("Dame el primer número");
		a = teclado.nextInt();
		System.out.print("Dame el segundo número");
		b = teclado.nextInt();
		teclado.close();
		System.out.println("La suma es igual a " + (a+b));
		System.out.println("La resta es igual a " + (a-b));
		System.out.println("El producto es igual a " + a*b);
		if (b!=0) {
			System.out.println("El consciente es igual a " + (float)a/(float)b);
		}else {
			System.out.println("No se puede calcular la división entre 0");
		}
	}
}

package es.studium.Intercambio;

import java.util.Scanner;

public class Intercambio {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int a, b ,c;
		System.out.print("Dame un número entero");
		a = teclado.nextInt();
		System.out.print("Dame otro número entero");
		b = teclado.nextInt();
		teclado.close();
		c=a;
		a=b;
		b=c;
		System.out.println("El primer número es " + a);
		System.out.println("El segundo número es " + b);
	}
}

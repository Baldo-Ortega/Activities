package es.studium.Intercambio;

import java.util.Scanner;

public class Intercambio {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int a, b ,c;
		System.out.print("Dame un n�mero entero");
		a = teclado.nextInt();
		System.out.print("Dame otro n�mero entero");
		b = teclado.nextInt();
		teclado.close();
		c=a;
		a=b;
		b=c;
		System.out.println("El primer n�mero es " + a);
		System.out.println("El segundo n�mero es " + b);
	}
}

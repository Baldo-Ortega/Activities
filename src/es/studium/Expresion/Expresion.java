package es.studium.Expresion;

import java.util.Scanner;

public class Expresion {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		int a, b, c;
		System.out.print("Dame el correspondiente a la letra a");
		a = teclado.nextInt();
		System.out.print("Dame el correspondiente a la letra b");
		b = teclado.nextInt();
		System.out.print("Dame el correspondiente a la letra c");
		c = teclado.nextInt();
		teclado.close();
		System.out.println("El resultado es igual a " + fun_1(a, b, c));
	}

	private static double fun_1(int a, int b, int c) {
		double r;
		r = (b*b - 4*a*c)/(2*a);
		return r;
	}

}

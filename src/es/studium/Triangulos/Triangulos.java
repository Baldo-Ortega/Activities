package es.studium.Triangulos;

import java.util.Scanner;

public class Triangulos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int a, b,c;
		System.out.print("Dame el primer lado");
		a = teclado.nextInt();
		System.out.print("Dame el segundo lado");
		b = teclado.nextInt();
		System.out.print("Dame el �ltimo lado");
		c = teclado.nextInt();
		teclado.close();
		if (a==b & a==c) {
			System.out.println("Es un tri�ngulo equil�tero.");
		}else if (a==b || b==c || a==c) {
			System.out.println("Es un tri�ngulo is�sceles.");
		}else {
			System.out.println("Es un tri�ngulo escaleno.");
		}
	}
}

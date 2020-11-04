package es.studium.Ordena3Numeros;

import java.util.Scanner;

public class Ordena3Numeros {

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
		if (a>=b) {
			if (b>=c) {
				System.out.println(a + "," + b + "," + c);
			}else {
				if (a>=c) {
					System.out.println(a + "," + c + "," + b);
				}else {
					System.out.println(c + "," + a + "," + b);
				}
			}
		}else {
			if (a>=c) {
				System.out.println(b + "," + a + "," + c);
			}else {
				if (b>=c) {
					System.out.println(b + "," + c + "," + a);
				}else {
					System.out.println(c + "," + b + "," + a);
				}
			}
		}
	}
}

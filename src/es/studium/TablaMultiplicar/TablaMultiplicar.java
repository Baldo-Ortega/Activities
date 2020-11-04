package es.studium.TablaMultiplicar;

import java.util.Scanner;

public class TablaMultiplicar {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		int a;
		System.out.print("Dame un número entero");
		a = teclado.nextInt();
		teclado.close();
		for (int i = 0; i <= 10; i++) {
			System.out.println(a + "x"+ i + "=" + a*i);
		}
	}
}

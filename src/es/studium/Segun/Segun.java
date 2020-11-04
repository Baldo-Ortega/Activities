package es.studium.Segun;

import java.util.Scanner;

public class Segun {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		int a, b;
		System.out.print("Dame un número entero");
		a = teclado.nextInt();
		System.out.print("Dame otro número entero");
		b = teclado.nextInt();
		teclado.close();
		if (a>b) {
			System.out.println("La suma de los valores es igual a " + (a+b));
		}else{
				System.out.println("El producto de los valores es igual a " + a*b);
			}
	}

}

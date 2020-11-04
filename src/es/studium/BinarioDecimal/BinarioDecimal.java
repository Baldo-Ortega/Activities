package es.studium.BinarioDecimal;

import java.util.Scanner;

public class BinarioDecimal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		int cifra1, cifra2, cifra3, cifra4, cifra5;
		do {
			System.out.println("Dame la primera cifra (----X)");
			cifra1 = teclado.nextInt();
		}while(cifra1!=1 & cifra1!=0);
		do {
			System.out.println("Dame la segunda cifra(---X-)");
			cifra2 = teclado.nextInt();
		}while(cifra2!=1 & cifra2!=0);
		do {
			System.out.println("Dame la tercera cifra(--X--)");
			cifra3 = teclado.nextInt();
		}while(cifra3!=1 & cifra3!=0);
		do {
			System.out.println("Dame la cuarta cifra(-X---)");
			cifra4 = teclado.nextInt();
		}while(cifra4!=1 & cifra4!=0);
		do {
			System.out.println("Dame la quinta cifra(X----)");
			cifra5 = teclado.nextInt();
		}while(cifra5!=1 & cifra5!=0);
		teclado.close();
		System.out.println("El número binario introducido es igual a "
				+ fun_binariodecimal(cifra1,cifra2,cifra3,cifra4,cifra5) + " en número decimal");
	}

	private static int fun_binariodecimal(int cifra1, int cifra2, int cifra3, int cifra4, int cifra5) {

		int resultado = cifra1 + cifra2*2 + cifra3*4 + cifra4*8 + cifra5*16;
		return resultado;
	}
}

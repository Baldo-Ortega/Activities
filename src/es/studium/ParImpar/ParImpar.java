package es.studium.ParImpar;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		int numero;
		System.out.println("Dame un número");
		numero = teclado.nextInt();
		if(numero%2 == 0) {
			System.out.println("El número es par");
		}
		else{
				System.out.println("El número es impar");
		}
		teclado.close();
	}
}

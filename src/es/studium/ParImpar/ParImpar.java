package es.studium.ParImpar;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		int numero;
		System.out.println("Dame un n�mero");
		numero = teclado.nextInt();
		if(numero%2 == 0) {
			System.out.println("El n�mero es par");
		}
		else{
				System.out.println("El n�mero es impar");
		}
		teclado.close();
	}
}

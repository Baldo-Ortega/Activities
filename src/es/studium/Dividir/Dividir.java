package es.studium.Dividir;

import java.util.Scanner;

public class Dividir {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		int numerador,denominador;
		System.out.print("Dame el numerador ");
		numerador = teclado.nextInt();
		do {
			System.out.print("Dame el denominador ");
			denominador = teclado.nextInt();
		}while(denominador == 0);
		teclado.close();
		System.out.println("La división vale "+ funDividir(numerador,denominador));
	}
	
	public static float funDividir(int a,int b) {
		float resultado;
		resultado = (float)a/(float)b;
		return resultado;
	}

}

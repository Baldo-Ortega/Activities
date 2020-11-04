package es.studium.Potencia;

import java.util.Scanner;

public class Potencia {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		int base,exponente,resultado;
		resultado = 1;
		System.out.print("Dame el base");
		base = teclado.nextInt();
		System.out.print("Dame el exponente");
		exponente = teclado.nextInt();
		for (int i = 1; i <=exponente; i++) {
			resultado = resultado * base;
		}
		System.out.println("El número " + base+ " elevado a " +exponente +" es igual a " + resultado);
		teclado.close();
	}

}

package es.studium.PotenciaFun;

import java.util.Scanner;

public class PotenciaFun {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int base, exponente;
		System.out.print("Dame el base");
		base = teclado.nextInt();
		System.out.print("Dame el exponente");
		exponente = teclado.nextInt();
		teclado.close();
		System.out.println("El resultado es igual a " + funPotencia(base, exponente));
	}

public static int funPotencia(int a,int b) {
	int r = 1;
	for (int i = 1; i <= b; i++) {
		r= r*a;
	}
	return r;
}

}

package es.studium.Compara;

import java.util.Scanner;

public class Compara {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		int num1,num2;
		System.out.print("Dame un número");
		num1 = teclado.nextInt();
		System.out.print("Dame otro número");
		num2 = teclado.nextInt();
		if (num1 == num2) {
			System.out.println("Los dos números son iguales");
		}else if (num1 > num2) {
				System.out.println("El primer número es mayor que el segundo");
			}else{
				System.out.println("El segundo número es mayor que el primero");	
			}
		teclado.close();
	}

}

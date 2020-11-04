package es.studium.Meses;

import java.util.Scanner;

public class Meses {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		int numero;
		String mes;
		do {
		System.out.print("Dame el número del mes");
		numero = teclado.nextInt();

			switch (numero) {
			case 1: mes = "Enero";
					break;
			case 2: mes = "Febrero";
					break;
			case 3: mes = "Marzo";
					break;
			case 4: mes = "Abril";
					break;
			case 5: mes = "Mayo";
					break;
			case 6: mes = "Junio";
					break;
			case 7: mes = "Julio";
					break;
			case 8: mes = "Agosto";
					break;
			case 9: mes = "Septiembre";
					break;
			case 10: mes = "Octubre";
					break;
			case 11: mes = "Noviembre";
					break;
			case 12: mes = "Diciembre";
					break;
			default: mes = "Número mal introducido";
			}	System.out.println(mes);
		}while(numero<1||numero>12);
		teclado.close();
		}
}

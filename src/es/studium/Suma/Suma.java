package es.studium.Suma;

import java.util.Scanner;
public class Suma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner teclado = new Scanner (System.in);
			//BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
			int num1,num2,suma;
			System.out.println("Ingrese número: ");
			num1 = teclado.nextInt();
			//num1 = Integer.parseInt(lectura.readLine());
			System.out.println("Deme otro número: ");
			num2 = teclado.nextInt();
			//num2= Integer.parseInt(lectura.readLine());
			suma = num1 + num2;
			System.out.println("La suma es igual a " + suma);
			teclado.close();
			
			
	}

}

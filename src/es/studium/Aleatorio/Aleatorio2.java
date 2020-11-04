package es.studium.Aleatorio;

import java.util.Random;

public class Aleatorio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		for(int i = 0;i<10;i++) {
			System.out.println(rnd.nextInt(100));
		}

	}

}

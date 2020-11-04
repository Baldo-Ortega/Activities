package es.studium.SumaParesProductoImpares;

public class SumaParesProductoImpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int suma , producto;
		suma=0;
		producto=1;
		for (int i = 1; i <=40; i++) {
			if(i%2 == 0) {
				suma = suma + i;
			}else {
				producto = producto * i;
			}
		}
		System.out.println("La suma de los pares hasta 40 es igual a  "+ suma);
		System.out.println("El producto de los impares hasta 40 es igual a "+ producto);
	}

}

package inicioTarea2;

import java.util.Scanner;

public class Npares2alN {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		System.out.println("Ingrese un numéro mayor a 2");
		int n = lector.nextInt();
		int contador=0;
		for (int i=2; i<=n; i+=2) {
			contador++;
		}
		System.out.println("Hay " +contador+ " numeros pares entre el 2 y el " +n);
		lector.close();
	}//Llave main

}//Llave fin

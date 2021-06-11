package inicioTarea2;

import java.util.Scanner;

public class Factorial {

		public static void main(String[] args) {
			Scanner lector = new Scanner(System.in);
			System.out.println("ingrese un número");
			int n = lector.nextInt();
			int contador =1;
			int factorial=1;
			while(contador<=n) {
				System.out.println(contador);
				factorial=factorial*contador;
				contador++;
			}
			  System.out.println("El factorial de "+n + " es:" + factorial);
		lector.close();
	}
}
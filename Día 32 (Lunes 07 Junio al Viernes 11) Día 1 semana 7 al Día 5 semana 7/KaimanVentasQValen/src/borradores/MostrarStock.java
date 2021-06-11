package borradores;

import java.util.Scanner;


public class MostrarStock {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese la fecha del Stock DD/MM/AAAA");
		String FechaStock = leer.nextLine();

		
		System.out.println("Ingrese el Stock de Pan Amasado del día");
		int StockDiaAmasado = leer.nextInt();
		
		System.out.println("Ingrese el Stock de Pan Pita del día");
		int StockDiaPita = leer.nextInt();
		
		System.out.println("Pan Amasado "+FechaStock+"\n" +StockDiaAmasado);
		if ((StockDiaAmasado)<=0) {
			System.out.println("Sin pan Amasado por el momento. Puede reservar para otro día.\n");
		}
		System.out.println("Pan Pita "+FechaStock+"\n" +StockDiaPita);
		if ((StockDiaPita)<=0) {
			System.out.println("Sin pan Pita por el momento. Puede reservar para otro día.\n");
		}
		
			leer.close();
		
	}// Linea main

}// Linea Final

package Tarea1;

import java.util.Scanner;

public class paresEnOrden {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		System.out.println("Ingrese 3 n�meros diferentes para ordenarlos");
		System.out.println("Ingrese el primer n�mero");
		int a = lector.nextInt();
		System.out.println("Ingrese el segundo n�mero");
		int b = lector.nextInt();
		System.out.println("Ingrese el tercer n�mero");
		int c = lector.nextInt();
		System.out.println("El orden descendente es: ");
		if (a>b && b>c) {
			System.out.println(a+","+b+","+c);
		} else if (a>c && c>b) {
			System.out.println(a+","+c+","+b);
		} else if (b>a && a>c) {
			System.out.println(b+","+a+","+c);
		} else if (b>c && c>a) {
			System.out.println(b+","+c+","+a);
		} else if (c>a && a>b) {
			System.out.println(c+","+a+","+b);
		} else if (c>b && b>a) {
			System.out.println(c+","+b+","+a);
		} else System.out.println("Existen n�meros repetidos");
		System.out.println("El orden Ascendente es: ");
		if (a<b && b<c) {
			System.out.println(a+","+b+","+c);
		} else if (a<c && c<b) {
			System.out.println(a+","+c+","+b);
		} else if (b<a && a<c) {
			System.out.println(b+","+a+","+c);
		} else if (b<c && c<a) {
			System.out.println(b+","+c+","+a);
		} else if (c<a && a<b) {
			System.out.println(c+","+a+","+b);
		} else if (c<b && b<a) {
			System.out.println(c+","+b+","+a);
		} else System.out.println("Existen n�meros repetidos");

	}

}
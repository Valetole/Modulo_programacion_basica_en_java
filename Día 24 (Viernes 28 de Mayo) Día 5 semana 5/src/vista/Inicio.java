package vista;

import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		System.out.println("hola, bienvenido a KaimanVentasQValen\n");
		
		
		/*Ingrese la opción que desee. 1. ver productos 2. Comprar productos 3. Reservar Productos
		4. Ver Pedidos 5. Ver Reservas. 5 Salir*/
		Scanner read = new Scanner(System.in);
		int opcion;
		do {
			menu();
			opcion=read.nextInt();
		read.close();
		switch(opcion) {
		case 1:System.out.println("vista");
		 		break;
		case 2:System.out.println("compra");
		 		break;
		case 3:System.out.println("reservar");
		 		break;
		case 4:System.out.println("pedidos");
		  		break;
		case 5:System.out.println("reservas");
		 		break;
		case 6:System.out.println("Hasta luego, vuelva pronto");
		 		break;
		default:System.out.println("Ingrese una opción válida");
				break;
		}
		}while(opcion!=6);
	}
	public static void menu () {
		System.out.println("Seleccione una opción:");
		System.out.println("1. Ver Productos");
		System.out.println("2. Comprar Productos");
		System.out.println("3. Reservar Productos");
		System.out.println("4. Ver Pedidos");
		System.out.println("5. Ver Reservas");
		System.out.println("6. Salir");
	}
		}


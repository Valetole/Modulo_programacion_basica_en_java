package borradores;

import java.util.Map;
import java.util.Scanner;
import modelo.Producto;
import controladores.ProductoController;


public class VistaProducto {
	static Scanner lector = new Scanner(System.in);
	static Scanner lector2 = new Scanner(System.in);
	

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		int opcion =0;
		do {
			try {
			menuProducto();// Menu Producto opciones para el vendedor
			opcion=lector.nextInt();
			switch(opcion) {
			case 1: System.out.println(".....INGRESE DATOS DEL PRODUCTO....");
					crearProducto();
					break;
			case 2: verProducto();
					break;				
			case 3: System.out.println("Ingrese nombre producto a modificar");
					modificarProducto();
					break;
			case 4:	System.out.println("Se desplegará lista de productos");
					listarProducto();
					break;
			case 5: System.out.println("Hasta Luego");
					break;
			default:System.out.println("INGRESE UNA OPCIÓN VÁLIDA\n");
					break;
			}
		}catch (java.util.InputMismatchException e) {
			System.out.println("POR FAVOR INGRESE UN NUMERO");
			lector.nextLine();
			}
		} while(opcion!=5);
		lector.close();
		} // linea main	 
		
	public static void crearProducto() { // Solicitar datos para crear un producto.

		String nombre, tipoProducto, descripcion;
		int precio;
		System.out.println("Ingrese el nombre del producto");/*
		Validar que ya existe un producto con ese nombre, se hace en el controller o aca? con
	    con containsKey()*/
		nombre= lector.nextLine();
		System.out.println("Ingrese tipo producto");
		tipoProducto= lector.nextLine();
		System.out.println("Ingrese la descripción del producto");
		descripcion= lector.nextLine();
		System.out.println("Ingrese el precio del producto");
		precio= lector2.nextInt();//hacer un try catch para validar
		
		
			/*try {
		System.out.println("Ingrese el precio del producto");
		precio= lector2.nextInt();//hacer un try catch para validar 
			}catch (java.util.InputMismatchException e) {
				System.out.println("Ingrese un precio válido con caracter numérico");
				lector.nextLine();
				precio=lector2.nextInt();
		}*/
	
		new ProductoController().agregarProducto(nombre.toLowerCase(),tipoProducto, descripcion, precio);
}
	
	public static void verProducto() {
		System.out.println("Ingrese el nombre del producto a visualizar");
		String nombre = lector.nextLine();
		Producto p = new ProductoController().verProducto(nombre.toLowerCase());
		if(p!=null) {// si no lo encuentra, pero si es pan pita en vez de Pan pita? sale del código sin hacer nada
			System.out.println(p);//debiese poner equals igual nombre?
		}else {//imprimir un mensaje de no se encontró un produto con ese nombre
			System.out.println("NO SE ENCONTRÓ UN PRODUCTO CON ESE NOMBRE, ASEGURESE DE HABERLO CREADO");/*
			El producto debe ser creado, validar*/
		}
	}
	
	

	
	public static void modificarProducto() {
		System.out.println("Ingrese el nombre del producto a modificar");
		//String nombre=lector.nextLine();
		//invoco al producto controller pero requiero solo un atributo para modificarlo pero choca con mi metodo ver producto?
		
	}
	
	public static void listarProducto() {
		Map<String, Producto> lista = new ProductoController().listarProductos();
		for(Map.Entry<String, Producto> producto:lista.entrySet()) {
			System.out.println(producto);
		}
		//System.out.println(lista);//se puede ir tabulando o sale hacia al lado no mas?
	}
	
	public static void menuProducto () {
		System.out.println("...SELECCIONE UNA OPCION...\n");
		System.out.println("1. Agregar producto");
		System.out.println("2. Ver producto");
		System.out.println("3. Modificar producto");//Prueba StockDelProducto
		System.out.println("4. Lista Productos");
		System.out.println("5. Salir");
	}//hacer un try catch para validar la entrada de numeros.
	
}// linea cierre





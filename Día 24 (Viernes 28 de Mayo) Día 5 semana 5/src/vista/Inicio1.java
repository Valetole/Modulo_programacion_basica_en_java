package vista;

import java.util.Scanner;

import controladores.ProductoController;
import modelo.Producto;

public class Inicio1 {
static Scanner lector = new Scanner(System.in);
static Scanner Lector2 = new Scanner(System.in);

	public static void main(String[] args) {
		crearProducto();
		verProducto();
	}
	public static void crearProducto() {
		String nombre, descripcion, tipoProducto;
		int precio;
		System.out.println("Ingrese el nombre del producto");
		nombre= lector.nextLine();
		System.out.println("Ingrese la descripción del producto");
		descripcion= lector.nextLine();
		System.out.println("Ingrese el tipo de producto");
		tipoProducto= lector.nextLine();
		System.out.println("Ingrese el precio del producto");
		precio= Lector2.nextInt();
		new ProductoController().agregarProducto(nombre,tipoProducto, descripcion, precio);
	}
	public static void verProducto() {
		System.out.println("Ingrese el nombre del producto");
		String nombre = lector.nextLine();
		Producto p = new ProductoController().verProducto(nombre);
		if(p!=null) {
			System.out.println("Producto"+p);
		}else {
			System.out.println("Ingrese un nombre de producto válido");
		}
	}
	}


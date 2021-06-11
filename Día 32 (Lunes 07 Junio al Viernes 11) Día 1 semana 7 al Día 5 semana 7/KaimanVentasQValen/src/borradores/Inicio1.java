package borradores;

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
		String nombre, tipoProducto, descripcion;
		int precio;
		//"1.Crear Producto (Agregar Sysout)
		/*Agregar un Do While para que mientras quiera agregar otro producto se vaya
		 * desplegando los requisitos de atributos del producto hasta que decida
		 * salir de crear producto.
		 */
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
		System.out.println("Ingrese el nombre del producto a visualizar");
		String nombre = lector.nextLine();
		Producto p = new ProductoController().verProducto(nombre);
		if(p!=null) {
			System.out.println("Producto"+p);
		}else {
			System.out.println("Ingrese un nombre de producto creado");//hacer un ciclo while hasta que encuentre un producto con igual nombre.
		}/* Crear opción ver productos y que me despliegue todos los productos con el toString agregados por el metodo anterior.
		se puede? y no ver solo uno 
		*/
	}
	}


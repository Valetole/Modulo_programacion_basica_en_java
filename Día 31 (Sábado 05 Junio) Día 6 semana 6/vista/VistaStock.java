package vista;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import modelo.Stock;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import modelo.Producto;

public class VistaStock {
static Scanner lector = new Scanner(System.in);
static Scanner lector1 = new Scanner(System.in);

	public static void main(String[] args) throws ParseException {
		crearStock();
		
	}
	public static void crearStock () throws ParseException {
		String fechaTexto;//debería agregar string fecha texto a mi clase stock o esto sería solo valido para validar mi fecha?
		Date fecha;
		int cantidad;
		ArrayList <Producto> productos;
		System.out.println("Ingrese la fecha de Stock(dd/MM/XXXX)");
		fechaTexto= lector.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		fecha = sdf.parse(fechaTexto);
		System.out.println("Stock de productos:"+fecha);
		/*new StockController().publicarStock(Date fecha, int cantidad, ArrayList<Producto> productos);/*Debo
		tener mi objeto producto creado o mi arrayList y como lo traigo aca?
		*/
	}
	
	
}


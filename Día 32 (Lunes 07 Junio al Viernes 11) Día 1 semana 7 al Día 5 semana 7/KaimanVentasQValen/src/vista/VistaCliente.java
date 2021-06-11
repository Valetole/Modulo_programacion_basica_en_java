package vista;

import java.util.Scanner;
import modelo.Cliente;
import controladores.ClienteController;


public class VistaCliente {
	static Scanner lector = new Scanner(System.in);
	
	public static void main(String[] args) {
		agregarCliente();
		System.out.println(new ClienteController().listarClientes());
		buscarCliente();
		
	}//Linea main
	public static void buscarCliente() {
		System.out.println("ingrese correo cliente para busqueda\n");
		String correoelectronico = lector.nextLine();
		Cliente clienteUno = new ClienteController().buscarCliente(correoelectronico);
		if (clienteUno!=null) {
			System.out.println("Cliente encontrado \n"+clienteUno+"\n");
		}else {
			System.out.println("No existe un cliente con el correo ingresado");
		}
	}
	public static void agregarCliente() {
	System.out.println("...AGREGAR NUEVO CLIENTE...");
	System.out.println("ingrese su nombre");
	String nombre=lector.nextLine();
	System.out.println("ingrese su apellido");
	String apellido=lector.nextLine();
	System.out.println("ingrese su telefono");
	String telefono=lector.nextLine();
	System.out.println("ingrese su correo electronico");
	String correoelectronico=lector.nextLine();
	ClienteController cc=new ClienteController();
	cc.registrarCliente(nombre, apellido, telefono, correoelectronico);
	System.out.println(cc.registrarCliente(nombre, apellido, telefono, correoelectronico));

	
	}
	}//Linea Cierre


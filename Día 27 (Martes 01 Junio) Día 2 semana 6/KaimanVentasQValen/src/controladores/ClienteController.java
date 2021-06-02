package controladores;

import java.util.Map;
import java.util.HashMap;
import modelo.Cliente;

public class ClienteController {
	static Map<String,Cliente> clientes = new HashMap<String,Cliente>();

	public String registrarCliente(String nombre, String apellido, String telefono, String correoelectronico) {
		Cliente clienteUno = new Cliente(nombre, apellido,telefono,correoelectronico);
		clientes.put(correoelectronico, clienteUno);
		return "Cliente registrado correctamente\n";
	}
	public Cliente buscarCliente(String correo) {
		Cliente clienteUno = clientes.get(correo);
		return clienteUno;
	}
	public Map<String, Cliente> listarClientes() {
		return clientes;
	}
}

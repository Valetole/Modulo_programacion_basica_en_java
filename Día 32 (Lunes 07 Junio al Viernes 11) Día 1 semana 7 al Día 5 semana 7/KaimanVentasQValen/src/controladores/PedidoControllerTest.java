package controladores;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.Cliente;
import modelo.Producto;

class PedidoControllerTest {

	@Test
	void testCrearPedido () {
		Cliente c = new Cliente("vale","muñoz","942207752","vale@gmail.com");
		Producto p = new Producto("pan pita", "pan", "String descripcion", 200);
		PedidoController pc = new PedidoController();
		String respuesta=pc.crearPedido(2, c, p, 10, "A domicilio");
		String esperado="Su pedido ha sido creado";
		System.out.println(PedidoController.pedidos.get("vale@gmail.com").getProducto().getNombre());
		assertEquals(esperado,respuesta);
		
		
	}

}

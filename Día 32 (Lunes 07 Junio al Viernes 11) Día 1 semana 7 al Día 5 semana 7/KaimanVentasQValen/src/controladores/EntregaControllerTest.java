package controladores;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.Pedido;

class EntregaControllerTest {

	@Test
	void testNuevaEntrega() {
		EntregaController e = new EntregaController();
		Pedido p= new Pedido();
		String respuesta=e.nuevaEntrega(p,"tipoEntrega");
		String esperado="Nueva entrega añadida";
		assertEquals(esperado,respuesta);
		
	}

}

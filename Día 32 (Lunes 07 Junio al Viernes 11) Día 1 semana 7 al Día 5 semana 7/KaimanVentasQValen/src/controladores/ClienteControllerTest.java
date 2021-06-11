package controladores;

import static org.junit.Assert.assertEquals;

//import static org.junit.jupiter.api.Assertions.*; Para que sirve?

import org.junit.jupiter.api.Test;

class ClienteControllerTest {

	@Test
	void testRegistrarCliente() {
		ClienteController cn = new ClienteController();
		String respuesta = cn.registrarCliente("vale", "mu�oz","942207752", "vale@null.cl");
		String esperado = "Cliente registrado correctamente";
		assertEquals(esperado,respuesta);
		
	}

}

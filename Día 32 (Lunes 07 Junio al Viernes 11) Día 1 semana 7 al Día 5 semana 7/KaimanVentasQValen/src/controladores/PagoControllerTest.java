package controladores;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PagoControllerTest {

	@Test
	void testCalcularPago() {
		PagoController pago = new PagoController();
		int respuesta = pago.calcularPago(5, 200);
		int esperado=1000;//como se plantea esto?
		assertEquals(esperado,respuesta);
	}

}

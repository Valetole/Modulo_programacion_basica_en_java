package controladores;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.Entrega;


class DomicilioControllerTest {

	@Test
	void testIngresarDomicilio () {
		DomicilioController d=new DomicilioController();
		Entrega e = new Entrega();		
		String respuesta = d.ingresarDomicilio(e,"domicilio");
		String esperado ="Direccion ingresada correctamente";
		assertEquals(esperado,respuesta);
		
		
		
		
	}

}

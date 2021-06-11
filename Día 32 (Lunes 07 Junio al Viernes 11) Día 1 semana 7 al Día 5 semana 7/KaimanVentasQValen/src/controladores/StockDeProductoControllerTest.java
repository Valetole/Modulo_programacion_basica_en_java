package controladores;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.Producto;

class StockDeProductoControllerTest {

	@Test
	void testAgregarStockProducto() {
		Producto p = new Producto("pan pita", "pan", "String descripcion", 200);
		SistemaStock s= new StockDeProductoController();
		String respuesta=s.publicarStock(p, 60);
		String esperado = "Se añadio stock al producto";
		System.out.println(StockDeProductoController.stocks.get("pan pita").getCantidad());
		System.out.println(StockDeProductoController.stocks.get("pan pita").getProducto().getNombre());
		assertEquals(esperado,respuesta);
				
	}

}

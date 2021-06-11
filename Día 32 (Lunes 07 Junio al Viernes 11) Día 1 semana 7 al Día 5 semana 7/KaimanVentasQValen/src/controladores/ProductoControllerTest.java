package controladores;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.Producto;

class ProductoControllerTest {

	@Test
	void testAgregarProducto() {
		ProductoController a = new ProductoController();
		String respuesta = a.agregarProducto("Pan pita","Pan","Pan libre de manteca", 200);
		String respuestaEsperada= "Nuevo producto agregado";//Hacer debug de mayusuculas para que pasen pruebas
		assertEquals(respuestaEsperada,respuesta);
	}
	/*Cuando yo comparo un objeto con otro objeto a java le interesa
	 la referencia de memoria, es decir, donde se crean esos objetos, si creo uno en el controlador y 
	 otro en este set de pruebas aunque sean identicos el test me dará error.
	 para compararlos yo debiese hacerlo a través de sus atributos por ejemplo
	 con su getNombre(), o a través de todos sus atributos. 
	 Para tener pruebas requiero que retornen si o si. por ejemplo si tengo
	 un modificar producto puedo entregar un 1 producto modificado y 0 si no encontró ningun producto a modificar 
	 */
	@Test
	void testVerProducto () {
		ProductoController a = new ProductoController();
		a.agregarProducto("Pan pita","Pan","Pan libre de manteca",200);//Se agrega el producto para poder buscarlo
		Producto obtenido = a.verProducto("Pan pita");//creado en el constructor productoController
		Producto esperado= new Producto("Pan pita","Pan","Pan libre de manteca",200);//creado aca en el test. Retorna tipo producto
		assertEquals(esperado.getNombre(),obtenido.getNombre());//Puedo hacer un equals para cada atributo para compararlos todos.
	}
	
	@Test
	void testModificarProducto() {
		ProductoController a = new ProductoController();
		a.agregarProducto("Pan pita","pan","Pan libre de manteca", 200);
		int obtenido = a.modificarProducto("Pan pita","Pan","Pan libre de manteca",200);//Retorna tipo int
		int esperado =1;//cada variable de metodo puede tener el mismo nombre. en diferente metodo el caso obtenido/esperado.
		assertEquals(esperado,obtenido);
	}
	/*void testListarProductos() {
		Map<String, Producto> lista = new ProductoController().listarProductos();
		for(Map.Entry<String, Producto> producto:lista.entrySet()) {
		System.out.println(producto);
		
	}
	/*@Test
	void testListarProductos() {
		ProductoController p = new ProductoController();
		p.listarProductos();
		
		assertThat(productos,IsMapContaining.hasEntry("pan pita",p));
		
	}*/
}

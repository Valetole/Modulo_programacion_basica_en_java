package controladores;

import java.util.HashMap;

import java.util.Map;

import modelo.Producto;

public class ProductoController {
		static Map<String, Producto> productos = new HashMap<String,Producto>();
		
		
		public String agregarProducto(String nombre, String tipoProducto, String descripcion, int precio) {
						productos.put(nombre, new Producto(nombre, tipoProducto, precio, descripcion));
						return "Nuevo Producto";
	}
		public Producto verProducto(String nombre ) {
			return productos.get(nombre);
		}

}

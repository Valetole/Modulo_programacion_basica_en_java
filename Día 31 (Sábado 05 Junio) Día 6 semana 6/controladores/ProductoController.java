package controladores;

import java.util.HashMap;

import java.util.Map;

import modelo.Producto;

public class ProductoController {
	static Map<String, Producto> productos = new HashMap<String, Producto>();	
	
		public String agregarProducto(String nombre, String tipoProducto, String descripcion, int precio) {
		productos.put(nombre, new Producto(nombre, tipoProducto, descripcion, precio));
		return "Nuevo producto agregado";
	}
		
		public Producto verProducto(String nombre) {
			return productos.get(nombre);
		}
		public int modificarProducto(String nombre, String tipoProducto, String descripcion, int precio) {
			Producto p = verProducto(nombre);
			if(p!=null) {
				p.setNombre(nombre);
				p.setPrecio(precio);
				return 1;
			}else {
			return 0;
		}
}
}

package controladores;

import java.util.HashMap;

import java.util.Map;


import modelo.Producto;

public class ProductoController {
	static Map<String, Producto> productos = new HashMap<String, Producto>();	
	
		public String agregarProducto(String nombre, String tipoProducto, String descripcion, int precio) {
			productos.put(nombre, new Producto(nombre, tipoProducto, descripcion, precio));
					return "Nuevo producto agregado";
					}/* if (productos.containsKey(nombre)) {
					return "Ya existe un producto con ese nombre";
					}else{ productos.put(nombre, new Producto(nombre, tipoProducto, descripcion, precio));
					return "Nuevo producto agregado";
					}
					*/
		
		public Producto verProducto(String nombre) {
			return productos.get(nombre);//nombre.equalsIgnoreCase(nombre)?
				}
		
		public int modificarProducto(String nombre, String tipoProducto, String descripcion, int precio) {//dejo solo nombre?
			Producto p = verProducto(nombre);
			if(p!=null) {
				p.setPrecio(precio);// aca debería venir con el precio de agregar producto? se inicializa aca?
				return 1;
			}else {
				return 0;
				}
		}
				
		public Map<String, Producto> listarProductos() {
			return productos;//falta test junit
		}
}

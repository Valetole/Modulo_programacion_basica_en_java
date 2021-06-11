package controladores;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import modelo.Producto;
import modelo.StockDeProducto;
import modelo.Stocks;

public class StockDeProductoController implements SistemaStock {
	static Map<String, StockDeProducto> stocks = new HashMap<String,StockDeProducto> ();
	
	/*public String agregarStockProducto(Producto producto, int cantidad) {
		StockDeProducto auxiliar= new StockDeProducto(producto, cantidad);
		stocks.put(producto.getNombre(), auxiliar);
		//como le paso mi parametro producto para agregarle la cantidad de stock a cada producto 
		return "Se añadio stock al producto";
	}*///ESTA COMO METODO DIRECTO ABAJO CON INTERFACE

	@Override
	public String publicarStock(Producto producto, int cantidad) {
		StockDeProducto auxiliar= new StockDeProducto(producto, cantidad);
		stocks.put(producto.getNombre(), auxiliar);
		//como le paso mi parametro producto para agregarle la cantidad de stock a cada producto 
		return "Se añadio stock al producto";
	}

	@Override
	public Stocks verStock(Date fecha) {
		// TODO Auto-generated method stub
		return null;
	}

}
   /*public verStockProducto () {
	   StockDeProducto stockProductActual = StockDeProductoController.stocks.get("nombre del producto").getValue();//con esto tengo la instancia
   }
}
//1.Buscar el producto que va agregarle stock
//2. si encuentre el producto le pido la cantidad
//3. agrego la cantidad al producto
//4. mostrar */
package controladores;

import java.util.Map;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;


import modelo.StockDeProducto;
import modelo.Stocks;

public class StocksController {
	static Map<Date,Stocks> stocks = new HashMap<Date, Stocks>();
	
	
	public Stocks publicarStock(Date fecha, ArrayList<StockDeProducto> stockProductos) {
		Stocks nuevo = new Stocks(fecha, stockProductos);//cantidad es por todos los productos no por uno :(: Solucionado creando otra clase
		stocks.put(fecha, nuevo);
		return nuevo;//Falta prueba Junit
	}

	public Stocks verStock(Date fecha) {
		return stocks.get(fecha);
	}

}


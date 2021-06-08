package controladores;

import java.util.Map;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import modelo.Producto;
import modelo.Stock;

public class StockController implements SistemaStock {
	static Map<Date,Stock> stocks = new HashMap<Date, Stock>();
	
	@Override
	public Stock publicarStock(Date fecha, int cantidad, ArrayList<Producto> productos) {
		Stock nuevo = new Stock(fecha, cantidad, productos);
		stocks.put(fecha, nuevo);
		return nuevo;
	}

	public Stock verStock(Date fecha) {
		return stocks.get(fecha);
	}

	@Override
	public void DescontarStock(Date fecha, ArrayList<Producto> productos) {
		// TODO Auto-generated method stub
		
	}
	
}

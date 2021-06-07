package controladores;

import modelo.Stock;

import java.util.ArrayList;
import java.util.Date;

import modelo.Producto;

public interface SistemaStock {
  
	public Stock publicarStock(Date fecha, int cantidad, ArrayList<Producto> productos);

	public Stock verStock(Date fecha);
	
	public void DescontarStock(Date fecha, ArrayList<Producto> productos);
	
}

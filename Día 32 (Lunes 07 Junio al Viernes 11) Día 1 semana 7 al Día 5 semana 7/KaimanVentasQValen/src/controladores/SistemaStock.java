package controladores;

import modelo.Stocks;

import java.util.Date;

import modelo.Producto;

public interface SistemaStock {
  
	public String publicarStock(Producto producto, int cantidad);

	public Stocks verStock(Date fecha);
	
	//public void DescontarStock();//Revisar que parametros recibo para descontar stock y crear su respectivo constructor.
	
}

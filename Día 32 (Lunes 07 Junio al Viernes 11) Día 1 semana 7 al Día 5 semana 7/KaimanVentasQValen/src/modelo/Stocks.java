package modelo;

import java.util.ArrayList;

import java.util.Date;

public class Stocks {
	private Date fecha;
    ArrayList<StockDeProducto> stockProductos;//aARREGLAR HACER ARRAY DE STOCKDEPRPDUCTO ACTUALIZAR
	
    
    public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public ArrayList<StockDeProducto> getStockProductos() {
		return stockProductos;
	}
	public void setStockProductos(ArrayList<StockDeProducto> stockProductos) {
		this.stockProductos = stockProductos;
	}
	public Stocks(Date fecha, ArrayList<StockDeProducto> stockProductos) {
		super();
		this.fecha = fecha;
		this.stockProductos = stockProductos;
	}
	public Stocks() {
		
	}
	@Override
	public String toString() {
		return "Stocks [fecha=" + fecha + ", stockProductos=" + stockProductos + "]";
	}


}


    
  
	



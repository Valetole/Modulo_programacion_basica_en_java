package modelo;

import java.util.Date;

public class Stock {
	private Date fecha;
	private int cantidad;
    Producto [] productos;
    
    
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Producto[] getProductos() {
		return productos;
	}
	public void setProductos(Producto[] productos) {
		this.productos = productos;
	}
	public Stock(Date fecha, int cantidad, Producto[] productos) {
		super();
		this.fecha = fecha;
		this.cantidad = cantidad;
		this.productos = productos;
	} 
	
}


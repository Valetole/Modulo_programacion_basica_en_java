package modelo;

import java.util.ArrayList;

import java.util.Date;

public class Stock {
	private Date fecha;
	private int cantidad;
    ArrayList<Producto> productos;
    
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
	public ArrayList<Producto> getProductos() {
		return productos;
	}
	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}
	public Stock(Date fecha, int cantidad, ArrayList<Producto> productos) {
		super();
		this.fecha = fecha;
		this.cantidad = cantidad;
		this.productos = productos;
	}
	@Override
	public String toString() {
		return "Stock [fecha=" + fecha + ", cantidad=" + cantidad + ", productos=" + productos + "]";
	}
    
    public Stock () {
	productos=new ArrayList<Producto>();
    }
    
}
	



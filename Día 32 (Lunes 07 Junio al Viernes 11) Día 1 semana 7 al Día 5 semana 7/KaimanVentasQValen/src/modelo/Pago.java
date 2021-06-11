package modelo;

import java.util.Date;

public class Pago {
	
	private Pedido pedido;
	private int total;//pero este lo calcula en un metodo
	private boolean tipoPago;//cambiar a String
	private Date fecha;
	
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public boolean isTipoPago() {
		return tipoPago;
	}
	public void setTipoPago(boolean tipoPago) {
		this.tipoPago = tipoPago;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Pago(Pedido pedido, int total, boolean tipoPago, Date fecha) {
		super();
		this.pedido = pedido;
		this.total = total;
		this.tipoPago = tipoPago;
		this.fecha = fecha;
	}
	public Pago() {
	
	}
	@Override
	public String toString() {
		return "Pago [pedido=" + pedido + ", total=" + total + ", tipoPago=" + tipoPago + ", fecha=" + fecha + "]";
	}
	
	
}

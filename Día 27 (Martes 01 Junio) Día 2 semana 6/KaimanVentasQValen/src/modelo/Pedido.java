package modelo;

public class Pedido {
	private long idPedido;
	private Cliente cliente;
	private Producto producto;
	private Pago pago;
	private Entrega entrega;
	
	public Pedido() {
		
	}
	
	public Pedido(long idPedido, Cliente cliente, Producto producto, Pago pago, Entrega entrega) {
		super();
		this.idPedido = idPedido;
		this.cliente = cliente;
		this.producto = producto;
		this.pago = pago;
		this.entrega = entrega;
	}

	public long getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(long idPedido) {
		this.idPedido = idPedido;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public Pago getPago() {
		return pago;
	}
	public void setPago(Pago pago) {
		this.pago = pago;
	}
	public Entrega getEntrega() {
		return entrega;
	}
	public void setEntrega(Entrega entrega) {
		this.entrega = entrega;
	}
}

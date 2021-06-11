package modelo;

public class Pedido {
	private long idPedido;
	private Cliente cliente;
	private Producto producto;
	private int cantidadProducto;
	private String tipoPedido;//Si es compra o reserva
	
	
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
	public int getCantidadProducto() {
		return cantidadProducto;
	}
	public void setCantidadProducto(int cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}
	public String getTipoPedido() {
		return tipoPedido;
	}
	public void setTipoPedido(String tipoPedido) {
		this.tipoPedido = tipoPedido;
	}
	public Pedido(long idPedido, Cliente cliente, Producto producto, int cantidadProducto, String tipoPedido) {
		super();
		this.idPedido = idPedido;
		this.cliente = cliente;
		this.producto = producto;
		this.cantidadProducto = cantidadProducto;
		this.tipoPedido = tipoPedido;
	}
	public Pedido() {
		
			}
	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", cliente=" + cliente + ", producto=" + producto
				+ ", cantidadProducto=" + cantidadProducto + ", tipoPedido=" + tipoPedido + "]";
	}
	
	
}
	


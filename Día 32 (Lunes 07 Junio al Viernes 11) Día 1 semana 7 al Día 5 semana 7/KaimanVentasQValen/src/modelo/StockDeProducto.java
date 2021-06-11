package modelo;

public class StockDeProducto {
	private Producto producto;
	private int cantidad;//agregar tipoDeStock al igual que en TipoEntrega si es a domicilio o retiro
	//en este caso consultar bien si tipoStock reserva o compra y no necesita otra clase para poder publicar ambos con su respectiva cantidad
	
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public StockDeProducto(Producto producto, int cantidad) {
		super();
		this.producto = producto;
		this.cantidad = cantidad;
	}
	public StockDeProducto() {
		
	}
	@Override
	public String toString() {
		return "StockDeProducto [producto=" + producto + ", cantidad=" + cantidad + "]";
	}
	
}


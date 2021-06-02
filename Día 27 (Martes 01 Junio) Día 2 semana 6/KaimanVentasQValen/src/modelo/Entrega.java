package modelo;

public class Entrega {
	private Pedido pedido;
	private boolean tipoEntrega;
	
		public Entrega() {
		
	}
		
		
	public Entrega(Pedido pedido, boolean tipoEntrega) {
			super();
			this.pedido = pedido;
			this.tipoEntrega = tipoEntrega;
		}

	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public boolean isTipoEntrega() {
		return tipoEntrega;
	}
	public void setTipoEntrega(boolean tipoEntrega) {
		this.tipoEntrega = tipoEntrega;
	}
	
	
}


package modelo;

public class Entrega {
	private Pedido pedido;
	private String tipoEntrega;// como boolean o String?
	
		public Entrega() {
		
	}
		
		
	public Entrega(Pedido pedido, String tipoEntrega) {
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
	public String isTipoEntrega() {
		return tipoEntrega;
	}
	public void setTipoEntrega(String tipoEntrega) {
		this.tipoEntrega = tipoEntrega;
	}


	@Override
	public String toString() {
		return "Entrega [pedido=" + pedido + ", tipoEntrega=" + tipoEntrega + "]";
	}
	
	
}


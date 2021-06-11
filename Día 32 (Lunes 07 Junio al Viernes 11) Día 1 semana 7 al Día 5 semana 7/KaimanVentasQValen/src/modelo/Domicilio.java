package modelo;

public class Domicilio {
	private Entrega entrega;//Crear una clase intermedia que tenga entrega y Domicilio y se crea solo cuando mi tipo entrega sea a domicilio
	private String direccion;//Calle numero Poblacion comuna etc buena practica una clase
	
	public Entrega getEntrega() {
		return entrega;
	}
	public void setEntrega(Entrega entrega) {
		this.entrega = entrega;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Domicilio(Entrega entrega, String direccion) {
		super();
		this.entrega = entrega;
		this.direccion = direccion;
	}
	public Domicilio() {
		
	}
	@Override
	public String toString() {
		return "Direccion [entrega=" + entrega + ", direccion=" + direccion + "]";
	}
	
	

}

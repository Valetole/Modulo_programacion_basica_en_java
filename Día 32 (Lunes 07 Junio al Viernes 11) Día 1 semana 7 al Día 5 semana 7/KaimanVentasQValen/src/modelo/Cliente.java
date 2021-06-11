package modelo;

public class Cliente {
	
	private String nombre;
	private String apellido;
	private String telefono;
	private String correoelectronico;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreoelectronico() {
		return correoelectronico;
	}
	public void setCorreoelectronico(String correoelectronico) {
		this.correoelectronico = correoelectronico;
	}
	public Cliente(String nombre, String apellido, String telefono, String correoelectronico) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.correoelectronico = correoelectronico;
	}
	
	public Cliente () {
		
	}
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono
				+ ", correoelectronico=" + correoelectronico + "]";
	}
}

	
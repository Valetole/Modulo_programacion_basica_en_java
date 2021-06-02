package modelo;

public class Vendedor {

	private String nombre;
	private String apellido;
	private String telefono;
	private String correoElectronico;
	
	public Vendedor(String nombre, String apellido, String telefono, String correoElectronico) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.correoElectronico = correoElectronico;
	}
	
	public Vendedor() {//constructor vacio	
	}

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

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	
	
}

	
	


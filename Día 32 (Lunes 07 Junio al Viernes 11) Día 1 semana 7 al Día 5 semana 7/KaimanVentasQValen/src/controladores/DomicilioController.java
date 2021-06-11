package controladores;

import java.util.HashMap;
import java.util.Map;

import modelo.Domicilio;
import modelo.Entrega;


public class DomicilioController {
	static Map<String,Domicilio> direcciones = new HashMap<String,Domicilio>();
	
	
	public String ingresarDomicilio (Entrega entrega, String direccion) {//entrega.get(tipoEntrega)="aDomicilio"
		Domicilio d = new Domicilio(entrega,direccion);
		direcciones.put(direccion, d);
		return "Direccion ingresada correctamente";/*Entrega tiene tipoEntrega: String yo quiero que si es aDomicilio
		me pida ingresar dirección, y así la clase Domicilio tendra como atributo: la Entrega tipo entrega, y dirección*/
		
	}
	//Listar domicilios.
}


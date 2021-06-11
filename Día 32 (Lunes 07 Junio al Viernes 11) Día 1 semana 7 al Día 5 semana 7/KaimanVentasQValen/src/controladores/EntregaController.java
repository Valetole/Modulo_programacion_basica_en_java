package controladores;


import java.util.HashMap;
import java.util.Map;

import modelo.Entrega;
import modelo.Pedido;


public class EntregaController {
	static Map<String, Entrega>  entregas= new HashMap<String, Entrega>();	
	
	public String nuevaEntrega (Pedido pedido, String tipoEntrega) {
		entregas.put(tipoEntrega, new Entrega(pedido, tipoEntrega));
				return "Nueva entrega añadida";//HAcer Test Junit. 
				//pero aca me pasa que mi lleva key del hashMap será tipoEntrega y siempre seran o Adomicilio o Retiro?
				
	}
	public Entrega verEntrega (String tipoEntrega) {
		return entregas.get(tipoEntrega);//Hacer Test Junit
	}
}

package controladores;

import java.util.HashMap;
import java.util.Map;

import modelo.Cliente;
import modelo.Pedido;
import modelo.Producto;



public class PedidoController {
	static Map<String, Pedido> pedidos= new HashMap<String, Pedido>();
	/*static Map<Cliente, Pedido> pedidosClientes = new HashMap<Cliente, Pedido>();/*puedo crear 2 hashMap diferentes 
	para ver por tipo y por Cliente mi key*/

	public String crearPedido(long idPedido, Cliente cliente, Producto producto, int cantidadProducto, String tipoPedido) {
		Pedido pedidoUno= new Pedido (idPedido,cliente,producto,cantidadProducto,tipoPedido);
		pedidos.put(cliente.getCorreoelectronico(), pedidoUno);
		return "Su pedido ha sido creado";
		
	}
}

package modelo;

import java.util.Date;

public class Pago {
	private boolean tipoPago;
	private int monto;
	private Date fecha;
	
	public Pago() {//Constructor Vacío, por defecto queda con los valores predeterminado.
		
	}
	public Pago(boolean tipoPago, int monto, Date fecha) {
		super();
		this.tipoPago = tipoPago;
		this.monto = monto;
		this.fecha = fecha;
	}
	public boolean isTipoPago() {
		return tipoPago;
	}
	public void setTipoPago(boolean tipoPago) {
		this.tipoPago = tipoPago;
	}
	public int getMonto() {
		return monto;
	}
	public void setMonto(int monto) {
		this.monto = monto;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
		
	}


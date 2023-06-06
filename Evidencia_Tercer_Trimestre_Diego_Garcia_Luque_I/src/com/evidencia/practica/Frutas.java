package com.evidencia.practica;

import java.util.Date;

public class Frutas extends Padre {
	String nombreProducto;
	double precioUnitario;
	
	public Frutas(int unidadesenStock, int unidadesenPedido, Date fechaCaducida, String nombreProducto,
			double precioUnitario) {
		super(unidadesenStock, unidadesenPedido, fechaCaducida);
		this.nombreProducto = nombreProducto;
		this.precioUnitario = precioUnitario;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	
	
	
	
	
}

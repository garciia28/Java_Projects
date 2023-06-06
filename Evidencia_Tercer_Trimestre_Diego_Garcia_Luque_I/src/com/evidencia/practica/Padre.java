package com.evidencia.practica;

import java.util.Date;

public class Padre {
	int unidadesenStock;
	int unidadesenPedido;
	Date fechaCaducida;
	
	public Padre(int unidadesenStock, int unidadesenPedido, Date fechaCaducida) {
		super();
		this.unidadesenStock = unidadesenStock;
		this.unidadesenPedido = unidadesenPedido;
		this.fechaCaducida = fechaCaducida;
	}

	public int getUnidadesenStock() {
		return unidadesenStock;
	}

	public void setUnidadesenStock(int unidadesenStock) {
		this.unidadesenStock = unidadesenStock;
	}

	public int getUnidadesenPedido() {
		return unidadesenPedido;
	}

	public void setUnidadesenPedido(int unidadesenPedido) {
		this.unidadesenPedido = unidadesenPedido;
	}

	public Date getFechaCaducida() {
		return fechaCaducida;
	}

	public void setFechaCaducida(Date fechaCaducida) {
		this.fechaCaducida = fechaCaducida;
	}
	
	
}

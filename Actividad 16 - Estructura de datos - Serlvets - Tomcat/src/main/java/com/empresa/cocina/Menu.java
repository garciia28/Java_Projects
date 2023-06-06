package com.empresa.cocina;

public class Menu {
	private String comida;
    private String bebida;
    private String postre;
    
	public Menu(String comida, String bebida, String postre) {
		super();
		this.comida = comida;
		this.bebida = bebida;
		this.postre = postre;
	}

	public String getComida() {
		return comida;
	}

	public void setComida(String comida) {
		this.comida = comida;
	}

	public String getBebida() {
		return bebida;
	}

	public void setBebida(String bebida) {
		this.bebida = bebida;
	}

	public String getPostre() {
		return postre;
	}

	public void setPostre(String postre) {
		this.postre = postre;
	}

}

package com.array.esercizi;

public class TipoCapoAbigliamento {
	
	protected String marca;
	protected String modello;
	protected double costo;
	

	public double getCosto() {
		return costo;
	}
	
	public double getApplicaSconto(double sconto) {
		return costo - (costo*sconto/100);
	}
	
	public void getModificaCosto(double c) {
		this.costo = c;
		
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public TipoCapoAbigliamento(String marca, String modello, double costo) {
		super();
		this.marca = marca;
		this.modello = modello;
		this.costo = costo;
	}
	

}

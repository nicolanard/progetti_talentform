package com.array.esercizi;

public class Car2 {
	
	protected double resa;
	protected double serbatoio;
	protected boolean benzina;
	
	public void aggiungiCarburante(double litri) {
		serbatoio += litri;
	}
	
	public void faiUnGiro(double kilometri) {
		double carburanteConsumato = kilometri / resa;
		
		if(carburanteConsumato <= serbatoio) {
			serbatoio -= carburanteConsumato;
		}
	}
	
	public boolean usaBenzina() {
		return benzina;
	}
	
	public boolean usaGasolio() {
		return !benzina;
	}
	
	public double getSerbatoio() {
		return serbatoio;
	}
	
	public String getTipoDiCarburante() {
		String tipoCarburante;
		if(benzina == true) {
			tipoCarburante = "benzina";
		} else {
			tipoCarburante = "gasolio";
		}
		
		return tipoCarburante;
	}
	
	public Car2(String unCarburante, double unaResa, double litri) {
		serbatoio = litri;
		resa = unaResa;
		if(unCarburante.equalsIgnoreCase("benzina") == true) {
			benzina = true;
		}else {
			benzina = false;
		}
	}
	
	
	
	
	
	
	

}

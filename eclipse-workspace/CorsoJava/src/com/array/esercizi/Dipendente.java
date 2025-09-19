package com.array.esercizi;

public class Dipendente {
	
	protected String matricola;
	protected float stipendio;
	protected float straordinario;


	public String getMatricola() {
		return matricola;
	}


	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}


	public float getStipendio() {
		return stipendio;
	}


	public void setStipendio(float stipendio) {
		this.stipendio = stipendio;
	}
	
	public float getPaga(int ore) {
		return stipendio + ore * straordinario;
	}


	public float getStraordinario() {
		return straordinario;
	}


	public void setStraordinario(float straordinario) {
		this.straordinario = straordinario;
	}
	
	public void getStampa() {
		System.out.println("La matricola e': " + getMatricola());
		System.out.println("Lo stipendio e': " + getStipendio());
		System.out.println("Lo straordinario e': " + getStraordinario());
		
	}
	
	
	public Dipendente(String matricola, float stipendio, float straordinario) {
		super();
		this.matricola = matricola;
		this.stipendio = stipendio;
		this.straordinario = straordinario;
	}
	
	

}

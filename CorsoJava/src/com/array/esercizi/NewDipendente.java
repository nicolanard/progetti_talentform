package com.array.esercizi;
/*Progettare una classe di nome Dipendente. Tale classe prevede due variabili di
istanza una definita come nome, di tipo String e una definita come stipendio di
tipo double. Scrivere un costruttore senza parametri, un costruttore con due
parametri (nome e stipendio).La classe deve inoltre implementare i seguenti
metodi. Un metodo definito come public String getNome() che restituisce il nome
del dipendente. Un metodo definito come public double getStipendio() che
restituisce lo stipendio del dipendente. Un metodo public void
setStipendio(double nuovoStipendio) che modifica il valore dello stipendio. Un
metodo public void setNome(String nuovoNome) che cambia il nome al dipendente.
Aggiungere poi un metodo aumento(double percentuale), che incrementi lo
stipendio del dipendente secondo una certa percentuale.*/

public class NewDipendente {
	
	protected String nome;
	protected double stipendio;
	
	/*public double getAumento(double percentuale) {
		return stipendio + (stipendio + percentuale / 100);
	}*/
	
	public void aumento(double percentuale) {
		stipendio = stipendio + (stipendio * percentuale / 100);
	}
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nuovoNome) {
		this.nome = nuovoNome;
	}


	public double getStipendio() {
		return stipendio;
	}


	public void setStipendio(double nuovoStipendio) {
		this.stipendio = nuovoStipendio;
	}


	public NewDipendente() {
		
	}


	public NewDipendente(String nome, double stipendio) {
		
		this.nome = nome;
		this.stipendio = stipendio;
	}
	
	
	

}

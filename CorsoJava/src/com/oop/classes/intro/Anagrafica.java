package com.oop.classes.intro;

public class Anagrafica {
	
	private String titoloStudio;
	private String nome;
	private String cognome;
	private String nazione;
	
	/*public Anagrafica(String titoloStudio, String nome, String cognome, String nazione) {
		super();
		this.titoloStudio = titoloStudio;
		this.nome = nome;
		this.cognome = cognome;
		this.nazione = nazione;
	}*/
	
	
	
	public String getTitoloStudio() {
		return titoloStudio;
	}



	public void setTitoloStudio(String titoloStudio) {
		this.titoloStudio = titoloStudio;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getCognome() {
		return cognome;
	}



	public void setCognome(String cognome) {
		this.cognome = cognome;
	}



	public String getNazione() {
		return nazione;
	}



	public void setNazione(String nazione) {
		this.nazione = nazione;
	}



	public static void main(String[] args) {
			
			Anagrafica anagrafica = new Anagrafica();
			
			System.out.println(anagrafica.titoloStudio);
			System.out.println(anagrafica.nome);
			System.out.println(anagrafica.cognome);
			System.out.println(anagrafica.nazione);
	
		}

}

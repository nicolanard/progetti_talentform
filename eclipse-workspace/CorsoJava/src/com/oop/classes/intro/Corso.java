package com.oop.classes.intro;

public class Corso {
	
	//MODEL
	
	//ATTRIBUTI DELLA CLASSE
	private int ore = 0;
	private String oggettoCorso = "";
	private String frequenza = "";
	
	
	// COSTRUTTORE DELLA CLASSE DICHIARAZIONE
	public Corso(int ore, String oggettoCorso, String frequenza) { // PARAMETRI
		super();
		this.ore = ore;
		this.oggettoCorso = oggettoCorso;
		this.frequenza = frequenza;
	}

	//METODI DELLA CLASSE
	
	public String getFrequenza() {
		return frequenza;
	}

	public void setFrequenza(String frequenza) {
		this.frequenza = frequenza;
	}

	public static void main(String[] args) {
		Corso corso = new Corso (248, "Corso Backend", "Settimanale"); //INIZIALIZZAZIONE DEL COSTRUTTORE + ARGOMENTI
		
		System.out.println(corso.frequenza); // ATTRIBUTO
		System.out.println(corso.getFrequenza()); // METODO


	}

	

}

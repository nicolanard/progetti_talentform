package com.methods;

public class AnagraficaDati {
	
	public String getAnagrafica (String nome, String cognome) {
		return nome + " " + cognome;
	}
	
	public int getAnagrafica (int anni) {
		return anni;
	}
	
	public long getAnagrafica (long telefono) {
		return telefono;
	}

	public static void main(String[] args) {
		AnagraficaDati dati = new AnagraficaDati();
		
		String nome = "Nicola";
		String cognome = "Narducci";
		int anni = 24;
		long telefono = 38966433;
		
		

	}

}

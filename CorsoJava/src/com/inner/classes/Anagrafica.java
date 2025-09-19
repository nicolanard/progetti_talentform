package com.inner.classes;

public class Anagrafica {
	
	int telefono;
	String documentoIdentità;
	
	public Anagrafica(int telefono, String documentoIdentità) {
		super();
		this.telefono = telefono;
		this.documentoIdentità = documentoIdentità;
	}
	
	public class Utente {
		String nome;
		String cognome;
		
		public Utente(String nome, String cognome) {
			super();
			this.nome = nome;
			this.cognome = cognome;
		}
		
		public void utente() {
			System.out.println("Telefono: " + telefono + " Documento: " + documentoIdentità + " Nome: " + nome + " Cognome: " + cognome);
		}
		
	}

	public static void main(String[] args) {
		Anagrafica anagrafica = new Anagrafica(38966433, "XD332DVF");
		Anagrafica.Utente utente = anagrafica.new Utente("Nicola", "Narducci");
		
		utente.utente();

	}

}

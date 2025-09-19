package com.array.esercizi;

public class MainNewDipendente {

	public static void main(String[] args) {
		
		NewDipendente d = new NewDipendente();
		
		d.setNome("Nicola");
		d.setStipendio(1700.50);
		d.aumento(10);
		
		System.out.println("Il nome del 1^ Dipendente: " + d.getNome());
		System.out.println("Lo stipendio del 1^ Dipendente: " + d.getStipendio());
		
		NewDipendente nd = new NewDipendente("Arianna", 2000.50);
		nd.aumento(25);
		
		System.out.println("Il nome del 2^ Dipendente: " + nd.getNome());
		System.out.println("Lo stipendio del 2^ Dipendente: " + nd.getStipendio());
		
		
		
		
	}

}

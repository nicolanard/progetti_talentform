package com.array.esercizi;

public class Cellulare {
	
	private double carica;
	private int numeroChiamate;
	
	public Cellulare(double carica) {
		super();
		this.carica = carica;
	}
	
	// Metodo per ricaricare il credito
    public void ricarica(double unaRicarica) {
        if (unaRicarica > 0) {
            carica += unaRicarica;
        }
    }
    
    // Metodo per effettuare una chiamata
    public void chiama(double minutiDurata) {
        double costoChiamata = minutiDurata * 0.20;

        if (minutiDurata > 0 && carica >= costoChiamata) {
            carica -= costoChiamata;
            numeroChiamate++;
        } else {
            System.out.println("Credito insufficiente o durata non valida.");
        }
    }
    
	 // Metodo per conoscere il credito residuo
	 	public double numero404() {
	        return carica;
	    }

	    // Metodo per conoscere il numero di chiamate effettuate
	    public int getNumeroChiamate() {
	        return numeroChiamate;
	    }

	    // Metodo per azzerare il numero di chiamate
	    public void azzeraChiamate() {
	        numeroChiamate = 0;
	    }

	
	
}

package com.inner.classes;

import com.inner.classes.Anagrafica.Utente;

public class OrdineRossi {
	
	private String nomeCliente;
	private String cognomeCliente;
	private long partitaIva; 
	private long fatturaCliente;
	
	public OrdineRossi(String nomeCliente, String cognomeCliente, long partitaIva, long fatturaCliente) {
		super();
		this.nomeCliente = nomeCliente;
		this.cognomeCliente = cognomeCliente;
		this.partitaIva = partitaIva;
		this.fatturaCliente = fatturaCliente;
	}

	public class Prodotto {
		private int idProdotto;
		private String nomeProdotto;
		private int quantitàProdotto;
		private double prezzoProdotto;
		
		public Prodotto(int idProdotto, String nomeProdotto, int quantitàProdotto, double prezzoProdotto) {
			super();
			this.idProdotto = idProdotto;
			this.nomeProdotto = nomeProdotto;
			this.quantitàProdotto = quantitàProdotto;
			this.prezzoProdotto = prezzoProdotto;
		}
		
		public void stampaOrdine() {
			System.out.println(" Dettagli Cliente ");
			System.out.println("Nome Cliente: " + nomeCliente + " Cognome Cliente: " + cognomeCliente);
			System.out.println("Partita IVA: " + partitaIva + " Fattura Cliente: €" + fatturaCliente);
			System.out.println(" Dettagli Ordine ");
			System.out.println("Id Prodotto: " + idProdotto + " Nome Prodotto: " + nomeProdotto);
			System.out.println("Quantità Prodotto: " + quantitàProdotto + " Prezzo Prodotto: €" + prezzoProdotto);
		}
		
		
		
	}

	public static void main(String[] args) {
		OrdineRossi ordine = new OrdineRossi("Giorgio", "Rossi", 1234567890 , 2050);
		
		OrdineRossi.Prodotto prodotto = ordine.new Prodotto(01, "MacBook Air", 5, 5000);
		
		prodotto.stampaOrdine();
	}

}

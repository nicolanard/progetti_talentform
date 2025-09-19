package com.oop.classes.intro;

public class NewBank {
	
	private int saldo = 0;
	private int primoDeposito = 0;
	private int primoPrelievo = 0;
	private int secondoDeposito = 0;
	private int secondoPrelievo = 0;
	private int canoneAnnuo = 0;
	
	
	public int getPrimoDeposito() {
		return saldo + primoDeposito;
	}

	public void setPrimoDeposito(int primoDeposito) {
		this.primoDeposito = primoDeposito;
	}

	public int getPrimoPrelievo() {
		return getPrimoDeposito() - primoPrelievo;
	}

	public void setPrimoPrelievo(int primoPrelievo) {
		this.primoPrelievo = primoPrelievo;
	}

	public int getSecondoDeposito() {
		return getPrimoPrelievo() + secondoDeposito;
	}

	public void setSecondoDeposito(int secondoDeposito) {
		this.secondoDeposito = secondoDeposito;
	}

	public void setSecondoPrelievo(int secondoPrelievo) {
		this.secondoPrelievo = secondoPrelievo;
	}
	
	public int getSecondoPrelievo() {
		return getSecondoDeposito() - secondoPrelievo;
	}

	  // PASSAGGIO DELL'ATTTRIBUTO BALANCE SU SETBALANCE COME PARAMETRO = INCAPSULAMENTO DI BALANCE
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	public int getTotalCanoneAnnuo() {
		return getSecondoPrelievo() * canoneAnnuo/100;
	}
	
	public int getTotalAccount() {
		return getSecondoPrelievo() - getTotalCanoneAnnuo();
	}
	
	public void setCanoneAnnuo(int canoneAnnuo) {
		this.canoneAnnuo = canoneAnnuo;
	}


	public static void main(String[] args) {
		
		NewBank bank = new NewBank();
		
		bank.setCanoneAnnuo(10);
		bank.setSaldo(500);
		bank.setPrimoDeposito(50);
		bank.setPrimoPrelievo(30);
		bank.setSecondoDeposito(20);
		bank.setSecondoPrelievo(10);
		
		
	}
	
	
}

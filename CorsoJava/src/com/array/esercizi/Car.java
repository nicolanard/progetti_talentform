package com.array.esercizi;

/* Modificare la classe Car2, assegnata nell’esercizio 3.4, in modo tale che la
macchina riconosca il tipo di carburante che consuma(benzina o gasolio).
Implementate inoltre i seguenti metodi: 
void aggiungiCarburante(double litri)
che aggiunge carburante al serbatoio della macchina. 
void faiUnGiro(double kilometri) che simula una corsa di un'auto per un determinato numero di km.
boolean usaBenzina() che restituisce se il carburante della macchina è benzina.
boolean usaGasolio() che restituisce se il carburante della macchina è gasolio.
double getSerbatoio()che restituisce il numero di litri di carburante rimanenti
nel serbatoio. 
String getTipoDiCarburante() che restituisce il tipo di carburante della macchina. */

public class Car {
	
	protected double resaCarburante;
	protected double gas;
	protected boolean benzina;

	public void drive(double km) {
		gas = gas - (km / resaCarburante);
	}
	
	public double getResaCarburante() {
		return resaCarburante;
	}

	public void setResaCarburante(double resaCarburante) {
		this.resaCarburante = resaCarburante;
	}

	public double getGas() {
		return gas;
	}
	
	public void addGas(double rifornimento) {
		gas += rifornimento;
	}

	public void setGas(double gas) {
		this.gas = gas;
	}
	
	public Car(double kmL) {
		this.resaCarburante = kmL;
		this.gas = 0;
	}
	
	
	
	
	

}

package com.array.esercizi;

public class MainCar {

	public static void main(String[] args) {
		
		Car c = new Car(30);
		
		c.addGas(10);
		c.drive(150);
		
		
		System.out.println("Carburante rimanente: " + c.getGas());
		
		//String unCarburante, double unaResa, double litri
		Car2 car = new Car2("benzina", 50, 20);
		
		car.aggiungiCarburante(10);
		car.faiUnGiro(12);
		car.usaBenzina();
		car.usaGasolio();
		
	
		System.out.println("Serbatoio: " + car.getSerbatoio());
		System.out.println("Il tipo di carburante: " + car.getTipoDiCarburante());

	}

}

package com.oop.abstracts.classes;

public class MainLavoratoriAutonomi {

	public static void main(String[] args) {
		
		Commercialista c = new Commercialista(3000, 22, 15000, 70000, 67, 24, 15);
		
		System.out.println(c.getRedditoAnnuoNetto());
		
		System.out.println(c.getTotaleNetto());

	}

}

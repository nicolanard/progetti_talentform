package com.oop.classes.intro;

public class MainAnagrafica {

	public static void main(String[] args) {
		
		Anagrafica a1 = new Anagrafica();

		a1.setTitoloStudio("Laurea Triennale");
		a1.setNome("Nicola");
		a1.setCognome("Narducci");
		a1.setNazione("Italia");
		
		System.out.println(a1.getTitoloStudio());
		System.out.println(a1.getNome());
		System.out.println(a1.getCognome());
		System.out.println(a1.getNazione());
		
		System.out.println("------");
		
		DatiAnagrafica d1 = new DatiAnagrafica();
		
		d1.setTitoloStudio("Laurea Triennale");
		d1.setNome("Dino");
		d1.setCognome("Narducci");
		d1.setNazione("Italia");
		
		System.out.println(d1.getTitoloStudio());
		System.out.println(d1.getNome());
		System.out.println(d1.getCognome());
		System.out.println(d1.getNazione());
		
	}

}

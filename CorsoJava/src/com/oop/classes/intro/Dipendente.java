package com.oop.classes.intro;

public class Dipendente {
	
	private int stipendio;
	private int oreLavorate;
	private int retribuzioneOraria;
	
	

	public Dipendente(int stipendio, int oreLavorate, int retribuzioneOraria) {
		this.stipendio = stipendio;
		this.oreLavorate = oreLavorate;
		this.retribuzioneOraria = retribuzioneOraria;
	}
	
	public int getRetribuzioneOraria() {
		return stipendio/oreLavorate;
	}
	
	public int getStipendio() {
		return retribuzioneOraria * oreLavorate;
	}
	
	public int getOreLavorate() {
		return stipendio/retribuzioneOraria;
	}
	

	public static void main(String[] args) {
		
		Dipendente dipendente = new Dipendente(1500, 160, 15);
		//System.out.println(dipendente.oreLavorate);
		//System.out.println(dipendente.retribuzioneOraria);
		//System.out.println(dipendente.stipendio);
		System.out.println("Totale retribuzione dipendente: " + dipendente.getRetribuzioneOraria());
		System.out.println("Totale stipendio: " + dipendente.getStipendio());
		System.out.println("Totale ore lavorate: " + dipendente.getOreLavorate());
	}

}

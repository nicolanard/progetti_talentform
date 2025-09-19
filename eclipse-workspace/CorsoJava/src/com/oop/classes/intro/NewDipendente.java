package com.oop.classes.intro;

public class NewDipendente {
	
	private int stipendio = 0;
	private int oreLavorate = 0;
	
	
	public NewDipendente(int stipendio, int oreLavorate) {
		this.stipendio = stipendio;
		this.oreLavorate = oreLavorate;
	}

	public int getRetribuzioneOraria() {
		return stipendio/oreLavorate;
	}

	public static void main(String[] args) {
		
		NewDipendente newDipendente = new NewDipendente(1200, 80);
		
		System.out.println("La retribuzione oraria e' di : $ " + newDipendente.getRetribuzioneOraria());

	}

}

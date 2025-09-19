package com.oop.classes.intro;

public class Studente {
	
	private String nome = "";
	private int age = 0;
	private String nation = "";
	private String city = "";
	

	public Studente(String nome, int age, String nation, String city) {
		this.nome = nome;
		this.age = age;
		this.nation = nation;
		this.city = city;
	}
	
	public static void main(String[] args) {
		Studente studente = new Studente("Nicola", 24, "Italy", "Foggia");
		
		System.out.println("Il nome dello Studente e': " + studente.nome);
		System.out.println("L'eta e': " + studente.age);
		System.out.println("La nazione e': " + studente.nation);
		System.out.println("La città e': " + studente.city);
	}


	

}

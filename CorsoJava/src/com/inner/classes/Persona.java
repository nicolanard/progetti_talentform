package com.inner.classes;

public class Persona {
	   String nome = "Nicola";

	    class Indirizzo {
	        String citta = "Foggia";
	        void stampa(){
	            System.out.println(nome + " vive a " + citta);
	        }
	    }

	    public static void main(String[] args){
	        Persona p = new Persona();
	        Persona.Indirizzo i = p.new Indirizzo();
	        i.stampa();
	    }

}

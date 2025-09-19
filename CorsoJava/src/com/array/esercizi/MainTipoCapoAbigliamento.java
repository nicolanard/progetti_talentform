package com.array.esercizi;

public class MainTipoCapoAbigliamento {
	
	public static void main (String[] args) {
		
		TipoCapoAbigliamento t = new TipoCapoAbigliamento("Balmain", "Estivo", 50.99);
		
		System.out.println(t.getApplicaSconto(10));
		
		CapoAbigliamento c = new CapoAbigliamento("Balmain", "Estivo", 50.99, 28, 1, 5);
        
        c.venduto(2);
        c.getDettagli();
	}	

}

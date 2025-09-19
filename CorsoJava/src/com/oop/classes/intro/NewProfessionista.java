package com.oop.classes.intro;

public class NewProfessionista {
	
	private static int redditoAnnuoLordo;
	private static int coeffRedd;
	private static int tassaInps;
	private static int tassaIrpef;

	public static int getUtileTasse() {
		return redditoAnnuoLordo * coeffRedd / 100;
	}
	
	public static int getTassaInps() {
		return getUtileTasse() * tassaInps / 100;
	}
	
	public static int getTassaIrpef() {
		return getUtileTasse() * tassaIrpef / 100;
	}
	
	public static int getRedditoAnnuoNetto() {
		return redditoAnnuoLordo - (getTassaInps() + getTassaIrpef());
	}

	public static void setRedditoAnnuoLordo(int redditoAnnuoLordo) {
		NewProfessionista.redditoAnnuoLordo = redditoAnnuoLordo;
	}

	public static void setCoeffRedd(int coeffRedd) {
		NewProfessionista.coeffRedd = coeffRedd;
	}

	public static void setTassaInps(int tassaInps) {
		NewProfessionista.tassaInps = tassaInps;
	}

	public static void setTassaIrpef(int tassaIrpef) {
		NewProfessionista.tassaIrpef = tassaIrpef;
	}

	public static void main(String[] args) {
		
		NewProfessionista.setCoeffRedd(78);
		NewProfessionista.setRedditoAnnuoLordo(780000);
		NewProfessionista.setTassaInps(26);
		NewProfessionista.setTassaIrpef(15);
		
		System.out.println(NewProfessionista.getRedditoAnnuoNetto());
		
		
		
	}

}

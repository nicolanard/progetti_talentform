package com.oop.classes.intro;

public class NewFreelancer {
	
	private int redditoAnnuoLordo;
	private int coeffRedd;
	private int tassaInps;
	private int tassaIrpef;
	
	

	public int getUtileTasse() {
		return redditoAnnuoLordo * coeffRedd / 100;
	}


	public int getRedditoAnnuoNetto() {
		return redditoAnnuoLordo - (getTassaInps() + getTassaIrpef());
	}

	public void setRedditoAnnuoLordo(int redditoAnnuoLordo) {
		this.redditoAnnuoLordo = redditoAnnuoLordo;
	}



	public int getCoeffRedd() {
		return coeffRedd;
	}



	public void setCoeffRedd(int coeffRedd) {
		this.coeffRedd = coeffRedd;
	}



	public int getTassaInps() {
		return getUtileTasse() * tassaInps / 100;
	}



	public void setTassaInps(int tassaInps) {
		this.tassaInps = tassaInps;
	}



	public int getTassaIrpef() {
		return getUtileTasse() * tassaIrpef / 100;
	}



	public void setTassaIrpef(int tassaIrpef) {
		this.tassaIrpef = tassaIrpef;
	}



	public static void main(String[] args) {
		
		NewFreelancer freelancer = new NewFreelancer();

		freelancer.setRedditoAnnuoLordo(85000);
		freelancer.setCoeffRedd(78);
		freelancer.setTassaInps(15);
		freelancer.setTassaIrpef(26);
		
	
		System.out.println("Il reddito annuo netto e': " + freelancer.getRedditoAnnuoNetto());
	
	
	}

}

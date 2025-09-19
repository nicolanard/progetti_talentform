package com.oop.classes.intro;

public class NewArtigiano {
	
	private int redditoAnnoLordo;
    private int coefficenteDiRedditiva;
    private int tassaIrpef;
    private int tassaInps;
    private int aliquotaInpsEccedenteIlMinimale;
    private int importoEccedente;
    
    //METODI GET
  
	public int getRedditoAnnoLordo() {
		return redditoAnnoLordo;
	}

	public int getUtile() {
		return getRedditoAnnoLordo() * getCoefficenteDiRedditiva() / 100;
	}
	
	public int getCoefficenteDiRedditiva() {
		return coefficenteDiRedditiva;
	}

	public int getCifraIrpef() {
		return getUtile() * tassaIrpef/100;
	}
	
	public int getUtileEccedente() {
        return (redditoAnnoLordo - importoEccedente) * coefficenteDiRedditiva/100;
    }

	public int getCifraInps() {
		 return getUtileEccedente() * aliquotaInpsEccedenteIlMinimale/100;
	}
	
	    
	public int getRedditoNetto() {
	    return redditoAnnoLordo - (getCifraIrpef() + getCifraInps() + tassaInps);
	}

	public int getAliquotaInpsEccedenteIlMinimale() {
		return aliquotaInpsEccedenteIlMinimale;
	}

	public int getImportoEccedente() {
		return importoEccedente;
	}
	
	// METODI SET

	public void setRedditoAnnoLordo(int redditoAnnoLordo) {
		this.redditoAnnoLordo = redditoAnnoLordo;
	}

	public void setCoefficenteDiRedditiva(int coefficenteDiRedditiva) {
		this.coefficenteDiRedditiva = coefficenteDiRedditiva;
	}

	public void setTassaIrpef(int tassaIrpef) {
		this.tassaIrpef = tassaIrpef;
	}

	public void setTassaInps(int tassaInps) {
		this.tassaInps = tassaInps;
	}

	public void setAliquotaInpsEccedenteIlMinimale(int aliquotaInpsEccedenteIlMinimale) {
		this.aliquotaInpsEccedenteIlMinimale = aliquotaInpsEccedenteIlMinimale;
	}

	public void setImportoEccedente(int importoEccedente) {
		this.importoEccedente = importoEccedente;
	}

	public static void main(String[] args) {
		NewArtigiano a = new NewArtigiano();
		
		a.setRedditoAnnoLordo(95000);
		a.setCoefficenteDiRedditiva(67);
		a.setTassaIrpef(15);
		a.setTassaInps(3000);
		a.setImportoEccedente(15000);
		a.setAliquotaInpsEccedenteIlMinimale(24);

		/*artigiano.setRedditoAnnuoLordo(85000);
		artigiano.setCoeffRedd(78);
		artigiano.setTassaInps(15);
		artigiano.setTassaIrpef(26);*/
		
	
		System.out.println("Il reddito annuo netto e': " + a.getRedditoNetto());

	}

}

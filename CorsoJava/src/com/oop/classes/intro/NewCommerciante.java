package com.oop.classes.intro;

public class NewCommerciante {
	
	private int redditoAnnoLordo;
    private int coefficenteDiRedditiva;
    private int tassaIrpef;
    private int tassaInps;
    private int aliquotaInpsEccedenteIlMinimale;
    private int importoEccedente;
    private int iva;
    
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
		return getUtile() * tassaIrpef / 100;
	}


	public int getUtileEccedente() {
		return (getRedditoAnnoLordo() - getImportoEccedente()) * getCoefficenteDiRedditiva() / 100;
	}
	
	
	public int getCifraInps() {
		return getUtileEccedente() * getAliquotaInpsEccedenteIlMinimale() / 100;
	}

	
	public int getRedditoAnnoNetto() {
		return (getRedditoAnnoLordo() - (getCifraIrpef() + getCifraInps() + tassaInps)) + getIva();
	}

	public int getAliquotaInpsEccedenteIlMinimale() {
		return aliquotaInpsEccedenteIlMinimale;
	}



	public int getImportoEccedente() {
		return importoEccedente;
	}



	public int getIva() {
		return getRedditoAnnoLordo() * iva / 100;
	}

    //METODI SET

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



	public void setIva(int iva) {
		this.iva = iva;
	}


	// COSTRUTTORE
	
	public NewCommerciante(int redditoAnnoLordo, int coefficenteDiRedditiva, int tassaIrpef, int tassaInps,
			int aliquotaInpsEccedenteIlMinimale, int importoEccedente, int iva) {
		this.redditoAnnoLordo = redditoAnnoLordo;
		this.coefficenteDiRedditiva = coefficenteDiRedditiva;
		this.tassaIrpef = tassaIrpef;
		this.tassaInps = tassaInps;
		this.aliquotaInpsEccedenteIlMinimale = aliquotaInpsEccedenteIlMinimale;
		this.importoEccedente = importoEccedente;
		this.iva = iva;
	}



	public static void main(String[] args) {
		NewCommerciante commerciante = new NewCommerciante(128000, 40, 15, 3000, 24, 15000, 22);
		
		System.out.println(commerciante.getUtile());
        System.out.println(commerciante.getCifraInps());
        System.out.println(commerciante.getCifraIrpef());
        System.out.println(commerciante.getUtileEccedente());

		System.out.println("Il Reddito Anno Netto e': " + commerciante.getRedditoAnnoNetto());
		

	}

}

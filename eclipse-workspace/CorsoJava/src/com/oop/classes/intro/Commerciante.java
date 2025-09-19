package com.oop.classes.intro;

public class Commerciante {
	
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





	//COSTRUTTORE
	
	public Commerciante(int redditoAnnoLordo, int coefficenteDiRedditiva, int tassaIrpef, int tassaInps,
			int aliquotaInpsEccedenteIlMinimale, int importoEccedente) {
		this.redditoAnnoLordo = redditoAnnoLordo;
		this.coefficenteDiRedditiva = coefficenteDiRedditiva;
		this.tassaIrpef = tassaIrpef;
		this.tassaInps = tassaInps;
		this.aliquotaInpsEccedenteIlMinimale = aliquotaInpsEccedenteIlMinimale;
		this.importoEccedente = importoEccedente;
	}






	public static void main(String[] args) {
		
		Commerciante commerciante = new Commerciante(125000, 40, 15, 3000, 24, 15000);
		
		System.out.println(commerciante.getUtile());
        System.out.println(commerciante.getCifraInps());
        System.out.println(commerciante.getCifraIrpef());
        System.out.println(commerciante.getUtileEccedente());
        System.out.println(commerciante.getRedditoNetto());
		
		
	    
	    

	}

}

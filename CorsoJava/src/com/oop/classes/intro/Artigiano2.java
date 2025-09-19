package com.oop.classes.intro;

public class Artigiano2 {

    private int redditoAnnoLordo;
    private int coefficenteDiRedditiva;
    private int tassaIrpef;
    private int tassaInps;
    private int aliquotaInpsEccedenteIlMinimale;
    private int importoEccedente;
    
    public Artigiano2(int redditoAnnoLordo, int coefficenteDiRedditiva, int tassaIrpef, int tassaInps,
            int aliquotaInpsEccedenteIlMinimale, int importoEccedente) {
        super();
        this.redditoAnnoLordo = redditoAnnoLordo;
        this.coefficenteDiRedditiva = coefficenteDiRedditiva;
        this.tassaIrpef = tassaIrpef;
        this.tassaInps = tassaInps;
        this.aliquotaInpsEccedenteIlMinimale = aliquotaInpsEccedenteIlMinimale;
        this.importoEccedente = importoEccedente;
    }
    
    public int getRal() {
        return redditoAnnoLordo;
    }

    //fino a 15000 paga il 24%
    //su 90000 calcolo irpef
    //aliquota irpef solo dopo il 15000
    
    //calcolo la cifra da tassare
    public int getUtile() {
        return redditoAnnoLordo * coefficenteDiRedditiva/100;
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
        return getRal() - (getCifraIrpef() + getCifraInps() + tassaInps);
    }
    
    public static void main(String[] args) {
        
        Artigiano2 artigiano = new Artigiano2(
                90000, 
                67,
                15,
                3500,
                24,
                15000
        );
        
        System.out.println(artigiano.getUtile());
        System.out.println(artigiano.getCifraInps());
        System.out.println(artigiano.getCifraIrpef());
        System.out.println(artigiano.getUtileEccedente());
        System.out.println(artigiano.getRedditoNetto());

    }

}
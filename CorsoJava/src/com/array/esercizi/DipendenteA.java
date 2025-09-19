package com.array.esercizi;

public class DipendenteA extends Dipendente {

    private int malattia = 0;
    
    public DipendenteA(
            String matricola, 
            float stipendio, 
            float straordinario,
            int malattia
    ) {
        super(matricola, stipendio, straordinario);
        this.malattia = malattia;
    }
    
    public void prendiMalattia(int giorniMalattiaPresi) {
        this.malattia += giorniMalattiaPresi;
    }
    
    @Override
    public float getPaga(int ore) {
        float p = super.getPaga(ore);
        if (this.malattia == 0)
            return p;
        else
            return p - this.malattia * 15f;
    }
    
    public void stampaMalattia() {
        System.out.println(this.malattia);
    }

}
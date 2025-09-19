package com.array.esercizi;

public class MotorinoImmatricolato extends Motorino {
    
    private float maxVelocita = 0;
    private String targa = "";
    

    public MotorinoImmatricolato(String colore, float velocita, String tipo, float maxVelocita,
            String targa) {
        
        super(colore, velocita, tipo);
        
        this.maxVelocita = maxVelocita;
        this.targa = targa;
    }
    
    public void getMax() {
        
        System.out.println("La massima velocità è: " + maxVelocita);
    }
    
    public void accellera(float accellera) {
        
        float s = velocita + accellera;
        
        if(antifurto == false) {
            
            if(s <= maxVelocita) {
                
                velocita = s;
            } else {
                
                velocita = maxVelocita;
            }
        }
    }
}
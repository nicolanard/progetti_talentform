package com.array.esercizi;

public class Motorino {
    
    private String colore = "";
    protected float velocita = 0;
    private String tipo = "";
    protected boolean antifurto;
    
    public Motorino(String colore, float velocita, String tipo) {
        
        this.colore = colore;
        this.velocita = velocita;
        this.tipo = tipo;
    }
    
    public String getColore() {
        
        return colore;
    }
    
    public String getTipo() {
        
        return tipo;
    }
    
    public float getVelocita() {
        
        return velocita;
    }
    
    public void accellera(float accellera) {
        
        if(antifurto == false) {
            
            velocita += accellera;
            
        } else {
            
            System.out.println("");
            System.out.println("Non è stato possibile accellerare perché l'antifurto è acceso.");
            System.out.println("");
        }
    }
    
    public void inserisciAntifurto() {
        
        antifurto = true;
    }
}
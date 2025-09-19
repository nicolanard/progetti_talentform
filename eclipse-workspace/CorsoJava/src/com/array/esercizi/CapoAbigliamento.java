package com.array.esercizi;

public class CapoAbigliamento extends TipoCapoAbigliamento {
    
    private int taglia = 0;
    private int quantitaAcquistata = 0;
    private int quantitaDisponibile = 0;

    public CapoAbigliamento(String marca, String modello, double costo, int taglia, int quantitaAcquistata,
            int quantitaDisponibile) {
        
        super(marca, modello, costo);
        this.taglia = taglia;
        this.quantitaAcquistata = quantitaAcquistata;
        this.quantitaDisponibile = quantitaDisponibile;
    }
    
    public void venduto(int capiVenduti) {
        
        int sottrazione = quantitaDisponibile - capiVenduti;
                
        if(quantitaDisponibile > sottrazione) {
            
            quantitaDisponibile -= capiVenduti;
        }
    }
    
    public void getDettagli() {
        
        System.out.println("La marca del capo è: " + this.marca);
        System.out.println("Il modello: " + this.modello);
        System.out.println("Con un costo di: €" + this.costo);
        System.out.println("Taglia scelta: " + this.taglia);
        System.out.println("Se ne sono acquistati: " + this.quantitaAcquistata);
        System.out.println("E ne rimangono: " + this.quantitaDisponibile);
    }
}

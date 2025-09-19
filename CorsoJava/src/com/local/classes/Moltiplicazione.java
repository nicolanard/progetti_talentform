package com.local.classes;

public class Moltiplicazione  {
    
    public void prodotto(int x, int y) {
        
        class Calcolo implements IOperazione {

            @Override
            public int esegui(int a, int b) {
                
                return a * b;
            }
        }
        
        Calcolo moltiplicazione = new Calcolo();
        System.out.println("Il risultato della moltiplicazione è: " +  moltiplicazione.esegui(x, y));
    }

    public static void main(String[] args) {
    
        Moltiplicazione m = new Moltiplicazione();
        m.prodotto(5, 5);
    }
}
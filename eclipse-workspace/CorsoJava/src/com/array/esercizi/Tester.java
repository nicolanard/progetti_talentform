package com.array.esercizi;

public class Tester {
    public static void main(String[] args) {
        // Creo distributore con prezzo iniziale 1.8 euro/litro
        DistributoreBenzina distributore = new DistributoreBenzina(1.8);

        // Creo due automobili con consumi diversi
        Car auto1 = new Car(0.05); // 5 litri ogni 100 km
        Car auto2 = new Car(0.07); // 7 litri ogni 100 km

        // Rifornisco il distributore
        distributore.rifornisci(100); // 100 litri disponibili

        // Faccio rifornire le auto
        distributore.vendi(20, auto1); // auto1 acquista circa 11.11 litri
        distributore.vendi(50, auto2); // auto2 acquista circa 27.77 litri

        // Le auto fanno un viaggio
        auto1.drive(100); // dovrebbe consumare 5 litri
        auto2.drive(300); // dovrebbe consumare 21 litri

        // Controllo benzina rimanente nel distributore
        System.out.println("Benzina rimanente al distributore: " + distributore.getDeposito() + " litri.");

        // Cambio il prezzo
        distributore.aggiorna(2.0);

        // Altra vendita
        distributore.vendi(10, auto1); // ora ottiene solo 5 litri

        // Rifornisco ancora il distributore
        distributore.rifornisci(50);
    }
}


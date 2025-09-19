package com.array.esercizi;

public class DistributoreBenzina {
    private double deposito;
    private double euroPerLitro;

    public DistributoreBenzina(double unPrezzoPerLitro) {
        this.euroPerLitro = unPrezzoPerLitro;
        this.deposito = 0;
    }

    public void rifornisci(double unaQuantita) {
        deposito += unaQuantita;
        System.out.println("Distributore rifornito di " + unaQuantita + " litri. Totale: " + deposito + " litri.");
    }

    public void vendi(double euro, Car unaAutomobile) {
        double litriDaVendere = euro / euroPerLitro;

        if (litriDaVendere > deposito) {
            System.out.println("Benzina insufficiente al distributore. Venduti solo " + deposito + " litri.");
            unaAutomobile.addGas(deposito);
            deposito = 0;
        } else {
            deposito -= litriDaVendere;
            unaAutomobile.addGas(litriDaVendere);
            System.out.println("Venduti " + litriDaVendere + " litri per " + euro + " euro.");
        }
    }

    public void aggiorna(double unPrezzoPerLitro) {
        euroPerLitro = unPrezzoPerLitro;
        System.out.println("Prezzo aggiornato a " + euroPerLitro + " euro/litro.");
    }

    public double getDeposito() {
        return deposito;
    }
}


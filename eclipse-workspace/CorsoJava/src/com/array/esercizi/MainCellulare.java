package com.array.esercizi;

public class MainCellulare {
    public static void main(String[] args) {
        Cellulare mioTelefono = new Cellulare(10.0); // Ricarica iniziale: 10 euro

        mioTelefono.chiama(5); // Chiamata da 5 minuti (1 euro)
        System.out.println("Credito residuo: " + mioTelefono.numero404() + " euro");
        System.out.println("Numero chiamate: " + mioTelefono.getNumeroChiamate());

        mioTelefono.ricarica(5.0); // Ricarica di 5 euro
        System.out.println("Credito dopo ricarica: " + mioTelefono.numero404() + " euro");

        mioTelefono.azzeraChiamate();
        System.out.println("Numero chiamate dopo azzeramento: " + mioTelefono.getNumeroChiamate());
    }
}


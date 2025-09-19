package com.oop.abstracts.classes;

public class HomeBankingAccount {

    public static void main(String[] args) {

        BankingAccount rossi = new BankingAccount(1000, 500, 200, 300, 100, 5, 34);
        
        System.out.println("Saldo Attuale Dott.Rossi: " + rossi.getTotalAccount());
        
        BankingAccount verdi = new BankingAccount(1000, 200, 100, 600, 100, 3, 34);
        
        System.out.println("Saldo Attuale Dott.Verdi: " + verdi.getTotalAccount());
        
    }

}
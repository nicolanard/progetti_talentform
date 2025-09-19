package com.array.esercizi;

import java.util.Scanner;

public class BankWithPassword {

    private int balance = 0;
    private int pass;
    private int rate;
    
    public BankWithPassword(int pass) {
        this.pass = pass;
    }

    public BankWithPassword(int initialBalance, int pass) {
        this.balance = initialBalance;
        this.pass = pass;
    }

    public boolean controlPassword(int pass) {
        if (this.pass == pass)
            return true;
        return false;
    }
    
    public boolean deposit(int pass, int amount) {
        if (controlPassword(pass)) {
            this.balance += amount;
            return true;
        }
        return false;
    }

    public int getBalance() {
        return balance;
    }
    
    
    
    public int getRate() {
        return rate;
    }

    public boolean withDraw(int pass, int amount) {
        if (controlPassword(pass)) {
            this.balance -= amount;
            return true;
        }
        return false;
    }
    
    public boolean addInterest(int percentualeInteresse, int pass) {
        if (controlPassword(pass)) {
            this.rate = this.balance*percentualeInteresse/100;
            return true;
        }
        return false;
    }
    
    

    public int getPass() {
        return pass;
    }
    
    public static boolean close() {
        return false;
    }
    
    public static void main(String[] args) {
        
        BankWithPassword a = new BankWithPassword(123);
    
        Scanner s = new Scanner(System.in);
        boolean run = true;
        
        
        
        System.out.println("inserisci password");
        int pass = s.nextInt();
        
        while (run) {
            
            if (a.controlPassword(pass)) {
                
                System.out.println("1 - saldo del conto");
                System.out.println("2 - deposito sul conto");
                System.out.println("3 - preleva dal conto");
                System.out.println("4 - aggiungi interesse");
                System.out.println("5 - visualizza interesse");
                System.out.println("6 - chiudi il programma");
                
                System.out.println("inserisci operazione");
                int operazione = s.nextInt();
                
                switch (operazione) {
                    case 1: System.out.println("il tuo saldo è = " + a.getBalance()); break;
                    case 2: {
                        System.out.println("inserisci quanto vuoi depositare");
                        int dep = s.nextInt();
                        a.deposit(pass, dep);
                        break;
                    }
                    case 3: {
                        System.out.println("inserisci quanto vuoi prelevare");
                        int prev = s.nextInt();
                        a.withDraw(pass, prev); 
                        break;                
                    }
                    case 4: {
                        System.out.println("aggiungi un interesse"); 
                        int interesse = s.nextInt();                                
                        a.addInterest(interesse, pass);                              
                        break;                                                 
                    }
                    case 5: {
                        System.out.println("l'interesse applicato corrisponde alla cifra: ");
                        System.out.println(a.getRate());
                        break;
                    }
                    case 6: {
                        run = close();
                        System.out.println("programma chiuso correttamente");
                    }
                }
            } else {
                System.out.println("password errata, reinseriscila");
            }
            
        }
        
    }

}

package com.oop.abstracts.classes;

public class BankingAccount extends DoctorRossi {

    private int saldoIniziale;
    private int primoDeposito;
    private int primoPrelievo;
    private int secondoDeposito;
    private int secondoPrelievo;
    private int canoneAnnuo;
    private int impostaBollo;

    public BankingAccount(int saldoIniziale, int primoDeposito, int primoPrelievo, int secondoDeposito,
            int secondoPrelievo, int canoneAnnuo, int impostaBollo) {

        this.saldoIniziale = saldoIniziale;
        this.primoDeposito = primoDeposito;
        this.primoPrelievo = primoPrelievo;
        this.secondoDeposito = secondoDeposito;
        this.secondoPrelievo = secondoPrelievo;
        this.canoneAnnuo = canoneAnnuo;
        this.impostaBollo = impostaBollo;
    }

    @Override
    public int getPrimoDeposito() {
        return saldoIniziale + primoDeposito;
    }

    @Override
    public int getPrimoPrelievo() {
        return getPrimoDeposito() - primoPrelievo;
    }

    @Override
    public int getSecondoDeposito() {
        return getPrimoPrelievo() + secondoDeposito;
    }

    @Override
    public int getSecondoPrelievo() {
        return getSecondoDeposito() - secondoPrelievo;
    }

    @Override
    public int getCanoneAnnuo() {
        return getSecondoPrelievo() * canoneAnnuo / 100;
    }

    @Override
    public int getTotalAccount() {
        return getSecondoPrelievo() - (getCanoneAnnuo() + impostaBollo);
    }

}
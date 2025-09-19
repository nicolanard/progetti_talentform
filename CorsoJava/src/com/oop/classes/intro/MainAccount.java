package com.oop.classes.intro;

public class MainAccount {

    public static void main(String[] args) {

        // MOTHERACCOUNT

        MotherAccount mother = new MotherAccount(0, 400, 100, 50, 10);

        System.out.println("SALDO ATTUALE MOTHER : € " + mother.getTotalAccount());

        // SON ACCOUNT
        SonAccount son = new SonAccount(0, 300, 10, 50, 20, 10);

        System.out.println("SALDO ATTUALE SON : € " + son.getTotalAccount());

        // FATHER ACCOUNT

        FatherAccount father = new FatherAccount();

        father.setBalance(0);
        father.setFirstDeposit(700);
        father.setFirstDraw(100);
        father.setSecondDeposit(200);
        father.setSecondDraw(100);

        System.out.println("SALDO ATTUALE FATHER : € " + father.getTotalAccount());

        // DAUGHTER ACCOUNT

        DaughterAccount daughter = new DaughterAccount();

        daughter.setCanoneAnnuo(10);
        daughter.setBalance(0);
        daughter.setFirstDeposit(400);
        daughter.setFirstDraw(50);
        daughter.setSecondDeposit(100);
        daughter.setSecondDraw(20);

        System.out.println("SALDO ATTUALE DAUGHTER : € " + daughter.getTotalAccountDaughter());

    }

}
package com.oop.abstracts.classes;

public class MainAppWeb {

    public static void main(String[] args) {

        ProductAppWeb app = new ProductAppWeb();
        
        app.setTariffa(250);
        app.setDaysFigma(30);
        app.setDaysMockup(30);
        app.setDaysMultilanguage(30);
        app.setDaysDbOffline(30);
        app.setDaysResponsive(30);
        
        System.out.println("Il totale dell' app è di : €" + app.getPriceApp());

    }

}
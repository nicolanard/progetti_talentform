package com.oop.abstracts.classes;

public class Main2AppMobile {

    public static void main(String[] args) {

        Product2AppMobile app = new Product2AppMobile(250, 10, 20, 30, 40, "90 GIORNI");

        System.out.println("Il totale dell' app è di : €" + app.getPriceApp());

    }

}
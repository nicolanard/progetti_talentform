package com.array.esercizi;

public class MainharrysChecking {

    public static void main(String[] args) {
     
        harrysChecking c = new harrysChecking(0, 1000, 500, 400);
        System.out.println(c.getSecondDraw());
        harrysChecking momsSaving = new harrysChecking(0, 1000, 500, 400);
        System.out.println(momsSaving.getTotalAccount());
    }
}
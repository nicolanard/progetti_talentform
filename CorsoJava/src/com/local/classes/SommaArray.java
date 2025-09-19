package com.local.classes;

public class SommaArray {

    public int getSomma(int[] v) {
        class Sommatore {
            int somma = 0;
            public Sommatore() {
                for (int u:v)
                    somma += u;
            }
            public int getSomma() {
                return somma;
            }
        }
        return new Sommatore().getSomma();
    }
    
    public static void main(String[] args) {
        int[] v = {5,2};
        SommaArray s = new SommaArray();
        int somma = s.getSomma(v);
        System.out.println(somma);
    }
    
}

package com.local.classes;

public class VerificaNumeri {

    public void controllaNumeri(int numero) {

        class Verifica {
            public boolean èPari() {
                return numero % 2 == 0;
            }
        }

        Verifica verifica = new Verifica();

        if (verifica.èPari()) {
            System.out.println(numero + " è pari.");
        } else {
            System.out.println(numero + " è dispari.");
        }
    }

    public static void main(String[] args) {
        VerificaNumeri v = new VerificaNumeri();
        v.controllaNumeri(10); 
        v.controllaNumeri(7);  
    }
}


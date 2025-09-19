package com.array.esercizi;

public class MainMotorino {

    public static void main(String[] args) {
        
        Motorino motorino = new Motorino("nero",50.4f, "scarabeo");
        
        motorino.accellera(20.3f);
        System.out.println("La velocità attuale è di: " + motorino.getVelocita());
        
        motorino.inserisciAntifurto();
        motorino.accellera(20.3f);
        System.out.println("La velocità attuale è di: " + motorino.getVelocita());
        
        MotorinoImmatricolato m = new MotorinoImmatricolato("nero", 50.4f, "scarabeo", 100.0f, "AD2334AD");
        
        m.accellera(70.7f);
        m.getMax();
        System.out.println("La velocità attuale è: " + m.getVelocita());
    }

}

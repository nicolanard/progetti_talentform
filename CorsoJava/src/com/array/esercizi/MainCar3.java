package com.array.esercizi;

public class MainCar3 extends Car3 {
    
    protected double resaCarburante;
    protected double gas;
    protected boolean benzina;
    
    public MainCar3(double KmL) {
        this.resaCarburante = KmL;
        this.gas = 0;
        this.benzina = true;
    }
    
    @Override
    public void drive(double km){
        if(gas >= (km/resaCarburante))
            this.gas -= (km/resaCarburante);
    }
    
    @Override
    public double getGas() {
        return this.gas;
    }
    
    @Override
    public void addGas(double rifornimento) {
        this.gas = rifornimento;
    }
    
    

    public static void main(String[] args) {
     MainCar3 m = new MainCar3(30);
        
        System.out.println("Carburante iniziale: "+m.getGas());
        m.addGas(20);
        System.out.println("Carburante dopo rifornimento: "+m.getGas());
        m.drive(150);
        System.out.println("Carburante rimanente: "+m.getGas());

    }

}

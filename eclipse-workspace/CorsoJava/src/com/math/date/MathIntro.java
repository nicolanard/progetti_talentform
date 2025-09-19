package com.math.date;

public class MathIntro {
	
	public static void main(String[] args) {


      System.out.println(Math.abs(-50));
      System.out.println(Math.abs(Integer.MIN_VALUE));
//      System.out.println(Math.absExact(Integer.MIN_VALUE));
      System.out.println(Math.abs((long) Integer.MIN_VALUE));

      System.out.println("Max = " + Math.max(10, -10));
      System.out.println("Min = " + Math.min(10.0000002, 10.001f));

      System.out.println("Round Down = " + Math.round(10.2));
      System.out.println("Round Up = " + Math.round(10.8));
      System.out.println("Round ? = " + Math.round(10.5));

      System.out.println("Floor = " + Math.floor(10.8));
      System.out.println("Ceil = " + Math.ceil(10.2));

      System.out.println("Square root of 100 = " + Math.sqrt(100));
      System.out.println("2 to the third power (2*2*2) = " + Math.pow(2, 3));
      System.out.println("10 to the fifth power (10*10*10*10*10) = " + Math.pow(10, 5));

      for (int i = 0; i < 10; i++) {
          System.out.println(Math.random());
      }
      
      int numero = 49;
      double radice = Math.sqrt(numero);
      System.out.println("La radice del numero e': " + radice);
      
      double numero2 = 3.6;
      double arrotondato = Math.round(numero2);
      System.out.println("Il numero arrotondato e' il seguente: " + arrotondato);

      System.out.println(Math.max(15, 27));
      System.out.println(Math.min(23, 12));
      
    
      //Stampa un numero intero random compreso tra 1 e 10
    /* double numeroCasuale = Math.random();
      if(numeroCasuale > 1 || numeroCasuale < 10) {
    	  System.out.println(numeroCasuale);
      } */
      
      // Genera un numero intero casuale tra 1 e 10
      int numeroCasuale = (int)(Math.random() * 10) + 1;

      System.out.println("Il numero casuale tra 1 e 10 è: " + numeroCasuale); 
      
      // Genera un numero intero casuale tra 1 e 6
      double numeroCasuale2 = (Math.random() * 6) + 1;

      System.out.println("Il numero casuale tra 1 e 6 è: " + numeroCasuale2); 
      
      double raggio = 5;
      double risultato = Math.PI * Math.pow(raggio, 2);
      System.out.println("L'area è: " + risultato);
      
      
      
  }

}

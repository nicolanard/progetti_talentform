package com.controlflow;

import java.util.Scanner;

public class ExampleFor {

	/*public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Inserisci un numero intero positivo: ");
		        int N = scanner.nextInt();

		        int somma = 0;

		        
		        for (int i = 1; i <= N; i++) {
		            somma += i;
		        }

		        System.out.println("La somma dei primi " + N + " numeri è: " + somma);

		        scanner.close();		

     }*/
	
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero intero positivo: ");
        int N = scanner.nextInt();

        
        int count = 10;
        for (int i = 1; i <= count; i++) {
        	int numeroMoltiplicazione = 0;
            numeroMoltiplicazione = N * i;
            System.out.println("Tabellina del " + N + " è: " + numeroMoltiplicazione);
        }


        scanner.close();		

}

		
}

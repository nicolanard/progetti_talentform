package com.enumeration;

import java.util.Scanner;

public class Enumeration {
	
	/*enum Level {
        MEDIUM,
        HIGH

    }

    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;
        Level myV = Level.HIGH;
        System.out.println(myVar);
        System.out.println(myV);
    } */
	
	// Crea un enum chiamato Giorno con i giorni della settimana. Stampa tutti i valori usando un ciclo for.
	
	/*enum Giorno {
		LUNEDI,
		MARTEDI,
		MERCOLEDI,
		GIOVEDI,
		VENERDI,
		SABATO,
		DOMENICA
		
	}
	
	public static void main (String[] args) {
		 System.out.println("Giorni della settimana:");
	        for (Giorno giorno : Giorno.values()) {
	            System.out.println(giorno);
	        }
	}*/
	
	//Crea un enum Stagione con quattro valori. Usa switch per stampare un messaggio diverso per ogni stagione.
	
	/*enum Stagione{
		AUTUNNO,
		INVERNO,
		PRIMAVERA,
		ESTATE
	}
	
	public static void main (String[] args) {
		Stagione stagioneAttuale = Stagione.AUTUNNO;

        switch (stagioneAttuale) {
            case PRIMAVERA:
                System.out.println("È primavera: i fiori sbocciano!");
                break;
            case ESTATE:
                System.out.println("È estate: fa caldo e si va al mare!");
                break;
            case AUTUNNO:
                System.out.println("È autunno: le foglie cadono.");
                break;
            case INVERNO:
                System.out.println("È inverno: fa freddo e forse nevica.");
                break;
        }
	} 
	
	//Chiedi all’utente il giorno della settimana e verifica se è lavorativo.
	enum Giorno {
        LUNEDI,
        MARTEDI,
        MERCOLEDI,
        GIOVEDI,
        VENERDI,
        SABATO,
        DOMENICA
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un giorno della settimana: ");
        String giornoSettimana = scanner.nextLine().toUpperCase();

        try {
            Giorno giorno = Giorno.valueOf(giornoSettimana);

            switch (giorno) {
                case LUNEDI:
                case MARTEDI:
                case MERCOLEDI:
                case GIOVEDI:
                case VENERDI:
                    System.out.println(giorno + " è un giorno lavorativo.");
                    break;
                case SABATO:
                case DOMENICA:
                    System.out.println(giorno + " è un giorno festivo.");
                    break;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Giorno non valido. Assicurati di scrivere correttamente (es: lunedi).");
        } */
	
	//Stampa tutti i nomi e le posizioni (ordinal) di un enum Taglia.
	enum Taglia {
		XS,
		S,
		M,
		L,
		XL
    }
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		for (Taglia taglia : Taglia.values()) {
			System.out.println("Quale taglia vuoi trovare? ");
			String t = scanner.nextLine();
            System.out.println(taglia + " - posizione: " + taglia.ordinal());
        }
		
		scanner.close();
	}
	
	
}



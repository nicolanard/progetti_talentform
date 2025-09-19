package com.sintax;

import java.lang.String;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Random;

public class Introduction {

	public static void main(String[] args) {

	/*	String student = "Nicola";
		System.out.println(student);
		
		String brand = "Audi";
		String model = brand;
		
		System.out.println("Il mio brand preferito è: " + brand);
		System.out.println(model);

		int number = 50; 
		boolean logged = true;
		char nicola = 'n';
	    double price = 30.50;     
	    float prices = 10.32f;
	    
	    System.out.println("Stampa multipla di valori: " + number + " " + logged + " " + nicola + " " + price + " " + prices);
	     
		
		String name = "Nicola";
		String surname = "Narducci";
		
		System.out.println("Il mio nome è: " + name + " ed il mio cognome è: " + surname);
		
		String conversion = "22.5";
		double priceShoes = Double.parseDouble(conversion);
		System.out.println("Il prezzo è: " + priceShoes);
		
		String variabile = "1234";
		int variabileInt = Integer.parseInt(variabile);
		System.out.println("Valore convertito " + variabileInt);
		
		String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("La lunghezza di questa stringa è di n. caratteri " + txt.length());
        System.out.println("Trasforma le lettere in minuscole " + txt.toLowerCase());
        
        String txt2 = "nicola";
        System.out.println("Trasforma le lettere in maiuscole " + txt2.toUpperCase());
        
        String txt3 = "Nicola";
        System.out.println("Cambia il carattere N grande in N piccola " + txt3.replace('N', 'n'));
        
        String txt4 = "Javascript";
        System.out.println("Cambia i caratteri A piccoli in A grandi " + txt4.replaceAll("a", "A"));
        
        String javascript = "Javascript";
        String technology = "Frontend";
        String res = javascript.concat(" " + technology);
        System.out.println("Questa è la concatenazione delle due parole String: " + res);
        String nome = " Nicola ";
        String cognome = " Narducci ";
        System.out.println("Elimina gli spazi " + nome.trim() + cognome.trim());
        
        StringBuilder student1 = new StringBuilder("Nicola");
        student1.append(" Narducci").append(" è")
        		.append(" uno studente modello");
        System.out.println("Risultato append: " + student1);
        
        StringBuilder course = new StringBuilder("Backend");
        course.insert(2,"Frontend");
        System.out.println(course);
        
        String uno = "Uno";
        String due = "Due";
        StringBuilder numeri = new StringBuilder(uno);
        numeri.insert(2, due);
        System.out.println("Dalla seconda lettera della parola Uno concatena la parola Due, ecco il risultato: " + numeri);
        
        StringBuilder animal = new StringBuilder("Coccodrillo");
        animal.delete(0, 2);
        System.out.println("Elimina dalla prima lettera alla seconda lettera di Coccodrillo, ecco il risultato: " + animal);
        
        StringBuilder sentimento = new StringBuilder("Amore");
        sentimento.reverse();
        System.out.println("Capovolge la parola Amore, ecco il risultato: " + sentimento);
        
        String text = """
                Nicola Narducci
                
                
                
      
             """;

        System.out.println(text);

        String escape = """
                                
                 Questo è un lungo test che sembra andare a capo \
                 ma in realtà non lo fa""\";
                """;

        System.out.println(escape);
 
        int a = 5;
        float b = a;
        System.out.println("Cast Implicito " + b);


        double d1 = 100;
        float f2 = (float) d1;

        System.out.println("Cast Esplicito " + f2);

        // Scrivi un programma che controlla se un numero è positivo o negativo.
        
        int prova = 20;
        
        if(prova >= 0) {
        	System.out.println("Il seguente numero è positivo");
        } else {
        	System.out.println("Il seguente numero è negativo");
        }
        
        // Verifica se un numero è pari o dispari.
        
        int prova2 = 4;
        
        if (prova % 2 == 0) {
        	System.out.println("Il " + prova2 + " è pari");
        } else {
        	System.out.println("Il " + prova2 + " è dispari");
        }
        
        // Controlla se un utente è maggiorenne (>=18 anni)
        
        int eta = 24;
        
        if (eta >= 18) {
        	System.out.println("L'utente è maggiorenne");
        } else {
        	System.out.println("L'utente è minorenne");
        }
        
        // Dato un carattere, controlla se è una vocale o una consonante.
        
        char c = 'a';
        
        if(Character.isLetter(c)) {
        	if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
        		System.out.println(c + " è una vocale");
        	} else {
        		System.out.println(c + " è una consonante");
        	}
        } else {
        	System.out.println("Il carattere inserito non è una lettera");
        }
        
        // Controlla se un numero è compreso tra 10 e 100.
        
        double prova3 = 20;
        
        if(prova3 >= 10 && prova3 <= 100) {
        	System.out.println("Il numero è compreso tra 10 e 100");
        } else {
        	System.out.println("Il numero non è compreso");
        }
        
        // Dato il voto di uno studente, stampa "promosso" se >= 6, altrimenti "bocciato".
        
        int votoFinale = 8;
        
        if(votoFinale >= 6) {
        	System.out.println("Promosso");
        } else {
        	System.out.println("Bocciato");
        } 
        
        // Stabilisci il maggiore tra due numeri interi.
        
        int num1 = 10;
        int num2 = 12;
        
        if(num1 > num2) {
        	System.out.println("Il num1: " + num1 + " è maggiore di " + num2);
        } else {
        	System.out.println("Il num2: " + num2 + " è maggiore di " + num1);
        } 
        
        // Verifica se una stringa è vuota.
		
		String testo = "";
		
		if(testo.isEmpty()) {
			System.out.println("La seguente stringa e' vuota");
		} else {
			System.out.println("La seguente stringa non e' vuota");
		} 
		
		// Scrivi un programma che stampa i numeri da 1 a 10 usando un ciclo for.
		
		for (int i = 1; i <= 10; i++) {
            System.out.println("Numero: " + i);
        } 
		
		// Scrivi un programma che calcola la somma dei numeri da 1 a 100 usando un ciclo for.
		
		int somma = 0;
		
		for (int i = 1; i <= 100; i++) {
			somma = somma + i;
		}
		
		System.out.println("La somma totale e': " + somma);
		
		// Scrivi un programma che stampa la tabellina del 7 (da 1×7 a 10×7).
		
		int N = 7;
		int count = 10;
        for (int i = 1; i <= count; i++) {
        	int numeroMoltiplicazione = 0;
            numeroMoltiplicazione = N * i;
            System.out.println("Tabellina del " + N + " è: " + numeroMoltiplicazione);
        } 
		
		// Scrivi un programma che stampa i numeri pari da 2 a 20.
		
		for (int i = 2; i <= 20; i+=2) {
			System.out.println(i);
		} 
		
		// Scrivi un programma che stampa tutti i numeri da 1 a 50 divisibili per 3.
		
		for (int i = 1; i <= 50; i++) {
			if(i % 3 == 0) {
				System.out.println(i);
			}
		} 
		
		// Scrivi un programma che stampa i numeri da 1 a 10 usando un ciclo while.
		
		int i = 1;
		
		while(i <= 10) {
			System.out.println("Numero: " + i);
			i++;
		} 
		
		// Scrivi un programma che stampa i numeri da 50 a 10 usando un ciclo while ogni 2.
		
		int i = 50;
		
		while(i >= 10) {
			System.out.println("Numero: " + i);
			i -= 2;
		} 
		
		// Scrivi un programma che calcola la somma dei numeri da 1 a 100 usando while.
		
		int i = 1;
		int somma = 0;
		
		while( i <= 100) {
			somma += i;
			i++;
		}
		
		System.out.println("La somma dei numeri e': " + somma); 
		
		// Scrivi un programma che stampa tutti i numeri pari da 2 a 20 usando while.
		
		int i = 2;
		
		while ( i <= 20) {
			System.out.println("Numero: " + i);
			i += 2;
		} 
		
		// Scrivi un programma che calcola quante cifre ha un numero intero positivo (es. numero = 3456 ha 4 cifre).
		
		int numero = 2001;
		
		int cifre = 0;
		int tempNum = numero;
		
		while (tempNum > 0) {
			tempNum /= 10;
			cifre++;
		} 
		
		System.out.println("Il numero " + numero + " ha " + cifre + " cifre "); 
		
		// Scrivi un programma che calcola la somma delle cifre di un numero intero positivo.
		//Esempio: 123 → 1 + 2 + 3 = 6.
		
		int numero = 2501;
		
		int somma = 0;
		int temp = numero;
		
		while(temp > 0) {
			int cifra = temp % 10;
			somma += cifra;
			temp = temp / 10;
		}
		
		System.out.println("La somma delle cifre del numero: " + numero + " e' " + somma); 
		
		// Scrivi un programma che inverte un numero intero positivo.
		//Esempio: 1234 → 4321
		
		int numero = 1234;
		
		int invertito = 0;
        
        while(numero > 0) {
        	int cifra = numero % 10;
        	invertito = invertito * 10 + cifra;
        	numero /= 10;
        }
        
        System.out.println("Ecco il numero invertito: " + invertito); 
		
		// Scrivi un programma che stampa tutti i divisori di un numero intero positivo.
		// Esempio: n = 12 → 1 2 3 4 6 12
		
		int numero = 12;
		
		int i = 1;
		
		while(i <= numero) {
			
			if(numero % i == 0) {
				
				System.out.println(i);
				
			}
			i++;
		} 
		
		// Scrivi un programma che stampa i numeri da 1 a 10 usando do-while.
		int i = 1;
		
		do {
			System.out.println("Numero: " + i);
			i++;
		} while (i <= 10); 
		
		// Scrivi un programma che stampa i numeri da 10 a 1 usando do-while.
				int i = 10;
				
				do {
					System.out.println("Numero: " + i);
					i--;
				} while (i >= 1); 
		
		// Scrivi un programma che somma i numeri da 1 a 100 usando do-while.
		
		int i = 1;
		int somma = 0;
		
		do {
			somma += i;
			i++;
		} while(i <= 100);
		
		System.out.println("La somma e': " + somma); 
		
		// Scrivi un programma che stampa la tabellina del 5 da 1×5 a 10×5.
		
		int i = 1;
		int numero = 5;
		
        do {
            System.out.println(numero + " x  " + i + " = " + (numero * i));
            i++;
        } while(i<= 10); 
		
		// Scrivi un programma che conta quante cifre ha un numero intero positivo, ad esempio n = 12345 ha 5 cifre.
		
		int numero = 12345;
		
		int cifre = 0;
		
		do {
			numero /= 10;
			cifre++;
		} while(numero > 0);
		
		System.out.println("Il numero 12345 ha: " + cifre + " cifre"); 
		
		// Scrivi un programma che calcola base^esponente usando do-while.
		//Esempio: 3^4 = 81
		
		int base = 3;
		int esponente = 4;
		
		int i=0;
		int risultatoFormula = 1;
		
		do {
			risultatoFormula *= base;
			i++;
		}while(i<esponente);
            
		System.out.println("Il risultato e': " + risultatoFormula); 
		
		// Usa uno switch per stampare il giorno della settimana dato un numero da 1 a 7.
		
		int giorno = 9;
		
		switch(giorno) {
		case 1:
			System.out.println("Lunedì");
			break;
		case 2:
			System.out.println("Martedì");
			break;
		case 3:
			System.out.println("Mercoledì");
			break;
		case 4:
			System.out.println("Giovedì");
			break;
		case 5:
			System.out.println("Venerdì");
			break;
		case 6:
			System.out.println("Sabato");
			break;
		case 7:
			System.out.println("Domenica");
			break;
		default:
			System.out.println("Numero del giorno non valido. Devi inserire un numero da 1 a 7! ");
		}
		
		//Usa uno switch per stampare la stagione dato un mese (es. 1 = gennaio = inverno).
		
		int mese = 12; 

        switch (mese) {
        	case 12:
            case 1:  
            case 2:
            	System.out.println("Inverno");
                break;
            case 3: 
            case 4: 
            case 5:
                System.out.println("Primavera");
                break;
            case 6: 
            case 7: 
            case 8:
                System.out.println("Estate");
                break;
            case 9: 
            case 10: 
            case 11:
            	System.out.println("Autunno");
                break;            	
            default:
                System.out.println("Mese non valido");
        } 
		
		// Simula un menu di un ristorante (switch per scegliere tra 3 piatti).
		
		int scelta = 3;
		
		switch (scelta) {
        case 1:
            System.out.println("Hai scelto la Pizza Margherita");
            break;
        case 2:
            System.out.println("Hai scelto la Pizza Capricciosa");
            break;
        case 3:
            System.out.println("Hai scelto la Pizza Diavola");
            break;
        default:
            System.out.println("Scelta non valida. Devi scegliere un numero da 1 a 3! ");
    }
		
		//Simula una calcolatrice base con switch (+, -, *, /).
		
		int a = 10;
		int b = 2;
		
		char operazione = '+';
		
		int risultato;
		
		switch(operazione) {
		case '+':
			risultato = a + b;
			System.out.println("Risultato dell'operazione (+): " + risultato);
			break;
		case '-':
			risultato = a - b;
			System.out.println("Risultato dell'operazione (-): " + risultato);
			break;
		case '*':
			risultato = a * b;
			System.out.println("Risultato dell'operazione (*): " + risultato);
			break;
		case '/':
			if(b != 0) {
				risultato = a / b;
				System.out.println("Risultato dell'operazione (/): " + risultato);
			}else {
				System.out.println("Non divisibile per 0. Errore.");
			}
			break;
		default:
			System.out.println("Scelta non valida. Nessuna operazione eseguita. Fai una nuova scelta! ");	
			
		} 
		
		// Dato un codice prodotto, usa uno switch per mostrare nome e prezzo.
		
		String codiceProdotto = "B2";
        
        String nomeProdotto = "";
        double prezzoProdotto = 0.0;
        
        // Switch per determinare nome e prezzo in base al codice prodotto
        switch (codiceProdotto) {
            case "A1":
                nomeProdotto = "Computer";
                prezzoProdotto = 1200.00;
                break;
            case "B2":
                nomeProdotto = "iPhone 16 Pro Max";
                prezzoProdotto = 1600.00;
                break;
            case "C3":
                nomeProdotto = "Apple Watch";
                prezzoProdotto = 500.00;
                break;
            case "D4":
                nomeProdotto = "PS 5";
                prezzoProdotto = 400.00;
                break;
            case "E5":
                nomeProdotto = "Cuffie";
                prezzoProdotto = 150.00;
                break;
            default:
                nomeProdotto = "Prodotto non trovato";
                prezzoProdotto = 0.0;
                break;
        }
        
        // Output
        System.out.println("Il Nome del prodotto è di : " + nomeProdotto);
        System.out.println("Il Prezzo del prodotto è di : €" + prezzoProdotto);
		
		
		//Scrivi un programma che usa if per verificare l'età, e switch per decidere il tipo di biglietto (es. junior, adulti, senior).

        int eta = 45;
        
        String tipoBiglietto = "";

        if (eta < 18) {
            tipoBiglietto = "junior"; 
        } else if (eta >= 18 && eta <= 64) {
            tipoBiglietto = "adulto"; 
        } else {
            tipoBiglietto = "senior";
        }

        switch (tipoBiglietto) {
            case "junior":
                System.out.println("Biglietto per Junior.");
                break;
            case "adulto":
                System.out.println("Biglietto per Adulti.");
                break;
            case "senior":
                System.out.println("Biglietto per Senior.");
                break;
            default:
                System.out.println("Tipo di biglietto non riconosciuto.");
        } 
	
		//Usa uno switch per stampare il nome del mese e con if stampa se ha 31 o 30 giorni.
		
		int mese = 2;
        String nomeMese = "";

        switch (mese) {
            case 1:
                nomeMese = "Gennaio";
                break;
            case 2:
                nomeMese = "Febbraio";
                break;
            case 3:
                nomeMese = "Marzo";
                break;
            case 4:
                nomeMese = "Aprile";
                break;
            case 5:
                nomeMese = "Maggio";
                break;
            case 6:
                nomeMese = "Giugno";
                break;
            case 7:
                nomeMese = "Luglio";
                break;
            case 8:
                nomeMese = "Agosto";
                break;
            case 9:
                nomeMese = "Settembre";
                break;
            case 10:
                nomeMese = "Ottobre";
                break;
            case 11:
                nomeMese = "Novembre";
                break;
            case 12:
                nomeMese = "Dicembre";
                break;
            default:
                System.out.println("Mese non valido. Digita una nuova scelta. ");
                return;
        }

        System.out.println("Il mese è: " + nomeMese);

        if (mese == 4 || mese == 6 || mese == 9 || mese == 11) {
            System.out.println("Ha 30 giorni.");
        } else if (mese == 2) {
            System.out.println("Ha 28 o 29 giorni (in base se l'anno bisestile o meno)");
        } else {
            System.out.println("Ha 31 giorni.");
        } 
		
		// Dato un voto in lettere (A, B, C, ecc.), stampa con switch il valore numerico equivalente.
		
		String votoLettera = "B"; // Per accettare anche lettere minuscole

        int valoreNumerico;

        switch (votoLettera) {
            case "A":
                valoreNumerico = 10;
                break;
            case "B":
                valoreNumerico = 8;
                break;
            case "C":
                valoreNumerico = 6;
                break;
            case "D":
                valoreNumerico = 5;
                break;
            case "F":
                valoreNumerico = 2;
                break;
            default:
                System.out.println("Voto digitato valido.");
                return;
        }

        System.out.println("Il valore numerico del voto " + votoLettera + " è: " + valoreNumerico);
		
		
		//Dato un numero intero, stampa il suo valore assoluto.
		
		int numero = 5;

        int valoreAssoluto = Math.abs(numero);

        System.out.println("Il valore assoluto è: " + valoreAssoluto); 
		
		//Calcola 2 elevato alla 5 utilizzando Math.pow.
		
		double risultato = Math.pow(2, 5);

        System.out.println("2 elevato alla 5 è: " + risultato); 
        
        //Trova la radice quadrata di 49.
		
		double risultato = Math.sqrt(49);

        System.out.println("La radice quadrata di 49 è: " + risultato); 
        
        //Dati i cateti a = 3 e b = 4, calcola l’ipotenusa usando il teorema di Pitagora.
		
		double a = 3;
        double b = 4;

        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("L'ipotenusa è: " + c); 
		
		// Dato un numero n, verifica se è una potenza di 2.
		
		int n = 20;
		boolean potenzaDue = (Math.log(n)/Math.log(2))%1==0;
		
		System.out.println("Il seguente numero: " + n + " è una potenza di 2? " + potenzaDue);
		
		//Genera due numeri casuali tra 1 e 50, poi stampa la loro differenza assoluta.
		
		int num1 = (int)(Math.random()*50) + 1;
		int num2 = (int)(Math.random()*50) + 1;
		
		int differenza = Math.abs(num1 - num2);
		
		System.out.println("La differenza tra i due numeri casuali e': " + differenza);
		
		//Dividi una ruota in 8 settori (da 0° a 360°), e stampa il settore in cui cade una freccia casuale.
		
		int numeroSettori = 8;
        int ampiezzaSettore = 360 / numeroSettori;

        // Genera un angolo casuale tra 0 e 359
        Random random = new Random();
        int angolo = random.nextInt(360);

        // Calcola il settore in cui cade l'angolo
        int settore = angolo / ampiezzaSettore;

        // Stampa i risultati
        System.out.println("Angolo casuale: " + angolo + "°");
        System.out.println("La freccia cade nel settore: " + settore); 
		
		//Dato pi = 3.14159, stampa solo le prime 2 cifre dopo la virgola, senza arrotondare (→ 3.14).
		
		double pi = Math.PI;
		
		double pi_ = Math.floor(pi*100)/100;
		
		System.out.println(pi_);
		
		//Stampa la data di oggi.
		
		LocalDate date = LocalDate.now();
		System.out.println("Ecco la data di oggi: " + date);
		
		//Crea e stampa una data: 3 settembre 2025.
		
		LocalDate date = LocalDate.of(2025, 9, 3);
		System.out.println("La data e': " + date);
		
		// Aggiungi 30 giorni alla data corrente e stampa la nuova data.
		LocalDate date = LocalDate.now();
		LocalDate plus = date.plusDays(30);
		System.out.println("La data e': " + plus);
		
		//Stampa il numero di giorni tra oggi e il 31 dicembre 2025.
		LocalDate date = LocalDate.now();
		LocalDate date2 = LocalDate.of(2025, 12, 31);
		
		long giorni = ChronoUnit.DAYS.between(date, date2);
		
		System.out.println("La differenza dei giorni e': " + giorni);
		
		//Controlla se il 31 dicembre 2024 è una data passata.
		LocalDate dataDicembre = LocalDate.of(2024, 12, 31);
		LocalDate date = LocalDate.now();

		boolean dataPassataCheck = dataDicembre.isBefore(date);
		
		System.out.println("Il 31 Dicembre 2024 è una data passata? " + dataPassataCheck);
		
		//Stampa l’anno, il mese e il giorno dalla data di oggi.
		LocalDate date = LocalDate.now();
		
		System.out.println(date.getYear());
		System.out.println(date.getMonthValue());
		System.out.println(date.getDayOfMonth());
		
		//Controlla se l’anno della data odierna è bisestile.
		LocalDate date = LocalDate.now();
		boolean dataBisestile = date.isLeapYear();
		
		if(dataBisestile) {
			System.out.println("L'anno " + date.getYear() + " è bisestile ");
		} else {
			System.out.println("L'anno " + date.getYear() + " non è bisestile ");
		}
		
		//data di nascita 2010-04-5, calcola l’età attuale.
		LocalDate date = LocalDate.now();
		LocalDate dataNascita = LocalDate.of(2010, 4, 5);
		
		long age = ChronoUnit.YEARS.between(dataNascita, date);
		
		System.out.println("L'età attuale e': " + age);
		
		//Stampa il giorno della settimana per il 4 settembre 2025.
		
		LocalDate date = LocalDate.of(2025, 9, 4);
		DayOfWeek giorno = date.getDayOfWeek();
		System.out.println("Il giorno della settimana e': " + giorno);
		
		//Stampa oggi e i prossimi 4 giorni consecutivi.
		
		LocalDate date = LocalDate.now();
		
		for(int i = 0; i <= 4; i++) {
			System.out.println("Giorno " + (i + 1) + ": " + date.plusDays(i));
		}
		
		//Stampa la data e l’ora correnti usando LocalDateTime
		System.out.println(LocalDateTime.now());
		
		//Aggiungi 2 ore e 30 minuti alla data corrente.
		
		LocalDateTime oggi = LocalDateTime.now();
		LocalDateTime add = oggi.plusHours(2).plusMinutes(30);
		
		System.out.println("Aggiunti 2 ore e 30 minuti, ecco: " + add); 
		
		//Calcola i minuti tra 14:15 e 16:45.
		
		long min = ChronoUnit.MINUTES.between(LocalTime.of(14, 15), LocalTime.of(16, 45));
		
		System.out.println("Calcolati i minuti, ecco: " + min);
		
		//Formatta la data 2025-03-10 nel formato 10/03/2025.
		
			LocalDate data = LocalDate.of(2025, 3, 10); // 10 marzo 2025

	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	        String dataFormattata = data.format(formatter);

	        System.out.println("Ecco qui la data nel formato dd/MM/yyyy: " + dataFormattata);
		
		//Trova il numero di giorni tra 2025-01-01T00:00 e la data corrente.
		
			LocalDateTime dataIniziale = LocalDateTime.of(2025, 1, 1, 0, 0);
	
	        LocalDateTime dataCorrente = LocalDateTime.now();
	
	        long giorni= ChronoUnit.DAYS.between(dataIniziale, dataCorrente);
	
	        System.out.println("Giorni trascorsi: " + giorni);
		
		//Stampa il nome del mese corrente in italiano (maiuscolo)
		
			String mese = LocalDate.now().getMonth().getDisplayName(java.time.format.TextStyle.FULL, Locale.ITALIAN);
			
			System.out.println("Nome del mese corrente in italiano " + mese.toUpperCase()); */
		
		//
		
		
		
		
		
   }
	
} 
        

package com.math.date;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class IntroDate {

	public static void main(String[] args) {
		
		/*LocalDate today = LocalDate.now();
		System.out.println(today);

		LocalDate Five5 = LocalDate.of(2022, 5, 5);
		System.out.println(Five5);

		LocalDate May5th = LocalDate.of(2022, Month.MAY, 5);
		System.out.println(May5th);

		LocalDate Day125 = LocalDate.ofYearDay(2022, 125);
		System.out.println(Day125);

		LocalDate May5 = LocalDate.parse("2022-05-05");
		System.out.println(May5);

		System.out.println(May5.getYear());
		System.out.println(May5.getMonth());

		System.out.println(May5.getMonthValue());

		System.out.println(May5.getDayOfMonth());
		System.out.println(May5.getDayOfWeek());
		System.out.println(May5.getDayOfYear());

		System.out.println(May5.get(ChronoField.YEAR));
		System.out.println(May5.get(ChronoField.MONTH_OF_YEAR));
		System.out.println(May5.get(ChronoField.DAY_OF_MONTH));
		System.out.println(May5.get(ChronoField.DAY_OF_YEAR));

		System.out.println(May5.withYear(2000));
		System.out.println(May5.withMonth(3));
		System.out.println(May5.withDayOfMonth(4));
		System.out.println(May5.withDayOfYear(126));
		System.out.println(May5);
		System.out.println(May5.with(ChronoField.DAY_OF_YEAR, 126));
		System.out.println(May5.plusYears(1));
		System.out.println(May5.plusMonths(12));
		System.out.println(May5.plusDays(365));
		System.out.println(May5.plusWeeks(52));
		System.out.println(May5.plus(365, ChronoUnit.DAYS));

		System.out.println("May5 > today? " + May5.isAfter(today));
		System.out.println("today > May5? " + May5.isBefore(today));
		System.out.println("May5 > today? " + May5.compareTo(today));
		System.out.println("today > May5? " + today.compareTo(May5));

		System.out.println("today = now ? " + today.compareTo(LocalDate.now()));
		System.out.println("today = now ? " + today.equals(LocalDate.now()));

		System.out.println(today.isLeapYear());
		System.out.println(May5.minusYears(2).isLeapYear()); */
		
		LocalDate oggi = LocalDate.now();
		System.out.println("La data di oggi e': " + oggi);
		
		// Crea e stampa una data: 1 gennaio 2025.
		
		LocalDate data1 = LocalDate.of(2025, Month.JANUARY, 1);
		System.out.println("La data e': " + data1);
		
		// Aggiungi 30 giorni alla data corrente e stampa la nuova data.
		
		LocalDate data2 = LocalDate.now();
		LocalDate plus = data2.plusDays(30);
		System.out.println("La data e': " + plus);
		
		// Stampa il numero di giorni tra oggi e il 25 dicembre 2025.
		
		LocalDate dataOdierna = LocalDate.now();
		LocalDate dataVenticinqueDic = LocalDate.of(2025, 12, 25);
		
		long i = ChronoUnit.DAYS.between(dataOdierna, dataVenticinqueDic);
		
		System.out.println("Il numero di giorni tra oggi e il 25 dicembre 2025 e' " + i);
		
		
		
		// Controlla se il 1 gennaio 2000 è una data passata.
		
		LocalDate dataPrimoGennaio = LocalDate.of(2000, 1, 1);
		LocalDate dataOdierna2 = dataOdierna;
		
		boolean dataPassataCheck = dataPrimoGennaio.isBefore(dataOdierna2);
		
		System.out.println("il 1 gennaio 2000 è una data passata? " + dataPassataCheck);
		
		// Stampa l’anno, il mese e il giorno dalla data di oggi.
		LocalDate oggi2 = LocalDate.now();
		
		System.out.println(oggi2.getYear());
		System.out.println(oggi2.getMonthValue());
		System.out.println(oggi2.getDayOfMonth());
		
		// Controlla se l’anno della data odierna è bisestile.
		
		if(LocalDate.now().isLeapYear()) {
			System.out.println("L'anno " + LocalDate.now().getYear() + " è bisestile ");
		} else {
			System.out.println("L'anno " + LocalDate.now().getYear() + " non è bisestile ");
		}
		
		// 2 SOLUZIONE
		
		LocalDate oggi5 = LocalDate.now();
        boolean bisestile = oggi.isLeapYear();
        System.out.println("L'anno " + oggi5.getYear() + " è bisestile? " + bisestile);
		
		// Dalla data di nascita 2000-04-15, calcola l’età attuale.
		LocalDate odierna = LocalDate.now();
		LocalDate dataAprile = LocalDate.of(2000, 4, 15);
		
		long age = ChronoUnit.YEARS.between(dataAprile, odierna);
		
		System.out.println("Data di nascita: " + dataAprile);
		System.out.println("Data Odierna: " + odierna);
		System.out.println("Età attuale: " + age);
		
		// 2 SOLUZIONE
		
		LocalDate nascita = LocalDate.of(2000, 4, 15);
        LocalDate today = LocalDate.now();
        Period eta = Period.between(nascita, today);
        System.out.println("Età: " + eta.getYears() + " anni");
        
	}

}

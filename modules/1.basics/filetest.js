// //Scrivi un programma che controlla se un numero è positivo o negativo.
// let numero = 5;
// if (numero >= 0) {
//     console.log("Il numero è positivo");
// } else {
//     console.log("Il numero è negativo");
// }
// //Verifica se un numero è pari o dispari.
// let num = 4;
// if (num % 2 == 0) {
//     console.log("Il numero è pari");
// } else {
//     console.log("Il numero è dispari");
// }

// //Controlla se un utente è maggiorenne (>=18 anni).
// let eta = 16;
// if (eta >= 18){
//     console.log("L'utente è maggiorenne");
// } else {
//     console.log("L'utente è minorenne");
// }

// //Dato un numero, verifica se è multiplo di 5.
// let numA = 10;
// if(numA % 5 === 0){
//     console.log("Il numero è divisibile per 5");
// }else {
//     console.log("Il numero non è divisibile per 5");
// }

// // Dato un carattere, controlla se è una vocale o una consonante
// let lettera = "a";
//  if (lettera == "a" || lettera == "e" || lettara == "u" || lettera == "i" || lettera == "o") {
//       console.log("È una vocale.");
//     } else {
//       console.log("È una consonante.");
//     }

// //Controlla se un numero è compreso tra 10 e 100.
// let numB = 30;
// if (numB >= 10 && numB <= 100) {
//     console.log("Il numero è compreso tra 10 e 100.");
//   } else {
//     console.log("Il numero NON è compreso tra 10 e 100.");
//   }

// //Dato il voto di uno studente, stampa "promosso" se >= 6, altrimenti "bocciato".
// let voto = 7;
// if (eta >= 6){
//     console.log("Promosso");
// } else {
//     console.log("Bocciato");
// }

// // Verifica se due numeri sono uguali.
// let numC = 30;
// let numD = 30;
// if (numC == numD) {
//     console.log("I numeri sono uguali.");
//   } else {
//     console.log("I numeri NON sono uguali.");
//   }

// // Stabilisci il maggiore tra due numeri interi
// let numE = 10;
// let numF = 11;
// if (numE > numF) {
//     console.log(numE + " è maggiore di " + numF);
//   } else if (numF > numE) {
//     console.log(numF + " è maggiore di " + numE); 
//   } else {
//     console.log("I due numeri sono uguali."); 
//   }

// //Verifica se una stringa è vuota.
// let str = "";

// if (str === "") {
//     console.log("La stringa è vuota.");
//   } else {
//     console.log("La stringa NON è vuota."); 
//   }

// // Scrivi un programma che stampa i numeri da 1 a 10 usando un ciclo for.
// for (let i = 1; i <= 10; i++) {
//   console.log(i);
// }

// // Scrivi un programma che calcola la somma dei numeri da 1 a 100 usando un ciclo for.
// let sum = 0;
// for (let i = 1; i <= 100; i++) {
//   sum += i;
// }
// console.log("La somma da 1 a 100 è:", sum);

// // Scrivi un programma che stampa la tabellina del 7 (da 1×7 a 10×7).
// for (let i = 1; i <= 10; i++) {
//   console.log( i + " x 7 " + " = " + i * 7);
// }

// //Scrivi un programma che stampa i numeri pari da 2 a 20.
// for (let i = 2; i <= 20; i += 2) {
//   console.log(i);
// }

// // Scrivi un programma che stampa tutti i numeri da 1 a 50 divisibili per 3.
// for (let i = 1; i <= 50; i++) {
//   if (i % 3 === 0) {
//     console.log(i);
//   }
// }

// //Stampa il quadrato di ogni numero da 1 a 10 (es: 1² = 1, 2² = 4, ecc.).
// for (let i = 1; i <= 10; i++) {
//   console.log(i + " = " + i * i);
// }

// // Calcola e stampa la somma dei primi n numeri dispari (es. n = 5 → 1 + 3 + 5 + 7 + 9 = 25).
// function sum_for(n) {
//   let sum = 0;
//   for (let i = 0; i < n; i++) {
//     sum += (2 * i + 1);
//   }
//   return sum;
// }

// console.log(sum_for(5));  // 25

// // Dato base = 2 ed esponente = 5, calcola 2 elevato a 5
// const base = 2;
// const esponente = 5;

// const risultato = base ** esponente;

// console.log("2 elevato a 5 da: " + risultato);

// //Scrivi un programma che stampa tutti i numeri primi da 2 a 100 usando solo for.
// for (let num = 2; num <= 100; num++) {
//   let isPrime = true;

//   for (let i = 2; i < num; i++) {
//     if (num % i === 0) {
//       isPrime = false;
//       break;
//     }
//   }

//   if (isPrime) {
//     console.log(num);
//   }
// }

// // Scrivi un programma che stampa i numeri da 1 a 10 usando un ciclo while.
// let i = 1;

// while (i <= 10) {
//   console.log(i);
//   i++;
// }

// //Scrivi un programma che calcola la somma dei numeri da 1 a 100 usando while.
// let i2 = 1;
// let sum2 = 0;

// while (i2 <= 100) {
//   sum2 += i;
//   i++;
// }

// console.log("La somma da 1 a 100 è:", sum2);

// //Scrivi un programma che stampa tutti i numeri pari da 2 a 20 usando while.
// let i3 = 2;

// while (i3 <= 20) {
//   console.log(i3);
//   i3 += 2;
// }

// //Scrivi un programma che calcola il fattoriale di 5 usando while.
// let numeroA = 5;
// let fattoriale = 1;
// let i4 = 1;

// while(i4 < numeroA){
//     fattoriale *= 1;
//     i4++;
// } 

// console.log("Il fattoriale di " + numeroA + " è " + fattoriale);

// //Stampa la tabellina del 4 da 1×4 a 10×4 usando while.
// let i5 = 1;

// while(i5 <= 10){
//     console.log(i5 + " x 4 = " + i5*4);
//     i5++;
// }

// // Scrivi un programma che calcola quante cifre ha un numero intero positivo (es. numero = 3456 ha 4 cifre).
// let numeroB = 3456;
// let count = 0;

// while(numeroB > 0){
//     numeroB = Math.floor(numeroB/10);
//     count++;
// }

// console.log("Il numero: " + numeroB + " ha " + count + " cifre.");

// //Scrivi un programma che inverte un numero intero positivo.
// //Esempio: 1234 → 4321
// let numeroD = 1234;
// let invertito = 0;

// while (numeroD > 0) {
//   let cifra = numeroD % 10;
//   invertito = invertito * 10 + cifra;
//   numeroD = parseInt(numeroD / 10);
// }

// console.log(invertito);

// let num = 5;
// let count = num;
// let primo = true;

// while (count > 2) {
//   count--;
//   //   primo = true;
//   if (num % count == 0) {
//     primo = false;
//     break;
//   }
// }
// // console.log("Il numero " + num + "è: " + primo ? " PRIMO" : " NON PRIMO");

// if (primo) {
//   console.log(num + " è primo.");
// } else {
//   console.log(num + " non è primo.");
// }

// 
// let num = 5;
// let count = num;
// let primo = true;

// while (count > 2) {
//   count--;
//   //   primo = true;
//   if (num % count == 0) {
//     primo = false;
//     break;
//   }
// }
// // console.log("Il numero " + num + "è: " + primo ? " PRIMO" : " NON PRIMO");

// if (primo) {
//   console.log(num + " è primo.");
// } else {
//   console.log(num + " non è primo.");
// }

// Scrivi un programma che stampa i numeri da 1 a 10 usando do-while.
// let i = 1;

// do {
//   console.log(i);
//   i++;
// } while (i <= 10);

// Scrivi un programma che somma i numeri da 1 a 100 usando do-while.
// let i = 1;
// let somma = 0;

// do {
//   somma += i;
//   i++;
// } while (i <= 100);

// console.log("La somma da 1 a 100 è:", somma);

// Scrivi un programma che stampa la tabellina del 5 da 1×5 a 10×5.
// let i = 1;

// do {
//   console.log(i + " × 5 = " + (i * 5));
//   i++;
// } while (i <= 10);

// Scrivi un programma che stampa i numeri pari da 2 a 20 usando do-while.
// let i = 2;

// do {
//   console.log(i);
//   i += 2;  // Incrementa di 2 per saltare i numeri dispari
// } while (i <= 20);

// Scrivi un programma che conta quante cifre ha un numero intero positivo, ad esempio n = 12345 ha 5 cifre.
// let n = 12345;    
// let count = 0;    
// let numero = n;   

// do {
//   numero = Math.floor(numero / 10);  
//   count++;                          
// } while (numero > 0);

// console.log("Il numero", n, "ha", count, "cifre.");

// Scrivi un programma che somma tutte le cifre di un numero intero positivo.
// Esempio: 456 → 4 + 5 + 6 = 15.
// let n = 456;       
// let somma = 0;     
// let numero = n;    

// do {
//   let cifra = numero % 10;      
//   somma += cifra;              
//   numero = Math.floor(numero / 10);  
// } while (numero > 0);

// console.log("La somma delle cifre di", n, "è:", somma);

// Usa uno switch per stampare il giorno della settimana dato un numero da 1 a 7.
// let numeroGiorno = 4;  

// switch (numeroGiorno) {
//   case 1:
//     console.log("Lunedì");
//     break;
//   case 2:
//     console.log("Martedì");
//     break;
//   case 3:
//     console.log("Mercoledì");
//     break;
//   case 4:
//     console.log("Giovedì");
//     break;
//   case 5:
//     console.log("Venerdì");
//     break;
//   case 6:
//     console.log("Sabato");
//     break;
//   case 7:
//     console.log("Domenica");
//     break;
//   default:
//     console.log("Numero non valido, inserisci un numero da 1 a 7");
// }

// Usa uno switch per stampare la stagione dato un mese (es. 1 = gennaio = inverno
// let mese = 4;  

// switch (mese) {
//   case 12:
//   case 1:
//   case 2:
//     console.log("Inverno");
//     break;
//   case 3:
//   case 4:
//   case 5:
//     console.log("Primavera");
//     break;
//   case 6:
//   case 7:
//   case 8:
//     console.log("Estate");
//     break;
//   case 9:
//   case 10:
//   case 11:
//     console.log("Autunno");
//     break;
//   default:
//     console.log("Mese non valido, inserisci un numero da 1 a 12");
// }

// Simula un menu di un ristorante (switch per scegliere tra 3 piatti).
// let scelta = 2;  

// switch (scelta) {
//   case 1:
//     console.log("Hai scelto: Spaghetti alla carbonara");
//     break;
//   case 2:
//     console.log("Hai scelto: Pizza margherita");
//     break;
//   case 3:
//     console.log("Hai scelto: Risotto ai funghi");
//     break;
//   default:
//     console.log("Scelta non valida. Scegli un numero da 1 a 3.");
// }

// Simula una calcolatrice base con switch (+, -, *, /).
// let a = 12;
// let b = 4;
// let operazione = '*';  // Può essere '+', '-', '*', '/'

// switch (operazione) {
//   case '+':
//     console.log(`${a} + ${b} = ${a + b}`);
//     break;
//   case '-':
//     console.log(`${a} - ${b} = ${a - b}`);
//     break;
//   case '*':
//     console.log(`${a} * ${b} = ${a * b}`);
//     break;
//   case '/':
//     if (b !== 0) {
//       console.log(`${a} / ${b} = ${a / b}`);
//     } else {
//       console.log("Errore: divisione per zero!");
//     }
//     break;
//   default:
//     console.log("Operazione non valida. Usa +, -, *, /");
// }

//Dato un codice prodotto, usa uno switch per mostrare nome e prezzo.
// let codiceProdotto = 'B2';  // Cambia il codice prodotto

// switch (codiceProdotto) {
//   case 'A1':
//     console.log("Prodotto: Penna, Prezzo: 1.20€");
//     break;
//   case 'B2':
//     console.log("Prodotto: Quaderno, Prezzo: 2.50€");
//     break;
//   case 'C3':
//     console.log("Prodotto: Zaino, Prezzo: 25.00€");
//     break;
//   default:
//     console.log("Codice prodotto non valido");
// }

// Scrivi un programma che usa if per verificare l'età, e switch per decidere il tipo di biglietto (es. junior, adulti, senior).
// let eta = 45;

// if (eta <= 0 || isNaN(eta)) {
//   console.log("Età non valida.");
// } else {
//   let tipoBiglietto;

//   if (eta < 18) {
//     tipoBiglietto = 'junior';
//   } else if (eta >= 65) {
//     tipoBiglietto = 'senior';
//   } else {
//     tipoBiglietto = 'adulto';
//   }

//   switch (tipoBiglietto) {
//     case 'junior':
//       console.log("Tipo di biglietto: Junior (sconto applicato)");
//       break;
//     case 'adulto':
//       console.log("Tipo di biglietto: Adulto (tariffa intera)");
//       break;
//     case 'senior':
//       console.log("Tipo di biglietto: Senior (sconto over 65)");
//       break;
//     default:
//       console.log("Errore nel calcolo del biglietto.");
//   }
// }

// Usa uno switch per stampare il nome del mese e con if stampa se ha 31 o 30 giorni.
// let numeroMese = 9; 
// let nomeMese = "";

// switch (numeroMese) {
//   case 1:
//     nomeMese = "Gennaio";
//     break;
//   case 2:
//     nomeMese = "Febbraio";
//     break;
//   case 3:
//     nomeMese = "Marzo";
//     break;
//   case 4:
//     nomeMese = "Aprile";
//     break;
//   case 5:
//     nomeMese = "Maggio";
//     break;
//   case 6:
//     nomeMese = "Giugno";
//     break;
//   case 7:
//     nomeMese = "Luglio";
//     break;
//   case 8:
//     nomeMese = "Agosto";
//     break;
//   case 9:
//     nomeMese = "Settembre";
//     break;
//   case 10:
//     nomeMese = "Ottobre";
//     break;
//   case 11:
//     nomeMese = "Novembre";
//     break;
//   case 12:
//     nomeMese = "Dicembre";
//     break;
//   default:
//     console.log("Numero mese non valido");
// }

// if (nomeMese !== "") {
//   console.log("Mese:", nomeMese);

//   if (
//     numeroMese === 4 || 
//     numeroMese === 6 || 
//     numeroMese === 9 || 
//     numeroMese === 11
//   ) {
//     console.log("Ha 30 giorni");
//   } else if (numeroMese === 2) {
//     console.log("Ha 28 o 29 giorni (anno bisestile)");
//   } else {
//     console.log("Ha 31 giorni");
//   }
// }

// Dato un voto in lettere (A, B, C, ecc.), stampa con switch il valore numerico equivalente.
// let votoLettera = 'B';
// let votoNumerico;

// switch (votoLettera.toUpperCase()) {
//   case 'A':
//     votoNumerico = 10;
//     break;
//   case 'B':
//     votoNumerico = 8;
//     break;
//   case 'C':
//     votoNumerico = 6;
//     break;
//   case 'D':
//     votoNumerico = 5;
//     break;
//   case 'F':
//     votoNumerico = 0;
//     break;
//   default:
//     console.log("Voto non valido. Usa A, B, C, D o F.");
// }

// if (votoNumerico !== undefined) {
//   console.log("Il voto numerico corrispondente a", votoLettera, "è:", votoNumerico);
// }

// Crea una simulazione bancomat: con if verifica il PIN, con switch scegli l’operazione.
// const pinCorretto = 1234;

// let pinInserito = 1234;       
// let saldo = 1000;             
// let operazione = 2;           
// let importo = 200;            

// if (pinInserito === pinCorretto) {
//   console.log("PIN corretto. Benvenuto!");

//   switch (operazione) {
//     case 1:
//       console.log("Saldo attuale: €" + saldo.toFixed(2));
//       break;

//     case 2:
//       if (importo > 0 && importo <= saldo) {
//         saldo -= importo;
//         console.log("Hai prelevato €" + importo.toFixed(2));
//         console.log("Nuovo saldo: €" + saldo.toFixed(2));
//       } else {
//         console.log("Importo non valido o saldo insufficiente.");
//       }
//       break;

//     case 3:
//       if (importo > 0) {
//         saldo += importo;
//         console.log("Hai depositato €" + importo.toFixed(2));
//         console.log("Nuovo saldo: €" + saldo.toFixed(2));
//       } else {
//         console.log("Importo non valido per il deposito.");
//       }
//       break;

//     default:
//       console.log("Operazione non valida.");
//   }

// } else {
//   console.log("PIN errato. Accesso negato.");
// }

// Dato un segno zodiacale ("Ariete", "Toro", ecc.), usa switch per stampare il mese corrispondente.
// let segno = "Leone"; 
// segno = segno.toLowerCase(); 

// switch (segno) {
//   case "ariete":
//     console.log("Ariete: 21 Marzo – 20 Aprile");
//     break;
//   case "toro":
//     console.log("Toro: 21 Aprile – 20 Maggio");
//     break;
//   case "gemelli":
//     console.log("Gemelli: 21 Maggio – 21 Giugno");
//     break;
//   case "cancro":
//     console.log("Cancro: 22 Giugno – 22 Luglio");
//     break;
//   case "leone":
//     console.log("Leone: 23 Luglio – 23 Agosto");
//     break;
//   case "vergine":
//     console.log("Vergine: 24 Agosto – 22 Settembre");
//     break;
//   case "bilancia":
//     console.log("Bilancia: 23 Settembre – 22 Ottobre");
//     break;
//   case "scorpione":
//     console.log("Scorpione: 23 Ottobre – 22 Novembre");
//     break;
//   case "sagittario":
//     console.log("Sagittario: 23 Novembre – 21 Dicembre");
//     break;
//   case "capricorno":
//     console.log("Capricorno: 22 Dicembre – 20 Gennaio");
//     break;
//   case "acquario":
//     console.log("Acquario: 21 Gennaio – 19 Febbraio");
//     break;
//   case "pesci":
//     console.log("Pesci: 20 Febbraio – 20 Marzo");
//     break;
//   default:
//     console.log("Segno zodiacale non valido");
// }

// Dato un numero intero, stampa il suo valore assoluto.
// let numero = -42;  

// let valoreAssoluto;

// if (numero < 0) {
//   valoreAssoluto = -numero;  
// } else {
//   valoreAssoluto = numero;   
// }

// console.log("Il valore assoluto di", numero, "è:", valoreAssoluto);

// // Calcola 2 elevato alla 5 utilizzando Math.pow.
// let potenza = Math.pow(2, 5);
// console.log("2 elevato alla 5 è:", potenza); 

// // Trova la radice quadrata di 49.
// let radice = Math.sqrt(49);
// console.log("La radice quadrata di 49 è:", radice);  

// // Arrotonda il numero 3.6.
// let arrotondato = Math.round(3.6);
// console.log("3.6 arrotondato è:", arrotondato);  

// // Stampa il maggiore tra 15 e 27.
// let massimo = Math.max(15, 27);
// console.log("Il maggiore tra 15 e 27 è:", massimo);  

// // Stampa il minore tra 23 e 12
// let minimo = Math.min(23, 12);
// console.log("Il minore tra 23 e 12 è:", minimo);

// // Stampa la differenza assoluta tra 20 e 35
// let a = 20;
// let b = 35;

// let differenzaAssoluta = Math.abs(a - b);
// console.log("La differenza assoluta tra 20 e 35 è:", differenzaAssoluta);

// // Stampa il floor e il ceil di 3.7
// let numero = 3.7;

// let floor = Math.floor(numero);
// let ceil = Math.ceil(numero);

// console.log("Floor di 3.7:", floor);  
// console.log("Ceil di 3.7:", ceil);  

// Esempi SetDate //

// Data Odierna
//let oggi = new Date();
//console.log("La data odierna e': " + oggi);

// // Set Data 24 Dicembre
// let data = new Date("December 24, 2025 18:30:00");
// console.log("Data: " + data);

// //Aggiungi 7 giorni alla data precedentemente settata
// data.setDate(data.getDate() + 7);
// console.log("La nuova data e': " + data);

// let numeri = [10, 20, 30, 40, 50, 60];

// numeri.splice(2, 2); 

// console.log(numeri); 

// // Calcola la somma di tutti gli elementi di un array.
// const numeri = [10, 20, 30, 40, 50];

// let somma = 0;

// for (let i = 0; i < numeri.length; i++) {
//   somma += numeri[i];
// }

// console.log("Somma:", somma);

// Calcola la media aritmetica degli elementi di un array.

// const numeri = [5, 8, 12, 3, 7];
// let somma = 0;

// for (let i = 0; i < numeri.length; i++) {
//   somma += numeri[i];
// }

// const media = somma / numeri.length;

// console.log("Media:", media);

// // Trova il valore massimo in un array di interi.
// const numeri = [10, 20, 30, 40, 50];
// let max = numeri[0];

// for(let i = 1; i < numeri.length; i++){
//     if(numeri[i] > max){
//         max = numeri[i];
//     }
// }

// console.log("Il numero massimo e': " + max);

// // // Trova il valore minimo in un array di interi.
// const numeri2 = [10, 20, 30, 40, 50];
// let min = numeri2[0];

// for(let i = 1; i < numeri.length; i++){
//     if(numeri2[i] < min){
//         min = numeri2[i];
//     }
// }

// console.log("Il numero minimo e': " + min);

// // Conta il numero di elementi pari in un array.
// const numeri = [1, 2, 3, 4, 5, 6];

// let contatorePari = 0;

// for (let i = 0; i < numeri.length; i++) {
//   if (numeri[i] % 2 === 0) {
//     contatorePari++;
//   }
// }

// console.log("Numero di elementi pari:", contatorePari);

// // Controlla se un numero dato (es. 10) è presente nell’array
// const numeri = [3, 7, 10, 21, 5];

// const numeroDaCercare = 10;

// let trovato = false;

// for (let i = 0; i < numeri.length; i++) {
//   if (numeri[i] === numeroDaCercare) {
//     trovato = true;
//     break; 
//   }
// }

// if (trovato) {
//   console.log("Il numero è presente nell'array.");
// } else {
//   console.log("Il numero NON è presente nell'array.");
// }

// // Conta quanti elementi nell’array sono maggiori di 10.
// const numeri = [5, 12, 8, 20, 3, 15];

// let contatore = 0;

// for (let i = 0; i < numeri.length; i++) {
//   if (numeri[i] > 10) {
//     contatore++;
//   }
// }

// console.log("Elementi maggiori di 10:", contatore);

// Copia tutti gli elementi di un array in un secondo array e stampalo.
// const arrayOriginale = [1, 2, 3, 4, 5];

// const arrayCopia = [];

// for (let i = 0; i < arrayOriginale.length; i++) {
//   arrayCopia[i] = arrayOriginale[i];
// }

// console.log(arrayCopia);

// // Dato un array, calcola la differenza tra il valore massimo e minimo.
// const numeri = [12, 5, 8, 21, 3, 9];

// let massimo = numeri[0];
// let minimo = numeri[0];

// for (let i = 1; i < numeri.length; i++) {
//   if (numeri[i] > massimo) {
//     massimo = numeri[i];
//   }
//   if (numeri[i] < minimo) {
//     minimo = numeri[i];
//   }
// }

// let differenza = massimo - minimo;

// console.log("Differenza tra massimo e minimo:", differenza);

// //Scrivi un programma che trova la posizione del numero 9 nell’array.
// const numeri = [12, 5, 8, 21, 3, 9];

// let posizione = -1;

// for (let i = 0; i < numeri.length; i++) {
//   if (numeri[i] === 9) {
//     posizione = i;
//     break; // Appena trovato, esce dal ciclo
//   }
// }

// if (posizione !== -1) {
//   console.log("Il numero 9 si trova alla posizione:", posizione);
// } else {
//   console.log("Il numero 9 non è presente nell'array.");
// }

// Calcola la somma dei numeri pari e quella dei numeri dispari separatamente.
// const numeri = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

// let sommaPari = 0;
// let sommaDispari = 0;

// for (let i = 0; i < numeri.length; i++) {
//   const numero = numeri[i];
//   if (numero % 2 === 0) {
//     sommaPari += numero;
//   } else {
//     sommaDispari += numero;
//   }
// }

// console.log("Somma dei numeri pari:", sommaPari);
// console.log("Somma dei numeri dispari:", sommaDispari);

// // Crea una matrice 2x3 e stampa tutti i suoi elementi.
// const matrice = [
//   [1, 2, 3],
//   [4, 5, 6]
// ];

// for (let i = 0; i < matrice.length; i++) {
//   for (let j = 0; j < matrice[i].length; j++) {
//     console.log("Elemento [" + i + "][" + j + "] = " + matrice[i][j]);
//   }
// }

// // Somma tutti gli elementi di una matrice 3x3.
// const matrice = [
//     [1, 2, 3],
//     [4, 5, 6],
//     [7, 8, 9]
// ]

// let somma = 0;

// for (let i = 0; i < matrice.length; i++){
//     for (let j = 0; j < matrice[i].length; j++){
//         somma += matrice[i][j];
//     }
// }

// console.log("La somma totale e': " + somma);

// // Stampa la seconda riga di una matrice 3x3.
// let matrice = [
//   [1, 2, 3],   
//   [4, 5, 6],   
//   [7, 8, 9]    
// ];

// console.log("Seconda riga:", matrice[1]);

// // Calcola la somma di ogni colonna in una matrice 3x3.
// let matrice = [
//   [1, 2, 3],
//   [4, 5, 6],
//   [7, 8, 9]
// ];

// let sommeColonne = [0, 0, 0];

// for (let i = 0; i < matrice.length; i++) {
//   for (let j = 0; j < matrice[i].length; j++) {
//     sommeColonne[j] += matrice[i][j];
//   }
// }

// console.log("Somma delle colonne:");
// for (let i = 0; i < sommeColonne.length; i++) {
//   console.log("Somma colonna : " + sommeColonne[i]);
// }

// Trova il valore massimo in una matrice 3x3 e stampa la sua posizione (riga e colonna).
// let matrice = [
//   [3, 8, 2],
//   [4, 1, 9],
//   [7, 6, 5]
// ];

// let max = matrice[0][0];
// let posizione = { riga: 0, colonna: 0 };

// for (let i = 0; i < matrice.length; i++) {
//   for (let j = 0; j < matrice[i].length; j++) {
//     if (matrice[i][j] > max) {
//       max = matrice[i][j];
//       posizione.riga = i;
//       posizione.colonna = j;
//     }
//   }
// }

// console.log("Valore massimo: " + max);
// console.log("Posizione riga: " +posizione.riga + " Posizione colonna: " + posizione.colonna);

// Trova la riga con la somma più alta e stampa l’indice della riga.
// let matrice = [
//   [2, 7, 1],
//   [6, 3, 8],
//   [4, 4, 5]
// ];

// let maxSomma = -Infinity;
// let indiceRigaMax = -1;

// for (let i = 0; i < matrice.length; i++) {
//   let sommaRiga = 0;

//   for (let j = 0; j < matrice[i].length; j++) {
//     sommaRiga += matrice[i][j];
//   }

//   if (sommaRiga > maxSomma) {
//     maxSomma = sommaRiga;
//     indiceRigaMax = i;
//   }
// }

// console.log(`La riga con la somma più alta è: ${indiceRigaMax}`);
// console.log(`Somma della riga: ${maxSomma}`);

// // Traccia: Scrivi una funzione che prende due numeri e ritorna la loro somma.
// function somma(a, b) {
//   return a + b;
// }

// //Traccia: Scrivi una funzione che dato un numero ritorna il suo quadrato.
// function quadrato(numero) {
//   return numero * numero;
// }

// let risultato = quadrato(5);
// console.log("Il quadrato è:", risultato); 

// //Traccia: Scrivi una funzione che riceve un numero e stampa se è pari o dispari.
// function pariDispari(numero) {
//   if (numero % 2 === 0) {
//     console.log("Il numero è pari.");
//   } else {
//     console.log("Il numero è dispari.");
//   }
// }

// pariDispari(7); 
// pariDispari(10); 

// // Traccia: Scrivi una funzione che prende una stringa e la ritorna in maiuscolo.
// function inMaiuscolo(testo) {
//   return testo.toUpperCase();
// }

// let risultato = inMaiuscolo("nicola narducci");
// console.log(risultato);

// // Traccia: Scrivi una funzione che ritorna il primo carattere di una stringa.
// function primoCarattere(testo) {
//   return testo.charAt(0);
// }

// let risultato = primoCarattere("nicola");
// console.log("Il primo carattere è:", risultato);

// //Traccia: Scrivi una funzione che ritorna l’ultimo carattere di una stringa.
// function ultimoCarattere(testo) {
//   return testo.charAt(testo.length - 1);
// }

// let risultato = ultimoCarattere("ciao");
// console.log("Ultimo carattere:", risultato);  

// //Traccia: Scrivi una funzione che somma tutti i numeri in un array.
// function sommaArray(numeri) {
//   let somma = 0;
//   for (let i = 0; i < numeri.length; i++) {
//     somma += numeri[i];
//   }
//   return somma;
// }

// let array = [1, 2, 3, 4, 5];
// let risultato = sommaArray(array);
// console.log("Somma totale:", risultato); 

// // Scrivi una funzione che ritorna il numero di elementi in un array.
// function contaElementi(array) {
//   return array.length;
// }

// let numeri = [10, 20, 30, 40];
// let risultato = contaElementi(numeri);
// console.log("Numero di elementi:", risultato);

// // Traccia: Scrivi una funzione che somma tutti i numeri in un array.
// function sommaArray(array) {
//   let somma = 0;
//   for (let i = 0; i < array.length; i++) {
//     somma += array[i];
//   }
//   return somma;
// }

// let numeri = [5, 10, 3, 7];
// let risultato = sommaArray(numeri);
// console.log("La somma è:", risultato); 

// // Traccia: Scrivi una funzione che ritorna il maggiore tra due numeri.
// function maggiore(a, b){
//     if(a > b){
//         return a;
//     } else {
//         return b;
//     }
// }

// let a = 3;
// let b = 2;
// console.log(maggiore(a, b));

// // Scrivi una funzione che ritorna la stringa al contrario.
// function invertiStringa(str){
//     return str.split("").reverse().join();
// }

// console.log(invertiStringa("Nicola Narducci"));

// // Traccia: Scrivi una funzione che calcola il fattoriale di un numero.
// function fattoriale(n) {
//     if (n < 0) return -1;
//     if (n === 0 || n === 1) return 1;
//     return n * fattoriale(n - 1);
// }

// console.log(fattoriale(5));


// // Traccia: Scrivi una funzione che conta quante vocali ci sono in una stringa.
// function contaVocali(str) {
//     const vocali = "aeiouAEIOU";
//     let count = 0;

//     for (let i = 0; i < str.length; i++) {
//         if (vocali.includes(str[i])) {
//             count++;
//         }
//     }

//     return count;
// }

// console.log(contaVocali("Nicola Narducci"));


// // Traccia: Scrivi una funzione che controlla se un numero è primo.
// function èPrimo(num) {
//     if (num <= 1) return false;
//     if (num === 2) return true;

//     for (let i = 2; i <= Math.sqrt(num); i++) {
//         if (num % i === 0) {
//             return false;
//         }
//     }

//     return true;
// }

// console.log(èPrimo(7)); 
// console.log(èPrimo(10));

// // Traccia: Scrivi una funzione che stampa la tabellina di un numero fino a 10.
// function stampaTabellina(numero) {
//     for (let i = 1; i <= 10; i++) {
//         console.log(`${numero} x ${i} = ${numero * i}`);
//     }
// }

// stampaTabellina(5);


// // Traccia: Scrivi una funzione che controlla se un valore è presente in un array.
// function contieneValore(array, valore) {
//     return array.includes(valore);
// }

// console.log(contieneValore([1, 2, 3, 4], 3)); 
// console.log(contieneValore(["a", "b", "c"], "d")); 

// //
// let astuccio = {

//     matita: 2,
//     gommaPerCancellare: 1,
//     temperino: 1,
//     colore: "nero",
//     penna: 2,
//     lista: function() {

//         console.log(this.matita + " matita/e " + this.gommaPerCancellare + " gomma/e per cancellare " 
//             + this.temperino + ",colore astuccio: " + this.colore + " penna/e " + this.penna);
//     }

// }

// astuccio.evidenziatore = "giallo";

// console.log(astuccio.evidenziatore);
// astuccio.lista();

// console.log("");

// console.log(astuccio);

// Esempio Eccezione
// function dividi(a, b){
//     try{
//         if(b === 0){
//             console.log("Divisione per 0 non consentita");
//         }
//         return a / b;
//     } catch(error) {
//         return "Errore " + error;
//     }
// }

// console.log(dividi(2,0));

// const arr = [10, 20, 30, 40, 50];

// try{
//     let valore = arr[5].toString();
//     console.log(valore);
// }catch(errore){
//     console.log("Errore: " + errore.message);
// }

//****************nullpointer exception********************

// //let stringa = "prova";
// let stringa = null;
// //let stringa = undefined;

// try {
//     if (stringa == null && stringa == undefined) {
//         throw new Error("nullpointer exception");
//     }
//     console.log(stringa);
// } catch (error) {
//     console.log(error);
// } finally {
//     console.log("eccezione gestita");
// }












































package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {

		/*int[] array = new int[5];

		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;

		System.out.println(array[2]);
		System.out.println("-----------------");

		int[] arr = { 1, 2, 3, 4, 5 };

		for (int in : arr) {

			System.out.println(in);

		} 
		
		String[] nomi = new String[5];
		
		nomi[0] = "Nicola";
		nomi[1] = "Giulia";
		nomi[2] = "Katia";
		nomi[3] = "Gabriele";
		nomi[4] = "Simone";
		
		System.out.println(nomi[4]);
		
		for(int i = 0; i < nomi.length; i++) {
			System.out.println(nomi[i]);
		} 
		
		int[] age = {18, 21, 22, 24, 26};
		
		System.out.println(age[2]);
		
		for (int a : age) {
			System.out.println(a);
		}
		
		
		//Crea un array di interi e stampane ogni elemento.
		int[] numeri = {10, 15, 30};
		
		for (int n : numeri) {
			System.out.println(n);
		}
		
		//Calcola la somma di tutti gli elementi di un array.
		int[] numeri2= {10, 15, 30};
		int somma = 0;
		
		for (int n : numeri2) {
			somma += n;
		}
		
		System.out.println("La somma totale e': " + somma); 
		
		//Calcola la media aritmetica degli elementi di un array.
		int[] numeri= {10, 15, 30};
		
		int somma = 0;
		int media;
		
		for(int i = 0; i < numeri.length; i++) {
			somma += numeri[i];
		}
		
		media = somma / numeri.length;
		
		System.out.println("La media aritmetica e': " + media); 
		
		//Trova il valore massimo in un array di interi.
		
		int[] numeri= {10, 15, 30};
		int max = numeri[0];
		
		for(int i = 1; i < numeri.length; i++) {
			
			if(numeri[i] > max) {
				max = numeri[i];			
			}
			
		}
		
		System.out.println("Il max e': " + max); 
		
		//Trova il valore minimo in un array di interi.
		
		int[] numeri= {10, 15, 30};
		int min = numeri[0];
		
		for(int i = 1; i < numeri.length; i++) {
			if(numeri[i] < min) {
				min = numeri[i];
				
			}
		}
		
		System.out.println("Il min e': " + min);
		
		//Conta il numero di elementi pari in un array.
		
		int[] numeri= {10, 15, 30};
		int count = 0;
		
		for(int i = 0; i < numeri.length; i++) {
			if(numeri[i] % 2 == 0) {
				count++;
			}
		}
		
		System.out.println("Gli elementi pari all'interno dell'array sono: " + count);
		
		//Stampa gli elementi dell’array in ordine inverso.
		
		int[] numeri= {10, 15, 30};
		
		for(int i = numeri.length - 1; i >= 0; i--) {
			System.out.println("Array invertito" + numeri[i]);
		}
		
		//Controlla se un numero dato (es. 10) è presente nell’array.
		
		int[] numeri= {10, 15, 30};
		
		for(int i = 0; i < numeri.length; i++) {
			if(numeri[i] == 10) {
				System.out.println("Il numero 10 e' presente nell'array");
			}
		}
		
		//Conta quanti elementi nell’array sono maggiori di 10.
		
		int[] numeri = {10, 15, 30};
		
		int count = 0;
		
		for(int i = 0; i < numeri.length; i++) {
			if(numeri[i]>10) {
				count++;
			}
		}
		
		System.out.println("Nell'array sono maggiori di 10, " + count + " elementi");
		
		//Copia tutti gli elementi di un array in un secondo array e stampalo.
		
		int[] numeri = {10, 15, 30};
		
		int[] numeri2 = new int[numeri.length];
		
		for(int i = 0; i < numeri.length; i++) {
			numeri2[i] = numeri[i];
			System.out.println("Elementi del secondo array: " + numeri2[i]);
		} 
		
		//Dato un array, calcola la differenza tra il valore massimo e minimo.
		
        int[] array = {5, 8, 1, 13, 2, 21};

        int max = array[0];
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }

        int differenza = max - min;

        System.out.println("Valore massimo: " + max);
        System.out.println("Valore minimo: " + min);
        System.out.println("Differenza: " + differenza);

		//Scrivi un programma che trova la posizione del numero 9 nell’array.
		int[] array = {5, 8, 1, 9, 2, 21};

        boolean trovato = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 9) {
                System.out.println("Il numero 9 si trova alla posizione: " + i);
                trovato = true;
            }
        }

        if (!trovato) {
            System.out.println("Il numero 9 non è presente nell'array.");
        }
		
		//Stampa solo gli elementi dispari presenti in un array.
		int[] array = {5, 8, 1, 9, 2, 21};

        System.out.println("Elementi dispari nell'array:");

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i]);
            }
        }
		
		//Controlla se gli elementi dell’array sono ordinati in ordine 
		//crescente
		
		int[] array = {5, 8, 1, 9, 2, 21};

        boolean ordinato = true;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                ordinato = false;
                break;
            }
        }

        if (ordinato) {
            System.out.println("L'array è ordinato in ordine crescente.");
        } else {
            System.out.println("L'array non è ordinato in ordine crescente.");
        } 
		
		//Calcola la somma dei numeri pari e quella dei numeri dispari separatamente.

		int[] array = {5, 8, 1, 9, 2, 21};
		
		int somma = 0;
		int somma1 = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] % 2 == 0) {
				somma += array[i];
			} else {
				somma1 += array[i];
			}
		}
		
		System.out.println("La somma dei numeri pari e': " + somma);
		System.out.println("La somma dei numeri dispari e': " + somma1); */
		
		//Dato un array, crea un nuovo array con solo i numeri positivi.
		/*int[] originali = {-2, 4, -1, 3, 0, 7};
		int[] positivi = new int[originali.length];
		
		int countPosizione = 0;
		int posizione = 0;
		
		for(int i = 0; i < originali.length; i++) {
			if(originali[i] > 0) {
				countPosizione++;
			}
		}
		
		for(int i = 0; i < originali.length; i++) {
			if(originali[i] > 0) {
				positivi[posizione++] = originali[i];
			}
		}
		
		for (int pos : positivi) {
			System.out.println("Array con numero positivo" + pos);
		}*
		
		/*int[] originali = {-2, 4, -1, 3, 0, 7};

        // Filtra solo i numeri > 0 e crea un nuovo array
        int[] positivi = Arrays.stream(originali)
                               .filter(n -> n > 0)
                               .toArray();

        // Stampa il nuovo array
        System.out.print("Numeri positivi: ");
        for (int n : positivi) {
            System.out.print(n + " ");
        }
		
		// Conta quante volte compare il numero 3 in un array.
		int[] numeri = {1, 3, 5, 3, 7, 3, 9, 3, 3};

        int contatore = 0;

        for (int i = 0; i < numeri.length; i++) {
            if (numeri[i] == 3) {
                contatore++;
            }
        }

        System.out.println("Il numero 3 compare " + contatore + " volte nell'array.");
		
		
		//Scambia tra loro il primo e l’ultimo elemento di un array.
		
		int[] array = {10, 20, 30, 40, 50};

        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
		
		//Conta quanti elementi dell’array sono maggiori della media.
		int[] array = {5, 8, 12, 3, 9, 7};

        int somma = 0;
        for (int i = 0; i < array.length; i++) {
            somma += array[i];
        }

        double media = (double) somma / array.length;
        
        int contatore = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > media) {
                contatore++;
            }
        }

        System.out.println("Media: " + media);
        System.out.println("Numero di elementi maggiori della media: " + contatore);
        
		
		//Dato un array, stampa i numeri duplicati presenti.
		
		int[] array = {3, 5, 7, 3, 2, 5, 9, 7, 7};

        System.out.println("Numeri duplicati presenti nell'array:");

        boolean[] giaStampato = new boolean[array.length];

        for (int i = 0; i < array.length; i++) {
            if (giaStampato[i]) {
                continue;
            }

            boolean duplicato = false;

            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    duplicato = true;
                    giaStampato[j] = true; 
                }
            }

            if (duplicato) {
                System.out.println(array[i]);
                giaStampato[i] = true;
            }
        }
		
        //Crea un nuovo array con solo valori univoci.
		 int[] array = {3, 5, 3, 2, 5, 9, 7, 7, 2};

	        int[] unici = new int[array.length];
	        int count = 0; 


	        for (int i = 0; i < array.length; i++) {
	            boolean trovato = false;


	            for (int j = 0; j < count; j++) {
	                if (array[i] == unici[j]) {
	                    trovato = true;
	                    break;
	                }
	            }

	            if (!trovato) {
	                unici[count] = array[i];
	                count++;
	            }
	        }

	        System.out.println("Array con solo valori univoci:");
	        for (int i = 0; i < count; i++) {
	            System.out.print(unici[i] + " ");
	        } 
		
		//Sposta tutti gli zeri di un array alla fine, mantenendo l’ordine degli altri numeri.

		//Esempio: {0, 5, 0, 3, 0, 1} → {5, 3, 1, 0, 0, 0}
		
		int[] array = {0, 5, 0, 3, 0, 1};

        int[] risultato = new int[array.length];

        int indice = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                risultato[indice] = array[i];
                indice++;
            }
        }

        System.out.println("Array con zeri spostati alla fine:");
        for (int i = 0; i < risultato.length; i++) {
            System.out.print(risultato[i] + " ");
        }
		
		//Conta quante volte due elementi consecutivi sono uguali.
		
		int[] array = {2, 2, 3, 3, 3, 1, 5, 5, 6};

        int contatore = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                contatore++;
            }
        }

        System.out.println("Numero di coppie consecutive uguali: " + contatore);
		
		//Inserisci 5 numeri interi e stampali con Scanner
		Scanner scanner = new Scanner (System.in);
        int[] numeri = new int[5];

        System.out.println("Inserisci 5 numeri interi:");
        for (int i = 0; i < numeri.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeri[i] = scanner.nextInt();
        }

        System.out.println("Hai inserito i seguenti numeri:");
        for (int i = 0; i < numeri.length; i++) {
            System.out.print(numeri[i] + " ");
        }

        scanner.close();
		
		//Calcola la somma degli elementi
		Scanner scanner = new Scanner(System.in);
		int[] numeri = new int[5];
		int somma = 0;
		
		System.out.println("Inserisci 5 numeri interi:");
        for (int i = 0; i < numeri.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeri[i] = scanner.nextInt();
            somma += numeri[i];
        }
        
        System.out.println("La somma totale dei 5 numeri interi inseriti e': " + somma);
        
		//Dato un array trova il massimo valore
		Scanner scanner = new Scanner(System.in);
		int[] numeri = new int[5];
		int max = 0;
		
		System.out.println("Inserisci 5 numeri interi:");
        for (int i = 0; i < numeri.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeri[i] = scanner.nextInt();
            if(numeri[i] > max) {
            	max = numeri[i];
            }
            
        }
        System.out.println("Il valore max dei 5 numeri interi inseriti e': " + max); 
		
		//Trova il minimo valore
		
		Scanner scanner = new Scanner(System.in);
		int[] numeri = new int[5];
		
		
		System.out.println("Inserisci 5 numeri interi:");
        for (int i = 0; i < numeri.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeri[i] = scanner.nextInt();
            
        }
        
        int minimo = numeri[0];
        for (int i = 1; i < numeri.length; i++) {
            if (numeri[i] < minimo) {
                minimo = numeri[i];
            }
        }
        System.out.println("Il valore max dei 5 numeri interi inseriti e': " + minimo); 
		
		//Stampa l’array al contrario
		Scanner scanner = new Scanner(System.in);
		int[] numeri = new int[5];
		
		
		System.out.println("Inserisci 5 numeri interi:");
        for (int i = 0; i < numeri.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeri[i] = scanner.nextInt();
            
        }
		
		for (int i = numeri.length - 1; i >= 0; i--) {
            System.out.print(numeri[i] + " ");
        }
		
		//Calcola la media
		Scanner scanner = new Scanner(System.in);
		int[] numeri = new int[5];
		
		int somma = 0;
		double media;
		
		System.out.println("Inserisci 5 numeri interi: ");
		for(int i = 0; i < numeri.length; i++) {
			System.out.println("Numero " + (i + 1) + ": ");
			numeri[i] = scanner.nextInt();
			somma += numeri[i];
		}
		
		media = somma / numeri.length;
		
		System.out.println("La media dei 5 numeri da te inseriti e': " + media);

		//Copia l’array in un nuovo array
		
		Scanner scanner = new Scanner(System.in);
		int[] numeri = new int[5];
		
		//int[] numeri2 = new int[numeri.length];
		
		System.out.println("Inserisci 5 numeri interi: ");
		for(int i = 0; i < numeri.length; i++) {
			System.out.println("Numero " + (i + 1) + ": ");
			numeri[i] = scanner.nextInt();
		}
		
		int[] numeri2 = new int[numeri.length];
		
		for(int i = 0; i < numeri.length; i++) {
			numeri2[i] = numeri[i];
		}
		
		System.out.println("Il secondo array contiene: ");
		for(int num2 : numeri2) {
			System.out.println(num2);
		}
		
		// 2 metodo
		Scanner scanner = new Scanner(System.in);
        int[] original = new int[5];

        for (int i = 0; i < original.length; i++) {
            System.out.print("Inserisci un numero: ");
            original[i] = scanner.nextInt();
        }

        int[] copia = new int[5];
        for (int i = 0; i < original.length; i++) {
            copia[i] = original[i];
        }

        System.out.println("Array copiato:");
        for (int num : copia) {
            System.out.println(num);
        }
        
        //Conta quanti numeri pari
		Scanner scanner = new Scanner(System.in);
		int[] numeri = new int[5];
		
		int count = 0;
		
		System.out.println("Inserisci 5 numeri interi: ");
		for(int i = 0; i < numeri.length; i++) {
			System.out.println("Numero " + (i + 1) + ": ");
			numeri[i] = scanner.nextInt();
			if(numeri[i] % 2 == 0) {
				count++;
			}
		}
		
		System.out.println("All'interno dell'array dei tuoi 5 valori inseriti, troviamo " + count + " numeri pari");
		
		//Cerca un numero
		
		 int[] numeri = {5, 8, 12, 3, 9, 1, 7}; 
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Inserisci un numero da cercare: ");
	        int numeroDaCercare = scanner.nextInt();

	        boolean trovato = false;

	        for (int i = 0; i < numeri.length; i++) {
	            if (numeri[i] == numeroDaCercare) {
	                System.out.println("Numero trovato all'indice: " + i);
	                trovato = true;
	                break;
	            }
	        }

	        if (!trovato) {
	            System.out.println("Numero non trovato nell'array.");
	        }
		
			//Scambia primo e ultimo elemento
			
			int[] numeri = {5, 8, 12, 3, 9, 1, 7};
	
	        System.out.println("Array originale: " + Arrays.toString(numeri));
	
	        int temp = numeri[0];
	        numeri[0] = numeri[numeri.length - 1];
	        numeri[numeri.length - 1] = temp;
	
	        System.out.println("Array dopo lo scambio: " + Arrays.toString(numeri));
			
		
			//Conta le occorrenze di un numero
			int[] numeri = {5, 8, 12, 3, 8, 1, 8, 3}; 
	        Scanner scanner = new Scanner(System.in);
	
	        System.out.print("Inserisci un numero da contare: ");
	        int numeroDaContare = scanner.nextInt();
	
	        int contatore = 0;
	
	        for (int i = 0; i < numeri.length; i++) {
	            if (numeri[i] == numeroDaContare) {
	                contatore++;
	            }
	        }
	
	        System.out.println("Il numero " + numeroDaContare + " appare " + contatore + " volte nell'array."); */
		
			//

		
		
	}
}

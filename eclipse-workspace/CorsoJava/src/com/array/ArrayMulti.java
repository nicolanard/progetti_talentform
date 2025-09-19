package com.array;

import java.util.Scanner;

public class ArrayMulti {

	public static void main(String[] args) {
		
       /* int[][] matrice = {
                {1, 2, 3},
                {4, 5, 6}
            };

            for (int i = 0; i < matrice.length; i++) {
                for (int j = 0; j < matrice[i].length; j++) {
                    System.out.print(matrice[i][j] + " ");
                }
                System.out.println();
            }

            // Crea una matrice 2x3 e stampa tutti i suoi elementi.
            
            int[][] matrice = {
                    {5, 8, 3},
                    {8, 2, 8},
                    {4, 6, 1}
                };

                int contatore = 0;

                for (int i = 0; i < matrice.length; i++) {
                    for (int j = 0; j < matrice[i].length; j++) {
                            contatore++;
                        }
                    }
                

                System.out.println(contatore);

                // Somma tutti gli elementi di una matrice 3x3.
				int [] [] matrice = {
						{1, 2, 3},
						{4, 5, 6},
						{7, 8, 9}
				};
				
				int somma = 0;
				
				for (int i = 0; i < matrice.length; i++){
					for (int j = 0; j < matrice[i].length; j++) {
						somma += matrice[i][j] ;
					}
				}
				
				System.out.println("La somma di tutti i valori della matrice e': " + somma); 
		
				//Trova il valore massimo in una matrice 3x2.
		
		        int[][] matrice = {
		            {5, 12},
		            {3, 9},
		            {7, 4}
		        };

		        int massimo = matrice[0][0];

		        for (int i = 0; i < matrice.length; i++) {
		            for (int j = 0; j < matrice[i].length; j++) {
		                if (matrice[i][j] > massimo) {
		                    massimo = matrice[i][j];
		                }
		            }
		        }

		        // Stampa il valore massimo
		        System.out.println("Il valore massimo nella matrice è: " + massimo);
			
				// Stampa la terza colonna di una matrice 3x3.
				int[][] matrice = {
			            {1, 2, 3},
			            {4, 5, 6},
			            {7, 8, 9}
			        };
		
			        System.out.println("Terza colonna della matrice:");
		
			        for (int i = 0; i < matrice.length; i++) {
			            System.out.println(matrice[i][2]);
			        } 
		
				//Calcola la somma di ogni riga in una matrice 3x3.
				int[][] matrice = {
			            {2, 4, 6},
			            {1, 3, 5},
			            {7, 8, 9}
			        };
		
			        // Ciclo per sommare ogni riga
			        for (int i = 0; i < matrice.length; i++) {
			            int somma = 0;
			            for (int j = 0; j < matrice[i].length; j++) {
			                somma += matrice[i][j];
			            }
			            System.out.println("Somma della riga " + (i + 1) + ": " + somma);
			        }
			        
			        //Calcola la somma di ogni colonna in una matrice 3x3.
					int[][] matrice = {
				            {2, 4, 6},
				            {1, 3, 5},
				            {7, 8, 9}
				        };
			
				        int colonne = matrice[0].length;
			
				        for (int j = 0; j < colonne; j++) {
				            int somma = 0;
			
				            for (int i = 0; i < matrice.length; i++) {
				                somma += matrice[i][j];
				            }
			
				            System.out.println("Somma della colonna " + (j + 1) + ": " + somma);
				        }
		
				//Chiedi all'utente di inserire i valori di una matrice 2x2 e stampala.
				Scanner scanner = new Scanner(System.in);
				
				int [][] matrice = new int [2][2];
				
				for(int i = 0; i < 2; i++) {
					for(int j = 0; j < 2; j++) {
						System.out.println("Inserisci elemento [" + i + "] [" + j + "]: ");
						matrice[i][j] = scanner.nextInt();
					}
				}
				
				System.out.println("Matrice inserita:");
				for(int i = 0; i < 2; i++) {
					for(int j = 0; j < 2; j++) {
						System.out.println(matrice[i][j] + " ");
					}
					System.out.println();
				}
				
				//Somma di tutti gli elementi di una matrice 3x3
				Scanner scanner = new Scanner(System.in);
				
				int [][] matrice = new int [3][3];
				
				int somma = 0;
				
				for(int i = 0; i < 3; i++) {
					for(int j = 0; j < 3; j++) {
						System.out.println("Inserisci elemento [" + i + "] [" + j + "]: ");
						matrice[i][j] = scanner.nextInt();
						somma += matrice[i][j];
					}
				}
				
				System.out.println("La somma di tutti i valori della matrice e': " + somma);
		
				//Somma degli elementi di ogni riga
				Scanner scanner = new Scanner(System.in);
				
				int [][] matrice = new int [3][3];
				
				int somma = 0;
				
				for(int i = 0; i < 3; i++) {
					for(int j = 0; j < 3; j++) {
						System.out.println("Inserisci elemento [" + i + "] [" + j + "]: ");
						matrice[i][j] = scanner.nextInt();

					}
				}
				
				for (int i = 0; i < 3; i++) {
		            int sommaRiga = 0;
		            for (int j = 0; j < 3; j++) {
		                sommaRiga += matrice[i][j];
		            }
		            System.out.println("Somma della riga " + i + ": " + sommaRiga);
		        } 
				
				//Somma di una colonna scelta
				Scanner scanner = new Scanner(System.in);
				
				int [][] matrice = new int [3][3];
				
				for(int i = 0; i < 3; i++) {
					for(int j = 0; j < 3; j++) {
						System.out.println("Inserisci elemento [" + i + "] [" + j + "] : ");
						matrice[i][j] = scanner.nextInt();
					}
				}
				
				int somma = 0;
				for(int i = 0; i < 3; i++) {
					somma += matrice[i][2];
				}
				
				System.out.println("La somma della colonna scelta e: " + somma); 
		
				//Ricerca di un numero nella matrice 2x2
		        Scanner scanner = new Scanner(System.in);
		        int[][] matrice = new int[2][2];

		        for (int i = 0; i < 2; i++) {
		            for (int j = 0; j < 2; j++) {
		                System.out.print("Inserisci elemento [" + i + "][" + j + "]: ");
		                matrice[i][j] = scanner.nextInt();
		            }
		        }

		        System.out.print("Inserisci il numero da cercare: ");
		        int numeroDaCercare = scanner.nextInt();

		        boolean trovato = false;
		        for (int i = 0; i < 2; i++) {
		            for (int j = 0; j < 2; j++) {
		                if (matrice[i][j] == numeroDaCercare) {
		                    System.out.println("Numero trovato nella posizione [" + i + "][" + j + "]");
		                    trovato = true;
		                }
		            }
		        }

		        if (!trovato) {
		            System.out.println("Numero non presente nella matrice.");
		        }
		
				//Conta i numeri pari e i numeri dispari
				  Scanner scanner = new Scanner(System.in);
			        int[][] matrice = new int[3][3];
			        int pari = 0;
			        int dispari = 0;
		
			        for (int i = 0; i < 3; i++) {
			            for (int j = 0; j < 3; j++) {
			                System.out.print("Inserisci elemento [" + i + "][" + j + "]: ");
			                matrice[i][j] = scanner.nextInt();
		
			                // Controllo pari o dispari
			                if (matrice[i][j] % 2 == 0) {
			                    pari++;
			                } else {
			                    dispari++;
			                }
			            }
			        }
		
			        System.out.println("Numeri pari: " + pari);
			        System.out.println("Numeri dispari: " + dispari);*/
		
				//Conta numeri > 10
				Scanner scanner = new Scanner(System.in);
		        int[][] matrice = new int[3][3];
		        int count = 0;
		
		        for (int i = 0; i < 3; i++) {
		            for (int j = 0; j < 3; j++) {
		                System.out.print("Inserisci elemento [" + i + "][" + j + "]: ");
		                matrice[i][j] = scanner.nextInt();
		
		                if (matrice[i][j] > 10) {
		                    count++;
		                } 
		            }
		        }
		
		        System.out.println("I numeri maggiori di 10 sono : " + count);

		
				
					
	}
}


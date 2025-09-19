package com.local.classes;

import java.util.Scanner;

public class TrovaMassimo {
	public void trovaMassimo(int a, int b) {
		class Confronto {
			int massimo() {
				if (a > b) {
					return a;
				} else {
					return b;
				}
			}
		}
		
		Confronto c = new Confronto();
		System.out.println("Il numero massimo e': " + c.massimo());
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserisci il primo numero: " );
		int a = scanner.nextInt();
		
		System.out.println("Inserisci il secondo numero: ");
		int b = scanner.nextInt();
		
		TrovaMassimo tm = new TrovaMassimo();
		tm.trovaMassimo(a, b);
	}
	

}

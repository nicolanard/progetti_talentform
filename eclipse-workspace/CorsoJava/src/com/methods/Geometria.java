package com.methods;

public class Geometria {
	
	public int geometria(int lato1, int lato2) {
		return lato1 * lato2;
	}
	
	public double geometria(double lato3, double lato4) {
		return lato3 + lato4;
	}

	public static void main(String[] args) {
		Geometria geometria = new Geometria();
		
		int lato1 = 5;
		int lato2 = 10;
		double lato3 = 15;
		double lato4 = 2;
		
		System.out.println(geometria.geometria(lato1, lato2));
		System.out.println(geometria.geometria(lato3, lato4));
	}

}

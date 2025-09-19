package com.controlflow;

public class ExampleIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		
		if(a != b) {
			System.out.println(true);
			
		} else {
			System.out.println(false);
		}
		
		if(a == b && c == d) {
			System.out.println(true);
			
		} else {
			System.out.println(false);
		}
		
		if(a == b || c != d) {
			System.out.println(false);
			
		} else {
			System.out.println(true);
		}

	}

}

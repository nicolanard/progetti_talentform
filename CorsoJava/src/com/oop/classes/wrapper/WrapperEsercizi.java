package com.oop.classes.wrapper;

public class WrapperEsercizi {
	
	public static void main(String[] args) {
		
		
	/*	//Dichiara una variabile int e assegnala a un oggetto Integer usando l'autoboxing.
		
		int num = 15;
		
		Integer numA = num;
		
		System.out.println(numA);
		
		//Dichiara un oggetto Double e assegna il suo valore a una variabile double primitiva.
		
		Double numeroObj = 12.5;
		
		double numero = numeroObj;
		
		System.out.println(numeroObj);
		
		//Converti la stringa "123" in un int usando il metodo statico di Integer.
		
		String numero = "123";
		
		int numero2 = Integer.parseInt(numero);
		
		System.out.println(numero2);  
		
		//Converti la stringa "45" in un oggetto Integer.
		
		String a = "45";
		
		Integer b = Integer.valueOf(a);
		
		System.out.println(b); 
		
		//Crea due oggetti Integer con valore 1000 e verifica se sono uguali usando == e .equals().
		
		Integer a = Integer.valueOf(1000);
		Integer b = Integer.valueOf(1000);
		
		System.out.println(a.equals(b)); 
		
		//Converte la stringa "true" in un valore boolean
		
		String a = "true";
		
		boolean b = Boolean.parseBoolean(a);
		
		System.out.println(b);
		
		//Converti la stringa "127" in un oggetto Byte.
		
		String a = "127";
		
		byte b = Byte.parseByte(a); //
		
		System.out.println(b); 
		
		//– Character.isDigit()
		//	Verifica se il carattere '9' è una cifra numerica.
		
		char a = '9';
		
		boolean b = Character.isDigit(a);
		
		System.out.println(b);
		
		//Converti la stringa "3.14" in un valore float.

		//String a = "3.14";
		
		//float b = Float.parseFloat(a);
		
		//System.out.println(b); 
		
		//Confronta due valori Double usando Double.compare.
		
		Double a = Double.valueOf(15);
		Double b = Double.valueOf(19);
		
		double c = Double.compare(a, b);
		
		System.out.println(c);
		
		//Converte la stringa "12345" in un oggetto Short.
		String a = "12345";
		
		Short b = Short.valueOf(a);
		
		System.out.println(b);
		
		//Converti un oggetto Integer in una stringa tramite concatenazione.
		
		Integer a = 10;
		
		String b = a + "";
		
		System.out.println(b); */
		
		//Crea un array di oggetti Integer con i valori da 1 a 5 e itera con un foreach
		Integer[] numeri = {1, 2, 3, 4, 5};

        for (Integer numero : numeri) {
            System.out.println("Numero: " + numero);
        }
		
	}


}

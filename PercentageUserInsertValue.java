package it.apuliadigitalmaker.esercitazioni;
import java.util.Scanner;

public class PercentageUserInsertValue {
	public static void main (String[] args) {
		
Scanner tastiera = new Scanner(System.in);
		
		
		System.out.println("Inserisci una Somma Iniziale");
		double sommaIniziale = tastiera.nextDouble();
		
		
		System.out.println("Inserisci un tasso d'interesse");
		double interesse = tastiera.nextDouble();
		
		
		System.out.println("Inserisci una quantità di anni");
		int anno = tastiera.nextInt();
		
		
		double percentuale;
		
		
		for(int i=0; i<anno; i++) { 
			percentuale = ((sommaIniziale*3)/100 );
			System.out.println("Gli interessi dopo "+ (i+1)+ " anno " + (sommaIniziale + percentuale ));
			sommaIniziale= sommaIniziale + percentuale ;
	}

}
	
}
package main.project;

import exercice1.Exercice1;
import exercice2.SelectionSort;
import exercice3.Hippopotamus;
import exercice4.Exercice4;
import exercice4.ValueOfPi;

public class Mian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// exercice1

		System.out.println("********* Affichage **********");

		String[] chaineCaractor = { "miriam ", "AKISSI ", "GNAMIEN" };
		Integer[] caractorNumber = { 1, 10, 20, 8, 45, };
		Exercice1.printArray(chaineCaractor);
		Exercice1.printArray(caractorNumber);

		System.out.println("********* selection par trie**********");

// exercice2
// donner des valeur dans le tableau
		Integer[] donneeInt = { 15, 7, 5, 8, 42, 96, 42, 36, 1 };

// efficher
		SelectionSort.selectionParTrie(donneeInt);

// EXERCICE3
		System.out.println("********* build word **********");

		String mot = "Hippopotamus ";
		Hippopotamus.reverse(mot);
		
		System.out.println("********* FIND PI **********");

		 ValueOfPi pi = () -> Math.PI;
	        System.out.println("La valeur de PI trouver est = " + pi.trouverPi());
	}

}

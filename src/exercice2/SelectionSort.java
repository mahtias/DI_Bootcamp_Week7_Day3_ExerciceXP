/**
 * @author N'ZO LAGOU
 * 
 *  Exercice 2 : Tri Par Sélection

Écrivez une méthode générique pour implémenter la
 selection Sort méthode en Java.

Écrivez également un programme de test qui devrait prendre, 
sort et donner la sortie d'un integer tableau.
 */

package exercice2;

import java.util.Arrays;

public class SelectionSort {

	public static <E> void selectionParTrie( E[] array) {
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
	}
}

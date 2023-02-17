/**
 * /**
 * @author N'ZO LAGOU
 * 
 * 
  Imprimer Tous Les Éléments


Vous avez un integeret un stringtableau.

Écrivez une seule méthode printArrayqui peut imprimer tous les éléments
 des deux tableaux.
 */

package exercice1;

public class Exercice1 {
	public static <E> void printArray (E[] array) {
		
		// parcourir le tableau
		
		for (E element : array) {
			System.out.println(element);
		}
			
	}

}

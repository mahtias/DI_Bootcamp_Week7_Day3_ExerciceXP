/**
 * @author N'ZO LAGOU
 * 
 *  Exercise 3 : “HIPPOPOTAMUS”
Write a Java program to write the word “HIPPOPOTAMUS” backward.
 */


package exercice3;

public class Hippopotamus {
	public static void reverse(String mot) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(mot);
        System.out.println(stringBuilder.reverse());
	}
}

/*
 * This is a solution to the codewars problem:
 * https://www.codewars.com/kata/520b9d2ad5c005041100000f/train/java
 * Solved using TDD processes. Consult Readme for full details.
 * 
 * @author  Jamie Wong
 * @version 13.0.0
 * @since	12/04/2020
 */

package codewarsSimplePigLatin;

public class PigLatin {
	
	static String pigIt(String input) {
		String[] inputArray = new String[input.split(" ").length];
		int counter = 0;
		for(String word : input.split(" ")) {
			if(word.substring(0,1).matches("[a-z]|[A-Z]")) {
				if(word.length() == 1) {
					inputArray[counter] = word + "ay";
				} else {
					inputArray[counter] = word.substring(1) + word.charAt(0) + "ay";
				}
			} else {
				inputArray[counter] = word;
			}
			counter++;
		}
		return String.join(" ", inputArray);
	}
	
}

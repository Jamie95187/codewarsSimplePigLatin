package codewarsSimplePigLatin;

public class PigLatin {
	
	static String pigIt(String input) {
		if(input.length() == 1) {
			return input + "ay";
		}
		return input.substring(1) + "ay" + input.charAt(0);
	}
	
}

package Ch1;

public class Problem_03 {
/*
	public static Object replaceSpacesWithSpecialCharacter(String string, int i) {
		Character[]arr = new Character[i];
		char [] letters = string.toCharArray();
		for (int j = 0; j < i; j++) {
			arr[j] = letters[j];
		}
		String finalString = "";
		for(Character c: arr) {
			if(c.toString() == " ") {
				finalString+="%20";
			}
			else {
				finalString+=c;
			}
				
		}
		return finalString;
	}
*/
public static Object replaceSpacesWithSpecialCharacter(String input, int trueLength) {
	if (input == null || input == "") {
		return null;
	}
	input = input.substring(0, trueLength);
	String replacement = "%20";
	StringBuilder builder = new StringBuilder();
	char[] charArray = input.toCharArray();
	for (char c : charArray) {
		if (c != ' ') {
			builder.append(c);
		} else {
			builder.append(replacement);
		}
	}
	return builder.toString();
}
}

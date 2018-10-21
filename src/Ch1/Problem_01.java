package Ch1;

import java.util.ArrayList;

public class Problem_01 {
	public static boolean hasUniqueAscii(String word) {
		if (word==("") || word==(null))
			return false;
		char[] arr = word.toCharArray();
		ArrayList<Character> characters = new ArrayList<Character>();
		for (char c : arr) {
			if (characters.contains(c)) {
				return false;
			} else {
				characters.add(c);
			}
		}
		return true;
	}

	public static boolean hasUniqueUnicode(String word) {
		if (word==("") || word==(null))
			return false;
		char[] arr = word.toCharArray();
		ArrayList<Character> characters = new ArrayList<Character>();
		for (char c : arr) {
			if (characters.contains(c)) {
				return false;
			} else {
				characters.add(c);
			}
		}
		return true;
	}
}

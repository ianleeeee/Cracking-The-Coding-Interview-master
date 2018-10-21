package Ch1;

import java.util.Arrays;

public class Problem_02 {

	public static boolean isValidPermutation_BruteForce(String str1, String str2) {
		if (str1.isEmpty() || str2.isEmpty() || str1.length() != str2.length()) {
			return false;
		}
		char[] str1Array = str1.toCharArray();
		char[] str2Array = str2.toCharArray();
		Arrays.sort(str1Array);
		Arrays.sort(str2Array);
		boolean x = new String(str1Array).equals(new String(str2Array));
		return x;
	}

	public static boolean isValidPermutation_Optimized(String str1, String str2) {
		if (str1.isEmpty() || str2.isEmpty() || str1.length() != str2.length()) {
			return false;
		}
		int[] characters = new int[256];
		for (int i = 0; i < str1.length(); i++) {
			characters[str1.charAt(i)]++;
		}
		for (int i = 0; i < str2.length(); i++) {
			characters[str2.charAt(i)]--;
			if (characters[str2.charAt(i)] < 0) {
				return false;
			}
		}
		return true;
	}

}

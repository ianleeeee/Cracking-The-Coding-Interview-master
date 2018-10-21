/**
 * Cracking-The-Coding-Interview
 * Problem_03_Test.java
 */
package com.deepak.ctci.Ch01_Arrays_And_Strings;

import org.junit.Assert;
import org.junit.Test;

import com.deepak.ctci.Ch01_Arrays_And_Strings.Problem_03;

/**
 * Test cases for Problem 03
 * 
 * @author Deepak
 */
public class Problem_03_Test {

	/**
	 * Test case to replace spaces with a special character
	 */
	@Test
	public void testReplaceSpacesWithSpecialCharacter() {
		Assert.assertEquals(Ch1.Problem_03.replaceSpacesWithSpecialCharacter("Mr John Smith ", 13), "Mr%20John%20Smith");
		Assert.assertEquals(Ch1.Problem_03.replaceSpacesWithSpecialCharacter("Mr John Smith ", 14), "Mr%20John%20Smith%20");
		Assert.assertEquals(Ch1.Problem_03.replaceSpacesWithSpecialCharacter("Mr John Smith ", 9), "Mr%20John%20S");
		Assert.assertEquals(Ch1.Problem_03.replaceSpacesWithSpecialCharacter("", 3), null);
		Assert.assertEquals(Ch1.Problem_03.replaceSpacesWithSpecialCharacter(null, 3), null);
	}

}

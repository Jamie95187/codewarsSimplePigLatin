/*
 * This is a solution to the codewars problem:
 * https://www.codewars.com/kata/520b9d2ad5c005041100000f/train/java
 * Solved using TDD processes. Consult Readme for full details.
 * 
 * @author  Jamie Wong
 * @version 13.0.0
 * @since	1/04/2020
 */

package codewarsSimplePigLatin;

import static org.junit.Assert.*;

import org.junit.Test;

public class PigLatinTest {

	@Test
	public void pigItTest_singleLetter_returnCorrectString() {
		assertEquals("Aay", PigLatin.pigIt("A"));
		assertEquals("bay", PigLatin.pigIt("b"));
	}

	@Test
	public void pigItTest_doubleLetterSingleWord_returnCorrectString() {
		assertEquals("oyay", PigLatin.pigIt("yo"));
		assertEquals("oGay", PigLatin.pigIt("Go"));
	}
	
	@Test
	public void pigItTest_twoWords_returnCorrectString() {
		assertEquals("elloHay orldWay", PigLatin.pigIt("Hello World"));
	}
}

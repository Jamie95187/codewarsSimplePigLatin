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
		assertEquals("oayy", PigLatin.pigIt("yo"));
		assertEquals("oayG", PigLatin.pigIt("Go"));
	}
}

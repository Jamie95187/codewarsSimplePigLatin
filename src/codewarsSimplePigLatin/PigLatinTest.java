package codewarsSimplePigLatin;

import static org.junit.Assert.*;

import org.junit.Test;

public class PigLatinTest {

	@Test
	public void pigItTest_singleLetter_returnCorrectString() {
		assertEquals("ayA", PigLatin.pigIt("A"));
		assertEquals("ayb", PigLatin.pigIt("b"));
	}

}

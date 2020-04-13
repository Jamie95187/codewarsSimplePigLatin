# Simple Pig Latin (5 KYU)

Solve [this](https://www.codewars.com/kata/520b9d2ad5c005041100000f/train/java) codewars challenge.

## Description

Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.

## Examples

```
pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
pigIt('Hello world !');     // elloHay orldway !
```
## Tests

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
	assertEquals("elloHay riendsFay", PigLatin.pigIt("Hello Friends"));
}

@Test
public void pigItTest_threeWords_returnCorrectString() {
	assertEquals("avaJay sIay oolCay", PigLatin.pigIt("Java Is Cool"));
}

@Test
public void pigItTest_threeWordsWithPunctuation_returnCorrectString() {
	assertEquals("avaJay sIay oolCay !", PigLatin.pigIt("Java Is Cool !"));
}

@Test
public void pigItTest_fourWordsAcceptanceCriteriaOne_returnCorrectString() {
	assertEquals("igPay atinlay siay oolcay", PigLatin.pigIt("Pig latin is cool"));
}

@Test
public void pigItTest_twoWordsWithPunctuationAcceptanceCriteriaTwo_returnCorrectString() {
	assertEquals("elloHay orldWay !", PigLatin.pigIt("Hello World !"));
}
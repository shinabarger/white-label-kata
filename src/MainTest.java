import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by davidshinabarger on 3/27/17.
 */

public class MainTest {

    @Test
    public void noTextandZeroColumnReturnNothing() throws Exception {
        String expected = "";
        String actual = Wrapper.wrap("", 0);
        assertEquals(expected, actual);

    }

    //test to see if wrapper will return a string it takes in
    @Test
    public void abLengthOneReturnsAPlusB() throws Exception {
        String expected = "a" + "\n" + "b";
        String actual = Wrapper.wrap("ab", 1);
        assertEquals(expected, actual);

    }

    //test to see if we can return the columnNumber if method is taking in column number
    @Test
    public void string1returns0InColumnNumberMethod() throws Exception {
        int expected = 0;
        int actual = Wrapper.getColumnNumber("string1", 0);
        assertEquals(expected, actual);

    }

    //get method to print out string that's three letters long using a for loop
    @Test
    public void splits3LetterWordWithOneColumnWidth() throws Exception {
        String expected = "a" + "\n" + "p" + "\n" + "p";
        String actual = Wrapper.wrap("app", 1);
        assertEquals(expected, actual);

    }

    //get column to print out string "a" if input is "a b" due to the column number being less than total length
    @Test
    public void returnsOneLetterOneColumnTest() throws Exception {
        String expected = "a";
        String actual = Wrapper.wrap("a", 1);
        assertEquals(expected, actual);

    }

    //get column to print out string "a" if input is "a b" due to the column number being less than total length
    @Test
    public void createsNoNewColumnWithColumnNumberGreaterThanStringLengthTest() throws Exception {
        String expected = "a b";
        String actual = Wrapper.wrap("a b", 3);
        assertEquals(expected, actual);

    }

    //get column to print out string "a" if input is "a b" due to the column number being less than total length
    @Test
    public void testifReturnsOnlyLimitedWords() throws Exception {
        String expected = "a" + "\n" + "b";
        String actual = Wrapper.wrap("a b", 2);
        assertEquals(expected, actual);

    }

    //test to see if it works when column length is greater than string
    @Test
    public void testReturnsLimitedWordsLength4() throws Exception {
        String expected = "a b";
        String actual = Wrapper.wrap("a b", 4);
        assertEquals(expected, actual);

    }


    @Test
    public void testWrappingSentenceWith41CharacterWidth() throws Exception {
        String expected = "The quick brown fox jumped over the lazy" + "\n" + "dog";
        String actual = Wrapper.wrap("The quick brown fox jumped over the lazy dog", 41);
        assertEquals(expected, actual);

    }


    //TODO make this work -- add spaces exception so it looks for previous space
    @Test
    public void test9goesToPreviousSpace() throws Exception {
        String expected = "The quick brown fox jumped over the lazy" + "\n" + "dog";
        String actual = Wrapper.wrap("The quick brown fox jumped over the lazy dog", 42);
        assertEquals(expected, actual);

    }


    @Test
    public void test10doesItSplitCorrectly() throws Exception {
        String expected = "The quick" + "\n" +  "brown fox" + "\n" + "jumped ove" + "\n" + "r the lazy" + "\n" + "dog";
        String actual = Wrapper.wrap("The quick brown fox jumped over the lazy dog", 10);
        assertEquals(expected, actual);

    }

    @Test
    public void test11longerTextSplitCorrectly() throws Exception {
        String expected = "Hello,\nWorld prog\nram is a\ncomputer p\nrogram tha\nt outputs\nor display\ns Hello,Wo\nrld to the\nuser.";
        String actual = Wrapper.wrap("Hello, World program is a computer program that outputs or displays Hello,World to the user.", 10);
        assertEquals(expected, actual);

    }





}
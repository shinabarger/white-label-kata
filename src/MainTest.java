import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by davidshinabarger on 3/27/17.
 */

public class MainTest {

    @Test
    public void test0() throws Exception {
        String expected = "";
        String actual = Wrapper.wrap("", 0);
        assertEquals(expected, actual);

    }

    //test to see if wrapper will return a string it takes in
    @Test
    public void test1() throws Exception {
        String expected = "a" + "\n" + "b" + "\n";
        String actual = Wrapper.wrap("ab", 1);
        assertEquals(expected, actual);

    }

    //test to see if we can return the columnNumber if method is taking in column number
    @Test
    public void test2() throws Exception {
        int expected = 0;
        int actual = Wrapper.getColumnNumber("string1", 0);
        assertEquals(expected, actual);

    }

    //get method to print out string that's three letters long using a for loop
    @Test
    public void test3() throws Exception {
        String expected = "a" + "\n" + "p" + "\n" + "p" + "\n";
        String actual = Wrapper.wrap("app", 1);
        assertEquals(expected, actual);

    }

    //get column to print out string "a" if input is "a b" due to the column number being less than total length
    @Test
    public void test4() throws Exception {
        String expected = "a";
        String actual = Wrapper.wrap("a", 1);
        assertEquals(expected, actual);

    }

    //get column to print out string "a" if input is "a b" due to the column number being less than total length
    @Test
    public void test5() throws Exception {
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
    public void test7() throws Exception {
        String expected = "a b";
        String actual = Wrapper.wrap("a b", 4);
        assertEquals(expected, actual);

    }


    @Test
    public void test8() throws Exception {
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
    public void test9doesitsplit() throws Exception {
        String expected = "The quick" + "\n" +  "brown fox" + "\n" + "jumped" + "\n" + "over" + "\n" + "the lazy" + "\n" + "dog";
        String actual = Wrapper.wrap("The quick brown fox jumped over the lazy dog", 10);
        assertEquals(expected, actual);

    }




}
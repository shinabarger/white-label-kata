import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by davidshinabarger on 3/27/17.
 */

public class MainTest {

    //setup basic testing template
    @Test
    public void life_the_universe_and_everything() {
        int expected = 42;
        int actual = Wrapper.answer();
        assertEquals(expected, actual);
    }

    @Test
    public void test0() throws Exception {
        String expected = "";
        String actual = Wrapper.wrap("", 0);
        assertEquals(expected, actual);

    }

    //test to see if wrapper will return a string it takes in
    @Test
    public void test1() throws Exception {
        String expected = "string1";
        String actual = Wrapper.wrap("string1", 0);
        assertEquals(expected, actual);

    }

    //test to see if we can return the columnNumber if method is taking in column number
    @Test
    public void test2() throws Exception {
        int expected = 0;
        int actual = Wrapper.getColumnNumber("string1", 0);
        assertEquals(expected, actual);

    }

    //get method to print out string
    @Test
    public void test3() throws Exception {
        String expected = "apple";
        String actual = Wrapper.wrap("apple", 1);
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
        String expected = "a ";
        String actual = Wrapper.wrap("a b", 2);
        assertEquals(expected, actual);

    }

    //get column to print out string "a" if input is "a b" due to the column number being less than total length
    @Test
    public void test7() throws Exception {
        String expected = "a" + "\n" + "b";
        String actual = Wrapper.wrap("a b", 4);
        assertEquals(expected, actual);

    }


}
import org.apache.commons.lang3.text.WordUtils;

import java.util.ArrayList;

/**
 * You write a class called Wrapper, that has a single static function named wrap that takes two arguments, a string, and a column number.
 * The function returns the string, but with line breaks inserted at just the right places to make sure that no line is longer than the column number.
 * You try to break lines at word boundaries.
 * <p>
 * Like a word processor, break the line by replacing the last space in a line with a newline.
 * <p>
 * Note: You can create as many functions as you would like. But wrap should be the only public function.
 * ---
 * You can use any programming language you would like. Please create a github repository and send me a link.
 * <p>
 * http://codingdojo.org/cgi-bin/index.pl?KataWordWrap
 */

public class Wrapper {

    public static String wrap(String stringInput, int columnNumber) {

        //declare new arrayList for returning to test page
        ArrayList<String> arraylist = new ArrayList<>();

        //this uses WordUtils to automatically wrap all words based on the inputted column length
        //then it adds them to an arrayList, which is used to return at the end of the method
        arraylist.add(0, WordUtils.wrap(stringInput, columnNumber, "\n", true));

        //prints out same results that are added to the arraylist
        System.out.println(WordUtils.wrap(stringInput, columnNumber, "\n", true));

        //remove characters from arraylist to make them look normal again & assign to new string to return
        String stringofList = arraylist.toString().replace("[", "").replace(", ", "").replace("]", "");

        return stringofList;
    }

    //this method just tests to make sure a method can succesfully take in the columnnumber and return it if need be
    protected static int getColumnNumber(String stringInput, int columnNumber) {

        return columnNumber;
    }

}



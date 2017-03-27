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

    //setup basic testing using junit
    public static int answer() {

        return 42;
    }

    public static String wrap(String stringInput, int columnNumber) {

        //if stringInput is shorter than column number, print and return the entire thing
        if (stringInput.length() <= columnNumber) {
            System.out.println(stringInput);
            return stringInput;
        }

        // if stringInput is longer than column number, print all complete words up to the column number -- junit test4
        else return (stringInput.substring(0, columnNumber));
    }

    public static int getColumnNumber(String stringInput, int columnNumber) {

        return columnNumber;
    }
}

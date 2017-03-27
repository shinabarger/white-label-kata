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

        int length = stringInput.length();
        int endOfString = length;

        //if stringInput is shorter than column number, print and return the entire thing
        if (length <= columnNumber) {
            columnNumber = length;
            return stringInput;
        }

        // if stringInput is longer than column number, print all complete words up to the column number -- junit test4
        else if (columnNumber < length) {
            int beginningofSubString = 0;
            for (int i = columnNumber; i <= length; i += columnNumber) {
                arraylist.add(stringInput.substring(beginningofSubString, i) + "\n");
                System.out.print(stringInput.substring(beginningofSubString, i) + "\n");
                beginningofSubString = beginningofSubString + columnNumber;
                if(i > length) {
                    arraylist.add(stringInput.substring(columnNumber, length));
                }
            }



            String stringofList = arraylist.toString().replace("[", "").replace(", ", "").replace("]", "");
            return stringofList;
        }
        return stringInput;
    }

    public static int getColumnNumber(String stringInput, int columnNumber) {

        return columnNumber;
    }

    //setup basic testing using junit
    public static int answer() {

        return 42;
    }
}

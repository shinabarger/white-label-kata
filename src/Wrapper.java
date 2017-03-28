import java.util.ArrayList;

/**
 * You write a class called Wrapper, that has a single static function named wrap that takes two arguments, a string, and a column number.
 * The function returns the string, but with line breaks inserted at just the right places to make sure that no line is longer than the column number.
 * You try to break lines at word boundaries.
 *
 * Like a word processor, break the line by replacing the last space in a line with a newline.
 *
 * Note: You can create as many functions as you would like. But wrap should be the only public function.
 * ---
 * You can use any programming language you would like. Please create a github repository and send me a link.
 * 
 * http://codingdojo.org/cgi-bin/index.pl?KataWordWrap
 */

public class Wrapper {

    public static String wrap(String stringInput, int columnNumber) {

        //declare new arrayList for returning to test page
        ArrayList<String> arraylist = new ArrayList<>();

        int length = stringInput.length();

        //find last space in sentence


        if (columnNumber < length) {
            int beginningOfSubString = 0;

            //split up into multiple lines based on columnNumber length
            for (int i = columnNumber; i <= length; i += columnNumber) {

                int lastSpace = 0;
                if (stringInput.contains(" ") && length > columnNumber) {
                    lastSpace = (stringInput.substring(beginningOfSubString, i)).lastIndexOf(" ");
                    arraylist.add(stringInput.substring(beginningOfSubString, (beginningOfSubString + lastSpace)) + "\n");

                    //TODO make nextline print work
                    arraylist.add(stringInput.substring(lastSpace + 1, length));

                } else if (!stringInput.contains(" ")) { //if there are no spaces in the string whatsoever, then just split it where the column number is
                    arraylist.add(stringInput.substring(beginningOfSubString, (beginningOfSubString + columnNumber)) + "\n");
                }

                //move beginning of substring up so it goes to the next location
                beginningOfSubString += columnNumber;
            }
            //remove characters from arraylist to make them look normal again & assign to new string to return
            String stringofList = arraylist.toString().replace("[", "").replace(", ", "").replace("]", "");

            return stringofList;
        }
        return stringInput;
    }

    protected static int getColumnNumber(String stringInput, int columnNumber) {

        return columnNumber;
    }

    private static String getStringInput(String stringInput, int columnNumber) {

        return stringInput;
    }

}

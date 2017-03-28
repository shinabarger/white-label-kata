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
        int endOfString = length;
        int lastSpace = stringInput.lastIndexOf(" ");

        if (columnNumber < length) {
            int beginningOfSubString = 0;
            boolean isSpace = false;

            for (int i = columnNumber; i <= length; i += columnNumber) {

                arraylist.add(stringInput.substring(beginningOfSubString, i) + "\n");
                beginningOfSubString = beginningOfSubString + columnNumber;

                if (columnNumber < length  && columnNumber != 1 && (length - columnNumber < columnNumber)) {
                    arraylist.add(stringInput.substring(columnNumber, length));

                } else if ((length - i) < columnNumber && columnNumber < length) {
                    arraylist.add(stringInput.substring(i, length));
                }
            }

            String stringofList = arraylist.toString().replace("[", "").replace(", ", "").replace("]", "");
            System.out.println(stringofList);
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

    //setup basic testing using junit
    public static int answer() {

        return 42;
    }
}

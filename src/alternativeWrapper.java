/**
 * ALTERNATE SOLUTION -- SOLUTION I STARTED WITH BUT GOT STUCK ON SO MOVED TO PREVIOUS METHOD FOR SIMPLICITY
 * Full disclosure -- I got a LOT of help with this from Yosuke, a classmate at Grand Circus Bootcamp - this solution is a completely different direction
 * TODO: make it so the words are hyphenated with wrapping
 */

public class alternativeWrapper {

    private static String wrap2(String originalStringInput, int numberColumnsPerLine) {

        // Check to make sure numberColumnsPerLine is more than 0
        if (numberColumnsPerLine < 1) {
            return "";
        }

        StringBuilder stringBuilder = new StringBuilder();

        // Take the original string into a string that can be manipulated throughout the code.
        String tempString = originalStringInput;

        // While tempString is not empty
        // Outer while loop takes care of each line
        while (!tempString.isEmpty()) {

            String singleLine = "";

            // Process until a word doesn't fit in a single line i.e. break;
            while (true) {

                // If the tempString contains a non-leading space, and it fits in the line From index 1 to not contain the leading space
                if (tempString.indexOf(" ", 1) >= 0
                        && singleLine.length() + tempString.substring(0, tempString.indexOf(' ', 1)).length()
                        <= numberColumnsPerLine) {

                    // singleLine gets up until the space
                    singleLine += tempString.substring(0, tempString.indexOf(' ', 1));

                    // tempString is now truncated up to the point that was added to the singleLine
                    tempString = tempString.substring(tempString.indexOf(' ', 1));

                }

                // Else, if the tempString does NOT have a non-leading space, but it DOES FIT end of line
                else if (tempString.indexOf(" ", 1) < 0
                        && singleLine.length() + tempString.length()
                        <= numberColumnsPerLine) {

                    // singleLine gets everything
                    singleLine += tempString;

                    // Nothing left in tempString
                    tempString = "";

                    // Next line
                    break;
                }

                // Else, next line
                else {
                    break;
                }

            }

            // Append onto the stringBuilder
            stringBuilder.append(singleLine);

            // New line if tempString still has something, and trim leading space
            if (!tempString.isEmpty()) {
                stringBuilder.append("\n");
                tempString = tempString.trim();
            }

        }

        //turn into a string
        return stringBuilder.toString();
    }

}

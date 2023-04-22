import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class newStringMethods_T3 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        var str = " ZDP ";

        System.out.println(str +" Length " + str.length());
        // strip() method to remove Leading white space and Trailing white space;
        // Returns a string whose value is this string, with all leading and trailing white space removed.
        // If this String object represents an empty string, or if all code points in this string are white space, then an empty string is returned.
        // Otherwise, returns a substring of this string beginning with the first code point that is not a white space up to and including the last code point that is not a white space.
        // This method may be used to strip white space from the beginning and end of a string.
        // Returns:
        // a string whose value is this string, with all leading and trailing white space removed
        System.out.println("strip " + str.strip() +" Length " + str.strip().length());




        // stripLeading() method to remove only Leading white space
        // Returns a string whose value is this string, with all leading white space removed.
        // If this String object represents an empty string, or if all code points in this string are white space, then an empty string is returned.
        // Otherwise, returns a substring of this string beginning with the first code point that is not a white space up to to and including the last code point of this string.
        // This method may be used to trim white space from the beginning of a string.
        // Returns:
        // a string whose value is this string, with all leading white space removed
        System.out.println("stripLeading " + str.stripLeading() +" Length " +str.stripLeading().length());





        // stripLeading() method to remove only Trailing white space
        // Returns a string whose value is this string, with all trailing white space removed.
        // If this String object represents an empty string, or if all characters in this string are white space, then an empty string is returned.
        // Otherwise, returns a substring of this string beginning with the first code point of this string up to and including the last code point that is not a white space.
        // This method may be used to trim white space from the end of a string.
        // Returns:
        // a string whose value is this string, with all trailing white space removed
        System.out.println("stripTrailing " + str.stripTrailing() +" Length " +str.stripTrailing().length());






        // isBlank() method
        // Returns true if the string is empty or contains only white space codepoints, otherwise false.
        // Returns:
        // true if the string is empty or contains only white space codepoints, otherwise false
        System.out.println("isBlank " + str.isBlank()); // it ignores the space and retuen false if there is no string.





        // Lines() method
        // Returns a stream of lines extracted from this string, separated by line terminators.
        // A line terminator is one of the following: a line feed character "\n" (U+000A), a carriage return character "\r" (U+000D), or a carriage return followed immediately by a line feed "\r\n" (U+000D U+000A).
        // A line is either a sequence of zero or more characters followed by a line terminator, or it is a sequence of one or more characters followed by the end of the string. A line does not include the line terminator.
        // The stream returned by this method contains the lines from this string in the order in which they occur.
        // Returns:
        // the stream of lines extracted from this string
        var strExample = "Z\n"
                + "D\n"
                + "P\n";
        strExample.lines().forEach(System.out::println); // printing each new line using for-each

        Stream<String> stream = strExample.lines(); // assigning it to stream object
        List<String> list = stream.collect(Collectors.toList()); // converting stream object to list

        System.out.println("list " + list);






        //Repeat() method is use to repeat a string as per need by providing count
        // Returns a string whose value is the concatenation of this string repeated count times.
        // If this string is empty or count is zero then the empty string is returned.
        // Parameters:
        // count number of times to repeat
        // Returns:
        // A string composed of this string repeated count times or the empty string if this string is empty or count is zero
        // Throws:
        // IllegalArgumentException - if the count is negative.
        var eString  = "ZDP ";
        System.out.println(eString.repeat(3));

    }
}

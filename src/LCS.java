import java.util.HashMap;

/**
 * @author frankegan on 12/3/14.
 */
public class LCS {

    String string1, string2;

    /**
     * @param string1 The first word that will be in your Least Common Substring
     * @param string2 The second word that will be in your Least Common Substring
     */
    public LCS(String string1, String string2) {
        this.string1 = string1;
        this.string2 = string2;
    }

    /**
     * @return The Longest Common Substring of string1 & string2
     */
    public String findLCS() {
        return lcsHelper(0, 0);
    }

    /**
     * @param start1 The starting point for string1's substring
     * @param start2 The starting point for string2's substring
     * @return The Longest Common Substring of string 1 & 2 starting the given points
     */
    public String lcsHelper(int start1, int start2) {
        HashMap<String, String> substrings = new HashMap<>();

        if (string1.isEmpty() || string2.isEmpty())
            return "";
        else if (string1.charAt(start1) == string2.charAt(start2))
            return string1.charAt(start1) + new LCS(string1.substring(1), string2.substring(1)).findLCS();
        else {
            String inc2 = new LCS(string1, string2.substring(1)).findLCS();
            String inc1 = new LCS(string1.substring(1), string2).findLCS();
            return (inc2.length() > inc1.length()) ? inc2 : inc1;
        }
    }
}
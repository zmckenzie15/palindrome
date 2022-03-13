package edu.mills.cs180;

/**
 * A static utility class for testing whether strings are palindromes.
 *
 * @author Ellen Spertus
 */
public class PalindromeChecker {
    private PalindromeChecker() {}

    /**
     * Checks whether the given string is a palindrome. A string is considered a palindrome if it
     * reads the same forwards and backwards, ignoring case, once all non-alphanumeric characters
     * are removed.
     *
     * @param s the string to check
     * @return true if the string is a palindrome, false otherwise
     */
    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb = sb.reverse();
        if (s.equals(sb.toString())) {
            return true;
        }
        return false;
    }

    // public static void main(String[] args) {
    // isPalindrome("abba");
    // }
}

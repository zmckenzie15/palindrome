package edu.mills.cs180;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

public class PalindromeCheckerTest {
    @Test
    void isPalindrome_True_EmptyString() {
        assertTrue(PalindromeChecker.isPalindrome("abbac"));
    }

    @ParameterizedTest
    @CsvSource({"Java", "abc", "spatula"})
    void isPalindromeParam(String input, String expected) {
        assertTrue(PalindromeChecker.isPalindrome(input));
    }
}

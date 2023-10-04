package tarea1MocksTest;

import static org.junit.jupiter.api.Assertions.*;
import tarea1Mocks.PalindromeChecker;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class PalindromeCheckerTest {
    PalindromeChecker palindromeChecker = new PalindromeChecker();

    @ParameterizedTest(name = "Test: la palabra ''{0}'' es un palíndromo: {1}")
    @CsvSource({
            "jose, false",
            "oro, true",
            "'', true",
            "' ', true",
            "AnitaLavaLaTina, true",
            "null, false"
    })
    public void testIsPalindrome(String word, boolean expectedResult) {
        // Validación especial para el caso nulo, ya que CsvSource no permite valores nulos.
        if ("null".equals(word)) {
            word = null;
        }
        assertEquals(expectedResult, palindromeChecker.isPalindrome(word));
    }
}

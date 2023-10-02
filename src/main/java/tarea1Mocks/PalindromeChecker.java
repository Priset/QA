package tarea1Mocks;

public class PalindromeChecker {
    public boolean isPalindrome(String word) {
        // Validación: asegurarse de que la palabra no sea nula.
        if (word == null) {
            return false;
        }

        // Convertir la palabra a minúsculas para asegurar la comparación correcta.
        String lowerCaseWord = word.toLowerCase();

        // Obtener la longitud de la palabra.
        int length = lowerCaseWord.length();

        // Comparar cada caracter de la palabra.
        for (int i = 0; i < length / 2; i++) {
            if (lowerCaseWord.charAt(i) != lowerCaseWord.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}

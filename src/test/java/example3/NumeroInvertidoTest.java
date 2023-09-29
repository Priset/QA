package example3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class NumeroInvertidoTest {

    @ParameterizedTest
    @CsvSource({
            // Casos límite y valores normales
            "-1,Valor Incorrecto",
            "0,0", // Límite inferior
            "1,1",
            "8,8",
            "80,08",
            "123,321",
            "100,001",
            "999,999", // Aproximación al límite superior
            "1000,0001"  // Límite superior
    })
    public void verifyInvertir(int inputValue, String expectedResult) {
        NumeroInvertido numInv = new NumeroInvertido();
        String actualResult = numInv.invertir(inputValue);
        Assertions.assertEquals(expectedResult, actualResult, "ERROR! El número invertido es incorrecto");
    }
}

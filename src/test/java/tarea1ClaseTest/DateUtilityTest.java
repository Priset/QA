package tarea1ClaseTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import tarea1Clase.DateUtility;

public class DateUtilityTest {
    @ParameterizedTest
    @CsvSource({
            "31, 12, 2023, '01/Enero/2024'",           // Fin de año
            "30, 11, 2023, '01/Diciembre/2023'",       // Cambio de mes
            "15, 5, 2023, '16/Mayo/2023'",             // Día normal
            "28, 2, 2023, '01/Marzo/2023'",            // Febrero en un año no bisiesto
            "28, 2, 2024, '29/Febrero/2024'",          // Febrero en un año bisiesto
            "29, 2, 2024, '01/Marzo/2024'",            // Día después del 29 de febrero en un año bisiesto
            "30, 4, 2023, '01/Mayo/2023'",             // Abril tiene 30 días
            "30, 6, 2023, '01/Julio/2023'",            // Junio tiene 30 días
            "30, 9, 2023, '01/Octubre/2023'",          // Septiembre tiene 30 días
            "31, 1, 2023, '01/Febrero/2023'",          // Enero tiene 31 días
            "31, 3, 2023, '01/Abril/2023'",            // Marzo tiene 31 días
            "31, 5, 2023, '01/Junio/2023'",            // Mayo tiene 31 días
            "31, 7, 2023, '01/Agosto/2023'",           // Julio tiene 31 días
            "31, 8, 2023, '01/Septiembre/2023'",       // Agosto tiene 31 días
            "31, 10, 2023, '01/Noviembre/2023'",       // Octubre tiene 31 días
            "2, 11, 2023, '03/Noviembre/2023'",        // Día normal en Noviembre
            "1, 1, 2024, '02/Enero/2024'",             // Primer día del año
            "16, 6, 2024, '17/Junio/2024'"             // Día normal en Junio
    })
    void testNextDay(int day, int month, int year, String expectedOutput) {
        Assertions.assertEquals(expectedOutput, DateUtility.nextDay(day, month, year), "La fecha calculada no es la esperada.");
    }
}

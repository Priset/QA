package tarea1Clase;

public class DateUtility {

    private static final String[] MONTHS_SPANISH = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
    };

    public static String nextDay(int day, int month, int year) {
        int[] daysInMonth = {
                31, (isLeapYear(year) ? 29 : 28), 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31
        };

        if (day < 1 || day > daysInMonth[month - 1] || month < 1 || month > 12) {
            throw new IllegalArgumentException("Fecha inválida.");
        }

        day++;
        if (day > daysInMonth[month - 1]) {
            day = 1;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }

        return String.format("%02d/%s/%d", day, MONTHS_SPANISH[month - 1], year);
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        System.out.println(nextDay(31, 12, 2023));  // Output: 01/Enero/2024
        System.out.println(nextDay(30, 12, 2023));  // Output: 31/Diciembre/2023
    }
}

/*
    Se quiere implementar un método que dado 3 parámetros dia, mes, gestion devuelva la fecha siguiente en formato texto

        ejemplo:

        nextDay(dia, mes, año) - retorne --> text

        31  12  2023 ------->  “01/01/2024 ”
        o

        31  Diciembre  2023 ------->  “01/Enero/2024 ”

 */

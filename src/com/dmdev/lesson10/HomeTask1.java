package com.dmdev.lesson10;

/**
 * Дана строка.
 * Удалить из нее все повторяющиеся символы без учета регистра, если они идут друг за другом. Также удалить пробелы.
 * Результат привести к верхнему регистру.
 *
 * Например:
 * "abc Cpddd Dio OsfWw" -> "ABCPDIOSFW"
 */
public class HomeTask1 {

    public static void main(String[] args) {
        String value = "ASddd Jjsad D mm M kkLwqee";
        System.out.println(removeDuplicateSymbols(value));
    }

    private static String removeDuplicateSymbols(String value) {
        String formatValue = value
                .replace(" ", "")
                .toUpperCase();

        char[] array = formatValue.toCharArray();
        for (int i = 0; i < formatValue.length() - 1; i++) {
            if (array[i] == array[i + 1]) {
                array[i] = ' ';
            }
        }

        String result = new String(array);
        return result.replace(" ", "");
    }
}

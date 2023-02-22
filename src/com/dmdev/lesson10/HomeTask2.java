package com.dmdev.lesson10;

/**
 * Дана строка с текстом, в котором есть цифры от 0 до 9.
 *
 * Написать 2 метода:
 * - возвращающий массив цифр из переданной строки
 * - возвращающий сумму цифр из переданного целочисленного массива
 *
 * Посчитать сумму всех чисел из строки
 *
 * Например:
 * “Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?” -> 18 (8+1+2+4+3)
 */

public class HomeTask2 {

    public static void main(String[] args) {
        String value = "ASfsda43202fsd 342FSvs35 af234jk2340167sdf89";

        int[] digits = getDigits(value);
        System.out.println(getSum(digits));
    }

    private static int[] getDigits(String value) {
        char[] array = value.toCharArray();
        char[] arrayWithDigits = new char[array.length];
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == '0' || array[i] == '1' || array[i] == '2' || array[i] == '3' || array[i] == '4'
                    || array[i] == '5' || array[i] == '6' || array[i] == '7' || array[i] == '8' || array[i] == '9') {
                arrayWithDigits[counter] = array[i];
                counter++;
            }
        }

        int[] digits = new int[counter];
        for (int i = 0; i < counter; i++) {
            digits[i] = Character.getNumericValue(arrayWithDigits[i]);
        }

        return digits;
    }

    private static int getSum(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }
}

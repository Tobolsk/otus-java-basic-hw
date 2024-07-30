package lesson05;

import java.util.Arrays;

public class Hw02 {
    public static void main(String[] args) {
        numberAndString(5, "SomeText");
        sumIntArray(1, 6, 9, 3, 2, 4);
        int[] arr = {1, 2, 3, -1, -2, 10};
        fillIntArray(15, arr);
        increaseArray(10, arr);
        sumHalfArray(arr);
    }

    // Реализуйте метод, принимающий в качестве аргументов целое число и строку, и печатающий в консоль строку
    // указанное количество раз.
    public static void numberAndString(int intNumber, String myString) {
        for (int i = 0; i < intNumber; i++) {
            System.out.println(myString);
        }
    }

    // Реализуйте метод, принимающий в качестве аргумента целочисленный массив, суммирующий все элементы, значение
    // которых больше 5, и печатающий полученную сумму в консоль.
    public static void sumIntArray(int... intArray) {
        int sumArray = 0;
        for (int j : intArray) {
            if (j > 5) {
                sumArray += j;
            }
        }
        System.out.println(sumArray);
    }

    // Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на целочисленный массив, метод должен
    // заполнить каждую ячейку массива указанным числом.
    public static void fillIntArray(int fillNumber, int[] arr) {
        Arrays.fill(arr, fillNumber);
    }

    // Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на целочисленный массив, увеличивающий
    // каждый элемент массива на указанное число.
    public static void increaseArray(int increaseNumber, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += increaseNumber;
        }
    }

    // Реализуйте метод, принимающий в качестве аргумента целочисленный массив, и печатающий в консоль информацию о том,
    // сумма элементов какой из половин массива больше.
    public static void sumHalfArray(int[] arr) {
        int sumLeftHalf = 0;
        int sumRightHalf = 0;
        for (int i = 0; i < (arr.length / 2); i++) {
            sumLeftHalf += arr[i];
            sumRightHalf += arr[arr.length - i - 1];
        }
        if (sumLeftHalf > sumRightHalf) {
            System.out.println("Сумма первой половины элементов больше");
        } else if (sumLeftHalf < sumRightHalf) {
            System.out.println("Сумма второй половины элементов больше");
        } else {
            System.out.println("Сумма первой и второй половин элементов равны");
        }
    }
}

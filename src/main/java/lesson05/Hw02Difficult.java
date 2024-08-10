package lesson05;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Hw02Difficult {
    public static void main(String[] args) {
        //Данные и запуск метода для решения задачи №1
        int[] array1 = {1, 2, 3};
        int[] array2 = {2, 2};
        int[] array3 = {1, 1, 1, 1, 1};
        setOfArrays(array1, array2, array3);

        //Данные и запуск метода для решения задачи №2
        int[] checkupArray = {1, 1, 1, 1, 1, 5};//{9, 4};//{5, 3, 4, -2};
        checkOrderArray(checkupArray);

        //Данные и запуск метода для решения задачи №3
        int[] incOrDecArray = {5, 4, 30, 2, 1};
        char comparisonOperator = '<'; // ">" - возрастание, "<" - убывание.
        incOrDecElements(incOrDecArray, comparisonOperator);

        //Данные и запуск метода для решения задачи №4
        int[] originalArray = {1, 2, 3, 4, 5};
        turnOverArray(originalArray);
    }

    //  1. Реализуйте метод, принимающий на вход набор целочисленных массивов, и получающий новый массив равный сумме
    //  входящих;
    //  Пример: { 1, 2, 3 }
    //  + { 2, 2 }
    //  + { 1, 1, 1, 1, 1}
    //   = { 4, 5, 4, 1, 1 }
    public static void setOfArrays(int[] array1, int[] array2, int[] array3) {
        int maxLength = Math.max(array1.length, Math.max(array2.length, array3.length));
        int[] arraySum = new int[maxLength];
        for (int i = 0; i < maxLength; i++) {
            arraySum[i] = (i >= array1.length ? 0 : array1[i]) + (i >= array2.length ? 0 : array2[i]) +
                    (i >= array3.length ? 0 : array3[i]);
            //System.out.print(arraySum[i]+", "); //для проверки результатов
        }
    }

    //  2. Реализуйте метод, проверяющий что есть “точка” в массиве, в которой сумма левой и правой части равны. “Точка
    //  находится между элементами”;
    //  Пример: { 1, 1, 1, 1, 1, | 5 }, { 5, | 3, 4, -2 }, { 7, 2, 2, 2 }, { 9, 4 }
    public static void checkOrderArray(int[] checkupArray) {
        int leftPoint = 0;
        int rightPoint = 0;
        int rightSum = IntStream.of(checkupArray).sum();
        System.out.println(rightSum);
        int leftSum = 0;
        for (int i = 0; i < checkupArray.length - 1; i++) {
            leftSum += checkupArray[i];
            rightSum -= checkupArray[i];
            if (leftSum == rightSum) {
                leftPoint = i + 1;
                rightPoint = leftPoint + 1;
                System.out.println("Точка слева = " + leftPoint + ". Точка справа = " + rightPoint);
                break;
            }
        }
    }

    //  3. Реализуйте метод, проверяющий, что все элементы массива идут в порядке убывания или возрастания (по выбору
    //  пользователя)
    public static void incOrDecElements(int[] incOrDecArray, char comparisonOperator) {
        boolean checkResult = true;
        String textResult = "";
        if (comparisonOperator == '>') {
            for (int i = 0; i < incOrDecArray.length - 1; i++) {
                if (incOrDecArray[i] > incOrDecArray[i + 1]) {
                    checkResult = false;
                }
            }
            textResult = "все элементы массива идут в порядке возрастания = " + checkResult;
        } else if (comparisonOperator == '<') {
            for (int i = 0; i < incOrDecArray.length - 1; i++) {
                if (incOrDecArray[i] < incOrDecArray[i + 1]) {
                    checkResult = false;
                }
            }
            textResult = "все элементы массива идут в порядке убывания = " + checkResult;
        } else textResult = "Неизвестный оператор сравнения";
        //System.out.println(textResult); //для проверки результатов
    }

    //  4. Реализуйте метод, “переворачивающий” входящий массив
//  Пример: { 1 2 3 4 } => { 4 3 2 1 }
    public static void turnOverArray(int[] originalArray) {
        int[] convertedArray = new int[originalArray.length];
        for (int i = 0; i < originalArray.length; i++) {
            convertedArray[originalArray.length - i - 1] = originalArray[i];
        }
        /*for (int i = 0; i <convertedArray.length; i++) { //для проверки результатов
            System.out.print(convertedArray[i]+",");
        }*/
    }
}
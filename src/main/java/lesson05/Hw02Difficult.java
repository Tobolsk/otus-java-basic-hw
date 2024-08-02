package lesson05;

public class Hw02Difficult {
    public static void main(String[] args) {
        //Данные и запуск метода для решения задачи №1
        int[] array1 = {1, 2, 3};
        int[] array2 = {2, 2};
        int[] array3 = {1, 1, 1, 1, 1};
        setOfArrays(array1, array2, array3);

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
        for (int i = 0; i<maxLength; i++) {
            arraySum[i] = (i >= array1.length ? 0 : array1[i]) + (i >= array2.length ? 0 : array2[i]) +
                    (i >= array3.length ? 0 : array3[i]);
            //System.out.print(arraySum[i]+", "); //для проверки результатов суммирования
        }
    }

    //  2. Реализуйте метод, проверяющий что есть “точка” в массиве, в которой сумма левой и правой части равны. “Точка
    //  находится между элементами”;
    //  Пример: { 1, 1, 1, 1, 1, | 5 }, { 5, | 3, 4, -2 }, { 7, 2, 2, 2 }, { 9, 4 }

    //  3. Реализуйте метод, проверяющий, что все элементы массива идут в порядке убывания или возрастания (по выбору
    //  пользователя)

    //  4. Реализуйте метод, “переворачивающий” входящий массив
    //  Пример: { 1 2 3 4 } => { 4 3 2 1 }
    public static void turnOverArray(int[] originalArray) {
        int[] convertedArray = new int[originalArray.length];
        for (int i = 0; i < originalArray.length; i++) {
            convertedArray[originalArray.length-i-1] = originalArray[i];
        }
        for (int i = 0; i <convertedArray.length; i++) {
            System.out.print(convertedArray[i]+",");
        }
    }
}

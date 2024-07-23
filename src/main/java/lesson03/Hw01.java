package lesson03;

import java.util.Scanner;
import java.util.Random;

/* Задание со (*) При запуске приложения, запросите у пользователя число от 1 до 5, и после ввода выполнения метод,
соответствующий указанному номеру со случайным значением аргументов*/
public class Hw01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 5");
        byte n = scanner.nextByte();
        while ((n<1) || (n>5)) {
            //System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Введите число от 1 до 5");
            n = scanner.nextByte();
        }
        switch (n) {
            case 1:
                greetings();
                break;
            case 2:
                Random ran2 = new Random();
                int a2 = ran2.nextInt();
                int b2 = ran2.nextInt();
                int c2 = ran2.nextInt();
                System.out.println("a=" + a2);
                System.out.println("b=" + b2);
                System.out.println("c=" + c2);
                checkSign(a2, b2, c2);
                break;
            case 3:
                Random ran3 = new Random();
                int data = ran3.nextInt();
                System.out.println("data=" + data);
                selectColor(data);
                break;
            case 4:
                Random ran4 = new Random();
                int a4 = ran4.nextInt();
                int b4 = ran4.nextInt();
                System.out.println("a=" + a4);
                System.out.println("b=" + b4);
                compareNumbers(a4, b4);
                break;
            case 5:
                Random ran5 = new Random();
                int initValue = ran5.nextInt();
                int delta = ran5.nextInt();
                boolean increment = ran5.nextBoolean();
                System.out.println("initValue=" + initValue);
                System.out.println("delta=" + delta);
                System.out.println("increment=" + increment);
                addOrSubtractAndPrint(initValue, delta, increment);
        }
    }

/*(1) Реализуйте метод greetings(), который при вызове должен отпечатать в столбец 4 слова: Hello, World, from, Java*/
    public static void greetings() {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");
    }

/*(2) Реализуйте метод checkSign(..), принимающий в качестве аргументов 3 int переменные a, b и c. Метод должен
посчитать их сумму, и если она больше или равна 0, то вывести в консоль сообщение “Сумма положительная”, в противном
случае - “Сумма отрицательная”*/
    public static void checkSign(int a, int b, int c) {
        if ((a+b+c) >= 0) {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }

    // (3) Реализуйте метод selectColor() в теле которого задайте int переменную data с любым начальным
    // значением. Если data меньше 10 включительно, то в консоль должно быть выведено сообщение “Красный”,
    // если от 10 до 20 включительно, то “Желтый”, если больше 20 - “Зеленый”;
    public static void selectColor(int data) {
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data <= 20) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    // (4) Реализуйте метод compareNumbers(), в теле которого объявите две int переменные a и b
    // с любыми начальными значениями. Если a больше или равно b, то необходимо вывести в консоль
    // сообщение “a >= b”, в противном случае “a < b”;
    public static void compareNumbers(int a, int b) {
        if (a >= b){
            System.out.println(a + " >= " + b);
        }
        else {
            System.out.println(a + " < " + b);
        }
    }

/*(5) Создайте метод addOrSubtractAndPrint(int initValue, int delta, boolean increment). Если increment = true, то
метод должен к initValue прибавить delta и отпечатать в консоль     результат, в противном случае - вычесть*/
    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment) {
            System.out.println(initValue + delta);
        }
        else {
            System.out.println(initValue - delta);
        }
    }
}
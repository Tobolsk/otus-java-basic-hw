package lesson03;

import java.util.Scanner;
import java.util.Random;

/* ЗАДАНИЕ СО (*) ПРИ ЗАПУСКЕ ПРИЛОЖЕНИЯ, ЗАПРОСИТЕ У ПОЛЬЗОВАТЕЛЯ ЧИСЛО ОТ 1 ДО 5, И ПОСЛЕ ВВОДА ВЫПОЛНЕНИЯ МЕТОД,
СООТВЕТСТВУЮЩИЙ УКАЗАННОМУ НОМЕРУ СО СЛУЧАЙНЫМ ЗНАЧЕНИЕМ АРГУМЕНТОВ*/
public class Hw01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 5");
        byte n = scanner.nextByte();
        while ((n < 1) || (n > 5)) {
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

    /* (1) РЕАЛИЗУЙТЕ МЕТОД GREETINGS(), КОТОРЫЙ ПРИ ВЫЗОВЕ ДОЛЖЕН ОТПЕЧАТАТЬ В СТОЛБЕЦ 4 СЛОВА: HELLO, WORLD, FROM, JAVA*/
    public static void greetings() {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");
    }

    /* (2) РЕАЛИЗУЙТЕ МЕТОД CHECKSIGN(..), ПРИНИМАЮЩИЙ В КАЧЕСТВЕ АРГУМЕНТОВ 3 INT ПЕРЕМЕННЫЕ A, B И C. МЕТОД ДОЛЖЕН
    ПОСЧИТАТЬ ИХ СУММУ, И ЕСЛИ ОНА БОЛЬШЕ ИЛИ РАВНА 0, ТО ВЫВЕСТИ В КОНСОЛЬ СООБЩЕНИЕ “СУММА ПОЛОЖИТЕЛЬНАЯ”, В
    ПРОТИВНОМ СЛУЧАЕ - “СУММА ОТРИЦАТЕЛЬНАЯ”*/
    public static void checkSign(int a, int b, int c) {
        if ((a + b + c) >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    /* (3) РЕАЛИЗУЙТЕ МЕТОД SELECTCOLOR() В ТЕЛЕ КОТОРОГО ЗАДАЙТЕ INT ПЕРЕМЕННУЮ DATA С ЛЮБЫМ НАЧАЛЬНЫМ ЗНАЧЕНИЕМ.
    ЕСЛИ DATA МЕНЬШЕ 10 ВКЛЮЧИТЕЛЬНО, ТО В КОНСОЛЬ ДОЛЖНО БЫТЬ ВЫВЕДЕНО СООБЩЕНИЕ “КРАСНЫЙ”, ЕСЛИ ОТ 10 ДО 20
    ВКЛЮЧИТЕЛЬНО, ТО “ЖЕЛТЫЙ”, ЕСЛИ БОЛЬШЕ 20 - “ЗЕЛЕНЫЙ”*/
    public static void selectColor(int data) {
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data <= 20) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    /* (4) РЕАЛИЗУЙТЕ МЕТОД COMPARENUMBERS(), В ТЕЛЕ КОТОРОГО ОБЪЯВИТЕ ДВЕ INT ПЕРЕМЕННЫЕ A И B С ЛЮБЫМИ НАЧАЛЬНЫМИ
    ЗНАЧЕНИЯМИ. ЕСЛИ A БОЛЬШЕ ИЛИ РАВНО B, ТО НЕОБХОДИМО ВЫВЕСТИ В КОНСОЛЬ СООБЩЕНИЕ “A >= B”, В ПРОТИВНОМ СЛУЧАЕ “A
    < B”*/
    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println(a + " >= " + b);
        } else {
            System.out.println(a + " < " + b);
        }
    }

    /* (5) СОЗДАЙТЕ МЕТОД ADDORSUBTRACTANDPRINT(INT INITVALUE, INT DELTA, BOOLEAN INCREMENT). ЕСЛИ INCREMENT = TRUE,
    ТО МЕТОД ДОЛЖЕН К INITVALUE ПРИБАВИТЬ DELTA И ОТПЕЧАТАТЬ В КОНСОЛЬ РЕЗУЛЬТАТ, В ПРОТИВНОМ СЛУЧАЕ - ВЫЧЕСТЬ*/
    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment) {
            System.out.println(initValue + delta);
        } else {
            System.out.println(initValue - delta);
        }
    }
}
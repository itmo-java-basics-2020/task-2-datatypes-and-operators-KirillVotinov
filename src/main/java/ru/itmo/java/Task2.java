package ru.itmo.java;

@SuppressWarnings("all")
public class Task2 {

    /**
     * Дано произвольное вещественное число. Выведите его дробную часть
     * <p>
     * Например
     * - дано 17.9
     * - вывод 0.9
     */
    double getFractionalPart(double realNumber) {
        return realNumber % 1;
    }

    /**
     * Дан символ, верните его код. Не используйте явное приведение типов и любые библиотечные функции
     */
    int charCode(char c) {
        int code = c;
        return code; //your code here
    }

    /**
     * Даны 2 целых числа. Проверьте равны ли они
     */
    boolean testIfIntsEqual(Integer a, Integer b) {
        return a.equals(b);
    }

    /**
     * Дано целое число. Выведите {@code true}, если оно входит в заданный диапазон или {@code false}
     * в иных случаях
     *
     * @param number      заданное число
     * @param leftBound   правая граница диапазона
     * @param rightBound  верхняя граница диапазона
     * @param inclusively входят ли границы в заданный даипазон
     */
    boolean numberInRange(Integer number, Integer leftBound, Integer rightBound, Boolean inclusively) {
        if (number == null || leftBound == null || rightBound == null || inclusively == null) {
            return false;
        }
        if (inclusively && number >= leftBound && number <= rightBound) {
                return true;
        }
        else if (number > leftBound && number < rightBound) {
            return true;
        }
        return false;
    }

    /**
     * Даны 3 символа. Определите является ли хотя бы один из них цифрой 1..9
     */
    boolean atLeastOneIsDigit(char c1, char c2, char c3) {
        if (Character.isDigit(c1) || Character.isDigit(c2) || Character.isDigit(c3)) {
            return true;
        }
        return false;
    }

    /**
     * Даны два вещественных числа. Определите равны ли они
     */
    boolean areRealNumbersEqual(double a, double b) {
        return Math.abs(a - b) < 1e-5;
    }

    /**
     * Дано трехзначное число 100 <= N <= 999. Найдите сумму его чисел.
     */
    int sumOfDigits(int n) {
        int ones = 0;
        int tens = 0;
        int hundreds = 0;
        ones = n % 10;
        n = (n - ones) / 10;
        tens = n % 10;
        n = (n - tens) / 10;
        hundreds = n % 10;
        return ones + tens + hundreds;
    }

    /**
     * Дано натуральное число N <= 10000. Выведите следующее после N четное число. Например: N = 8, Result = 10
     */
    int nextEvenNumber(int n) {
        if (n % 2 == 0) {
            return  n + 2;
        }
        else {
            return n + 1;
        }
    }

    /**
     * Школа №32 решила создать 3 дополнительных физмат класса и укомплектовать кабинеты новыми партами.
     * За одной партой может сидеть 2 ученика. Кол-во учеников в каждом из классов известно (num1, num2, num3).
     * Выведите минимальное кол-во парт, которые нужно приобрести школе, при условии что каждый из классов сидит в
     * своем кабинете
     */
    int schoolDesks(int num1, int num2, int num3) {
        int sum = 0;
        if (num1 % 2 == 0) {
            sum += num1 / 2;
        }
        else {
            sum += (num1 + 1) / 2;
        }
        if (num2 % 2 == 0) {
            sum += num2 / 2;
        }
        else {
            sum += (num2 + 1) / 2;
        }
        if (num3 % 2 == 0) {
            sum += num3 / 2;
        }
        else {
            sum += (num3 + 1) / 2;
        }
        return sum;
    }

    /**
     * Дано натуральное число N >= 10. Выведите результат применения XOR к последним 2-м цифрам числа N
     */
    int xorDigits(int N) {
        int figure1;
        int figure2;
        figure1 = N % 10;
        N = (N - figure1) / 10;
        figure2 = N % 10;
        return figure1 ^ figure2;
    }

}

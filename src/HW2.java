/*
Реализовать программу, выводящую на экран результаты:
Сложения двух чисел
Вычитания двух чисел
Умножения двух чисел
Деления двух чисел
Каждая из арифметических операций должна быть реализована как отдельный метод.
 */

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        div();
        sum();
        diff();
        mult();
    }

    public static void sum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа для сложения: ");
        double result = scanner.nextDouble();
        double result2 = scanner.nextDouble();
        System.out.println("Сумма двух чисел: " + (result + result2));
    }
    public static void diff() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа для вычитания: ");
        double result = scanner.nextDouble();
        double result2 = scanner.nextDouble();
        System.out.println("Разность двух чисел: " + (result - result2));
    }
    public static void mult() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа для умножения: ");
        double result = scanner.nextDouble();
        double result2 = scanner.nextDouble();
        System.out.println("Умножение двух чисел: " + (result * result2));
    }
    public static void div() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа для деления: ");
        double result = scanner.nextDouble();
        double result2 = scanner.nextDouble();
        while (result2 == 0) {
            System.out.println("На 0 делить нельзя! Введите что-то не ноль :)");
            result2 = scanner.nextInt();
        }
        System.out.println("Деление двух чисел: " + result / result2);
    }

}

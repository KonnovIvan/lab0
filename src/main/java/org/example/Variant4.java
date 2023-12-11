package org.example;

import java.util.Arrays;

public class Variant4 {


// Завдання 1
// Даны целые положительные числа A и B (A > B).
// На отрезке длины A размещено максимально возможное количество отрезков длины B (без наложений).
// Используя операцию деления нацело, найти количество отрезков B, размещенных на отрезке A.
public static int task1Int(int A, int B) {
            if (A <= 0 || B <= 0 || A <= B) {
                throw new IllegalArgumentException("Invalid input values");
            }
            return A / B;
        }


// Завдання 2
// Даны два целых числа: A, B.
// Проверить истинность высказывания: «Справедливы неравенства A > 2 и B < 3».
public static boolean task2Bool(int A, int B) {
            return A > 2 && B < 3;
        }


// Завдання 3
// Даны три целых числа. Найти количество положительных чисел в исходном наборе.
public static int task3If(int num1, int num2, int num3) {
            int count = 0;
            if (num1 > 0) {
                count++;
            }
            if (num2 > 0) {
                count++;
            }
            if (num3 > 0) {
                count++;
            }
            return count;
        }

// Завдання 4
//  Дан номер месяца — целое число в диапазоне 1–12 (1 — январь, 2 — февраль и т. д.).
//  Определить количество дней в этом месяце для невисокосного года.
public static int task4Case(int month) {
 if (month < 1 || month > 12) {
     throw new IllegalArgumentException("Invalid month");
 }

 int days;

 switch (month) {
     case 1: case 3: case 5: case 7: case 8: case 10: case 12:
         days = 31;
         break;
     case 4: case 6: case 9: case 11:
         days = 30;
         break;
     case 2:
         days = 28;
         break;
     default:
         throw new IllegalArgumentException("Invalid month");
}
        return days;
}

// Завдання 5
//Дано вещественное число — цена 1 кг конфет. Вывести стоимость 1, 2, … , 10 кг конфет.
public static double[] task5For(double pricePerKg) {
            double[] costs = new double[10];
            for (int i = 1; i <= 10; i++) {
                costs[i - 1] = pricePerKg * i;
            }
            return costs;
        }

// Завдання 6
// Дано целое число N (> 0).
// Если оно является степенью числа 3, то вывести True, если не является — вывести False.
public static boolean task6While(int N) {
    if (N <= 0) {
        throw new IllegalArgumentException("Invalid input value");
    }
    while (N > 1) {
        if (N % 3 != 0) {
        return false;
        }
    N /= 3;
    }
    return true;
}

public static void main(String[] args) {
            // Виклики функцій
            System.out.println("Завдання 1: " + task1Int(15, 3));
            System.out.println("Завдання 2: " + task2Bool(5, 2));
            System.out.println("Завдання 3: " + task3If(3, -7, 10));
            System.out.println("Завдання 4: " + task4Case(7));

            System.out.println("Завдання 5:" + Arrays.toString(task5For(5.5)));
            System.out.println("Завдання 6: " + task6While(27));
    }
}

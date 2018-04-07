package by.it.Romanenko.lesson02;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод:
34 26

Вывод:
Sum = 26
*/
class TaskC1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1;
        int b = 1;
        int sum = 0;
        System.out.println("Ввод:");
        if (sc.hasNextInt()) {
            a = sc.nextInt();
            b = sc.nextInt();
            sum = a+b;
            System.out.println("Вывод:");
            System.out.println("Sum = " + sum);
        } else {
            System.out.println("Вы ввели не целое число");
        }
    }




}

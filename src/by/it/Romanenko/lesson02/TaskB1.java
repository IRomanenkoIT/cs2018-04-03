package by.it.Romanenko.lesson02;

/*
Выводим квадрат числа
Напишите программу, которая считывает с клавиатуры целое число a и выводит квадрат этого числа (a * a).
Для считывания данных с клавиатуры используйте метод nextInt() объекта класса Scanner.

Создать Scanner можно так:
Scanner sc=new Scanner(System.in);

Требования:
1. Программа должна выводить текст.
2. В программе необходимо создать объект типа Scanner.
3. Программа должна считывать число типа Int с клавиатуры.
4. Программа должна выводить квадрат считанного числа.

 */

import java.util.Scanner;

class TaskB1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1;
        System.out.print("Введите целое число: ");
        if (sc.hasNextInt()) {
            a = sc.nextInt();
            a = a*a;
            System.out.println(a);
        } else {
            System.out.println("Вы ввели не целое число");
        }
    }
}

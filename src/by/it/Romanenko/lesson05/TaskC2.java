package by.it.Romanenko.lesson05;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TaskC2 {
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);


        for (int x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(int[] array)
    {
        int temp;
        for (int i = 0; i < array.length; i++){
//            System.out.println("******************");
//            System.out.println("i = " + i);
//            System.out.println("******************");
            for (int k = 0; k < array.length - i - 1; k++){
//                System.out.println("k = " + k);
                if (array[k] < array[k + 1]){
                    temp = array[k + 1];
                    array[k + 1] = array[k];
                    array[k] = temp;

                }
            }
        }
    }
}

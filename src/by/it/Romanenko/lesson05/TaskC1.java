package by.it.Romanenko.lesson05;
/*
Три массива
1.  Введите с клавиатуры 20 чисел, сохраните их в список и рассортируйте по трём другим спискам:
    Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
    Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2.  Статический метод void printList(List<Integer> list) должен выводить на экран
    все элементы переданного ему списка list, каждый элемент - с новой строки.
3.  Используя метод printList выведите ваши три списка на экран.
    Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TaskC1 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> l3=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();
        ArrayList<Integer> l4=new ArrayList<>();
        for (int i=0;i<20;i++)
            list.add(Integer.parseInt(reader.readLine()));
        for (int i=0;i<20;i++)
            if (list.get(i)%2==0)
                l2.add(list.get(i));
        for (int i=0;i<20;i++)
            if (list.get(i)%3==0)
                l3.add(list.get(i));
        for (int i=0;i<20;i++)
            if ((list.get(i)%3!=0)&(list.get(i)%2!=0))
                l4.add(list.get(i));
        printList(l3);
        printList(l2);
        printList(l4);
    }
    public static void printList(List<Integer> list) {
        for (int i=0; i<list.size();i++)
            System.out.println(list.get(i));
    }


}

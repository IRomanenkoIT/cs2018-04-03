package by.it.Romanenko.lesson04;

/*
Напишите программу которая спрашивает у пользователя:
Какую вы хотите зарплату в $$$?

После ввода суммы, программа анализирует полученное значение
и если введенная цифра меньше 300 или больше 3000 программа выводит на экран:
Мы вам перезвоним!

Иначе выводит в цикле по переменной int month от 0 до 14 рассчитанную зарплату.
В летние месяцы - выводится введенная сумма с названием месяца.
В несуществующие месяцы 0, 13 и 14 выводится сумма в $0.0
в остальные месяцы выводится указанная сумма с премией в 50%.

Сделайте так, чтобы в тот месяц, когда получилась зарплата в $666 цикл после вывода прерывался.

Пример работы программы (у вас должно быть так же, до символа):

Какую вы хотите зарплату в $$$?
2000
За месяц 0 начислено $0.0
За январь начислено $3000.0
За февраль начислено $3000.0
За март начислено $3000.0
За апрель начислено $3000.0
За май начислено $3000.0
За июнь начислено $2000.0
За июль начислено $2000.0
За август начислено $2000.0
За сентябрь начислено $3000.0
За октябрь начислено $3000.0
За ноябрь начислено $3000.0
За декабрь начислено $3000.0
За месяц 13 начислено $0.0
За месяц 14 начислено $0.0

*/


import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) {
        System.out.println("Какую вы хотите зарплату в $$$");
        Scanner scanner=new Scanner(System.in);
        double zzz=scanner.nextInt();
        double rez=0;
        if (zzz<300 || zzz>3000)
            System.out.println("Мы вам перезвоним!");
        else
        for (int month = 0; month <= 14; month++) {
            String strMonth;
            if (month<6 || month>8) rez=zzz*1.5; else rez=zzz;
            switch (month) {
                case 1: strMonth="январь"; break;
                case 2: strMonth="февраль"; break;
                case 3: strMonth="март"; break;
                case 4: strMonth="апрель"; break;
                case 5: strMonth="май"; break;
                case 6: strMonth="июнь"; break;
                case 7: strMonth="июль"; break;
                case 8: strMonth="август"; break;
                case 9: strMonth="сентябрь"; break;
                case 10: strMonth="октябрь"; break;
                case 11: strMonth="ноябрь"; break;
                case 12: strMonth="декабрь"; break;
                default: {strMonth="месяц "+month; rez=0;}
            }


            System.out.println("За "+strMonth+" начислено $"+rez);
            if (rez==666) break;

        }


    }

}

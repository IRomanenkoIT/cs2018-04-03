package by.it.Romanenko.lesson04;

/*
Вывести таблицу умножения 10 x 10 (двоныйм циклом),
но вывод должен быть словами:

Ожидаемый вывод:
два умножить на два равно четыре
два умножить на три равно шесть
два умножить на четыре равно восемь
два умножить на пять равно десять
два умножить на шесть равно двенадцать
два умножить на семь равно четырнадцать
два умножить на восемь равно шестнадцать
два умножить на девять равно восемнадцать
два умножить на десять равно двадцать
три умножить на два равно шесть
три умножить на три равно девять
три умножить на четыре равно двенадцать
...
и т.д. до фразы
...
десять умножить на десять равно сто
*/

public class TaskC3 {
    public static void main(String[] args) {
        String digits[] = {"ноль","один","два","три","четыре","пять","шесть","семь","восемь","девять","десять"};
        String dozens[] = {"ноль","десять","двадцать","тридцать","сорок","пятьдесят","шестьдесят","семьдесят","восемьдесят","девяносто","сто","ноль2"};
        String secondDozen[] = {"ноль","одинадцать","двенадцать","тринадцать","четырнадцать","пятнадцать","шестнадцать","семнадцать","восемнадцать","девятнадцать","ноль2"};

        int result;
        String digit1, digit2, resultInWords;

        for (int i = 2; i<=10; i++) {
            for (int j = 1; j<=10; j++) {
                result = i * j;
                digit1 = digits[i];
                digit2 = digits[j];

                if (result < 10) {
                    resultInWords = digits[result];
                    System.out.println(digit1+" умножить на " + digit2 + " равно " + resultInWords);
                }
                else if (result%10 > 0 && result < 20) {
                    resultInWords = secondDozen [result%10];
                    System.out.println(digit1+" умножить на " + digit2 + " равно " + resultInWords);
                }
                else if (result%10 == 0) {
                    resultInWords = dozens [result / 10];
                    System.out.println(digit1+" умножить на " + digit2 + " равно " + resultInWords);
                }
                else if (result%10 > 0 && result > 20) {
                    resultInWords = dozens [result/10] + " " + digits[result%10];
                    System.out.println(digit1+" умножить на " + digit2 + " равно " + resultInWords);
                }
                else if (result == 100) {
                    resultInWords = dozens [result%10] + " " + digits[result/10];
                    System.out.println(digit1+" умножить на " + digit2 + " равно " + resultInWords);
                }
            }
        }
    }

}

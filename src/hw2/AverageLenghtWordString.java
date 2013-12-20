package hw2;

import java.util.StringTokenizer;

/**
 * Created with IntelliJ IDEA.
 * User: Пономаренко
 * Date: 20.12.13
 * Time: 12:39
 * Decision: Дана строка. Найти среднюю длину слова в строке.
 */
public class AverageLenghtWordString {

    public static void main(String[] args)
    {
        String str = "Тестовая строка для задания номер два";

        StringTokenizer st = new StringTokenizer(str, " \t\n\r,.");

        int i = 0;
        int averageLenght = 0;

        while(st.hasMoreTokens()){

            i++;
            String tmp = st.nextToken();
            averageLenght = averageLenght + tmp.length();
            System.out.println("Текущее слово "+tmp);

        }
        System.out.println("Средняя длина слова равна " +(averageLenght/i));

    }
}

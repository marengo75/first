package hw1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 * User: Поономаренко
 * Date: 20.12.13
 * Time: 12:04
 * Decision: Написать программу для вычисления y=((a-b)*2+c)/(a-b). a,b,c вводятся с консоли.
 */
public class Raschet
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if ((a - b) == 0)
        {
            System.out.println("При значении переменной a = "+a+", и переменной b = "+b+" - рассчитать выражение не возможно (деление на ноль)");
        }
        else
        {
            a = a - b;
            int y = (a*2 + c)/a;
            System.out.println("Результат вычисления y=((a-b)*2+c)/(a-b) равен "+y);
        }
    }



}

package hw3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Пономаренко
 * Date: 20.12.13
 * Time: 14:20
 * Decision: Дан текстовый файл. Найти во сколько раз самая длинная строка больше самой короткой
 */
public class MaxStringMinString
{


    public static void main(String[] args) throws IOException

    {
        ArrayList<String> list = new ArrayList<String>();

        File fd = new File("C:\\Users\\Пользователь\\IdeaProjects\\test\\src\\hw3\\BugReport.txt");

        System.out.println("> Content of file " + fd.getName());

        Scanner fw = new Scanner(fd);
        while(fw.hasNextLine())
        {
            list.add(fw.nextLine());
        }
        fw.close();

        int maxStr = 0;
        int minStr = 0;
        int flag = 0;

        for (int i=0; i<list.size(); i++)
        {
            if (list.get(i).length() != 0)
            {
                if (flag == 0)
                {
                    maxStr = list.get(i).length();
                    minStr = list.get(i).length();
                    flag = 1;
                }
                else
                {
                    if ( maxStr < list.get(i).length())
                        maxStr = list.get(i).length();
                    if ( minStr > list.get(i).length())
                       minStr = list.get(i).length();
                }

            }
        }

        float result = (float) maxStr/minStr;
        System.out.println("Максимальная строка в файле равна "+maxStr);
        System.out.println("Минимальная строка в файле равна "+minStr);
        System.out.println("Максимальная строка больше минимальной в "+result+" раз(а)");
    }

}

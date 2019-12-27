package Lab12;

import java.util.regex.*;
import java.util.*;

public class Test {

    public static void main(String[] args)
    {
       /* Scanner in = new Scanner(System.in);
        System.out.print("Введите адрес электронной почты: ");
        String str = in.nextLine();

        Pattern p1 = Pattern.compile("(\\w+)@(\\w+)(\\.?)(\\w*)");
        Matcher m1 = p1.matcher( str );
        if(m1.matches())
        {
            System.out.println("Адрес электронной почты корректен.");
        }
        else
        {
            System.out.println("Адрес электронной почты некорректен.");
        }
*/
      /*  Scanner in = new Scanner(System.in);
        System.out.print("Введите текст со списками цен: ");
        String str = in.nextLine();
        myMatches("\\d+(\\.\\d+)? USD", str);
        myMatches("\\d+(\\.\\d+)? RUB", str);
        myMatches("\\d+(\\.\\d+)? EU", str);*/

        Scanner in = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        String str = in.nextLine();
        isPlusAfterNumber(str);
    }

    public static void myMatches(String regex, String input)
    {
        Pattern p1 = Pattern.compile(regex);
        Matcher m1 = p1.matcher(input);
        while (m1.find())
        {
            System.out.println("соответсвие: " + m1.group());
        }
    }

    public static void isPlusAfterNumber(String input)
    {
        Pattern p1 = Pattern.compile("\\d+(.\\d+)? \\+");
        Matcher m1 = p1.matcher(input);
        if(m1.find())
        {
            System.out.println("Плюс после чисел есть.");
        }
        else
        {
            System.out.println("Плюса после чисел нет.");
        }
    }
}

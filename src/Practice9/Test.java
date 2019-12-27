package Practice9;
import java.util.Scanner;

public class Test {
    public static void main(String[] args)
    {
        System.out.println("Введите данные для оформления заказа:");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ФИО");
        String fio = in.nextLine();
        if(fio.contains(" "))
        {
            System.out.println("Введите ИНН");
            String inn = in.nextLine();
            try
            {
                isCorrectINN(inn);
                System.out.println("Заказ оформлен верно.");
            }
            catch(INNN e)
            {
                System.out.println(e.getMessage());
            }
        }
        else
        {
            System.out.println("Неверное ФИО");
        }

        Comparable[] list1 = {new Student("Алексей", 18, 4, "1235432"), new Student("Дмитрий", 20,5, "7562345"),
                new Student("Павел", 21,12, "gergewgr"), new Student("Иван", 23, 13, "t245t2t"),
                new Student("Ирина", 19,14, "432234"), new Student("Том", 22,15, "5342535"),
                new Student("Ольга", 18,6, "whgrthhtr"), new Student("Руслан", 20,2, "4352345"),
                new Student("Боб",23,20, "9856876"), new Student("Артём", 20,3, "74567567")};

        for(int i = 0; i < list1.length; i++)
        {
            try
            {
                Student.isCorrectINNOfStudent((Student) list1[i]);
            }
            catch (INNN e)
            {
                System.out.println("Студент " + ((Student)list1[i]).getName() + " неверно оформлен в базе: " + e.getMessage());
            }
        }
    }
    static void isCorrectINN(String inn) throws INNN
    {
        for(int i = 0; i < inn.length(); i++)
        {
            if((int)inn.charAt(i) < 48 || (int)inn.charAt(i) > 57)
            {
                throw new INNN("Неверный инн, инн состоит лишь из цифр.");
            }
        }
    }
}

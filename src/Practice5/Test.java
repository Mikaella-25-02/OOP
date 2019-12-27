package Practice5;

public class Test {
    public static void main(String[] args)
    {
        System.out.println("Числа от 1 до n:");
        printAllNumbers(10);

        System.out.println("Числа от A до B:");
        printNumbersA_to_B(20,15);

        System.out.println("Количество чисел заданной k-значности с суммой цифр = d:");
        getSumCount(2,7);

        System.out.println("Сумма цифр числа:");
        System.out.println(getCountInNumber(517302));

    }
    private static void printAllNumbers(int n)
    {
        if(n > 1)
        {
            printAllNumbers(n - 1);
            System.out.println(n);
        }
        else
            System.out.println(1);

    }
    private static void printNumbersA_to_B(int a, int b)
    {
        if(a < b)
        {
            System.out.println(a);
            printNumbersA_to_B(a + 1, b);
        }
        else if(a == b)
        {
            System.out.println(b);
        }
        else if(b < a)
        {
            System.out.println(a);
            printNumbersA_to_B(a - 1, b);
        }
    }


    private static void getSumCount(int k, int d)
    {
        System.out.println(getCount(0, 0, k, d));
    }

    private static int getCount (int length, int sum,  int k,  int s)
    {
        if(length == k)
        {
            if (sum == s)
                return 1;
            else
                return 0;
        }

        int c = (length == 0 ? 1 : 0);

        int sumOfNumbers  = 0;
        for(int i = c; i < 10; i++)
        {
            sumOfNumbers  += getCount(length + 1, sum + i, k, s);
        }

        return sumOfNumbers ;
    }


    private static int getCountInNumber(int n)
    {
        int s = n % 10;
        n /= 10;
        if(n > 0)
            s += getCountInNumber(n);
        return s;
    }
}
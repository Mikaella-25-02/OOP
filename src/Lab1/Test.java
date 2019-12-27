package Lab1;

public class Test
{

    public static void main(String[] args)
    {
        int[] mas = new int[15];
        System.out.println("Неотсортированный массив: ");
        for(int i = 0; i < mas.length;i++)
        {
            mas[i] = (int)(Math.random() * 100);
            System.out.print(mas[i] + " ");
        }
        System.out.println("\r\nОтсортированный массив: ");
        int temp;
        for(int i = 0; i < mas.length;i++)
        {
            for(int j = 0;j < mas.length - i - 1;j++)
            {
                if(mas[j] > mas[j + 1])
                {
                    temp = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = temp;
                }
            }
        }
        for(int i = 0; i < mas.length;i++)
        {
            System.out.print(mas[i] + " ");
        }
    }
}

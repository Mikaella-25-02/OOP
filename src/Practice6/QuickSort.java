package Practice6;

import java.util.Comparator;

public class QuickSort
{
    private Student[] list = {new Student("Алексей", 18, 4), new Student("Дмитрий", 20,5),
            new Student("Павел", 21,12), new Student("Иван", 23, 13),
            new Student("Ирина", 19,14), new Student("Варвара", 22,15),
            new Student("Ольга", 18,6), new Student("Аркадий", 20,7),
            new Student("Боб",23,20), new Student("Артём", 21,9)};

    public QuickSort(){}
    public void quickSort(Comparator c)
    {
        sort(c,0,list.length - 1);
        for(int i = 0; i < list.length; i++)
        {
            System.out.println(((Student)list[i]).getName() + " возраст:" + ((Student)list[i]).getAge() + " баллы:" + ((Student)list[i]).getPoint());
        }
    }
    public void sort(Comparator c, int low, int high)
    {
        if (list.length == 0)
            return;

        if (low >= high)
            return;

        int middle = low + (high - low) / 2;
        Student opora = list[middle];

        int i = low, j = high;
        while (i <= j) {
            while (c.compare(list[i],opora) == -1) {
                i++;
            }

            while (c.compare(list[j], opora) > 0) {
                j--;
            }

            if (i <= j) {
                Student temp = list[i];
                list[i] = list[j];
                list[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            sort(c, low, j);

        if (high > i)
            sort(c, i, high);
    }
}

package Practice6;

import java.util.Arrays;

public class MergerSort
{
    private Comparable[] list1 = {new Student("Алексей", 18, 14), new Student("Дмитрий", 20,5),
            new Student("Павел", 21,12), new Student("Иван", 23, 13),
            new Student("Ирина", 19,14), new Student("Варвара", 22,15),
            new Student("Ольга", 18,6), new Student("Аркадий", 20,7),
            new Student("Боб",23,20), new Student("Артём", 21,9)};
    private Comparable[] list2 = {new Student("Павел", 20, 2), new Student("Варвара", 21,9),
            new Student("Радион", 22,13), new Student("Боб", 21, 19),
            new Student("Алиса", 20,11), new Student("Анатолий", 19,10)};

    public MergerSort(){}

    public void sort()
    {
        Comparable[] list = new Comparable[list1.length + list2.length];
        for(int i = 0; i < list.length; i++)
        {
            if(i < list1.length)
            {
                list[i] = list1[i];
            }
            else
                list[i] = list2[i - 10];
        }
        sortUnsorted(list, 0, list.length - 1);

        for(int count = 0; count < list.length; count++)
        {
            System.out.println(((Student)list[count]).getName() + " возраст:" + ((Student)list[count]).getAge() + " баллы:" + ((Student)list[count]).getPoint());
        }
    }
    private void sortUnsorted(Comparable[] a, int lo, int hi) {

        if (hi <= lo)
            return;
        int mid = lo + (hi - lo) / 2;
        sortUnsorted(a, lo, mid);
        sortUnsorted(a, mid + 1, hi);

        Comparable[] buf = Arrays.copyOf(a, a.length);

        for (int k = lo; k <= hi; k++)
            buf[k] = a[k];

        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {

            if (i > mid) {
                a[k] = buf[j];
                j++;
            } else if (j > hi) {
                a[k] = buf[i];
                i++;
            } else if (buf[j].compareTo(buf[i]) < 0) {
                a[k] = buf[j];
                j++;
            } else {
                a[k] = buf[i];
                i++;
            }
        }
    }
}

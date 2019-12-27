package Practice6;

public class TestStudentSort
{
    private Comparable[] list = {new Student("Алексей", 18), new Student("Дмитрий", 20),
            new Student("Павел", 21), new Student("Иван", 23),
            new Student("Ирина", 19), new Student("Варвара", 22),
            new Student("Ольга", 18), new Student("Аркадий", 20),
            new Student("Боб",23), new Student("Артём", 21)};

    public TestStudentSort(){}

    public void sort()
    {
        int min;
        Comparable temp;

        for (int index = 0; index < list.length-1; index++)
        {
            min = index;
            for (int scan = index+1; scan < list.length; scan++)
                if (list[scan].compareTo(list[min]) < 0)
                    min = scan;
            temp = list[min];
            list[min] = list[index];
            list[index] = temp;
        }

        for(int i = 0; i < list.length; i++)
        {
            System.out.println(((Student)list[i]).getName() + " " + ((Student)list[i]).getAge());
        }
    }
}

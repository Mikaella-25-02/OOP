package Practice6;

public class Test {
    public static void main(String[] args)
    {
        System.out.println("Задание 1:");
        TestStudentSort test = new TestStudentSort();
        test.sort();

        System.out.println("Задание 2:");
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(new SortingStudentsByGPA());

        System.out.println("Задание 3:");
        MergerSort mergerSort = new MergerSort();
        mergerSort.sort();
    }
}

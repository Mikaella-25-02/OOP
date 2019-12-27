package Practice6;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator
{

    public int compare(Object o, Object t1)
    {
        Student first = (Student)o;
        Student second = (Student)t1;
        if (first.getPoint() > second.getPoint())
            return -1;
        else if(first.getPoint() == second.getPoint())
            return 0;
        else return 1;
    }
}

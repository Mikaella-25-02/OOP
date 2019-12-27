package Practice6;

public class Student implements Comparable
{
    private String name;
    private int age;
    private int point;

    public Student(String name, int age)
    {
        this.name = name;
        this.age = age;
        this.point = 0;
    }

    public Student(String name, int age, int point)
    {
        this.name = name;
        this.age = age;
        this.point = point;
    }

    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public int getPoint()
    {
        return point;
    }


    public int compareTo(Object o)
    {
        Student second = (Student)o;
        return  this.name.compareTo(second.getName());
    }
}
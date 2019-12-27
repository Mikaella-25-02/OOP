package Practice9;

public class Student implements Comparable
{
    private String name;
    private int age;
    private int point;
    private String inn;

    public Student(String name, int age, String inn)
    {
        this.name = name;
        this.age = age;
        this.inn = inn;
        this.point = 0;
    }

    public Student(String name, int age, int point, String inn)
    {
        this.name = name;
        this.age = age;
        this.point = point;
        this.inn = inn;
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
    public String getINN(){ return inn; }

    public int compareTo(Object o)
    {
        Student second = (Student)o;
        return  this.name.compareTo(second.getName());
    }
    static void isCorrectINNOfStudent(Student student) throws INNN
    {
        for(int i = 0; i < student.getINN().length(); i++)
        {
            if((int)student.getINN().charAt(i) < 48 || (int)student.getINN().charAt(i) > 57)
            {
                throw new INNN("Неверный инн, инн состоит лишь из цифр.");
            }
        }
    }
}
package Practice1;

public class Dog
{
    private int Age;
    private String Name;
    private String Host;

    public Dog(int age, String name, String host) throws Exception
    {
        if(age < 0 || age > 20)
            throw new Exception("Age of dog is invalid");
        Age = age;
        Name = name;
        Host = host;
    }

    public int GetAge()
    {
        return Age;
    }
    public String GetName()
    {
        return Name;
    }
    public String GetHost()
    {
        return Host;
    }
    public void SetAge(int age) throws Exception
    {
        if(age < 0 || age > 20)
            throw new Exception("Age of dog is invalid");
        Age = age;
    }
    public void SetName(String name)
    {
        Name = name;
    }
    public void SetHost(String host)
    {
        Host = host;
    }

    public String toString()
    {
        return "Собака " + Name + "\r\nВозраст " + Age + "\r\nХозяин " + Host;
    }
}

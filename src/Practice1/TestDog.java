package Practice1;

public class TestDog
{
    public static void main(String[] args)
    {
        try
        {
            Dog dog = new Dog(7,"Sharik","Victor");
            System.out.println(dog);
            System.out.println("Возраст и имя собаки: " + dog.GetName() + "; " + dog.GetAge());
            System.out.println();
            dog.SetAge(15);
            System.out.println("Другой возраст: " + dog.GetAge());
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }

    }
}


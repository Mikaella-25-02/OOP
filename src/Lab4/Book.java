package Lab4;

public class Book implements Nameable {

    private String Name;
    private int Price;
    public Book(String name, int price)
    {
        Name = name;
        Price = price;
    }

    public String GetName() {
        return Name;
    }
}
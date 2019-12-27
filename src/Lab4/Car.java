package Lab4;

public class Car implements Nameable {

    private String Name;
    private int Price;
    public Car(String name, int price)
    {
        Name = name;
        Price = price;
    }

    public String GetName() {
        return Name;
    }
}
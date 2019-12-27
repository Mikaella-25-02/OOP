package Lab3;

public class Plate extends Dish
{
    private double Size;
    public Plate(double size, int price)
    {
        super(price);
        Size = size;
    }
    public double GetSize()
    {
        return Size;
    }
    public void SetSize(double size)
    {
        Size = size;
    }

    public void WashDish()
    {
        System.out.println("Тарелка вымыта");
    }
}

package Lab3;

public class Cup extends Dish
{
    private double Volume;
    public Cup(double volume, int price)
    {
        super(price);
        Volume = volume;
    }
    public double GetVolume()
    {
        return Volume;
    }
    public void SetVolume(double value)
    {
        Volume = value;
    }
    public void WashDish()
    {
        System.out.println("Чаша вымыта");
    }
}

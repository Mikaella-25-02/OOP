package Lab3;

public abstract class Dish
{
    private int Price;
    public Dish(int price)
    {
        Price = price;
    }
    public int GetPrice()
    {
        return Price;
    }
    public void SetPrice(int value)
    {
        Price = value;
    }
    public abstract void WashDish();
}
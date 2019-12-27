package Lab2;

public class Circle
{
    private double Radius;
    private double X;
    private double Y;
    public Circle(double radius,double x, double y)
    {
        Radius = radius;
        X = x;
        Y = y;
    }
    public double GetRadius()
    {
        return Radius;
    }
    public void SetRadius(double value)
    {
        Radius = value;
    }
    public double GetX()
    {
        return X;
    }
    public void SetX(double value)
    {
        X = value;
    }
    public double GetY()
    {
        return Y;
    }
    public void SetY(double value)
    {
        Y = value;
    }
    public double GetArea()
    {
        return Math.PI * Radius * Radius;
    }
}
package Lab2;

public class TestCircle
{
    public static void main(String[] args)
    {
        Circle circle = new Circle(4,3,2);
        System.out.println("Радиус: " + circle.GetRadius());
        System.out.println("Координата Х: " + circle.GetX());
        System.out.println("Координата Y: " + circle.GetY());

        circle.SetRadius(15);
        System.out.println("Новый радиус: " + circle.GetRadius());
        System.out.println("Площадь " + circle.GetArea());
    }
}

package Practice3;

public class TestMovable {

    public static void main(String[] args)
    {
        System.out.println("Точка: ");
        MovablePoint point = new MovablePoint(2,2,5,10);
        System.out.println("Координаты точки " + point);
        point.moveRight();
        point.MoveDown();
        System.out.println("Новые координаты точки " + point);

        System.out.println("Круг: ");
        MovableCircle circle = new MovableCircle(7,6,2,10,5);
        System.out.println("Координаты круга " + circle);
        circle.MoveLeft();
        circle.MoveUp();
        System.out.println("Новые координаты круга " + circle);
    }

}

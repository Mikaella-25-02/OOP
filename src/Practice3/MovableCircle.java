package Practice3;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int radius, int x, int y, int speedX, int speedY)
    {
        this.radius = radius;
        this.center = new MovablePoint(x,y,speedX,speedY);
    }

    public String toString(){
        return "Center " + center + "\r\nRadius " + radius;
    }

    public void MoveUp() {
        center.MoveUp();
    }

    public void MoveDown() {
        center.MoveDown();
    }

    public void MoveLeft() {
        center.MoveLeft();
    }

    public void moveRight() {
        center.moveRight();
    }
}

package Practice3;

public class MovablePoint implements Movable {
    public int x;
    public int y;

    public int speedX;
    public int speedY;

    public MovablePoint(int x, int y, int speedX, int speedY){
        this.x = x;
        this.y = y;
        this.speedX = speedX;
        this.speedY = speedY;
    }

    public String toString(){
        return x + ". " + y;
    }

    public void MoveUp() {
        y += speedY;
    }

    public void MoveDown() {
        y -= speedY;
    }

    public void MoveLeft() {
        x -= speedX;
    }

    public void moveRight() {
        x += speedX;
    }

}

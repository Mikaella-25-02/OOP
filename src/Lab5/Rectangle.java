package Lab5;

import java.awt.*;

public class Rectangle extends Shape
{
    public Rectangle(Color color, int x, int y)
    {
        super(color, x, y);
    }

    public void paint(Graphics g){
        g.setColor(getColor());
        g.fillRect(getX(), getY(), 30 + (int) (Math.random() * 50), 30 + (int) (Math.random() * 50));
    }
}

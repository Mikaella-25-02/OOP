package Lab5;

import java.awt.*;

public class Circle extends Shape
{
    public Circle(Color color, int x, int y)
    {
        super(color, x, y);
    }

    public void paint(Graphics g){
        g.setColor(getColor());
        g.fillOval(getX(), getY(), 30 + (int) (Math.random() * 50), 30 + (int) (Math.random() * 50));
    }
}
package Lab5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public abstract class Shape
{
    private Color color;
    private int x;
    private int y;

    Shape(Color color, int x, int y)
    {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    void setColor(Color color)
    {
        this.color = color;
    }
    public Color getColor()
    {
        return this.color;
    }

    void setX(int x)
    {
        this.x = x;
    }
    public int getX()
    {
        return this.x;
    }

    void setY(int y)
    {
        this.y = y;
    }
    public int getY()
    {
        return this.y;
    }
    public abstract void paint(Graphics g);
}
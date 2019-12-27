package Lab5;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

class MultiColoredFigures extends JFrame {
    Shape[] shapes = new Shape[20];

    MultiColoredFigures() {
        super("Window");
        this.setLayout(new FlowLayout());
        this.setSize(1000, 1000);
        this.setVisible(true);
    }

    public void arrayFilling() {
        for (int i = 0; i < 20; i++)
        {
            Random rand = new Random();
            int rnd = 1 + (int)(Math.random() * 2);
            float red = rand.nextFloat();
            float green = rand.nextFloat();
            float blue = rand.nextFloat();
            int x = 50 + rand.nextInt(800);
            int y = 50 + rand.nextInt(800);
            Color randomColor = new Color(red, green, blue);
            switch (rnd) {
                case 1:
                    shapes[i] = new Circle(randomColor, x, y);
                    break;
                case 2:
                    shapes[i] = new Rectangle(randomColor, x, y);
                    break;
            }
        }
    }

    public void paint(Graphics g)
    {
        arrayFilling();
        for (Shape s : shapes) {
            s.paint(g);
        }
    }
}

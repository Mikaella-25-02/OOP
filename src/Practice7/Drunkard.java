package Practice7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayDeque;
import java.util.Deque;

public class Drunkard extends JFrame
{
    public JTextField jta1 = new JTextField(10);
    public JTextField jta2 = new JTextField(10);
    Font fnt = new Font("Times new roman",Font.BOLD,20);
    JButton but = new JButton("Ввести карты");

    Drunkard()
    {
        super("Example");
        setLayout(new FlowLayout());
        setSize(250,200);
        add(jta1);
        jta1.setForeground(Color.PINK);
        jta1.setFont(fnt);

        add(jta2);
        jta2.setForeground(Color.PINK);
        jta2.setFont(fnt);

        add(but);
        but.setMinimumSize(new Dimension(120,60));
        setVisible(true);
        but.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(jta1.getText().length() == 9 && jta2.getText().length() == 9)
                {
                    ArrayDeque<Integer> mas1 = new ArrayDeque<Integer>(10);
                    ArrayDeque<Integer> mas2 = new ArrayDeque<Integer>(10);

                    String[] strMas1 = jta1.getText().split(" ");
                    String[] strMas2 = jta2.getText().split(" ");

                    int sum = 0;
                    for(int i = 0; i < 5; i++)
                    {
                        sum += Integer.parseInt(strMas1[i]);
                        mas1.add(Integer.parseInt(strMas1[i]));
                        if(Integer.parseInt(strMas1[i]) < 0 || Integer.parseInt(strMas1[i]) > 9)
                        {
                            JOptionPane.showMessageDialog(null,"Числа должны быть от 0 до 9");
                            return;
                        }
                    }
                    for(int i = 0; i < 5; i++)
                    {
                        sum += Integer.parseInt(strMas2[i]);
                        mas2.add(Integer.parseInt(strMas2[i]));
                        if(Integer.parseInt(strMas2[i]) < 0 || Integer.parseInt(strMas2[i]) > 9)
                        {
                            JOptionPane.showMessageDialog(null,"Числа должны быть от 0 до 9");
                            return;
                        }
                    }
                    if (sum != 45)
                    {
                        JOptionPane.showMessageDialog(null,"Карты должны быть различны");
                        return;
                    }
                    int count = 0;
                    while(mas1.size() != 0 && mas1.size() != 10)
                    {
                        if(count >= 106)
                        {
                            JOptionPane.showMessageDialog(null,"botva");
                            return;
                        }
                        int a,b;
                        a = mas1.pollFirst();
                        b = mas2.pollFirst();

                        if((a > b && !(b == 0 && a == 9)) || (b ==9 && a == 0))
                        {
                            mas1.add(a);
                            mas1.add(b);
                        }
                        else
                        {
                            mas2.add(a);
                            mas2.add(b);
                        }
                        count++;
                    }
                    if(mas1.isEmpty())
                    {
                        JOptionPane.showMessageDialog(null,"Второй игрок выиграл за " + count + " итерацию игры");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Первый игрок выиграл за " + count + " итерацию игры");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Данные введены неверно");
                }


            }
        });
    }

}




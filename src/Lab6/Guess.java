package Lab6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Guess extends JFrame
{
    JTextField jta = new JTextField (10);
    JButton but = new JButton();
    int i;
    int count = 2;
    JPanel[] pnl = new JPanel[8];
    public Guess()
    {
        super("Form");

        setLayout(new GridLayout(2,4));
        but.setSize(100,40);
        i = (int)(Math.random() * 21);
        setSize(500,200);
        setMinimumSize(new Dimension(500,200));
        but.setText("Ввести число");
        but.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(isDigit(jta.getText()))
                {
                    int number = Integer.parseInt(jta.getText());
                    if(number == i)
                    {
                        JOptionPane.showMessageDialog(null, "Число указано верно! \n\r Закрытие программы.");
                        System.exit(0);
                    }
                    else
                    {
                        if(count > 0)
                        {
                            if(number > i)
                                JOptionPane.showMessageDialog(null, "Число указано неверно! Правильное число меньше");
                            else JOptionPane.showMessageDialog(null, "Число указано неверно! Правильное число больше");
                            count--;
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Число указано неверно!\n\r" +
                                    " Верное число - " + i + "\r\n" +
                                    " Закрытие программы.");
                            System.exit(0);
                        }
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Введено не число");
                }
            }
        });
        for(int i = 0 ; i < pnl.length ; i++)
        {
            pnl[i] = new JPanel();
            pnl[i].setBackground(Color.WHITE);
            add(pnl[i]);
        }

        pnl[5].add(jta);
        pnl[6].add(but);
        setVisible(true);
    }
    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DeleteWindow extends JFrame
{
    OrderManager manager;

    JLabel label1 = new JLabel("Введите адрес заказа");
    JTextField jta1 = new JTextField(15);
    Font fnt = new Font("Times new roman",Font.BOLD,20);
    JButton remove = new JButton("Удалить заказ по адресу");
    DeleteWindow(OrderManager manager)
    {
        super("Example");
        this.manager = manager;
        setLayout(new FlowLayout());
        setSize(300, 250);
        add(label1);
        add(jta1);
        jta1.setForeground(Color.BLACK);
        jta1.setFont(fnt);
        add(remove);

        remove.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try
                {
                    manager.removeOrder(jta1.getText());
                    JOptionPane.showMessageDialog(null, "Заказ по адресу " +  jta1.getText() + " удален");
                }
                catch (Exception ex)
                {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });
        setVisible(true);
    }
}

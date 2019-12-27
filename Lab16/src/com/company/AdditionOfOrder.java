package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AdditionOfOrder extends JFrame
{
    OrderManager manager;
    Orderable order;
    JLabel label1 = new JLabel("Цена        ");
    JLabel label2 = new JLabel("Название ");
    JLabel label3 = new JLabel("Описание ");
    JTextField jta1 = new JTextField(15);
    JTextField jta2 = new JTextField(15);
    JTextField jta3 = new JTextField(15);
    Font fnt = new Font("Times new roman",Font.BOLD,20);
    JButton addOrder = new JButton("Добавить предмет");
    JButton closeOrder = new JButton("Оформить заказ");
    AdditionOfOrder(OrderManager manager, boolean typeOfOrder)
    {
        super("Example");
        this.manager = manager;
        if(typeOfOrder)
        {
            order = new RestaurantOrder();
        }
        else
        {
            order = new InternetOrder();
        }
        setLayout(new FlowLayout());
        setSize(350,250);
        add(label1);
        add(jta1);
        jta1.setForeground(Color.BLACK);
        jta1.setFont(fnt);
        add(label2);
        add(jta2);
        jta2.setForeground(Color.BLACK);
        jta2.setFont(fnt);
        add(label3);
        add(jta3);
        jta3.setForeground(Color.BLACK);
        jta3.setFont(fnt);

        ButtonGroup group = new ButtonGroup();
        JRadioButton dish = new JRadioButton("Блюдо", false);
        group.add(dish);
        JRadioButton drink = new JRadioButton("Напиток", true);
        group.add(drink);
        add(dish);
        add((drink));

        addOrder.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                try
                {
                    int price = Integer.parseInt(jta1.getText());
                    Itemable item;
                    if(dish.isSelected())
                    {
                        item = new Dish(price, jta2.getText(), jta3.getText());
                    }
                    else
                    {
                        item = new Drink(price, jta2.getText(), jta3.getText());
                    }
                    order.add(item);
                }
                catch (Exception ex)
                {
                    JOptionPane.showMessageDialog(null,ex.getMessage());
                }
            }
        });
        closeOrder.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                try
                {
                    manager.add("" + manager.getCount(), order);
                    if(typeOfOrder)
                    {
                        order = new RestaurantOrder();
                    }
                    else
                    {
                        order = new InternetOrder();
                    }
                }
                catch (Exception ex)
                {
                    JOptionPane.showMessageDialog(null,ex.getMessage());
                }
            }
        });

        add(addOrder);
        add(closeOrder);
        setVisible(true);
    }
}

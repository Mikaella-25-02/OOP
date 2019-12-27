package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MainWindow extends JFrame
{
    OrderManager manager;
    JButton addBut = new JButton("Создать новый заказ");
    JButton remBut = new JButton("Удалить заказ");
    JButton showBut = new JButton("Показать все заказы");
    JButton intOrders = new JButton("Узнать количество всех заказов");
    JButton intOrdersRest = new JButton("Узнать количество интернет-заказов");
    JButton intOrdersInInternet = new JButton("Узнать количество заказов в ресторане");
    JButton showInf = new JButton("Узнать информацию о конкретном заказе");
    JTextArea textForInf = new JTextArea(1,8);


    JTextArea text = new JTextArea(20,30);
    JScrollPane jScroll = new JScrollPane(text);
    JPanel[] pnl = new JPanel[2];
    public MainWindow()
    {
        super("Окно программы");
        manager = new OrderManager();
        setSize(380,650);
        setLayout(new GridLayout(2,2));
        for(int i = 0 ; i < pnl.length ; i++)
        {
            pnl[i] = new JPanel();
            add(pnl[i]);
        }
        pnl[0].setLayout(new FlowLayout());
        pnl[0].add(jScroll);

        pnl[1].setLayout(new FlowLayout());
        pnl[1].add(addBut);
        pnl[1].add(remBut);



        ButtonGroup group = new ButtonGroup();
        JRadioButton restBut = new JRadioButton("Заказ в ресторане", false);
        group.add(restBut);
        JRadioButton intBut = new JRadioButton("Интернет-заказ", true);
        group.add(intBut);
        pnl[1].add(restBut);
        pnl[1].add((intBut));
        pnl[1].add(showBut);
        pnl[1].add(new JLabel("Введите адрес конкретного заказа"));
        pnl[1].add(textForInf);
        pnl[1].add(showInf);


        pnl[1].add(intOrders);
        pnl[1].add(intOrdersRest);
        pnl[1].add(intOrdersInInternet);

        addBut.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                AdditionOfOrder additionOfOrder;
                if(restBut.isSelected())
                {
                    additionOfOrder = new AdditionOfOrder(manager, true);
                }
                else
                {
                    additionOfOrder = new AdditionOfOrder(manager, false);
                }
            }
        });
        remBut.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                DeleteWindow deleteWindow = new DeleteWindow(manager);
            }
        });
        showBut.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                text.setText("");
                text.append(manager.toString());
            }
        });
        intOrders.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                JOptionPane.showMessageDialog(null, "Всего заказов в системе " + manager.getAllOrdersCount());
            }
        });
        intOrdersRest.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                JOptionPane.showMessageDialog(null, "Всего интернет-заказов в системе " + manager.getCountInIntOrders());
            }
        });
        intOrdersInInternet.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                JOptionPane.showMessageDialog(null, "Всего заказов в ресторане в системе " + (manager.getAllOrdersCount() - manager.getCountInIntOrders()));
            }
        });
        showInf.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                if(manager.getOrder(textForInf.getText()) != null)
                {
                    JOptionPane.showMessageDialog(null, manager.getOrder(textForInf.getText()).toString());
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Заказа с таким адресом нет");
                }
            }
        });
        this.setVisible(true);
    }
}

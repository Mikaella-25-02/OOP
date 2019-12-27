package com.company;

import java.lang.reflect.Array;
import java.util.LinkedList;

public class InternetOrder implements Orderable
{
    private LinkedList<Itemable> list;
    public InternetOrder()
    {
        this(null);
    }
    public InternetOrder(Itemable... items)
    {
        list = new LinkedList<>();
        if(items != null)
        {
            for(int i = 0; i < items.length; i++)
            {
                list.addLast(items[i]);
            }
        }
    }
    public Itemable getItem(int number)
    {
        return list.get(number);
    }
    public void add(Itemable newItem)
    {
        list.addLast(newItem);
    }
    public boolean remove(String title)
    {
        for(int i = list.size() - 1; i >= 0; i--)
        {
            if(list.get(i).getTitle() == title)
            {
                list.remove(i);
                return  true;
            }
        }
        return false;
    }
    public int removeSeveral(String title)
    {
        int count = 0;
        for(int i = 0; i < list.size(); i++)
        {
            if(list.get(i).getTitle() == title)
            {
                list.remove(i);
                count++;
            }
        }
        return  count;
    }
    public int getCountInOrder()
    {
        return list.size();
    }
    public Itemable[] getMas()
    {
        Itemable[] mas = new Itemable[list.size()];
        for(int i = 0; i < mas.length; i++)
        {
            mas[i] = list.get(i);
        }
        return  mas;
    }
    public int totalSum()
    {
        int sum = 0;
        for(int i = 0; i < list.size(); i++)
        {
            sum += list.get(i).getCost();
        }
        return  sum;
    }
    public int getCountInOrders(String title)
    {
        int count = 0;
        for(int i = 0; i < list.size(); i++)
        {
            if(list.get(i).getTitle() == title)
            {
                count++;
            }
        }
        return  count;
    }
    public String[] getTitles()
    {

        String[] tempMas = new String[list.size()];
        for (int i = 0; i < list.size(); i++)
        {
            boolean isAdd = true;
            for(int j = 0; j < i; j++)
            {
                if(tempMas[j] == list.get(i).getTitle())
                {
                    isAdd = false;
                    break;
                }
            }
            if(isAdd)
            {
                tempMas[i] = list.get(i).getTitle();
            }
        }
        int count = 0;
        for(int i = 0; i < tempMas.length; i++)
        {
            if(tempMas[i] != null)
            {
                count++;
            }
        }
        String[] mas = new String[count];
        for(int i = 0; i < count; i++)
        {
            mas[i] = tempMas[i];
        }
        return  mas;
    }
    public Itemable[] getOrdersInSortCost()
    {
        Itemable[] mas = new Itemable[list.size()];
        for(int i = 0; i < mas.length; i++)
        {
            mas[i] = list.get(i);
        }

        int maxPrice = 0;
        for(int i = 0; i < mas.length; i++)
        {
            for(int j = i; j < mas.length; j++)
            {
                if(mas[j].getCost() > maxPrice)
                {
                    maxPrice =  mas[j].getCost();
                    Itemable t = mas[i];
                    mas[i] = mas[j];
                    mas[j] = t;
                }
            }
            maxPrice = 0;
        }
        return  mas;
    }

    public String toString()
    {
        String str = "";
        for(int i = 0; i < list.size(); i++)
        {
            str += "   " + list.get(i).getTitle() + " ,цена - " + list.get(i).getCost();
            if(list.get(i).getDescription() != "")
            {
                str += " , описание - " + list.get(i).getDescription();
            }
            str += "\n";
        }
        return  str;
    }
}

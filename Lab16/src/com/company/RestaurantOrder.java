package com.company;

import java.util.HashMap;

public class RestaurantOrder implements Orderable
{
    private HashMap<Integer,Itemable> items;
    public RestaurantOrder(Itemable... items)
    {
        this.items = new HashMap<Integer,Itemable>();
        if(items != null)
        {
            for(int i = 0; i < items.length; i++)
            {
                this.items.put(i, items[i]);
            }
        }
    }
    public RestaurantOrder()
    {
        this(null);
    }
    public Itemable getItem(int id)
    {
        return items.get(id);
    }
    public void add(Itemable newItem)
    {
        items.put(items.size(), newItem);
    }
    public boolean remove(int id)
    {
        if(items.containsKey(id))
        {
            items.remove(id);
            return  true;
        }
        return  false;
    }
    public boolean remove(String title)
    {
        var setOfKeys = items.keySet();
        for (var t: setOfKeys)
        {
            if(items.containsKey(t))
            {
                items.remove(t);
                return  true;
            }
        }
        return  false;
    }
    public int size()
    {
        return  items.size();
    }

    public String toString()
    {
        String str = "";
        Object[] keys = items.keySet().toArray();
        for(int i = 0; i < keys.length; i++)
        {
            str += "   " + items.get(keys[i]).getTitle() + " ,цена - " + items.get(keys[i]).getCost();
            if(items.get(keys[i]).getDescription() != "")
            {
                str += " , описание - " + items.get(keys[i]).getDescription();
            }
            str += "\n";
        }
        return  str;
    }

    public int removeSeveral(String title)
    {
        int count = 0;
        var keys = items.keySet().toArray();
        for(int i = 0; i < keys.length; i++)
        {
            if(items.get(keys[i]).getTitle() == title)
            {
                items.remove(items.get(keys[i]));
                count++;
            }
        }
        return  count;
    }
    public int getCountInOrder()
    {
        return items.size();
    }
    public Itemable[] getMas()
    {
        Itemable[] mas = new Itemable[items.size()];
        var keys = items.keySet().toArray();
        for(int i = 0; i < keys.length; i++)
        {
            mas[i] = items.get(keys[i]);
        }
        return  mas;
    }
    public int totalSum()
    {
        int sum = 0;
        var keys = items.keySet().toArray();
        for(int i = 0; i < items.size(); i++)
        {
            sum += items.get(keys[i]).getCost();
        }
        return  sum;
    }
    public int getCountInOrders(String title)
    {
        int count = 0;
        var keys = items.keySet().toArray();
        for(int i = 0; i < keys.length; i++)
        {
            if(items.get(keys[i]).getTitle() == title)
            {
                count++;
            }
        }
        return  count;
    }
    public String[] getTitles()
    {
        var keys = items.keySet().toArray();
        String[] tempMas = new String[items.size()];
        for (int i = 0; i < items.size(); i++)
        {
            boolean isAdd = true;
            for(int j = 0; j < i; j++)
            {
                if(tempMas[j] == items.get(keys[i]).getTitle())
                {
                    isAdd = false;
                    break;
                }
            }
            if(isAdd)
            {
                tempMas[i] = items.get(i).getTitle();
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
        Itemable[] mas = new Itemable[items.size()];
        var keys = items.keySet().toArray();
        for(int i = 0; i < mas.length; i++)
        {
            mas[i] = items.get(keys[i]);
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
}

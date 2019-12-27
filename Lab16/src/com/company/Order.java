package com.company;

import java.util.HashMap;

public class Order
{
    private HashMap<Integer,Itemable> items;
    public Order(Itemable... items)
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
    public Order()
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
    public void remove(int id)
    {
        items.remove(id);
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
            str += "   " + items.get(keys[i]).getTitle() + ", цена - " + items.get(keys[i]).getCost();
            if(items.get(keys[i]).getDescription() != "")
            {
                str += ", описание - " + items.get(keys[i]).getDescription();
            }
            str += "\n";
        }
        return  str;
    }
}

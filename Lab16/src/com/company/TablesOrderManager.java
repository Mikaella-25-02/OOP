package com.company;

import java.util.HashMap;

public class TablesOrderManager
{
    private HashMap<Integer, Order> map;
    public TablesOrderManager()
    {
        map = new HashMap<Integer, Order>();
    }
    public int addOrder(Itemable... items)
    {
        Object[] keys = map.keySet().toArray();
        for(int i = 0; i < map.size(); i++)
        {
            if(i != (int)keys[i])
            {
                map.put(i, new Order(items));
                return  i;
            }
        }
        map.put(map.size(), new Order(items));
        return map.size() - 1;
    }
    public void removeOrder(int id)
    {
        map.remove(id);
    }
    public Order getOrder(int id)
    {
        return map.get(id);
    }

    public String toString()
    {
        String str = "";
        Object[] keys = map.keySet().toArray();
        for(int i = 0; i < keys.length; i++)
        {
            str += "Заказ номер " + keys[i] + "\n" + map.get(keys[i]);
        }
        return  str;
    }
}

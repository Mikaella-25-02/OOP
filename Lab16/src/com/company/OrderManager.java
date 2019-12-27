package com.company;

import java.util.HashMap;
import java.util.LinkedList;

public class OrderManager
{
    int count = 0;
    public HashMap<String, Orderable> map;
    public OrderManager()
    {
        map = new HashMap<String, Orderable>();
    }
    public void add(String address, Orderable order) throws OrderAlreadyAddedException {
        if(!map.containsKey(address))
        {
            map.put(address, order);
            count++;
        }
        else throw new OrderAlreadyAddedException("Заказ уже существует");
    }
    public Orderable getOrder(String address)
    {
        if(map.containsKey(address))
        {
            return map.get(address);
        }
        else
        {
            return null;
        }
    }
    public void removeOrder(String address) throws Exception
    {
        if(map.containsKey(address))
        {
            map.remove(address);
        }
        else
        {
            throw new Exception("Заказа с данным адресом нет");
        }
    }
    public void addNewItem(String address, Itemable item)
    {
        if(map.containsKey(address))
        {
            map.get(address).add(item);
        }
    }
    public InternetOrder[] getAllIntOrders()
    {
        int count = 0;
        var keys = map.keySet().toArray();
        for(int i = 0; i < keys.length; i++)
        {
            if(map.get(keys[i]) instanceof InternetOrder)
            {
                count++;
            }
        }
        InternetOrder[] mas = new InternetOrder[count];
        for(int i = 0; i < count; i++)
        {
            if(map.get(keys[i]) instanceof InternetOrder)
            {
                mas[i] = (InternetOrder) map.get(keys[i]);
            }
        }
        return  mas;
    }
    public int getCountInIntOrders()
    {
        int count = 0;
        var keys = map.keySet().toArray();
        for(int i = 0; i < keys.length; i++)
        {
            if(map.get(keys[i]) instanceof InternetOrder)
            {
                count++;
            }
        }
        return count;
    }
    public int getCountTitleInIntOrders(String title)
    {
        var keys = map.keySet().toArray();
        int count = 0;
        for(int i = 0; i < keys.length; i++)
        {
            if(map.get(keys[i]) instanceof InternetOrder)
            {
                count += map.get(keys[i]).getCountInOrders(title);
            }
        }
        return  count;
    }
    public int getCount()
    {
        return count;
    }
    public  int getAllOrdersCount()
    {
        return  map.size();
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

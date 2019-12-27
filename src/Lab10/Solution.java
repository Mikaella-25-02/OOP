package Lab10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Solution
{
    public static <T> ArrayList<T> newArrayList(T... values)
    {
        ArrayList<T> list = new ArrayList<T>();
        for (T value: values)
        {
            list.add(value);
        }
        return  list;
    }
    public static <T> HashSet<T> newHashSet(T... values)
    {
        HashSet<T> set = new HashSet<T>();
        for (T value: values)
        {
            set.add(value);
        }
        return set;
    }
    public static <K,V> HashMap<K,V> newHashMap(K[] keys, V[] values)
    {
        HashMap<K,V> map = new HashMap<K,V>();
        if(keys.length == values.length)
        {
            for(int i = 0; i < keys.length; i++)
            {
                map.put(keys[i],values[i]);
            }
            return map;
        }
        else
        {
            return  null;
        }
    }
}


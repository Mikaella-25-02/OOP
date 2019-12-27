package Lab7;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public class MyList<T>
{
    private final int INIT_SIZE = 16;
    private final int CUT_RATE = 4;
    private Object[] array = new Object[INIT_SIZE];
    private int pointer = 0;
    private int count = 0;

    public T get(int index)
    {
        if(index < pointer)
            return (T)array[index];
        else return null;
    }
    public void add(T item) {
        if(pointer == array.length-1)
            resize(array.length*2);
        array[pointer++] = item;
    }

    public boolean contains(T item)
    {
        for(int i = 0; i < pointer; i++)
        {
            if(array[i] == item)
                return true;
        }
        return false;
    }

    public void remove(int index) {
        for (int i = index; i<pointer; i++)
            array[i] = array[i+1];
        array[pointer] = null;
        pointer--;
        if (array.length > INIT_SIZE && pointer < array.length / CUT_RATE)
            resize(array.length/2);
    }
    public void remove(T item)
    {
        for(int i = 0; i < pointer; i++)
        {
            if(array[i] == item)
            {
                for(int j = i; j < pointer - 1; j++)
                {
                    array[j] = array[j + 1];
                }
                array[pointer] = null;
                pointer--;
                return;
            }
        }
    }
    public int size() {
        return pointer;
    }

    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }

}

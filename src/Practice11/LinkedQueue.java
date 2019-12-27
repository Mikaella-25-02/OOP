package Practice11;

import java.util.LinkedList;
/**
 * @inv intValue () > 0
 **/
public class LinkedQueue<T> extends AbstractQueue<T> implements Querable<T>
{
    private LinkedList<T> list;
    public LinkedQueue()
    {
        list = new LinkedList<T>();
    }

    /**
     * @pre el != null
     * @post c.size() = c@pre.size() + 1
     * @post c.contains(el)
     **/
    public void enqueue(T el)
    {
        list.addLast(el);
    }


    /**
     * @pre c.size() != 0
     * @post c.size() = c@pre.size() - 1
     * @post !c.contains(el)
     **/
    public T dequeue()
    {
        return list.removeFirst();
    }

    public int size()
    {
        return  list.size();
    }

    /**
     * @pre c.size() != 0
     **/
    public T element()
    {
        return list.getFirst();
    }

    public boolean isEmpty()
    {
        return  list.isEmpty();
    }

    public void clear()
    {
        list.clear();
    }

    public String toString()
    {
        String str = "";
        for (int i = 0; i < list.size(); i++)
        {
            str += list.get(i);
        }
        return  str;
    }
}

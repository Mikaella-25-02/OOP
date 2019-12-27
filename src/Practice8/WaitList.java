package Practice8;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList<E>
{
    private ConcurrentLinkedQueue<E> queue;
    public WaitList()
    {
        queue = new ConcurrentLinkedQueue<E>();
    }
    public WaitList(Collection<E> collection)
    {
        queue = new ConcurrentLinkedQueue<E>();
        for (E el:collection)
        {
            queue.add(el);
        }
    }

    public void add(E element)
    {
        queue.add(element);
    }

    public void remove(E element)
    {
        queue.remove(element);
    }

    public boolean containts(E element)
    {
        return queue.contains(element);
    }

    public boolean containtsAll(Collection<E> collection)
    {
        for (E el:collection)
        {
            if(!queue.contains(el))
                return false;
        }
        return true;
    }

    public boolean IsEmpty()
    {
        return queue.isEmpty();
    }

    public String toString()
    {
        String string = "";
        for (E el:queue)
        {
            string += el.toString() + " ";
        }
        return string;
    }
    public int size()
    {
        return queue.size();
    }
}

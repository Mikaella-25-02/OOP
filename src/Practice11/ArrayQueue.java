package Practice11;

/**
 * @inv intValue () > 0
 **/
public class ArrayQueue<T> extends AbstractQueue<T> implements Querable<T>
{
    private Object[] mas;
    int front;
    int rear;
    public ArrayQueue(int capacity)
    {
        mas = new Object[capacity];
        front = 0;
        rear = 0;
    }
    /**
     * @pre el != null
     * @post c.size() = c@pre.size() + 1
     * @post c.contains(el)
     **/
    public void enqueue(T el)
    {
        if(mas[rear] != null)
        {
            Object[] newmas = new Object[mas.length * 2];
            for(int i = 0; i< mas.length; i++)
            {
                T t = this.dequeue();
                if(t != null)
                {
                    newmas [i] = t;
                }

            }
            rear = mas.length;
            mas = newmas;
            front = 0;
        }

        if(rear == mas.length - 1)
        {
            mas[rear] = el;
            rear = 0;
        }
        else{
            mas[rear] = el;
            rear++;
        }
    }

    /**
     * @pre c.size() != 0
     **/
    public T element()
    {
        return (T)mas[front];
    }

    /**
     * @pre c.size() != 0
     * @post c.size() = c@pre.size() - 1
     * @post !c.contains(el)
     **/
    public T dequeue()
    {
        if(mas[front] == null)
        {
            return null;
        }
        T t = (T)mas[front];
        mas[front] = null;
        if(front == mas.length - 1)
        {
            front = 0;
        }
        else{
            front++;
        }
        return t;
    }

    public int size()
    {
        if(rear > front)
        {
            return rear - front;
        }
        else
        {
            return mas.length - front + rear;
        }
    }

    public boolean isEmpty()
    {
        return  size() == 0;
    }

    public void clear()
    {
        for (int i = 0; i < mas.length; i++)
        {
            if(mas[i] != null)
            {
                mas[i] = null;
            }
        }
        front = 0;
        rear = 0;
    }

    public String toString()
    {
        String str = "";
        for(int i = front; i < mas.length;i++)
        {
            if(mas[i] != null){
                str += mas[i] + " ";
            }
            else{
                return str;
            }
        }
        for(int i = 0; i < front;i++)
        {
            if(mas[i] != null){
                str += mas[i] + " ";
            }
            else{
                break;
            }
        }
        return  str;
    }
    public String getMasStr()
    {
        String str = "";
        for(int i = 0; i < mas.length;i++)
        {
            str += mas[i];
        }
        return  str;
    }
    public int getCapacity()
    {
        return  mas.length;
    }
}

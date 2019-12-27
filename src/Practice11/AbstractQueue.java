package Practice11;

/**
 * @inv intValue () > 0
 **/
public abstract class AbstractQueue<T>
{
    /**
     * @pre el != null
     * @post c.size() = c@pre.size() + 1
     * @post c.contains(el)
     **/
    public abstract void enqueue(T el);
    /**
     * @pre c.size() != 0
     * @post c.size() = c@pre.size() - 1
     * @post !c.contains(el)
     **/
    public abstract T dequeue();
    public abstract int size();
    /**
     * @pre c.size() != 0
     **/
    public abstract T element();
    public abstract boolean isEmpty();
    public abstract void clear();
}

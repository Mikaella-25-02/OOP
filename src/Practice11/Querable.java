package Practice11;

public interface Querable<T>
{
    /**
     * @pre el != null
     * @post c.size() = c@pre.size() + 1
     * @post c.contains(el)
     **/
    void enqueue(T el);
    /**
     * @pre c.size() != 0
     * @post c.size() = c@pre.size() - 1
     * @post !c.contains(el)
     **/
    T dequeue();
}

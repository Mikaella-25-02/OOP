package Practice8;

public class UnfairWaitList<E> extends WaitList<E>
{
    public UnfairWaitList()
    {
        super();
    }

    public void remove(E element)
    {
        super.remove(element);
    }
    public void moveToBack(E element)
    {
        super.remove(element);
        super.add(element);
    }
}

package Practice8;

import java.util.Collection;

public interface IWaitList<E>
{
    public void add(E element);
    public void remove(E element);
    public boolean containts(E element);
    public boolean containtsAll(Collection<E> collection);
    public boolean IsEmpty();
}


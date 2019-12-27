package Lab10;

public class UniversalMas<T>
{
    private Object[] mas;
    private int length;
    public UniversalMas(int length)
    {
        mas = new Object[length];
        this.length = length;
    }
    public void add(T value, int i)
    {
        mas[i] = value;
    }
    public T get(int i)
    {
        return (T)mas[i];
    }
    public int getLength()
    {
        return length;
    }
}

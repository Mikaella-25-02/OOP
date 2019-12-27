package Practice11;

public class Test
{
    public static void main(String[] args)
    {
        ArrayQueue<Integer> queue = new ArrayQueue<Integer>(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        System.out.println("size - " + queue.size());
        System.out.println("capacity - " + queue.getCapacity());
        System.out.println(queue.toString());

        /*LinkedQueue<Integer> queue = new LinkedQueue<Integer>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        System.out.println("size - " + queue.size());
        System.out.println(queue.toString());
        queue.clear();*/
    }
}

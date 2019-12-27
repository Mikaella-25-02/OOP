package Practice8;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;

public class TestWaitList
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(4);
        list.add(12);
        list.add(5);
        list.add(7);
        list.add(35);
        list.add(1);
        WaitList<Integer> waitList = new WaitList<Integer>(list);

        System.out.println("WaitList: ");
        waitList.add(48);
        waitList.remove(12);
        if(waitList.containts(5))
        {
            System.out.println(waitList);
        }

        BoundedWaitList<Integer> boundedList = new BoundedWaitList<Integer>(8);
        boundedList.add(1);
        boundedList.add(2);
        boundedList.add(3);
        boundedList.add(4);
        boundedList.add(5);
        boundedList.add(6);
        boundedList.add(7);
        boundedList.add(8);
        boundedList.add(9);

        System.out.println("BoundedWaitList: ");
        System.out.println(boundedList + "    Емкость листа - " + boundedList.getCapacity());
        boundedList.remove(8);
        boundedList.add(9);
        System.out.println(boundedList + "    Емкость листа - " + boundedList.getCapacity());

        UnfairWaitList<Integer> unfList = new UnfairWaitList<Integer>();
        unfList.add(1);
        unfList.add(2);
        unfList.add(3);
        unfList.add(4);
        unfList.add(5);
        unfList.add(6);

        System.out.println("UnfairWaitList: ");
        System.out.println("Лист перед удалением элемента  " + unfList);
        unfList.remove(3);
        System.out.println("Лист после удаления элемента  " + unfList);
        unfList.moveToBack(2);
        System.out.println("Лист после перемещения элемента 2 в конец  " + unfList);
    }
}


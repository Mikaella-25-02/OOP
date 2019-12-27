package Lab7;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedList;

public class Test {

    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>(20);
        list.add("Москва");
        list.add("Париж");
        list.add("Брюссель");
        list.add("Нью-Йорк");
        list.add("Пекин");
        list.add("Санкт-Петербург");

        for (String s : list)
        {
            System.out.println(s);
        }

        if(list.contains("Москва"))
        {
            list.remove("Москва");
            list.remove("Санкт-Петербург");
        }
        list.set(2,"Новый Брюссель");
        System.out.println(list.get(2));
        System.out.println("Количество элементов в списке после удаления " + list.size());
        System.out.println("Элементы списка после изменения");
        for (String s : list)
        {
            System.out.println(s);
        }


        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Москва");
        linkedList.add("Париж");
        linkedList.add("Брюссель");
        linkedList.add("Нью-Йорк");
        linkedList.add("Пекин");
        linkedList.add("Санкт-Петербург");
        linkedList.addFirst("Рим");
        linkedList.addLast("Прага");

        linkedList.set(2,"Новый Орлеан");
        for(String str : linkedList)
        {
            System.out.println(str);
        }
        System.out.println("Количество элементов в списке " + linkedList.size());
        if(linkedList.contains("Москва"))
        {
            linkedList.remove("Москва");
        }
        linkedList.removeFirst();
        System.out.println("Количество элементов в списке после удаления двух элементов " + linkedList.size());
        for(String str : linkedList)
        {
            System.out.println(str);
        }

        MyList<String> myList = new MyList<String>();
        myList.add("Москва");
        myList.add("Париж");
        myList.add("Брюссель");
        myList.add("Нью-Йорк");
        myList.add("Пекин");
        myList.add("Санкт-Петербург");

        System.out.println("Элементы в списке");

        if(myList.contains("Москва"))
        {
            myList.remove("Москва");
            myList.remove("Санкт-Петербург");
        }
        System.out.println(myList.get(2));
        System.out.println("Количество элементов в списке после удаления " + myList.size());
        System.out.println("Элементы списка после изменения");
    }
}



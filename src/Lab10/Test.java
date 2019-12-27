package Lab10;

import java.io.File;
import java.util.ArrayList;

public class Test {

    public static void main(String[] args)
    {

      String[] mas = {"Tom", "Sam", "Bob", "Alice"};
        ArrayList<String> list = convert(mas);
        for(String el:list)
        {
            System.out.println(el);
        }

        UniversalMas<Integer> massive = new UniversalMas<Integer>(10);
        for(int i = 0; i < massive.getLength(); i++)
        {
            massive.add(i,i);
            System.out.println(massive.get(i));
        }

        UniversalMas<String> masS = new UniversalMas<String>(4);
        masS.add("Tom",0);
        masS.add("Bob",1);
        masS.add("Pol",2);
        masS.add("Alice",3);
        for(int i = 0; i < masS.getLength(); i++)
        {
            System.out.println(masS.get(i));
        }
        getCat("C:\\Users\\Mikaella\\Desktop\\Files");

        ArrayList<Integer> list1 = Solution.newArrayList(1,4,1,5,5,2,3,51);
        for (int value:list1)
        {
            System.out.println(value);
        }
    }
    static <T> ArrayList<T> convert(T[] mas)
    {
        ArrayList<T> list = new ArrayList<T>();
        for(int i = 0; i < mas.length; i++)
        {
            list.add(mas[i]);
        }
        return list;
    }

    static void getCat(String path)
    {
        ArrayList<String> list = new ArrayList<String>();
        File dir = new File(path);
        int count = 0;
        if(dir.isDirectory())
        {
            for(File item : dir.listFiles())
            {
                if(count < 5)
                {
                    count++;
                    list.add(item.getName());
                }

            }

        }
        for (String s:list)
        {
            System.out.println(s);
        };
    }
}
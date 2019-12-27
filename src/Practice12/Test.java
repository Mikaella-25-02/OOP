package Practice12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Test
{
    public static void main(String[] args)
    {
        Person person = new Person("Tom", "Tomson", "Patr");
        System.out.println(person.getFIO());
        Person person2 = new Person("Tom", null, "Patr");
        System.out.println(person2.getFIO());

        Address address1 = new Address("Russia; Moscow region; Moscow; Vernadskiy; 86; 1; 1233", ";");
        System.out.println(address1.edge);
        System.out.println(address1.city);
        System.out.println(address1);

        String[] shirts = new String[11];
        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black T-Shirt,Black,XL";
        shirts[6] = "S007,White T-Shirt,White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";
        Shirt[] newShirts = new Shirt[shirts.length];
        for(int i = 0; i < shirts.length; i++)
        {
            newShirts[i] = new Shirt(shirts[i]);
            System.out.println(newShirts[i]);
        }

        NumberConverter conv1 = new NumberConverter("89175655655");
        System.out.println(conv1.getNumber());

        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            Scanner scanner = new Scanner(new FileReader(reader.readLine()));
            String www = "";
            while (scanner.hasNextLine())
            {
                www = scanner.nextLine();
            }
            StringBuilder result = getLine(www.split(" "));
            System.out.println(result.toString());
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    public static StringBuilder getLine(String... words) {
        if (words == null || words.length == 0)
        { return new StringBuilder(); }
        if ("".equals(words[0]) || words.length == 1)
        {return new StringBuilder(words[0]); }

        int count = 0;
        StringBuilder result = new StringBuilder();
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < words.length; i ++)
        {
            if (!words[i].equals(""))
            {
                list.add(words[i]);
            }
        }


        while (!isOK(list))
        {
            count++;
            if(count > 1000 * words.length)
            {
                return new StringBuilder("Нельзя составить цепочку");
            }
            Collections.shuffle(list);
        }
        for (String s : list)
            result.append(s+ " ");
        result.deleteCharAt(result.length()-1);
        return result;
    }
    public static boolean isOK(ArrayList<String> list)
    {
        for (int i = 0; i < list.size()-1; i++)
        {
            String first = list.get(i);
            String second = list.get(i+1);
            first = first.toLowerCase();
            second =second.toLowerCase();
            if (first.charAt(first.length()-1)!=second.charAt(0))
                return false;
        }
        return true;
    }
}

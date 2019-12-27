package Lab9;

import java.util.*;
import java.lang.Exception;

public class Test {

    public static void main(String[] args)
    {
        try
        {
            System.out.println(2 / 0);
        }
        catch(ArithmeticException  ex)
        {
            System.out.println(ex.getMessage());
        }
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        try
        {
            int i = Integer.parseInt(intString);
            System.out.println( 2 / i );
        }
        catch (ArithmeticException ex)
        {
            System.out.println(ex.getMessage());
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        finally
        {
            System.out.println("Завершение программы");
        }

        try {
            getDetails(null);
        } catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Завершение программы");
        }


    }

    static void getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        } else {
            System.out.println("Входные данные верны!");
        }
    }

    public static void getKey() {
        Scanner myScanner = new Scanner(System.in);
        String key = myScanner.next();
        try {
            printDetails(key);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void printDetails(String key) throws Exception {
        try {
            String message = getDetails2(key);
            System.out.println(message);
        } catch (Exception e) {
            throw e;
        }
    }

    public static String getDetails2(String key) throws Exception {
        if (key == "") {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }
       /* getKey();*/
}

/*
    public static void getKey()
    {
        Scanner myScanner = new Scanner( System.in );
        boolean isContinue = false;
        do {
            try
            {
                isContinue = false;
                System.out.print("Enter Key ");
                String key = myScanner.nextLine();
                printDetails( key );
            }
            catch(Exception ex)
            {
                System.out.println("\r\nВведите значение заново");
                isContinue = true;
            }
        }
        while (isContinue);
    }

    public static void printDetails(String key) throws Exception
    {
        String message = getDetails(key);
        System.out.println( message );
    }

    private static String getDetails(String key) throws Exception
    {
        if(key.equals("")) {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key;
    }
*/


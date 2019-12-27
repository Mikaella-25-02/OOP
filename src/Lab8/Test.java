package Lab8;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку для записи её в файл");
        String str = in.nextLine();

        try(FileWriter writer = new FileWriter("someFile.txt", false))
        {
            writer.append(str);

            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        System.out.println("Вывод:");
        try(FileReader reader = new FileReader("someFile.txt"))
        {
            int c;
            while((c=reader.read())!=-1){

                System.out.print((char)c);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        System.out.println("\n\rВведите новую строку для замены");
        str = in.nextLine();

        try(FileWriter writer = new FileWriter("someFile.txt", false))
        {
            writer.append(str);

            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        System.out.println("\n\rВведите строку для добавления");
        str = in.nextLine();

        try(FileWriter writer = new FileWriter("someFile.txt", true))
        {
            writer.append(str);

            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
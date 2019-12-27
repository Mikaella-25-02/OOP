package Practice12;

public class Shirt
{
    private String number;
    private String title;
    private String color;
    private String size;
    public Shirt(String shirt)
    {
        String[] mas = shirt.split(",");
        number = mas[0];
        title = mas[1];
        color = mas[2];
        size = mas[3];
    }

    public String toString()
    {
        return number + " " + title + " цвета " + color + " размера " + size;
    }
}

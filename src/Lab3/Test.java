package Lab3;

public class Test
{
    public static void main(String[] args)
    {
        Cup cup = new Cup(0.250,300);
        System.out.println("Объем чаши: " + cup.GetVolume() + " мл ");
        System.out.println("Цена чаши: " + cup.GetPrice() + " руб. ");

        cup.SetPrice(500);
        cup.SetVolume(0.5);

        System.out.println("Новый объем чаши: " + cup.GetVolume() + " мл ");
        System.out.println("Новая цена чаши: " + cup.GetPrice() + " руб. ");
        cup.WashDish();
        System.out.println();

        Plate plate = new Plate(30,200);
        System.out.println("Размер тарелки: " + plate.GetSize() + " см ");
        System.out.println("Цена тарелки: " + plate.GetPrice() + " руб. ");

        plate.SetSize(25);
        plate.SetPrice(150);

        System.out.println("Новый размер тарелки: " + plate.GetSize() + " см ");
        System.out.println("Новая цена тарелки: " + plate.GetPrice() + " руб. ");
        plate.WashDish();
    }
}

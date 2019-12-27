package Lab4;

public class Test
{
    public static void main(String[] args) {
        Nameable
        nameable = new Planet("Venus",3396);
        System.out.println("Планета " + nameable.GetName());

        nameable = new Book("Dandelion Wine", 285);
        System.out.println("Книга " + nameable.GetName());

        nameable = new Car("Porsche", 2000000);
        System.out.println("Машина " + nameable.GetName());
    }
}

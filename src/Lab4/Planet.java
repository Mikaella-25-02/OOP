package Lab4;

public class Planet implements Nameable {

    private String Name;
    private int Radius;
    public Planet(String name, int radius)
    {
        Name = name;
        Radius = radius;
    }

    public String GetName() {
        return Name;
    }
}
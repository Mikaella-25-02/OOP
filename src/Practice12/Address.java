package Practice12;

import java.util.StringTokenizer;

public class Address
{
    public String state;
    public String edge;
    public String city;
    public String street;
    public String house;
    public String entrance;
    public String apartment;
    public Address(String address)
    {
        addition(address.split(","));
    }
    public Address(String address, String separator)
    {
        StringTokenizer st = new StringTokenizer(address,separator);
        String[] mas = new String[7];
        int count = 0;
        while(st.hasMoreTokens())
        {
            mas[count++] = st.nextToken();
        }
        addition(mas);
    }
    private void addition(String[] mas)
    {
        state = mas[0];
        edge = mas[1];
        city = mas[2];
        street = mas[3];
        house = mas[4];
        entrance = mas[5];
        apartment = mas[6];
    }

    public String toString()
    {
        return state + " " + edge + " " + city + " " + street + " " + house + " " + entrance + " " + apartment;
    }
}


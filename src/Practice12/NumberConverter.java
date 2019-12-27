package Practice12;

public class NumberConverter
{
    private StringBuilder newNumber;
    public NumberConverter(String number)
    {
        newNumber = new StringBuilder();
        if(number.charAt(0) == '+')
        {
            newNumber.append('+' );

        }
        else
        {
            newNumber.append("+7");

        }
        newNumber.append(number.substring(1, number.length() - 7) + '-');
        newNumber.append(number.substring(number.length() - 7, number.length() - 4) + '-');
        newNumber.append(number.substring(number.length() - 4, number.length()));
    }
    public String getNumber()
    {
        return  newNumber.toString();
    }
}

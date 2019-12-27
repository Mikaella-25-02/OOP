package Practice12;

public class Person
{
    private String firstName;
    private String secondname;
    private String patronymic;

    public Person(String firstName, String secondname, String patronymic)
    {
        this.firstName = firstName;
        this.secondname = secondname;
        this.patronymic = patronymic;
    }
    public String getFIO()
    {
        StringBuilder builder = new StringBuilder();
        if(firstName != null){
            builder.append(firstName + " ");
        }
        if(secondname != null){
            builder.append(secondname + " ");
        }
        if(patronymic != null){
            builder.append(patronymic + " ");
        }
        return builder.toString();
    }
}

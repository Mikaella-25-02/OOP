package Practice2;

public class TestAuthor
{
    public static void main(String[] args)
    {
        Author author = new Author("Miya", "samya.elshejx@mail.ru",'G');
        System.out.println(author);

        System.out.println(author.GetName() + "; " + author.GetEmail() + "; " + author.GetGender());

        author.SetEmail("mikaella.sheikh@mail.ru");
        System.out.println(author.GetName() + "; " + author.GetEmail() + "; " + author.GetGender());
    }
}

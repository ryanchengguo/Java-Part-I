import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Person> phoneBook;

    public Phonebook() {
        this.phoneBook = new ArrayList<Person>();
    }
  
  public void printAll(){
        for (Person person:phoneBook
             ) {
            System.out.println(person);

        }
    }

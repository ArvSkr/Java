import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W", 1200));
        persons.add(new Student("ollie", "6381 Hollywood Blvd. Los Angeles 90028"));

        printPersons(persons);
    }

    public static void printPersons(ArrayList<Person> person) {

        for (int i = 0; i < person.size(); i++) {
            System.out.println(person.get(i));
        }
    }

}

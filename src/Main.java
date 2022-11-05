import java.util.List;
import java.util.ArrayList;

class Main {

    private static List<Person> personList() {
        List<Person> person = new ArrayList<>();
        person.add(new Person("Alex", "Petrov-Ivanov", 20));
        person.add(new Person("Katrine", "Gonzalez Fernandez, Jose", 18));
        person.add(new Person("Max", "Alexandros", 30));
        person.add(new Person("Mary", "Johnson-Frederik", 22));
        person.add(new Person("John", "Muslin-Pierre", 18));
        person.add(new Person("Anny", "Redwood", 18));

        return person;
    }

    public static void main(String[] args) {
        List<Person> person = personList();
        person.sort(new SurnameAgeComparator(1));
        System.out.println(person);
    }
}
import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

class Main {

    private static List<Person> personList() {
        List<Person> person = new ArrayList<>();
        person.add(new Person("Alex", "Petrov-Ivanov", 20));
        person.add(new Person("Katrine", "Gonzalez Fernandez, Jose", 15));
        person.add(new Person("Max", "Alexandros", 18));
        person.add(new Person("Mary", "Johnson-Frederik", 13));
        person.add(new Person("John", "Muslin-Pierre", 19));
        person.add(new Person("Anny", "Redwood", 17));

        return person;
    }

    public static void main(String[] args) {
        List<Person> person = personList();

        Predicate<Person> lessEighteen = personComp ->  personComp.getAge() < 18;
        person.removeIf(lessEighteen);
        System.out.println(person);
    }
}
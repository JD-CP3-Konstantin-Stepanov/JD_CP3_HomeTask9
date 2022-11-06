import java.util.Comparator;
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

        Comparator<Person> newComporator = (p1, p2) -> {
            int maxSurnameWords = 1;
            String[] wordsArray = p1.getSurname().split("\\P{IsAlphabetic}+");
            int firstObjectLength = wordsArray.length;

            wordsArray = p2.getSurname().split("\\P{IsAlphabetic}+");
            int secondObjectLength = wordsArray.length;

            if (firstObjectLength > maxSurnameWords && secondObjectLength > maxSurnameWords) {
                return Integer.compare(p1.getAge(), p2.getAge());
            } else {
                if (firstObjectLength < secondObjectLength) {
                    return -1;
                } else if (firstObjectLength > secondObjectLength) {
                    return 1;
                } else {
                    return Integer.compare(p1.getAge(), p2.getAge());
                }
            }
        };

        person.sort(newComporator);
        System.out.println(person);
    }
}
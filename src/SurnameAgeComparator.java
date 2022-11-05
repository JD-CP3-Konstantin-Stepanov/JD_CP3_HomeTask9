import java.util.Comparator;

public class SurnameAgeComparator implements Comparator<Person> {

    private final int maxSurnameWords;

    public SurnameAgeComparator(int MaxSurnameWords) {
        this.maxSurnameWords = MaxSurnameWords;
    }

    @Override
    public int compare(Person o1, Person o2) {
        String[] wordsArray = o1.getSurname().split("\\P{IsAlphabetic}+");
        int firstObjectLength = wordsArray.length;

        wordsArray = o2.getSurname().split("\\P{IsAlphabetic}+");
        int secondObjectLength = wordsArray.length;

        if (firstObjectLength > maxSurnameWords && secondObjectLength > maxSurnameWords) {
            return Integer.compare(o1.getAge(), o2.getAge());
        } else {
            if (firstObjectLength < secondObjectLength) {
                return -1;
            } else if (firstObjectLength > secondObjectLength) {
                return 1;
            } else {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        }
    }
}

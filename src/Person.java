class Person {
    private final String name;
    private final String surname;
    private final int age;

    // создайте конструктор на все поля
    public Person(String Name, String Surname, int Age) {
        this.name = Name;
        this.surname = Surname;
        this.age = Age;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    // создайте toString
    @Override
    public String toString() {
        return name + " " + surname + " " + age;
    }
}
public class Person {
    private String firstName;
    private String lastName;
    private int id;

    public Person(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + firstName + " " + lastName;
    }
}

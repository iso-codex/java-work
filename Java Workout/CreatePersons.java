import java.util.Scanner;

public class CreatePersons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array to store Person objects
        Person[] people = new Person[3];

        // Initialize a counter for generating unique IDs
        int idCounter = 1;

        System.out.println("Welcome to Person Creator!");
        
        for (int i = 0; i < people.length; i++) {
            Person person = new Person();

            System.out.print("Enter first name for person " + (i + 1) + ": ");
            person.setFirstName(scanner.nextLine());

            System.out.print("Enter middle name: ");
            person.setMiddleName(scanner.nextLine());

            System.out.print("Enter last name: ");
            person.setLastName(scanner.nextLine());

            person.setId(idCounter);
            idCounter++;

            people[i] = person;
        }

        System.out.println("Person creation complete!");
        System.out.println("Displaying information for the created people:");

        for (Person person : people) {
            System.out.println("ID: " + person.getId());
            System.out.println("First Name: " + person.getFirstName());
            System.out.println("Middle Name: " + person.getMiddleName());
            System.out.println("Last Name: " + person.getLastName());
            System.out.println();
        }

        scanner.close();
    }
}

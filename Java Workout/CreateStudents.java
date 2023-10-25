import java.util.Scanner;

public class CreateStudents {
    public static void main(String[] args) {
        Course course1 = new Course("Math 101", 1);
        Course course2 = new Course("Computer Science 201", 2);
        Course course3 = new Course("History 101", 3);
        Course course4 = new Course("Machine Learning", 4);
        Course course5 = new Course("EOM", 5);

        Scanner scanner = new Scanner(System.in);

        // System.out.println("Choose your Role:");


        System.out.println("Enter student information:");
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();
        System.out.print("Student ID: ");
        int studentId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Student student = new Student(firstName, lastName, studentId);

        System.out.println("Available Courses:");
        System.out.println("1. Math 101\n2. Computer Science 201\n3. History 101\n4. Machine Learning\n5.");
        System.out.println("Enter the course number to register");
        System.out.println("To Move to Next press 0 ");

        int courseChoice;
        do {
            courseChoice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (courseChoice) {
                case 1:
                    student.registerForCourse(course1);
                    break;
                case 2:
                    student.registerForCourse(course2);
                    break;
                case 3:
                    student.registerForCourse(course3);
                    break;
                default:
                    break;
            }
        } while (courseChoice != 0);

        System.out.println("Student Information:\n" + student.toString());
    }
}

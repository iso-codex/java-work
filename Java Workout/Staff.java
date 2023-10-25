public class Staff extends Person {
    private String role;
    private double salary;

    public Staff(String firstName, String lastName, int id, String role, double salary) {
        super(firstName, lastName, id);
        this.role = role;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\nRole: " + role + "\nSalary: $" + salary;
    }
}

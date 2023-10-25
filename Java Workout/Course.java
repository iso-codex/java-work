public class Course {
    private String name;
    private int id;

    public Course(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Course ID: " + id + ", Name: " + name;
    }
}

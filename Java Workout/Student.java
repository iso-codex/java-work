import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private List<Course> courses;

    public Student(String firstName, String lastName, int id) {
        super(firstName, lastName, id);
        courses = new ArrayList<>();
    }

    public void registerForCourse(Course course) {
        courses.add(course);
    }

    @Override
    public String toString() {
        String studentInfo = super.toString();
        StringBuilder courseInfo = new StringBuilder("Registered Courses:\n");
        for (Course course : courses) {
            courseInfo.append(course.toString()).append("\n");
        }
        return studentInfo + "\n" + courseInfo.toString();
    }
}

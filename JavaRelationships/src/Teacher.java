import java.util.ArrayList;
import java.util.List;

class Department
{
    private String departmentName;
    private List<Student> students;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.students = new ArrayList<>();
    }

    // Add a student to the department
    public void addStudent(Student student) {
        students.add(student);
    }

    // Display all students in the department
    public void displayStudents() {
        System.out.println("Department: " + departmentName);
        System.out.println("Students:");
        for (Student student : students) {
            System.out.println(" - " + student.getName());
        }
    }
}
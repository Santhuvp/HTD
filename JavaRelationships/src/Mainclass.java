public class Mainclass {
    public static void main(String[] args) {
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        // Create a department
        Department department = new Department("Computer Science");

        // Add students to the department
        department.addStudent(student1);
        department.addStudent(student2);

        // Display students in the department
        department.displayStudents();



    }
}

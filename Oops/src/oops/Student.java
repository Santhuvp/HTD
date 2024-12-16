package oops;

public class Student extends Person
{
    private String course;
    private int marks;

    Student(int id, String name, int age, String course, int marks) {
        super(id, name, age);
        this.course = course;
        this.marks = marks;
    }

   @Override
    public String toString() {
        return "Student{" +
                "course='" + course + '\'' +
                ", marks=" + marks +
                '}';
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCourse()
    {
        return course;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getMarks()
    {
        return marks;
    }

    public void calculate(int marks)
    {
        if(marks>70)
        {
            System.out.println("A");
        }
        else if(marks>=50)
        {
            System.out.println("B");
        }
        else

            System.out.println("C");
    }
    public void displayDetails()
    {
        System.out.println("Displaying the student details");
        calculate(marks);
    }

}

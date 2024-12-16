package oops;

public class Teacher extends Person {

    private String subject;
    private int salary;

    Teacher(int id, String name, int age,String subject,int salary) {
        super(id, name, age);
        this.subject = subject;
        this.salary = salary;
    }


    public String getSubject()
    {
        return subject;
    }
    public int getSalary()
    {
        return salary;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "subject='" + subject + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void displayDetails()
    {
        System.out.println("Displaying the teachers details");

    }
}

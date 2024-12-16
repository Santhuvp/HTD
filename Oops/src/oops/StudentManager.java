package oops;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {



  Scanner sc= new Scanner(System.in);

  System.out.println("Enter the case");
  int case_id=sc.nextInt();

  while(case_id<3) {
      switch (case_id) {

          case 1:
              System.out.println("Enter the id");
              int id = sc.nextInt();
              System.out.println("Enter the name");
              String name = sc.next();
              System.out.println("Enter the age");
              int age = sc.nextInt();
              System.out.println("Enter the course");
              String course = sc.next();
              System.out.println("Enter the marks");
              int marks = sc.nextInt();
              Student s1 = new Student(id, name, age, course, marks);
              System.out.println(s1.getMarks());

              ArrayList<Student> a1 = new ArrayList<>();
              a1.add(s1);
              s1.displayDetails();
              s1.getId();
              s1.getName();
              s1.getAge();
              s1.getCourse();
              s1.getMarks();
              break;
          case 2:
              System.out.println("Enter the id");
              id = sc.nextInt();
              System.out.println("Enter the name");
              name = sc.next();
              System.out.println("Enter the age");
              age = sc.nextInt();
              System.out.println("Enter the subject");
              String subject = sc.next();
              System.out.println("Enter the salary");
              int salary = sc.nextInt();
              Teacher t1 = new Teacher(id, name, age, subject, salary);

              ArrayList<Teacher> a2 = new ArrayList<>();
              a2.add(t1);

              t1.displayDetails();

              System.out.println(t1.getId());
              System.out.println(t1.getName());
              System.out.println( t1.getAge());
              System.out.println(t1.getSubject());
              System.out.println( t1.getSalary());
              t1.setSalary(45000);
              System.out.println(t1.getSalary());
              break;

          default:
              System.out.println("Exit");
              break;
      }
  }

    }
}

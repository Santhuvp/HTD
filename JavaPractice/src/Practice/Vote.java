package Practice;

import java.util.Scanner;

public class Vote
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = sc.nextInt();
        if(age>=18 && age<=100)
        {
            System.out.println("Eligible");
        } else if (age<18)
        {
            System.out.println("Not Eligible")  ;
        } else if (age>100) {
            System.out.println("Invalid input");
        }
    }
}

package Practice;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number");
        int b = sc.nextInt();
        System.out.println("Enter the operation");
       int opt=sc.nextInt();
        switch (opt)
        {
            case 1 :
                         int c=a+b;
                         System.out.println("The addition of the numbers ="+c);
                          break;
            case 2 :
                c=a-b;
                System.out.println("The subtraction of the numbers ="+c);
                break;
            case 3 :
                c=a*b;
                System.out.println("The multiplication of the numbers ="+c);
                   break;
            case 4 :
                c=a/b;
                System.out.println("The division of the numbers ="+c);
                break;
            default:System.out.println("Unsupported operation");
                break;
        }
    }
}

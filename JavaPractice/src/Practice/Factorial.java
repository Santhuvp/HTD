package Practice;

import java.util.Scanner;

public class Factorial {

    public static void fact(int n)
    {
        int fact=1;
        for( int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("The factorial is "+fact);

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        fact(num);
    }
}

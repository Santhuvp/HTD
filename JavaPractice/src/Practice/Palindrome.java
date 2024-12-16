package Practice;

import java.util.Scanner;

public class Palindrome {
    public static void palindromeNumber(int n1)
    {
        int n2=n1,summ=0;
        while(n2>0)
        {


            int rem = n2 % 10;
            summ=(summ*10)+rem;
            n2 = n2/10;

        }
        if(summ==n1)
        {
            System.out.println("The number is palindrome");
        }
        else
        {
            System.out.println("The number is not palindrome");
        }
    }

    public static void palindromeString(String str)
    {
       StringBuilder str1=new StringBuilder(str);
       str1.reverse();
       if (str.equals(str1.toString()))
       {
           System.out.println("The string is palindrome");
       }
       else
       {
           System.out.println("The string is not palindrome");
       }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  number");
        int n1 = sc.nextInt();
        System.out.println("Enter the String");
        String str = sc.next();
        palindromeNumber(n1);
        palindromeString(str);
    }
}

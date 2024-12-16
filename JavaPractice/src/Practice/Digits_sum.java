package Practice;

import java.util.Scanner;

public class Digits_sum
{
    public static void main(String[] args) {
        int summ=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        while(num>0)
        {

            int div = num/10;
            int rem = num % 10;
            num= div;
             summ=summ+rem;

        }

        System.out.println("The sum of all the digits  is "+summ);
    }
}

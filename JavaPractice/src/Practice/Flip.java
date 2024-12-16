package Practice;

import java.util.Scanner;

public class Flip {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of times coin flipped");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            double random = Math.random();
            if(random<0.5)
            {
                System.out.println("Head");
            }
            else if (random>=0.5)
            {
                System.out.println("Tails");
            }

        }
    }

}
